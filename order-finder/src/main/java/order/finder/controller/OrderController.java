package order.finder.controller;

import commons.pojo.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import service.OrderShowerService;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class OrderController {
    @Resource
    private OrderShowerService orderShowerService;

    @GetMapping("/orders")
    public List<Order> findAllOrders(){
        return orderShowerService.findAllOrders();
    }
}
