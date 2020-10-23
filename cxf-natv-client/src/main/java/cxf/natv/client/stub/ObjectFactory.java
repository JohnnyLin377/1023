
package cxf.natv.client.stub;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cxf.natv.client.stub package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
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

    private final static QName _FindCityByZipcode_QNAME = new QName("http://service/", "findCityByZipcode");
    private final static QName _FindCityByZipcodeResponse_QNAME = new QName("http://service/", "findCityByZipcodeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cxf.natv.client.stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindCityByZipcode }
     * 
     */
    public FindCityByZipcode createFindCityByZipcode() {
        return new FindCityByZipcode();
    }

    /**
     * Create an instance of {@link FindCityByZipcodeResponse }
     * 
     */
    public FindCityByZipcodeResponse createFindCityByZipcodeResponse() {
        return new FindCityByZipcodeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCityByZipcode }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindCityByZipcode }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "findCityByZipcode")
    public JAXBElement<FindCityByZipcode> createFindCityByZipcode(FindCityByZipcode value) {
        return new JAXBElement<FindCityByZipcode>(_FindCityByZipcode_QNAME, FindCityByZipcode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCityByZipcodeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindCityByZipcodeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service/", name = "findCityByZipcodeResponse")
    public JAXBElement<FindCityByZipcodeResponse> createFindCityByZipcodeResponse(FindCityByZipcodeResponse value) {
        return new JAXBElement<FindCityByZipcodeResponse>(_FindCityByZipcodeResponse_QNAME, FindCityByZipcodeResponse.class, null, value);
    }

}
