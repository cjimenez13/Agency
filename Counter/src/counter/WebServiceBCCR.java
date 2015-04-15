package counter;

import java.io.StringReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/**
 *
 * @author Yorley
 */
public class WebServiceBCCR {
    private static WebServiceBCCR _Instance = null;
    
    
    private WebServiceBCCR(){
        
    }
    private static void createInstance(){
        if (_Instance== null){
            _Instance = new WebServiceBCCR();
        }
    }
    public static synchronized WebServiceBCCR getInstance(){
        createInstance();
        return _Instance;
                
    }
    
    public double getExchangeSale(){
        return exchangeSaleOfForeignCurrency(assing_date_webservice(),assing_date_webservice());
    }
    public double getExchangePurchase(){
        return exchangePurchaseForeignCurrency(assing_date_webservice(),assing_date_webservice());
    }
    //assign_date_webservice se encarga de obtener la fecha del ordenador y lo retorna para uso en el web service en forma de string
    private static String assing_date_webservice()
            {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Calendar cal = Calendar.getInstance();
            Calendar.getInstance();
            String date=dateFormat.format(cal.getTime());
            return date;
    } 
    
    
    
    private double exchangeSaleOfForeignCurrency(String fecha1,String fecha2){
    String xml=obtenerIndicadoresEconomicosXML("318", fecha1, fecha2, "Byron", "N");
    double exchange=0;
    try{
        DocumentBuilderFactory built_xml = DocumentBuilderFactory.newInstance();
        built_xml.setNamespaceAware(true); 
        DocumentBuilder builder = built_xml.newDocumentBuilder();
        Document doc = builder.parse(new InputSource(new StringReader(xml)));
        NodeList Result = doc.getElementsByTagName("INGC011_CAT_INDICADORECONOMIC");
        Node output = Result.item(0);
        if (output.getNodeType() == Node.ELEMENT_NODE){
            Element elemento = (Element) output;
            NodeList lista = elemento.getElementsByTagName("NUM_VALOR").item(0).getChildNodes();
            Node valor = (Node) lista.item(0);
            exchange = Double.parseDouble(valor.getNodeValue());
            //System.out.println(exchange );         
        }
    }catch(Exception ex){
          ex.printStackTrace();
    }
        return exchange;
    }
    public double exchangePurchaseForeignCurrency(String fecha1,String fecha2){
    String xml=obtenerIndicadoresEconomicosXML("317", fecha1, fecha2, "Byron", "N");
    double exchange=0;
    try{
        DocumentBuilderFactory built_xml = DocumentBuilderFactory.newInstance();
        built_xml.setNamespaceAware(true); 
        DocumentBuilder builder = built_xml.newDocumentBuilder();
        Document doc = builder.parse(new InputSource(new StringReader(xml)));
        NodeList Result = doc.getElementsByTagName("INGC011_CAT_INDICADORECONOMIC");
        Node output = Result.item(0);
        if (output.getNodeType() == Node.ELEMENT_NODE){
            Element elemento = (Element) output;
            NodeList lista = elemento.getElementsByTagName("NUM_VALOR").item(0).getChildNodes();
            Node valor = (Node) lista.item(0);
            exchange = Double.parseDouble(valor.getNodeValue());
            //System.out.println(exchange );         
    }
    }catch(Exception ex){
          ex.printStackTrace();
    }
        return exchange;
    }
    private static String obtenerIndicadoresEconomicosXML(java.lang.String tcIndicador, java.lang.String tcFechaInicio, java.lang.String tcFechaFinal, java.lang.String tcNombre, java.lang.String tnSubNiveles) {
        counter.WsIndicadoresEconomicos service = new counter.WsIndicadoresEconomicos();
        counter.WsIndicadoresEconomicosSoap port = service.getWsIndicadoresEconomicosSoap();
        return port.obtenerIndicadoresEconomicosXML(tcIndicador, tcFechaInicio, tcFechaFinal, tcNombre, tnSubNiveles);
    }
}
