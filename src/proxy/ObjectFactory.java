
package proxy;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
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

    private final static QName _GetCompteResponse_QNAME = new QName("http://WS/", "getCompteResponse");
    private final static QName _ConvertionEuroToDh_QNAME = new QName("http://WS/", "ConvertionEuroToDh");
    private final static QName _GetCompte_QNAME = new QName("http://WS/", "getCompte");
    private final static QName _ListCompteResponse_QNAME = new QName("http://WS/", "listCompteResponse");
    private final static QName _ConvertionEuroToDhResponse_QNAME = new QName("http://WS/", "ConvertionEuroToDhResponse");
    private final static QName _ListCompte_QNAME = new QName("http://WS/", "listCompte");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConvertionEuroToDh }
     * 
     */
    public ConvertionEuroToDh createConvertionEuroToDh() {
        return new ConvertionEuroToDh();
    }

    /**
     * Create an instance of {@link GetCompte }
     * 
     */
    public GetCompte createGetCompte() {
        return new GetCompte();
    }

    /**
     * Create an instance of {@link ListCompteResponse }
     * 
     */
    public ListCompteResponse createListCompteResponse() {
        return new ListCompteResponse();
    }

    /**
     * Create an instance of {@link GetCompteResponse }
     * 
     */
    public GetCompteResponse createGetCompteResponse() {
        return new GetCompteResponse();
    }

    /**
     * Create an instance of {@link ConvertionEuroToDhResponse }
     * 
     */
    public ConvertionEuroToDhResponse createConvertionEuroToDhResponse() {
        return new ConvertionEuroToDhResponse();
    }

    /**
     * Create an instance of {@link ListCompte }
     * 
     */
    public ListCompte createListCompte() {
        return new ListCompte();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getCompteResponse")
    public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse value) {
        return new JAXBElement<GetCompteResponse>(_GetCompteResponse_QNAME, GetCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertionEuroToDh }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "ConvertionEuroToDh")
    public JAXBElement<ConvertionEuroToDh> createConvertionEuroToDh(ConvertionEuroToDh value) {
        return new JAXBElement<ConvertionEuroToDh>(_ConvertionEuroToDh_QNAME, ConvertionEuroToDh.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "getCompte")
    public JAXBElement<GetCompte> createGetCompte(GetCompte value) {
        return new JAXBElement<GetCompte>(_GetCompte_QNAME, GetCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "listCompteResponse")
    public JAXBElement<ListCompteResponse> createListCompteResponse(ListCompteResponse value) {
        return new JAXBElement<ListCompteResponse>(_ListCompteResponse_QNAME, ListCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertionEuroToDhResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "ConvertionEuroToDhResponse")
    public JAXBElement<ConvertionEuroToDhResponse> createConvertionEuroToDhResponse(ConvertionEuroToDhResponse value) {
        return new JAXBElement<ConvertionEuroToDhResponse>(_ConvertionEuroToDhResponse_QNAME, ConvertionEuroToDhResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WS/", name = "listCompte")
    public JAXBElement<ListCompte> createListCompte(ListCompte value) {
        return new JAXBElement<ListCompte>(_ListCompte_QNAME, ListCompte.class, null, value);
    }

}
