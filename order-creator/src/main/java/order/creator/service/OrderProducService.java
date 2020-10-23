package order.creator.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.TextMessage;
@Service
public class OrderProducService {
    @Resource
    private JmsTemplate jmsTemplate;
    public void sendOrderSn(String sn){
        jmsTemplate.send("john_queue",session -> {
            TextMessage textMessage=session.createTextMessage(sn);
            return textMessage;
        });
    }
}
