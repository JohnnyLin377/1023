package jms.spring.cosumer;

import commons.pojo.Payment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;

import javax.jms.ConnectionFactory;

//http://johnyu.cn:8161/
@SpringBootApplication
@EnableJms
public class SpringConsumer {
    public static void main(String[] args) {
        SpringApplication.run(SpringConsumer.class,args);
    }
    @Bean
    public MessageConverter jacksonJmsMessageConverter() {
        MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
        converter.setTargetType(MessageType.TEXT);
        converter.setTypeIdPropertyName("className");//"className"可以为任意字符，用于标记传递数据的类型
        return converter;
    }

    @Bean
    public JmsListenerContainerFactory<?> myFactory(ConnectionFactory connectionFactory,
                                                    DefaultJmsListenerContainerFactoryConfigurer configurer,
                                                    MessageConverter messageConverter) {
        DefaultJmsListenerContainerFactory jmsListenerContainerFactory = new DefaultJmsListenerContainerFactory();
        jmsListenerContainerFactory.setMessageConverter(messageConverter);
        configurer.configure(jmsListenerContainerFactory, connectionFactory);
        return jmsListenerContainerFactory;
    }



    @JmsListener(destination = "john_queue")
    public void receive(Payment payment){
        System.out.println("收到的消息："+payment);
    }
}
