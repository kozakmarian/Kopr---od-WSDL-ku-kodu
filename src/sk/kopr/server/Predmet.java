
package sk.kopr.server;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Predmet", targetNamespace = "http://localhost:8888/AJS?wsdl", wsdlLocation = "file:/E:/Skola/3%20rocnik%20ZS/Konkurentne%20programovanie/Projekt2/WSDLKod/src/AJS.wsdl")
public class Predmet
    extends Service
{

    private final static URL PREDMET_WSDL_LOCATION;
    private final static WebServiceException PREDMET_EXCEPTION;
    private final static QName PREDMET_QNAME = new QName("http://localhost:8888/AJS?wsdl", "Predmet");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/E:/Skola/3%20rocnik%20ZS/Konkurentne%20programovanie/Projekt2/WSDLKod/src/AJS.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PREDMET_WSDL_LOCATION = url;
        PREDMET_EXCEPTION = e;
    }

    public Predmet() {
        super(__getWsdlLocation(), PREDMET_QNAME);
    }

    public Predmet(WebServiceFeature... features) {
        super(__getWsdlLocation(), PREDMET_QNAME, features);
    }

    public Predmet(URL wsdlLocation) {
        super(wsdlLocation, PREDMET_QNAME);
    }

    public Predmet(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PREDMET_QNAME, features);
    }

    public Predmet(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Predmet(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PredmetPort
     */
    @WebEndpoint(name = "PredmetPort")
    public PredmetPort getPredmetPort() {
        return super.getPort(new QName("http://localhost:8888/AJS?wsdl", "PredmetPort"), PredmetPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PredmetPort
     */
    @WebEndpoint(name = "PredmetPort")
    public PredmetPort getPredmetPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://localhost:8888/AJS?wsdl", "PredmetPort"), PredmetPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PREDMET_EXCEPTION!= null) {
            throw PREDMET_EXCEPTION;
        }
        return PREDMET_WSDL_LOCATION;
    }

}