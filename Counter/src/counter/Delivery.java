/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 *
 * @author Byron
 */
public class Delivery {
    protected static int identifier=1;
    protected int code;
    protected boolean statusEsPendiente;
    protected String description;
    protected String remittent;
    protected Calendar date;
    protected Calendar out_date;
    protected Double price;
    public Delivery(String description, String remittent) {
        this.code=identifier;
        this.statusEsPendiente = true;
        this.description = description;
        this.remittent = remittent;
        this.date=assing_date();
        this.price=0.0;
        identifier++;
    }

    public final void set_code(int pcode) {
        code = pcode;
    }
    public int get_code() {
        return code;
    }
    public final void set_status() {
        statusEsPendiente = false;
    }
    public boolean get_status() {
        return statusEsPendiente;
    }
    public final void set_description(String pdescription) {
        description = pdescription;
    }
    public String get_description() {
        return description;
    }
    public final void set_remittent(String premittent) {
        remittent = premittent;
    }

    public String get_remittent() {
        return remittent;
    }
    
    public Calendar get_date() {
        return date;
    }

    public Calendar getOut_date() {
        return out_date;
    }

    public void setOut_date() {
        this.out_date = assing_date();
    }

    public Double get_original_price() {
        return price;
    }
    
        //assign_date se encarga de obtener la fecha del ordenador.
    public static Calendar assing_date(){
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Calendar cal = Calendar.getInstance();
            Calendar.getInstance();
            System.out.println(dateFormat.format(cal.getTime()));
            return cal;
    }
    public void Display_delivery(){
        System.out.println("Código: "+get_code());
        System.out.println("Estado: "+get_status());
        System.out.println("Descripción: "+get_description());
        System.out.println("Remitente: "+get_remittent());
    }
}

