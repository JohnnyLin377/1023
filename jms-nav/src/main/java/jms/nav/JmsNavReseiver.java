package jms.nav;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;

import javax.jms.*;

public class JmsNavReseiver {
    public static void main(String[] args) throws Exception{
        ConnectionFactory connectionFactory=new ActiveMQConnectionFactory("tcp://localhost:61616");
//        Destination destination=new ActiveMQQueue("john_queue");
        Destination destination=new ActiveMQTopic("john_topic");
        Connection connection=connectionFactory.createConnection();
        connection.start();
        Session session=connection.createSession(true,Session.AUTO_ACKNOWLEDGE);
        MessageConsumer consumer=session.createConsumer(destination);
        consumer.setMessageListener(message -> {
            TextMessage textMessage=(TextMessage)message;
        });

//        TextMessage message=(TextMessage) consumer.receive();
//        System.out.println(message.getText());
//        message.acknowledge();
        session.commit();
        session.close();
        connection.close();
    }
}
