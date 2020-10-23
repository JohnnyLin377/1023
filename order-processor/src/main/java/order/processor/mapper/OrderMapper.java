package order.processor.mapper;

import commons.pojo.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
//@Repository
public interface OrderMapper {
    int addOrder(Order order);
    List<Order> findAllOrders();
}
