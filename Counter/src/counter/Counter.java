/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package counter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Byron
 */
public class Counter {

    private String name;
    private long legal_identity;
    private String direction;
    private int cant_clients;
    private ArrayList<Client> client_register = new ArrayList<>(); //se crea una lista de clientes
    private Locker locker_available[];//array de lockers que posee la empresa a disposición.Relación de composición
                                                      //nótese uso del array en el constructor.
    private ArrayList<Envelope> Sold_envelopes=new ArrayList<>();//Array de tipo envelope, para preservar registro de objetos ya retirados.
    private ArrayList<Package> Sold_packages=new ArrayList<>();//Array de tipo package, para preservar registro de objetos ya retirados.
    private ArrayList<Magazine> Sold_magazines=new ArrayList<>();//Array de tipo Magazine, para preservar registro de objetos ya retirados.     
    public Counter(String name, long legal_identity, String direction, int cant_lockers) {
        this.name = name;
        this.legal_identity = legal_identity;
        this.direction = direction;
        this.cant_clients=0;
        this.locker_available=new Locker[cant_lockers];
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
    public void display_clients(){
        for(int i=0; i<cant_clients;i++){
            Client client=client_register.get(i);
            client.Display_client();
        }
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
                    return _client;
                    
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
            if(Integer.toString(phone).length()!=8){
                System.out.println("El número de telefono no es válido");}
            if(email.contains(".com")==false||email.contains("@")==false){
                System.out.println("Dirección de correo electrónica inválida");}
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
    public boolean modify_client(int ID,String email,int phone,String Direction){
        if(verified_client_existance(ID)!=true){
            System.out.println("El cliente no se encuentra registrado");
            return false;
        }
        if(Integer.toString(phone).length()!=8||email.contains("@")==false||email.contains(".com")==false){
            System.out.println("Error de formato en la infromación");
            return false;
        }
        else{
            Client client=getClient(ID);
            if(email!="")
                client.set_email(email);
            if(phone!=-1111111)                
                client.set_phone(phone);
            if(Direction!="")
                client.set_diretion(direction);
        }
        return true;
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
        locker.set_state(true);
        return true;
    }
    public boolean saveDeliveryPackage(int pID,Package pDeliverTypePackage){
        Client client= getClient(pID);
        Locker locker= getLocker(client.get_locker());
        locker.addPackage(pDeliverTypePackage);
         locker.set_state(true);
        return true;
    }
    public boolean saveDeliveryMagazine(int pID,Magazine pDeliverTypeMagazine){
        Client client= getClient(pID);
        Locker locker= getLocker(client.get_locker());
        locker.addMagazine(pDeliverTypeMagazine);
         locker.set_state(true);
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
    public double chargeIndividualPrice(int pCodeOfDeliver, int pID){
        double price=0;
        Client client= getClient(pID);
        if (client!=null){
            client.get_locker();
            Locker locker= getLocker(client.get_locker()); 
            int option=locker.searchDelivery(pCodeOfDeliver);
            if (option==1){
                ArrayList<Envelope> envelopes=locker.DeliverEnvelope();
                for (int k=0; k!=envelopes.size();k++){
                    if (envelopes.get(k).get_code()==pCodeOfDeliver){
                        price=envelopes.get(k).getPrice();
                        break;
                    }
                }
            }
            if (option==2){
                ArrayList<Package> packages=locker.DeliverPackage();
                for (int l=0; l!=packages.size();l++){
                    if (packages.get(l).get_code()==pCodeOfDeliver){
                        price=packages.get(l).getPrice();
                        break;
                    }
                }
            }
            if (option==3){
                ArrayList<Magazine> magazines=locker.DeliverMagazine();
                for (int w=0; w!=magazines.size();w++){
                    if (magazines.get(w).get_code()==pCodeOfDeliver){
                        price=magazines.get(w).getPrice();
                        break;
                    }
                }
            }

        }else{
            price= -1;
        }
        System.out.println("El precio individual es "+price);
        return price;
    }
    public double chargeTotalPrice_InsideLocker(int pID){
        double price=0;
        Client client= getClient(pID);
        System.out.println("_______________________________________");
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
             System.out.println("rntro");
            price+=(magazines.get(j)).getPrice();
        }
        System.out.println("el precio sin descuento es "+price);
        price-=(disscount(price,pID));
        System.out.println("el precio final es"+price);
        return price;

    }
    public double exchangePurchaseForeignCurrency(){
        double exchange=0;
        return exchange;
    }
    public double exchangeSaleOfForeignCurrency(){
        double exchange=0;
        return exchange;
    }
    //assign_date se encarga de obtener la fecha del ordenador.
    public static Calendar assing_date(){
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Calendar cal = Calendar.getInstance();
            Calendar.getInstance();
            System.out.println(dateFormat.format(cal.getTime()));
            return cal;
    }
    //compare_YMD compara el día, año y mes de 2 fechas; si retorna true las fechas pertencen al mismo día del año, en caso contrario, son fechas distintas.
     public static boolean compare_YMD(Calendar date1,Calendar date2){
            boolean sameDay = date1.get(Calendar.YEAR) == date2.get(Calendar.YEAR) && date1.get(Calendar.DATE) == date2.get(Calendar.DATE) && date1.get(Calendar.MONTH)==date2.get(Calendar.MONTH);
            return sameDay;
        }
     //Método que informa a un cliente si su casillero está vacío o no, por numero de ID o de locker en este caso. True si el casillero tiene objetos, false si esta libre.
    public boolean locker_state(int number){
        String pnumber = Integer.toString(number);
        Locker locker;
       if(pnumber.length()!=9&&pnumber.length()!=4){
           System.out.println("Número no válido");
           return false;   
       }
       else{
           if(pnumber.length()==9){
                 Client client=getClient(number);
                if(client==null)
                {
                     System.out.println("El cliente no está registrado");
                     return false;
                }
                locker=getLocker(client.get_locker());
           }
           else{
               locker=getLocker(number);
            }       
            if(locker.get_state()==true)
            {
                        System.out.println("El locker tiene objetos pendientes de retirar.");
                        return true;
                    }

                    else{
                        System.out.println("No hay objetos que retirar.");
                        return false;
                    }    
                }
        }
    //Este método(clients_pending_payment) genera una lista con la información de todos los clientes que presentan morosidad.
    public ArrayList<Client> clients_pending_payment(){
        ArrayList<Client> list=new ArrayList<>();
        for(int i=0;i<cant_clients;i++){
            Client client=client_register.get(i);
            int numLock=client.get_locker();
            Locker locker=getLocker(numLock);
            if(locker.get_state()==true){
                list.add(client);
            }

        }
        return list;
    }
    //función que retorna lista de objetos que no han sido retirados de la bodega de tipo package;
    public ArrayList<Package> non_retired_packages(){
        ArrayList<Package> list=new ArrayList<>();
        for(int i=0;i<cant_clients;i++){
            Client client=client_register.get(i);
            Locker locker=getLocker(client.get_locker());
            for(int m=0;m<locker.DeliverPackage().size();m++){
                Package packagee=locker.DeliverPackage().get(m);
                list.add(packagee);
            }   
        }
    return list;
    }
     //función que retorna lista de objetos que no han sido retirados de la bodega de tipo magazine;
     public ArrayList<Magazine> non_retired_magazine(){
        ArrayList<Magazine> list=new ArrayList<>();
        for(int i=0;i<cant_clients;i++){
            Client client=client_register.get(i);
            Locker locker=getLocker(client.get_locker());
            for(int k=0;k<locker.DeliverMagazine().size();k++){
                Magazine magazine=locker.DeliverMagazine().get(k);
                list.add(magazine);
            }
  
        }
    return list;
    }
    //función que retorna lista de objetos que no han sido retirados de la bodega de tipo envelope;
     public ArrayList<Envelope> non_retired_envelope(){
        ArrayList<Envelope> list=new ArrayList<>();
        for(int i=0;i<cant_clients;i++){
            Client client=client_register.get(i);
            Locker locker=getLocker(client.get_locker());
            for(int j=0;j<locker.DeliverEnvelope().size();j++){
                Envelope envelope=locker.DeliverEnvelope().get(i);
                list.add(envelope);
                
            }
        }
    return list;
    }
    //función que retorna lista de tipo string, con los objetos recibidos en una fecha determinada y que no han sido retirados;
    public ArrayList<String> non_retired_packages_received(int day,int month,int year){
        ArrayList<String> list=new ArrayList<>();
         for(int i=0;i<100;i++){
            if(locker_available[i].get_ocuppied()==true){
                Locker locker=getLocker(locker_available[i].getNumber());
                if(locker.get_state()==true){
                    for(int j=0;j<locker.DeliverEnvelope().size();j++){
                        Envelope envelope=locker.DeliverEnvelope().get(j);
                        Calendar date=envelope.get_date();
                        if(day==date.get(Calendar.DATE)&&month==date.get(Calendar.MONTH+1)&&year==date.get(Calendar.YEAR)){
                            list.add(Integer.toString(envelope.get_code()));
                            list.add(envelope.get_remittent());
                            list.add("Sobre" +envelope.get_typeEnvelope());
                        }
                        
                    }
                    for(int k=0;k<locker.DeliverPackage().size();k++){
                        Package packagee=locker.DeliverPackage().get(k);
                        Calendar date=packagee.get_date();
                        //Es necesario sumarle un elemento al mes, ya que la librería le asigna valores comenzando en 0.
                        if(day==date.get(Calendar.DATE)&&month==date.get(Calendar.MONTH)+1&&year==date.get(Calendar.YEAR)){
                            
                            list.add(Integer.toString(packagee.get_code()));
                            list.add(packagee.get_remittent());
                            list.add("Paquete de: " +packagee.get_description());
                        }
                    }
                    for(int m=0;m<locker.DeliverMagazine().size();m++){
                        Magazine magazine=locker.DeliverMagazine().get(m);
                        Calendar date=magazine.get_date();
                        if(day==date.get(Calendar.DATE)&&month==date.get(Calendar.MONTH)+1&&year==date.get(Calendar.YEAR)){
                            list.add(Integer.toString(magazine.get_code()));
                            list.add(magazine.get_remittent());
                            list.add("Revista " +magazine.get_name());
                        }               
                     }
                }
        
            }      
        }
    for(int i=0;i<list.size();i++)
    {
        System.out.println(list.get(i));
        if((i+1)%3==0)
            System.out.println("_________");
    }
    return list;    
    }
    
    public ArrayList<String> retired_packages_received(int day,int month,int year){
         ArrayList<String> list= new ArrayList<>();
    return list;    
    }
    public static void main(String[] args) {
            // TODO code application logic here
            Counter Aerostore=new Counter("aerosostes",12313,"cwewef",100);
            Aerostore.add_client(304900953,"Byron", "bmiranda@.com", 12345678, "paraiso cartago", "H","18/11/1995");
            Aerostore.add_client(304900950,"GOKU", "bmiranda@.com", 12345678, "paraiso cartago", "H","18/11/1995");
            Aerostore.add_client(304900951,"Chichimara", "bmiranda@.com", 12345678, "paraiso cartago", "F","18/11/1995");
            Aerostore.add_client(304900952,"Liryel", "bmiranda@.com", 12345678, "paraiso cartago", "H","18/11/1995");
            Aerostore.changeType(304900952);
            Magazine deliver= new Magazine(true, "revista de cocina mediterranea", "yor",assing_date(),assing_date(),3123, "cocina mediterranea", false, "cocina");

            Aerostore.saveDeliveryMagazine(304900950, deliver);
            Package deliver1=new Package(true,"computadora mac","yorley",assing_date(),assing_date(),100,true,true,40);
            Aerostore.saveDeliveryPackage(304900952, deliver1);
            Package deliver2=new Package(true,"almohadas","yorley",assing_date(),assing_date(),14513,true,true,60);
            Aerostore.saveDeliveryPackage(304900952, deliver2);
            Aerostore.chargeTotalPrice_InsideLocker(304900950);
        }
}
