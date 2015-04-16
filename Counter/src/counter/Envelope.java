/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counter;
import java.util.Calendar;

public class Envelope extends Delivery {
    private String typeEnvelope;
    private String typeContent;
    private double weight;   

    public Envelope(String description,String remittent,String typeEnvelope, String typeContent, double weight) {
        super(description,remittent);
        this.typeEnvelope = typeEnvelope;
        this.typeContent = typeContent;
        this.weight = weight;
    }
    public void set_typeEnvelope(String typeEnvelope) {
        this.typeEnvelope = typeEnvelope;
    }

    public String get_typeEnvelope() {
        return typeEnvelope;
    }

    public void set_typeContent(String typeContent) {
        this.typeContent = typeContent;
    }

    public String get_typeContent() {
        return typeContent;
    }

    public void set_weight(double weight) {
        this.weight = weight;
    }

    public double get_weight() {
        return weight;
    }
    @Override
    public void Display_delivery(){
        super.Display_delivery();
        System.out.println("Tipo de sobre: "+get_typeEnvelope());
        System.out.println("Tipo de contenido: "+get_typeContent());
        System.out.println("Peso: "+get_weight());
        System.out.println("---------------------");
    } 
    public double getTax(){
        double tax=0.0;
        if (typeEnvelope.equals("aereo") && !(typeContent.equals("documento"))){
            tax=1.0;
        }
        if (typeEnvelope.equals("manila") && !(typeContent.equals("documento"))){
            tax=2.0;
        }
        if (typeEnvelope.equals("manila") && (typeContent.equals("documento"))){
            tax=1.0;
        }
        return tax;
    }
    public double getPrice(){
        //double price=0;
        this.price=getTax();
        return this.price;
    }
}
