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
    private ArrayList<Package> lockerPackagesOut = new ArrayList<>(); //se crea un array de entregables con capacidad para 100 miembros.
    private ArrayList<Envelope> lockerEnvelopesOut=new ArrayList<>();
    private ArrayList<Magazine> lockerMagazinesOut=new ArrayList<>();
    
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
        state = true;    
    }
    public ArrayList<Package> DeliverPackage(){
        return lockerPackages;
    }
    public void addEnvelope(Envelope pDelivery){
        lockerEnvelopes.add(pDelivery);
        state = true; 
    }
    public ArrayList<Envelope> DeliverEnvelope(){
        return lockerEnvelopes;
    }
    public void addMagazine(Magazine pDelivery){
        lockerMagazines.add(pDelivery);
        state = true;     
    }
    public ArrayList<Magazine> DeliverMagazine(){
        return lockerMagazines;
    }
   public int get_cantdeliveries(){
       return lockerPackages.size()+ lockerMagazines.size()+ lockerEnvelopes.size();
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
    public void takeOutPackage(int code){
        for (int m=0; m!= lockerPackages.size();m++){
           int num=(lockerPackages.get(m).get_code());
           if (num==(code)){
               lockerPackages.get(m).setOut_date();
               lockerPackages.get(m).set_status();
               lockerPackagesOut.add(lockerPackages.remove(m));
               
               
               break; 
           }
       }       
        
    }
    public void takeOutEnvelope(int code){
        for (int m=0; m!= lockerEnvelopes.size();m++){
           int num=(lockerEnvelopes.get(m).get_code());
           if (num==(code)){
               lockerEnvelopes.get(m).setOut_date();
               lockerEnvelopes.get(m).set_status();
               lockerEnvelopesOut.add(lockerEnvelopes.remove(m));
               
               break; 
           }
       }       
        
    }
    public void takeOutMagazines(int code){
        for (int m=0; m!= lockerMagazines.size();m++){
           int num=(lockerMagazines.get(m).get_code());
           if (num==(code)){
               lockerMagazines.get(m).setOut_date();
               lockerMagazines.get(m).set_status();
               lockerMagazinesOut.add(lockerMagazines.remove(m));
               break; 
           }
       }       
        
    }
    public ArrayList<Package> getSearchDeletePackages(ArrayList<Integer> codesList){
        ArrayList<Package> packagesPreviousRetired=new ArrayList<>();
        for (int j=0;j<codesList.size();j++){
            for(int m=0;m<lockerPackagesOut.size();m++){
                if(codesList.get(j)==lockerPackagesOut.get(m).get_code()){
                    packagesPreviousRetired.add(lockerPackagesOut.get(m));
                }
            }
        }
        return packagesPreviousRetired;
    }
    public ArrayList<Envelope> getSearchDeleteEnvelopes(ArrayList<Integer> codesList){
        ArrayList<Envelope> envelopesPreviousRetired=new ArrayList<>();
        for (int j=0;j<codesList.size();j++){
            for(int m=0;m<lockerEnvelopesOut.size();m++){
                if(codesList.get(j)==lockerEnvelopesOut.get(m).get_code()){
                    
                    envelopesPreviousRetired.add(lockerEnvelopesOut.get(m));
                }
            }
        }
        return envelopesPreviousRetired;
    }
    public ArrayList<Magazine> getSearchDeleteMagazines(ArrayList<Integer> codesList){
        ArrayList<Magazine> magazinesPreviousRetired=new ArrayList<>();
        for (int j=0;j<codesList.size();j++){
            for(int m=0;m<lockerMagazinesOut.size();m++){
                if(codesList.get(j)==lockerMagazinesOut.get(m).get_code()){
                    magazinesPreviousRetired.add(lockerMagazinesOut.get(m));
                }
            }
        }
        return magazinesPreviousRetired;
    }

    public ArrayList<Package> getLockerPackagesOut() {
        System.out.println("el largo es:");
        System.out.println(lockerPackagesOut.size());
        return lockerPackagesOut;
    }

    public ArrayList<Envelope> getLockerEnvelopesOut() {
        return lockerEnvelopesOut;
    }

    public ArrayList<Magazine> getLockerMagazinesOut() {
        return lockerMagazinesOut;
    }
    
}
