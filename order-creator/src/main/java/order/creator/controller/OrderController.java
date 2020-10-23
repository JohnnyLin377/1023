package order.creator.controller;

import commons.pojo.Order;
import order.creator.service.OrderProducService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@CrossOrigin
public class OrderController {
    @Resource
    private OrderProducService orderProducService;
    @PostMapping("/orders")
    public String addOrder(@RequestBody Order order){
        orderProducService.sendOrderSn(order.getSn());
        return "success";
    }
}
