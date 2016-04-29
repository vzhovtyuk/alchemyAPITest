
package net.myrts.alchemy.concept;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for conceptType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conceptType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="relevance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dbpedia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="freebase" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="opencyc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="yago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conceptType", propOrder = {
    "text",
    "relevance",
    "dbpedia",
    "freebase",
    "opencyc",
    "yago"
})
public class ConceptType {

    @XmlElement(required = true)
    protected String text;
    @XmlElement(required = true)
    protected String relevance;
    @XmlElement(required = true)
    protected String dbpedia;
    @XmlElement(required = true)
    protected String freebase;
    protected String opencyc;
    protected String yago;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the relevance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelevance() {
        return relevance;
    }

    /**
     * Sets the value of the relevance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelevance(String value) {
        this.relevance = value;
    }

    /**
     * Gets the value of the dbpedia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbpedia() {
        return dbpedia;
    }

    /**
     * Sets the value of the dbpedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbpedia(String value) {
        this.dbpedia = value;
    }

    /**
     * Gets the value of the freebase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreebase() {
        return freebase;
    }

    /**
     * Sets the value of the freebase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreebase(String value) {
        this.freebase = value;
    }

    /**
     * Gets the value of the opencyc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpencyc() {
        return opencyc;
    }

    /**
     * Sets the value of the opencyc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpencyc(String value) {
        this.opencyc = value;
    }

    /**
     * Gets the value of the yago property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYago() {
        return yago;
    }

    /**
     * Sets the value of the yago property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYago(String value) {
        this.yago = value;
    }

}
