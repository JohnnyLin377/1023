package cxf.natv.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import service.WetherService;

import javax.management.MXBean;

public class NatvClientWithCxfApplication {
    public static void main(String[] args) {
        JaxWsProxyFactoryBean factoryBean=new JaxWsProxyFactoryBean();
        factoryBean.setAddress("http://localhost:8001/services/wether?wsdl");
        factoryBean.setServiceClass(WetherService.class);
        WetherService wetherService=(WetherService) factoryBean.create();
        String city=wetherService.findCityByZipcode("021");
        System.out.println(city);
    }
//    @Bean
//    public WetherService xxx(){
//        JaxWsProxyFactoryBean factoryBean=new JaxWsProxyFactoryBean();
//        factoryBean.setAddress("http://localhost:8000/wether?wsdl");
//        factoryBean.setServiceClass(WetherService.class);
//        WetherService wetherService=(WetherService) factoryBean.create();
//        String city=wetherService.findCityByZipcode("021");
//        System.out.println(city);
//        return wetherService;
//    }
}
