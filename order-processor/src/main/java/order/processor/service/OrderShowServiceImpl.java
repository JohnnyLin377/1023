package order.processor.service;

import commons.pojo.Order;
import order.processor.mapper.OrderMapper;
import org.springframework.stereotype.Service;
import service.OrderShowerService;

import javax.annotation.Resource;
import java.util.List;
@Service
public class OrderShowServiceImpl implements OrderShowerService {
    @Resource
    private OrderMapper orderMapper;
    @Override
    public List<Order> findAllOrders() {
        return orderMapper.findAllOrders();
    }
}
