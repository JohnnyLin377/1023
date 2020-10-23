package jms.spring.producer;

import commons.pojo.Payment;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

@Service
public class ProducerService {
    @Resource
    JmsTemplate jmsTemplate;

    public void send1(String message){
        jmsTemplate.send("john_queue",session -> {
            TextMessage textMessage=session.createTextMessage(message);
            return textMessage;
        });
    }

    public void send2(Payment payment){
        jmsTemplate.convertAndSend("john_queue",payment);
    }
}
