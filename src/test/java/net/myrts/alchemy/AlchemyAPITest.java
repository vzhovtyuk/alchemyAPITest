package net.myrts.alchemy;

import com.alchemyapi.api.AlchemyAPI;
import com.alchemyapi.api.AlchemyAPI_ConceptParams;
import com.alchemyapi.api.AlchemyAPI_TaxonomyParams;
import net.myrts.alchemy.concept.ConceptsType;
import net.myrts.alchemy.concept.ResultsType;
import net.myrts.alchemy.taxonomy.TaxonomyType;
import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPathExpressionException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by IntelliJ IDEA.
 *
 * @author <a href="mailto:vzhovtiuk@gmail.com">Vitaliy Zhovtyuk</a>
 *         Date: 4/29/16
 *         Time: 9:15 AM
 */
public class AlchemyAPITest {
    private final static Logger LOGGER = LoggerFactory.getLogger(AlchemyAPITest.class);

    public static final String DEFAULT_ALCHEMY_KEY = "8b2e812b0467290fa2074d33b8f74006ef7f3245";
    private String alchemyApiKey;

    @Test
    public void shouldAddDocumentConcept() throws IOException, XPathExpressionException, SAXException, ParserConfigurationException, JAXBException {
        String documentContent = getStringResource("/concept.txt");
        String conceptResponse = getStringResource("/conceptResp.xml");
        AlchemyAPI alchemyAPI = AlchemyAPI.GetInstanceFromString(DEFAULT_ALCHEMY_KEY);
        AlchemyAPI_ConceptParams conceptParams = new AlchemyAPI_ConceptParams();

        conceptParams.setHtml(documentContent);
        conceptParams.setMaxRetrieve(50);
        org.w3c.dom.Document documentConcept = alchemyAPI.TextGetRankedConcepts(documentContent, conceptParams);
        String actualStrResponse = getStringFromDocument(documentConcept);
        LOGGER.debug(actualStrResponse);

        assertNotNull("Top ranked concepts result is undefined", documentConcept);
        assertEquals("Concept response does not match", conceptResponse, actualStrResponse);

        JAXBContext jc = JAXBContext.newInstance(net.myrts.alchemy.concept.ResultsType.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        StringReader sr = new StringReader(actualStrResponse);
        net.myrts.alchemy.concept.ResultsType conceptType = (net.myrts.alchemy.concept.ResultsType) JAXBIntrospector.getValue(unmarshaller.unmarshal(sr));
        assertNotNull("Concept type is undefined ", conceptType);
    }

    @Test
    public void shouldProvideTaxonomyClassification() throws IOException, XPathExpressionException, SAXException, ParserConfigurationException, JAXBException {
        String documentContent = getStringResource("/taxonomy.txt");
        String taxonomyResponse = getStringResource("/taxonomyResp.xml");
        AlchemyAPI alchemyAPI = AlchemyAPI.GetInstanceFromString(DEFAULT_ALCHEMY_KEY);
        AlchemyAPI_TaxonomyParams taxonomyParams = new AlchemyAPI_TaxonomyParams();

        taxonomyParams.setHtml(documentContent);
        taxonomyParams.setMaxRetrieve(50);
        org.w3c.dom.Document documentConcept = alchemyAPI.TextGetTaxonomy(documentContent, taxonomyParams);
        String actualStrResponse = getStringFromDocument(documentConcept);

        LOGGER.debug(actualStrResponse);

        assertNotNull("Taxonomy result is undefined", documentConcept);
        assertEquals("Taxonomy response does not match", taxonomyResponse, actualStrResponse);

        JAXBContext jc = JAXBContext.newInstance(net.myrts.alchemy.taxonomy.ResultsType.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        StringReader sr = new StringReader(actualStrResponse);
        net.myrts.alchemy.taxonomy.ResultsType taxonomyType = (net.myrts.alchemy.taxonomy.ResultsType) JAXBIntrospector.getValue(unmarshaller.unmarshal(sr));
        assertNotNull("Taxonomy type is undefined ", taxonomyType);

    }

    private String getStringResource(String path) throws IOException {
        return new String(IOUtils.toByteArray(AlchemyAPITest.class.getResourceAsStream(path)));
    }

    //method to convert Document to String
    private String getStringFromDocument(org.w3c.dom.Document doc) {
        try {
            DOMSource domSource = new DOMSource(doc);
            StringWriter writer = new StringWriter();
            StreamResult result = new StreamResult(writer);
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.transform(domSource, result);
            return writer.toString();
        } catch (TransformerException ex) {
            ex.printStackTrace();
            return null;
        }
    }

}
