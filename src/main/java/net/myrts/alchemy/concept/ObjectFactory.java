
package net.myrts.alchemy.concept;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.myrts.alchemy.concept package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Results_QNAME = new QName("", "results");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.myrts.alchemy.concept
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResultsType }
     * 
     */
    public ResultsType createResultsType() {
        return new ResultsType();
    }

    /**
     * Create an instance of {@link ConceptsType }
     * 
     */
    public ConceptsType createConceptsType() {
        return new ConceptsType();
    }

    /**
     * Create an instance of {@link ConceptType }
     * 
     */
    public ConceptType createConceptType() {
        return new ConceptType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "results")
    public JAXBElement<ResultsType> createResults(ResultsType value) {
        return new JAXBElement<ResultsType>(_Results_QNAME, ResultsType.class, null, value);
    }

}
