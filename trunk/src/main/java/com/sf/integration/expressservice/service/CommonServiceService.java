package com.sf.integration.expressservice.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.0
 * 2014-03-21T15:53:45.311+08:00
 * Generated source version: 2.6.0
 * 
 */
@WebServiceClient(name = "CommonServiceService", 
                  wsdlLocation = "http://219.134.187.132:9090/bsp-ois/ws/expressService?wsdl",
                  targetNamespace = "http://service.expressservice.integration.sf.com/") 
public class CommonServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.expressservice.integration.sf.com/", "CommonServiceService");
    public final static QName CommonServicePort = new QName("http://service.expressservice.integration.sf.com/", "CommonServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://219.134.187.132:9090/bsp-ois/ws/expressService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CommonServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://219.134.187.132:9090/bsp-ois/ws/expressService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CommonServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CommonServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CommonServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns IService
     */
    @WebEndpoint(name = "CommonServicePort")
    public IService getCommonServicePort() {
        return super.getPort(CommonServicePort, IService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IService
     */
    @WebEndpoint(name = "CommonServicePort")
    public IService getCommonServicePort(WebServiceFeature... features) {
        return super.getPort(CommonServicePort, IService.class, features);
    }

}
