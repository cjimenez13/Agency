/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counter;
import java.util.Calendar;

public class Magazine extends Delivery {
    private String name="";
    private boolean catalog=false;
    private String topic="";

    public Magazine(boolean status, String description, String remittent,Calendar date,String name, boolean catalog, String topic) {
        super(status, description, remittent,date);
        this.name = name;
        this.catalog = catalog;
        this.topic = topic;
    }

    public String get_name() {
        return name;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public boolean get_catalog() {
        return catalog;
    }

    public void set_catalog(boolean catalog) {
        this.catalog = catalog;
    }

    public String get_topic() {
        return topic;
    }

    public void set_topic(String topic) {
        this.topic = topic;
    }
    @Override
    public void Display_delivery(){
        super.Display_delivery();
        System.out.println("Nombre: "+get_name());
        System.out.println("Catálogo: "+get_catalog());
        System.out.println("Tema: "+get_topic());
        System.out.println("---------------------");
    }
    public double getTax(){
        int tax=1;
        if (catalog){
           tax=0;
        }
        return tax;
    }
    public double getPrice(){
        double price=0;
        price+=getTax();
        return price;
    }

    
}
