/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counter;
import java.util.Calendar;

public class Package extends Delivery {
    private boolean frailness;
    private double weight;
    private boolean technological;

    public Package(boolean status, String description, String remittent,Calendar date,Calendar outdate,double price,boolean frailness, boolean technological, double weight ) {
        super(status, description, remittent,date,outdate,price);
        this.frailness = frailness;
        this.weight = weight;
        this.technological = technological;
    }
    
    

    public boolean get_frailness() {
        return frailness;
    }

    public void set_frailness(boolean frailness) {
        this.frailness = frailness;
    }

    public double get_weight() {
        return weight;
    }

    public void set_weight(double weight) {
        this.weight = weight;
    }

    public boolean get_technological() {
        return technological;
    }

    public void set_technological(boolean technological) {
        this.technological = technological;
    }
    @Override
    public void Display_delivery(){
        super.Display_delivery();
        System.out.println("Frágil: "+get_frailness());
        System.out.println("Es tecnológico: "+get_technological());
        System.out.println("Peso: "+get_weight());
        System.out.println("---------------------");
        
    }
    public double getTax(){
        double tax= weight*0.02;
        if(technological){
            tax+=2;
        }
        if (frailness){
            tax+=2;
        }
        return tax;
    }
    public double getPrice(){
        //double price=0;
        this.price+=getTax();
        return this.price;
    }
   
    
}
