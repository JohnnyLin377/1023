package cxf.nartv;

import cxf.nartv.service.WetherServiceImpl;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import service.WetherService;

import javax.xml.ws.Endpoint;

public class CxfNatvServerApplication {
    public static void main(String[] args) {
        JaxWsServerFactoryBean factoryBean=new JaxWsServerFactoryBean();
        factoryBean.setServiceClass(WetherService.class);
        factoryBean.setServiceBean(new WetherServiceImpl());
        factoryBean.setAddress("http://localhost:8000/wether");
        factoryBean.create();
//        Endpoint.publish("",new Object());
    }
}
