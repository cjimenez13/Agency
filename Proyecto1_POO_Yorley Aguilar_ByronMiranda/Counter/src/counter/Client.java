/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counter;

/**
 *
 * @author Yorley
 */
public class Client {
    private int ID;
    private final String name;
    private String email;
    private int phone;
    private String direction;
    private String gender;
    private String birthday;
    private String type;
    private int cant_recibidos;
    //private int numlocker;//# de Locker que le corresponde
    private Locker locker;
    

    public Client(int ID, String name, String email, int phone, String direction, String gender, String birthday) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.direction = direction;
        this.gender = gender;
        this.birthday = birthday;
        this.type = "Estandar";
        this.cant_recibidos=0;
        this.locker = new Locker();
        //this.locker=locker;
    }

    public Locker get_locker() {
        return locker;
    }

    public void set_locker(Locker locker) {
        this.locker = locker;
    }

    public int get_ID() {
        return ID;
    }

    public String get_name() {
        return name;
    }

    public String get_email() {
        return email;
    }

    public int get_phone() {
        return phone;
    }

    public String get_direction() {
        return direction;
    }

    public String get_gender() {
        return gender;
    }

    public String get_birthday() {
        return birthday;
    }

    public String get_type() {
        return type;
    }

    public int get_cant_recibidos() {
        return cant_recibidos;
    }

    public void set_email(String email) {
        this.email = email;
    }

    public void set_phone(int phone) {
        this.phone = phone;
    }

    public void set_direction(String direction) {
        this.direction = direction;
    }

    public void set_birthday(String birthday) {
        this.birthday = birthday;
    }

    public void set_type(String type) {
        this.type = type;
    }

    public void setCant_recibidos(int cantRecibidos) {
        this.cant_recibidos = cantRecibidos;
    }
    public void changeType(){
            if ((get_cant_recibidos()/10)>=2){
                set_type("gold");
            }else
            if ((get_cant_recibidos()/10)>=1 && (get_cant_recibidos()/10)<2 ){
                set_type("silver");
            }else{
                set_type("standard");
            }
    }
    public double disscount(double pPrice){
            double disscount = 0;
            if((get_type()).equals("silver")){
                disscount= (pPrice*5)/100;
            }
            if((get_type()).equals("gold")){
                disscount= (pPrice*10)/100;
            }
            return disscount;
    }
    
    
    public void Display_client(){
        System.out.println("Identificación: "+get_ID());
        System.out.println("Nombre: "+get_name());
        System.out.println("Email: "+get_email());
        System.out.println("Número telefónico: "+get_phone());
        System.out.println("Direccóno: "+get_direction());
        System.out.println("Género: "+get_gender());
        System.out.println("Fecha de nacimiento: "+get_birthday());
        System.out.println("Tipo de cuenta: "+get_type());
        System.out.println("Cantidad de compras: "+get_cant_recibidos());
        System.out.println("Número de casillero: "+get_locker().getNumber());
        System.out.println("---------------------");
    }
}
