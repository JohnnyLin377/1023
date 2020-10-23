package order.processor.service;

import commons.pojo.Order;
import order.processor.mapper.OrderMapper;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderProcessorService {
    @Resource
    private OrderMapper orderMapper;
    @JmsListener(destination = "john_queue")
    public void receive(String ordersn){
        Order order=new Order();
        order.setSn(ordersn);
        orderMapper.addOrder(order);
    }
}
