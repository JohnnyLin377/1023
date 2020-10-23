package service;

import commons.pojo.Order;

import javax.jws.WebService;
import java.util.List;

@WebService
public interface OrderShowerService {
    List<Order> findAllOrders();
}
