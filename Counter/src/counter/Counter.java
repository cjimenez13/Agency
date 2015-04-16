/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package counter;

//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.sql.ResultSet;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
import java.util.ArrayList;
//import java.io.StringReader;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.parsers.DocumentBuilder;
//import org.w3c.dom.Document;
//import org.w3c.dom.NodeList;
//import org.w3c.dom.Node;
//import org.w3c.dom.Element;
//import org.xml.sax.InputSource;
import java.util.Calendar;
/**
 *
 * @author Yorley
 */
public class Counter {
    private static Counter _Counter =null;
    private String name;
    private long legal_identity;
    private String direction;
    private int cant_clients;
    private int cant_lockers;
    private ArrayList<Client> client_register = new ArrayList<>(); //se crea una lista de clientes
   // private Locker locker_available[];//array de lockers que posee la empresa a disposición.Relación de composición
                                                 //nótese uso del array en el constructor.
    public Counter(String name, long legal_identity, String direction, int Cant_lockers) {
        this.name = name;
        this.legal_identity = legal_identity;
        this.direction = direction;
        this.cant_clients=0;
        this.cant_lockers=Cant_lockers;
        _Counter = this;     
    }
    private Counter(){}
    public ArrayList<Client> getClient_register() {
        return client_register;
    }
    private static void createInstance(){
        if(_Counter ==null){
            _Counter=new Counter();
        }
    }
    public static synchronized Counter getInstance(){
        createInstance();
        return _Counter;
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
    public Client getClientByLocker(int pNumber){
        Client _client=null;
            for(int i=0; i<cant_clients;i++){
                Client client=client_register.get(i);
                if(client.get_locker().getNumber()==pNumber){
                    _client= client;
                    return _client;  
                }else{
                    _client= null;
                }
            }
            return _client;
    }
    public String add_client(int ID, String name, String email, int phone, String direction, String gender, String birthday){
            String number = Integer.toString(ID);            
            if(number.length()!=9){
                return("El número de cédula ingresado no es válido");
                }
            if(Integer.toString(phone).length()!=8){
                return("El número de telefono no es válido");}
            if(email.contains(".com")==false||email.contains("@")==false){
                return("Dirección de correo electrónica inválida");}
            else{
                    if(verified_client_existance(ID)==true){
                        return ("El cliente ya se encuentra registrado");
                    }
                    else{
                        int lockers_number=client_register.size();
                        if(lockers_number==cant_lockers)
                                return("No hay lockers disponibles");
                        else{
                            Client client=new Client(ID,name,email, phone,direction,gender,birthday);
                            client_register.add(client);
                            cant_clients++;
                            return "";
                        }
                    }
                }      
    }
    public void delete_client(int ID){
        if(verified_client_existance(ID)==false){
            System.out.println("No registrado");///return false en caso de que no se pueda eliminar
        }else{
               for(int i=0; i<cant_clients;i++){
                    Client client=client_register.get(i);
                    if(client.get_ID()==ID)
                    {
                        client_register.remove(i);
                        cant_clients--;
                    }     
               }
            }
    }    
    public String modify_client(int ID,String email,int phone,String Direction){
        if(verified_client_existance(ID)!=true){
            return("El cliente no se encuentra registrado"); 
        }
        if(Integer.toString(phone).length()!=8||email.contains("@")==false||email.contains(".com")==false){
            return("Error de formato en la infromación");   
        }
        else{
            Client client=getClient(ID);
                client.set_email(email);
                client.set_phone(phone);
                client.set_direction(direction);
        }
        return " ";
    }
    //Método que verifica si el cliente se encuentra o no registrado por medio de su ID
    public boolean verified_client_existance(int ID){
            for(int i=0; i<cant_clients;i++){
                Client client=client_register.get(i);
                if(client.get_ID()==ID)
                    return true; //retorna True si el cliente efectivamente existe        
            }
            return false;//False si el cliente no es encontrado
        }
    public boolean saveDeliveryEnvelope(int pID,Envelope pDeliverTypeEnvelope){
        Client client= getClient(pID);
        Locker locker= client.get_locker();
        locker.addEnvelope(pDeliverTypeEnvelope);
        locker.set_state(true);
        client.changeType();
        return true;
    }
    public boolean saveDeliveryPackage(int pID,Package pDeliverTypePackage){
        Client client= getClient(pID);
        Locker locker= client.get_locker();
        locker.addPackage(pDeliverTypePackage);
         locker.set_state(true);
         client.changeType();
        return true;
    }
    public boolean saveDeliveryMagazine(int pID,Magazine pDeliverTypeMagazine){
        Client client= getClient(pID);
        Locker locker= client.get_locker();
        locker.addMagazine(pDeliverTypeMagazine);
        locker.set_state(true);
        client.changeType();
        return true;
    }
    //retorna los paquetes que tiene pendiente de retirar una persona en específico.
    public ArrayList<Package> non_retired_packages(int ID){
     ArrayList<Package> list=new ArrayList<>();
     Client client= getClient(ID);
     Locker locker= client.get_locker();
     for(int i=0;i<locker.DeliverPackage().size();i++){
         list.add(locker.DeliverPackage().get(i));
     }
     for(int k=0;k<list.size();k++){
         list.get(k).Display_delivery();
     }
     return list;    
     }
     //retorna los sobres que tiene pendiente de retirar uuna persona en específico.
    public ArrayList<Envelope> non_retired_envelope(int ID){
     ArrayList<Envelope> list=new ArrayList<>();
     Client client= getClient(ID);
     Locker locker= client.get_locker();
     for(int i=0;i<locker.DeliverEnvelope().size();i++){
         list.add(locker.DeliverEnvelope().get(i));
     }
     for(int k=0;k<list.size();k++){
         list.get(k).Display_delivery();
     }
     return list;    
     }
//retorna las revistas que tiene pendiente de retirar uuna persona en específico.
    public ArrayList<Magazine> non_retired_magazine(int ID){
     ArrayList<Magazine> list=new ArrayList<>();
     Client client= getClient(ID);
     Locker locker= client.get_locker();
     for(int i=0;i<locker.DeliverMagazine().size();i++){
         list.add(locker.DeliverMagazine().get(i));
     }
     for(int k=0;k<list.size();k++){
         list.get(k).Display_delivery();
     }
     return list;    
     }
//    public double disscount(double pPrice, int pID){
//            Client client= getClient(pID);
//            double disscount = 0;
//            if((client.get_type()).equals("silver")){
//                disscount= (pPrice*5)/100;
//            }
//            if((client.get_type()).equals("gold")){
//                disscount= (pPrice*10)/100;
//            }
//            return disscount;
//    }
    public double chargeIndividualPrice(int pCodeOfDeliver, int pID){
        double price=0;
        Client client= getClient(pID);
        if (client!=null){
            Locker locker= client.get_locker();
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
        return price;
    }
    public double chargeTotalPrice_InsideLocker(Client client,ArrayList<Envelope> envelopes,ArrayList<Package> packages,ArrayList<Magazine> magazines){
        double price=0;
        for (int i=0; envelopes.size()!=i;i++ ){
            price+=(envelopes.get(i)).getPrice();
        }
        for (int n=0; packages.size()!=n;n++ ){
            price+=(packages.get(n)).getPrice();
        }
        for (int j=0; magazines.size()!=j;j++ ){
            price+=(magazines.get(j)).getPrice();
        }
        //price-=(disscount(price,client.get_ID()));
        price-=client.disscount(price);
        return price;
    }
    //compare_YMD compara el día, año y mes de 2 fechas; si retorna true las fechas pertencen al mismo día del año, en caso contrario, son fechas distintas.
     public static boolean compare_YMD(Calendar date1,Calendar date2){
            boolean sameDay = date1.get(Calendar.YEAR) == date2.get(Calendar.YEAR) && date1.get(Calendar.DATE) == date2.get(Calendar.DATE) && date1.get(Calendar.MONTH)==date2.get(Calendar.MONTH);
            return sameDay;
        }
     //Método que informa a un cliente si su casillero está vacío o no, por numero de ID o de locker en este caso. True si el casillero tiene objetos, false si esta libre.
//    public boolean locker_state(int number){
//        String pnumber = Integer.toString(number);
//        Locker locker;
//       if(pnumber.length()!=9&&pnumber.length()!=4){
//           System.out.println("Número no válido");
//           return false;   
//       }
//       else{
//           if(pnumber.length()==9){
//                 Client client=getClient(number);
//                if(client==null)
//                {
//                     System.out.println("El cliente no está registrado");
//                     return false;
//                }
//                locker= client.get_locker();
//           }
//           else{
//               locker=getClient(number).get_locker();
//            }       
//            if(locker.get_state()==true)
//            {
//                        System.out.println("El locker tiene objetos pendientes de retirar.");
//                        return true;
//                    }
//                    else{
//                        System.out.println("No hay objetos que retirar.");
//                        return false;
//                    }    
//                }
//        }
    //Este método(clients_pending_payment) genera una lista con la información de todos los clientes que presentan morosidad.
    public ArrayList<Client> clients_pending_payment(){
        ArrayList<Client> list=new ArrayList<>();
        for(int i=0;i<cant_clients;i++){
            Client client=client_register.get(i);
            Locker locker=client.get_locker();
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
            Locker locker=client.get_locker();
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
            Locker locker=client.get_locker();
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
            Locker locker=client.get_locker();
            for(int j=0;j<locker.DeliverEnvelope().size();j++){
                Envelope envelope=locker.DeliverEnvelope().get(j);
                list.add(envelope);
            }
        }
    return list;
    }
    //función que retorna lista de tipo string, con los objetos recibidos en una fecha determinada y que no han sido retirados;
    public ArrayList<Package> packages_ByDay(Client pClient,boolean isRetired,boolean dateRetired,int day,int month,int year){
        ArrayList<Package> list=new ArrayList<>();
        if(isRetired==true){
                ArrayList<Package> deletePackages=pClient.get_locker().getLockerPackagesOut();
                for(int j=0;j<deletePackages.size();j++){
                            Package packages=deletePackages.get(j);
                            Calendar date=packages.get_date();
                            if (dateRetired==true){
                                date=packages.getOut_date();
                            }
                            if(day==date.get(Calendar.DATE)&&month==date.get(Calendar.MONTH)+1&&year==date.get(Calendar.YEAR)){
                                list.add(packages);
                            }
                }
        }else{
            if(pClient.get_locker().get_ocuppied()==true){
                Locker locker=pClient.get_locker();
                if(locker.get_state()==isRetired){
                    for(int k=0;k<locker.DeliverPackage().size();k++){
                        Package packagee=locker.DeliverPackage().get(k);
                            Calendar date=packagee.get_date();
                            if (dateRetired==true){
                                date=packagee.getOut_date();
                            }
                        //Es necesario sumarle un elemento al mes, ya que la librería le asigna valores comenzando en 0.
                        if(day==date.get(Calendar.DATE)&&month==date.get(Calendar.MONTH)+1&&year==date.get(Calendar.YEAR)){                          
                            list.add(packagee);
                        }
                    }
                }       
            }      
        }   
        return list;    
    }
    //función que retorna lista de tipo envelope, con los objetos recibidos en una fecha determinada y que no han sido retirados;
    
    public ArrayList<Envelope> envelopes_ByDay(Client pClient,boolean isRetired,boolean dateRetired,int day,int month,int year){
        ArrayList<Envelope> list=new ArrayList<>();
            if(isRetired==true){
                ArrayList<Envelope> deleteEnvelopes=pClient.get_locker().getLockerEnvelopesOut();
                for(int j=0;j<deleteEnvelopes.size();j++){
                            Envelope envelope=deleteEnvelopes.get(j);
                            Calendar date=envelope.get_date();
                            if (dateRetired==true){
                                date=envelope.getOut_date();
                            }
                            if(day==date.get(Calendar.DATE)&&month==date.get(Calendar.MONTH)+1&&year==date.get(Calendar.YEAR)){
                                list.add(envelope);
                            }
                        }
            }else{
                if(pClient.get_locker().get_ocuppied()==true){
                    Locker locker=pClient.get_locker();
                    if(locker.get_state()==isRetired){
                           for(int j=0;j<locker.DeliverEnvelope().size();j++){
                            Envelope envelope=locker.DeliverEnvelope().get(j);
                            Calendar date=envelope.get_date();
                            if (dateRetired==true){
                                date=envelope.getOut_date();
                            }
                            if(day==date.get(Calendar.DATE)&&month==date.get(Calendar.MONTH)+1&&year==date.get(Calendar.YEAR)){
                                list.add(envelope);
                            }
                        }
                    }     
                }      
            }
    return list;    
    }
     //función que retorna lista de tipo magazine, con los objetos recibidos en una fecha determinada y que no han sido retirados;
    public ArrayList<Magazine> magazine_ByDay(Client pClient,boolean isRetired,boolean dateRetired,int day,int month,int year){
        ArrayList<Magazine> list=new ArrayList<>();
        if(isRetired==true){
                ArrayList<Magazine> deleteMagazine=pClient.get_locker().getLockerMagazinesOut();
                for(int j=0;j<deleteMagazine.size();j++){
                            Magazine magazine=deleteMagazine.get(j);
                            Calendar date=magazine.get_date();
                            if (dateRetired==true){
                                date=magazine.getOut_date();
                            }
                            if(day==date.get(Calendar.DATE)&&month==date.get(Calendar.MONTH)+1&&year==date.get(Calendar.YEAR)){
                                list.add(magazine);
                            }
                }
        }else{
            if(pClient.get_locker().get_ocuppied()==true){
                Locker locker=pClient.get_locker();
                if(locker.get_state()==isRetired){                        
                  for(int m=0;m<locker.DeliverMagazine().size();m++){
                        Magazine magazine=locker.DeliverMagazine().get(m);
                            Calendar date=magazine.get_date();
                            if (dateRetired==true){
                                date=magazine.getOut_date();
                            }
                        if(day==date.get(Calendar.DATE)&&month==date.get(Calendar.MONTH)+1&&year==date.get(Calendar.YEAR)){
                            System.out.println("hola");
                            list.add(magazine);
                        }               
                     }
                }
            } 
        }
        return list;
     }    
    ///método que forma un string con toda la infromación necesaria del descuento aplicado al cliente en un paquete.
    public String show_tax_delivery(Package packagee){
        String information="";
        //information+=("Precio original: "+Double.toString(packagee.get_original_price())+"\n");
        information+=("Impuesto por peso:"+Double.toString(packagee.get_weight()*0.02)+"\n" );
        int fragility=0;
        int techno=0;
        if(packagee.get_frailness()==true)
            fragility=2;
        information+=("Impuesto por fragilidad: "+Integer.toString(fragility)+"\n");
        if(packagee.get_technological()==true)
            techno=2;
        information+=("Impuesto por tipo de paquete: "+Integer.toString(fragility)+"\n");
        information+=("Precio del artículo con impuestos: "+Double.toString(packagee.get_original_price()));
        System.out.println(information);
        return information;
    }
       ///método que forma un string con toda la infromación necesaria del descuento aplicado al cliente en un sobre.
    public String show_tax_delivery(Envelope envelope){
        String information="";
        double tax=1;
        if (envelope.get_typeEnvelope().equals("aereo") && !(envelope.get_typeEnvelope().equals("documento"))){
            tax=1;
        }
        if (envelope.get_typeEnvelope().equals("manila") && !(envelope.get_typeEnvelope().equals("documento"))){
            tax=2;
        }
        if (envelope.get_typeEnvelope().equals("manila") && (envelope.get_typeEnvelope().equals("documento"))){
            tax=1;
        }
        //information+=("Precio original del sobre: "+Double.toString(envelope.get_original_price())+"\n");
        information+=("Tipo de sobre: "+envelope.get_typeEnvelope()+"\n");
        information+=("Impuesto por tipo de sobre: "+Double.toString(tax)+"\n");
        information+=("Precio del artículo con impuestos: "+Double.toString(envelope.get_original_price()));
        System.out.println(information);
        return information;
    }
 ///método que forma un string con toda la infromación necesaria del descuento aplicado al cliente en una revista.
    public String show_tax_delivery(Magazine magazine){
        String information="";
        String tipo="Catálogo";
        double tax=0;
        if (magazine.get_catalog()==false){
            tax=1;
            tipo="Corriente";
        }
        //information+=("Precio original de la revista: "+Double.toString(magazine.get_original_price())+"\n");
        information+=("Tipo de revista: "+tipo+"\n");
        information+=("Impuesto por tipo de revista: "+Double.toString(tax)+"\n");
        information+=("Precio del artículo con impuestos: "+Double.toString(magazine.get_original_price()));
        System.out.println(information);
        return information;
    }
    ///método que forma string con el descuento aplicado al cliente a partir de su tipo(standar, gold, silver)
    public String show_disscount(Client client,double price){
        String information="";
        double disscount=0;
        if(client.get_type()=="silver")
            disscount=5;
         if(client.get_type()=="gold")
             disscount=10;
         information+=("Tipo de cuenta: "+client.get_type()+"\n");
         information+=("Porcentaje de descuento: "+Double.toString(disscount)+"%"+"\n");
         //information+=("Descuento: "+Double.toString(disscount(price,client.get_ID()))+"\n");
         information+=("Descuento: "+Double.toString(client.disscount(price))+"\n");
         //information+=("Precio final del artículo: "+Double.toString(price-disscount(price,client.get_ID()))+"\n");
         information+=("Precio final del artículo: "+Double.toString(price-(client.disscount(price)))+"\n");
         return information;
    }
     public ArrayList<Package> retrieve_packages(ArrayList<Integer> list,int ID){
        ArrayList<Package> packages=new ArrayList<>();
        Client client=getClient(ID);
        Locker locker=client.get_locker();
        for(int i=0;i<list.size();i++){
            for(int k=0;k<locker.DeliverPackage().size();k++){
                Package packagee=locker.DeliverPackage().get(k);
                if(packagee.get_code()==list.get(i)){
                    locker.takeOutPackage(packagee.get_code());
                    packages.add(packagee);
                    
                }
            }
        }
        return packages;
    }
///método con el cual el cliente paga uno, o varios objetos de tipo sobre   
    public ArrayList<Envelope> retrieve_envelopes(ArrayList<Integer> list,int ID){
        ArrayList<Envelope> envelopes=new ArrayList<>();
        Client client=getClient(ID);
        Locker locker=client.get_locker();
        for(int i=0;i<list.size();i++){
            for(int k=0;k<locker.DeliverEnvelope().size();k++){
                Envelope envelope=locker.DeliverEnvelope().get(k);
                if(envelope.get_code()==list.get(i));
                {
                    locker.takeOutEnvelope(envelope.get_code());
                    envelopes.add(envelope);
                }
            }
        }
        return envelopes;
    }
 ///método con el cual el cliente paga uno, o varios objetos de tipo sobre   
    public ArrayList<Magazine> retrieve_magazines(ArrayList<Integer> list,int ID){
        ArrayList<Magazine> magazines=new ArrayList<>();
        Client client=getClient(ID);
        Locker locker=client.get_locker();
        for(int i=0;i<list.size();i++){
            for(int k=0;k<locker.DeliverMagazine().size();k++){
                Magazine magazine=locker.DeliverMagazine().get(k);
                if(magazine.get_code()==list.get(i));
                {
                    locker.takeOutMagazines(magazine.get_code());
                    magazines.add(magazine);
                }
            }
        }
        return magazines;
    }  

    public static void main(String[] args) {
            // TODO code application logic here
            Counter Aerostore=new Counter("aerosostes",12313,"cwewef",100);
            Aerostore.add_client(304900953,"Byron", "bmiranda@.com", 12345678, "paraiso cartago", "H","18/11/1995");
            Aerostore.add_client(304900950,"GOKU", "bmiranda@.com", 12345678, "paraiso cartago", "H","18/11/1995");
            Aerostore.add_client(304900951,"Chichimara", "bmiranda@.com", 12345678, "paraiso cartago", "F","18/11/1995");
            Aerostore.add_client(304900952,"Liryel", "bmiranda@.com", 12345678, "paraiso cartago", "H","18/11/1995");
            Magazine deliver= new Magazine("revista de cocina mediterranea", "yor", "cocina mediterranea", false, "cocina");
            Aerostore.saveDeliveryMagazine(304900950, deliver);
            Package deliver1=new Package("computadora mac","yorley",true,true,40);
            Aerostore.saveDeliveryPackage(304900952, deliver1);
            Package deliver2=new Package("almohadas","yorley",true,true,60);
            Aerostore.saveDeliveryPackage(304900952, deliver2);

            
        }

}
