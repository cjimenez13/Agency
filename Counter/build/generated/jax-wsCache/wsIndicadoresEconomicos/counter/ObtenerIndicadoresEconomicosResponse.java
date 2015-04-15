
package counter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ObtenerIndicadoresEconomicosResult" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any minOccurs="2"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "obtenerIndicadoresEconomicosResult"
})
@XmlRootElement(name = "ObtenerIndicadoresEconomicosResponse")
public class ObtenerIndicadoresEconomicosResponse {

    @XmlElement(name = "ObtenerIndicadoresEconomicosResult")
    protected ObtenerIndicadoresEconomicosResponse.ObtenerIndicadoresEconomicosResult obtenerIndicadoresEconomicosResult;

    /**
     * Gets the value of the obtenerIndicadoresEconomicosResult property.
     * 
     * @return
     *     possible object is
     *     {@link ObtenerIndicadoresEconomicosResponse.ObtenerIndicadoresEconomicosResult }
     *     
     */
    public ObtenerIndicadoresEconomicosResponse.ObtenerIndicadoresEconomicosResult getObtenerIndicadoresEconomicosResult() {
        return obtenerIndicadoresEconomicosResult;
    }

    /**
     * Sets the value of the obtenerIndicadoresEconomicosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObtenerIndicadoresEconomicosResponse.ObtenerIndicadoresEconomicosResult }
     *     
     */
    public void setObtenerIndicadoresEconomicosResult(ObtenerIndicadoresEconomicosResponse.ObtenerIndicadoresEconomicosResult value) {
        this.obtenerIndicadoresEconomicosResult = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;any minOccurs="2"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class ObtenerIndicadoresEconomicosResult {

        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }

}
