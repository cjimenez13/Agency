/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counter;

import java.util.ArrayList;

/**
 *
 * @author Byron
 */
public  final class Locker {
    private int number;
    private boolean state;//Determinna si está vacío
     private boolean ocuppied;//Determina si posee dueño.
    private static int identifier=1000;
    private ArrayList<Package> lockerPackages = new ArrayList<>(); //se crea un array de entregables con capacidad para 100 miembros.
    private ArrayList<Envelope> lockerEnvelopes=new ArrayList<>();
    private ArrayList<Magazine> lockerMagazines=new ArrayList<>();
    public Locker() {
        this.number = identifier;
        this.state = false; //En false el locker estará vacío.
        this.ocuppied=false;//En false está desocupado
        identifier++;
    }

    public boolean get_ocuppied() {
        return ocuppied;
    }

    public void set_ocuppied(boolean ocuppied) {
        this.ocuppied = ocuppied;
    }

    public int getNumber() {
        return number;
    }

    public void set_number(int number) {
        this.number = number;
    }

    public boolean get_state(){
        return state;
    }

    public void set_state(boolean state) {
        this.state = state;
    }
    
    public void addPackage(Package pDelivery){
        lockerPackages.add(pDelivery);
        System.out.println((lockerPackages.get(0)).get_description());
    
    }
    public ArrayList<Package> DeliverPackage(){
        return lockerPackages;
    }
    public void addEnvelope(Envelope pDelivery){
        lockerEnvelopes.add(pDelivery);
        System.out.println((lockerEnvelopes.get(0)).get_description());
    
    }
    public ArrayList<Envelope> DeliverEnvelope(){
        return lockerEnvelopes;
    }
    public void addMagazine(Magazine pDelivery){
        lockerMagazines.add(pDelivery);
        pDelivery.Display_delivery();
    
    }
    public ArrayList<Magazine> DeliverMagazine(){
        return lockerMagazines;
    }
    
    
}
