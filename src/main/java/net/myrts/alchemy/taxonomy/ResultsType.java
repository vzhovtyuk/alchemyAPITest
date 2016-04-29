
package net.myrts.alchemy.taxonomy;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for resultsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="usage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totalTransactions" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taxonomy" type="{}taxonomyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultsType", propOrder = {
    "status",
    "usage",
    "totalTransactions",
    "language",
    "taxonomy"
})
@XmlRootElement(name = "results")
public class ResultsType {

    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    protected String usage;
    @XmlElement(required = true)
    protected String totalTransactions;
    @XmlElement(required = true)
    protected String language;
    @XmlElement(required = true)
    protected TaxonomyType taxonomy;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the usage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsage() {
        return usage;
    }

    /**
     * Sets the value of the usage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsage(String value) {
        this.usage = value;
    }

    /**
     * Gets the value of the totalTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalTransactions() {
        return totalTransactions;
    }

    /**
     * Sets the value of the totalTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalTransactions(String value) {
        this.totalTransactions = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the taxonomy property.
     * 
     * @return
     *     possible object is
     *     {@link TaxonomyType }
     *     
     */
    public TaxonomyType getTaxonomy() {
        return taxonomy;
    }

    /**
     * Sets the value of the taxonomy property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxonomyType }
     *     
     */
    public void setTaxonomy(TaxonomyType value) {
        this.taxonomy = value;
    }

}
