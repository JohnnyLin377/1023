package order.processor;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import service.OrderShowerService;

import javax.annotation.Resource;
import javax.xml.ws.Endpoint;

@SpringBootApplication
@EnableJms
@MapperScan(basePackages = "order.processor.mapper")
public class OrderPorcessorApp {
    public static void main(String[] args) {
        SpringApplication.run(OrderPorcessorApp.class);
    }

    @Resource
    private Bus bus;
    @Resource
    private OrderShowerService orderShowerService;

    @Bean
    public Endpoint createEndpoint(){
        Endpoint endpoint=new EndpointImpl(bus,orderShowerService);
        endpoint.publish("/orders");
        return endpoint;
    }
}
