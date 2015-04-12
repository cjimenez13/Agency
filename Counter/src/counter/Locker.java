/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counter;

/**
 *
 * @author Byron
 */
public  final class Locker {
    private int number;
    private boolean state;//Determinna si está vacío
     private boolean ocuppied;//Determina si posee dueño.
    private static int identifier=1000;

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
    
    
    
    
}
