package jms.spring.producer;

import commons.pojo.Payment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@SpringBootTest(classes = SpringProducer.class)
@RunWith(SpringRunner.class)
public class ProducerServiceTest {
    @Resource
    private ProducerService producerService;
    @Test
    public void testSend1(){
        producerService.send1("I am johnYu");
    }
    @Test
    public void testSend2(){
        Payment payment=new Payment(100,"deeee");
        producerService.send2(payment);
    }

}
