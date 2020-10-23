package jms.spring.producer;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;

import javax.annotation.Resource;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;

@SpringBootApplication

@EnableJms
public class SpringProducer {
    public static void main(String[] args) {
        SpringApplication.run(SpringProducer.class,args);
    }
//    @Bean
//    public ConnectionFactory xxx(){
//        return new ActiveMQConnectionFactory("xxxx")
//    }
//    @Bean
//    public Destination xxx(){
//        return new ActiveMQQueue()
//    }
    @Bean
    public JmsTemplate jmsTemplate(ConnectionFactory connectionFactory, MessageConverter messageConverter) {
        JmsTemplate jmsTemplate = new JmsTemplate();
//        jmsTemplate.setDefaultDestinationName("john"); 可以直接指定名字

        jmsTemplate.setConnectionFactory(connectionFactory);
        jmsTemplate.setMessageConverter(messageConverter);
        return jmsTemplate;
    }
    @Bean
    public MessageConverter jacksonJmsMessageConverter() {
        MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
        converter.setTargetType(MessageType.TEXT);
        converter.setTypeIdPropertyName("className");//"className"可以为任意字符，用于标记传递数据的类型
        return converter;
    }

}
