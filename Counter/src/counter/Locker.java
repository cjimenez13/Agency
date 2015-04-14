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
    private ArrayList<Package> lockerPackages= new ArrayList<>(); //se crea un array de entregables con capacidad para 100 miembros.
    private ArrayList<Envelope> lockerEnvelopes= new ArrayList<>();
    private ArrayList<Magazine> lockerMagazines= new ArrayList<>();
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
        pDelivery.Display_delivery();
        
        System.out.println("el locker de paquetes tiene: "+lockerPackages.size());
    
    }
    public ArrayList<Package> DeliverPackage(){
        return lockerPackages;
    }
    public void addEnvelope(Envelope pDelivery){
        lockerEnvelopes.add(pDelivery);
    
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
   public int searchDelivery(int pCode){
       int option=0;
       for (int i=0; i!= lockerEnvelopes.size();i++){
           int num=(lockerEnvelopes.get(i).get_code());
           if (num==(pCode)){
               option=1;
               break; 
           }
       }
       for (int m=0; m!= lockerPackages.size();m++){
           int num=(lockerPackages.get(m).get_code());
           if (num==(pCode)){
               option=2;
               break; 
           }
       }       
       for (int n=0; n!= lockerMagazines.size();n++){
           int num=(lockerMagazines.get(n).get_code());
           if (num==(pCode)){
               option=3;
               break; 
           }
       }
       return option;
   }
    
    
}
