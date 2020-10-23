package cxf.spring.server;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import service.WetherService;

import javax.annotation.Resource;
import javax.xml.ws.Endpoint;

@SpringBootApplication
public class SpringServerApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringServerApp.class);
    }
    @Resource
    Bus bus;
    @Resource
    WetherService wetherService;
    @Bean
    public Endpoint createEndpoint(){
        Endpoint endpoint=new EndpointImpl(bus,wetherService);
        endpoint.publish("/wether");
        return endpoint;
    }
}
