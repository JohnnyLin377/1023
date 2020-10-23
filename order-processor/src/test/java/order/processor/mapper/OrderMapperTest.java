package order.processor.mapper;

import commons.pojo.Order;
import order.processor.OrderPorcessorApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.UUID;

@SpringBootTest(classes = OrderPorcessorApp.class)
@RunWith(SpringRunner.class)
public class OrderMapperTest {
    @Resource
    private OrderMapper orderMapper;
    @Test
    public void testAddOrder(){
        Order order=new Order();
        order.setSn(UUID.randomUUID().toString().substring(20));
        orderMapper.addOrder(order);
    }
    @Test
    public void testFindAllOrders(){
        orderMapper.findAllOrders().stream().forEach(order -> System.out.println(order.getSn()));
    }
}
