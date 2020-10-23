package order.finder;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import service.OrderShowerService;

@SpringBootApplication
public class OrderFinderApp {
    public static void main(String[] args) {
        SpringApplication.run(OrderFinderApp.class);

    }
    @Value("${service-url}")
    private String serviceUrl;
    @Bean
    public OrderShowerService createOrderShowerService(){
        JaxWsProxyFactoryBean proxyFactoryBean=new JaxWsProxyFactoryBean();
        proxyFactoryBean.setAddress(serviceUrl);
        proxyFactoryBean.setServiceClass(OrderShowerService.class);
        OrderShowerService orderShowerService=(OrderShowerService)proxyFactoryBean.create();
        return orderShowerService;
    }
}
