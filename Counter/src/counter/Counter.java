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
public class Counter {

    private String name;
    private long legal_identity;
    private String direction;
    private int cant_clients;
    private ArrayList<Client> client_register = new ArrayList<>(); //se crea un array de clientes con capacidad para 100 miembros.
    private Locker locker_available[]=new Locker[100];//array de lockers que posee la empresa a disposición.Relación de composición
                                                      //nótese uso del array en el constructor.
    public Counter(String name, long legal_identity, String direction, int cant_lockers) {
        this.name = name;
        this.legal_identity = legal_identity;
        this.direction = direction;
        this.cant_clients=0;
        for(int i=0;i<cant_lockers;i++){
            Locker Mailbox=new Locker();
            this.locker_available[i]=Mailbox;//se crean todos los locker al Iniciar el counter.
        }
            
    }
    public String get_name() {
        return name;
    }

    public long get_legal_identity() {
        return legal_identity;
    }
    public String get_direction() {
        return direction;
    }
    
    public void set_direction(String direction) {
        this.direction = direction;
    }
    //assing locker se encarga de encontrar el próximo locker desocupado y reorna su número.
    public int assing_locker(){
        for(int i=0;i<100;i++){
            if(locker_available[i].get_ocuppied()==false){
                locker_available[i].set_ocuppied(true);
                return locker_available[i].getNumber();
            }
        }
        return 0;
    }
    public Locker getLocker(int pNumber){
        Locker locker=null;
        for(int i=0;i<100;i++){
            if(locker_available[i].getNumber()==pNumber){
                    locker=locker_available[i] ;
            }
        }
        return locker;
    }
    public Client getClient(int ID){
        Client _client=null;
            for(int i=0; i<cant_clients;i++){
                Client client=client_register.get(i);
                if(client.get_ID()==ID){
                    _client= client;
                }else{
                    _client= null;
                }
            }
            return _client;
    }
//add_client será sustituido a boolean para términos de interfaz(Suscripción exitosa/fallida).
public void add_client(int ID, String name, String email, int phone, String direction, String gender, String birthday){
        String number = Integer.toString(ID);
        if(number.length()!=9){
            System.out.println("El número de cédula ingresado no es válido");//return false; DEBE CAMBIARSE A LA INTERFAZ!!!
            }
        else{
                if(verified_client_existance(ID)==true){
                    System.out.println("El cliente ya se encuentra registrado");//return false //posicionar en lugar del length cuando exista interfaz
                }
                else{
                    int lockers_number=assing_locker();
                    if(lockers_number==0)
                            System.out.println("No hay lockers disponibles");//return False en caso de que no haya lockers disponibles
                    else{
                        Client client=new Client(ID,name,email, phone,direction,gender,birthday);   
                        client.set_locker(lockers_number);///
                        client_register.add(client);
                        cant_clients++;
                        }
                 //return true;
                }
                }      
    }
public void delete_client(int ID){
    if(verified_client_existance(ID)==false)
        System.out.println("No registrado");///return false en caso de que no se pueda eliminar
    else{
           for(int i=0; i<cant_clients;i++){
            Client client=client_register.get(i);
            if(client.get_ID()==ID)
            {
                 client_register.remove(i);
                 cant_clients--;
                 //return true;
            }     
           }
    }
        
}    
//Método que verifica si el cliente se encuentra o no registrado por medio de su ID
    public boolean verified_client_existance(int ID){
        for(int i=0; i<cant_clients;i++){
            Client client=client_register.get(i);
            if(client.get_ID()==ID)
                return true; //retorna True si el cliente efectivamente existe        
        }
        System.out.println("nn");
        return false;//False si el cliente no es encontrado
    }
public void printInfo(int ID){
    Client pClient=getClient(ID);
    System.out.println("_____________________");
    System.out.println(pClient.get_name());
    System.out.println(pClient.get_type());
    System.out.println(pClient.get_direction());
    System.out.println(pClient.get_email());
    System.out.println(pClient.get_phone());
    System.out.println("_____________________");
    
}  
public boolean saveDeliveryEnvelope(int pID,Envelope pDeliverTypeEnvelope){
    Client client= getClient(pID);
    Locker locker= getLocker(client.get_locker());
    locker.addEnvelope(pDeliverTypeEnvelope);
    return true;
}
public boolean saveDeliveryPackage(int pID,Package pDeliverTypePackage){
    Client client= getClient(pID);
    Locker locker= getLocker(client.get_locker());
    locker.addPackage(pDeliverTypePackage);
    return true;
}
public boolean saveDeliveryMagazine(int pID,Magazine pDeliverTypeMagazine){
    Client client= getClient(pID);
    Locker locker= getLocker(client.get_locker());
    locker.addMagazine(pDeliverTypeMagazine);
    return true;
}
public double disscount(double pPrice, int pID){
    
        Client client= getClient(pID);
        double disscount = 0;
        if((client.get_type()).equals("silver")){
            disscount= (pPrice*5)/100;
        }
        if((client.get_type()).equals("gold")){
            disscount= (pPrice*10)/100;
        }
        
        System.out.println("el descuento es:");
        System.out.println(disscount);
        return disscount;
    
}
public void changeType(int pID){
    Client client= getClient(pID);
        if ((client.get_cant_compras()/10)<=2){
            client.set_type("gold");
        }else
        if ((client.get_cant_compras()/10)>=1 && (client.get_cant_compras()/10)<2 ){
            client.set_type("silver");
        }else{
            client.set_type("standard");
        }
}
public double chargePrice(int pID){
    double price=0;
    Client client= getClient(pID);
    client.get_locker();
    Locker locker= getLocker(client.get_locker());
    ArrayList<Magazine> magazines =locker.DeliverMagazine();
    ArrayList<Envelope> envelopes=locker.DeliverEnvelope();
    ArrayList<Package> packages=locker.DeliverPackage();
    for (int i=0; envelopes.size()!=i;i++ ){
        price+=(envelopes.get(i)).getPrice();
    }
    for (int n=0; packages.size()!=n;n++ ){
        price+=(packages.get(n)).getPrice();
    }
    for (int j=0; magazines.size()!=j;j++ ){
        price+=(magazines.get(j)).getPrice();
    }
    System.out.println("el precio sin descuento es "+price);
    price-=(disscount(price,pID));
    System.out.println("el precio final es"+price);
    return price;
            
}
    public static void main(String[] args) {
        // TODO code application logic here
        Counter Aerostore=new Counter("aerosostes",12313,"cwewef",100);
        Aerostore.add_client(304900953,"Byron", "bmiranda", 879791312, "paraiso cartago", "H","18/11/1995");
        Aerostore.add_client(304900950,"GOKU", "bmiranda", 8712312, "paraiso cartago", "H","18/11/1995");
        Aerostore.add_client(304900951,"Chichimara", "bmiranda", 879791312, "paraiso cartago", "F","18/11/1995");
        Aerostore.add_client(304900952,"Liryel", "bmiranda", 879791312, "paraiso cartago", "H","18/11/1995");
        Aerostore.printInfo(304900952);
        Aerostore.changeType(304900952);
        Aerostore.printInfo(304900952);
        Magazine deliver= new Magazine(true, "revista de cocina mediterranea", "yor", "cocina mediterranea", false, "cocina");
        Aerostore.saveDeliveryMagazine(304900952, deliver);
        Aerostore.chargePrice(304900952);
        
    }
    
}
