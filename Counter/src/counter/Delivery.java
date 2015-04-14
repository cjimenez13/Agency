/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counter;
import java.util.Calendar;
/**
 *
 * @author Byron
 */
public class Delivery {
    protected static int identifier=1;
    protected int code;
    protected boolean status;
    protected String description;

    protected String remittent;
    protected Calendar date;
    protected Calendar out_date;
    protected Double price;
    public Delivery(boolean status, String description, String remittent,Calendar date,Calendar out_date,double price) {
        this.code=identifier;
        this.status = status;
        this.description = description;
        this.remittent = remittent;
        this.date=date;
        this.out_date=out_date;
        this.price=price;
        identifier++;
    }

    public final void set_code(int pcode) {
        code = pcode;
    }
    public int get_code() {
        return code;
    }
    public final void set_status(boolean pstatus) {
        status = pstatus;
    }
    public boolean get_status() {
        return status;
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

    public void setOut_date(Calendar out_date) {
        this.out_date = out_date;
    }

    public Double get_original_price() {
        return price;
    }
    
    
    public void Display_delivery(){
        System.out.println("Código: "+get_code());
        System.out.println("Estado: "+get_status());
        System.out.println("Descripción: "+get_description());
        System.out.println("Remitente: "+get_remittent());
    }
}

