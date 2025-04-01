package nm_customer_orders.NM_Customer_Orders.service;

import nm_customer_orders.NM_Customer_Orders.exception.ResourceNotFoundException;
import nm_customer_orders.NM_Customer_Orders.model.Order;
import nm_customer_orders.NM_Customer_Orders.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public Order addOrder(Order order) {
        return repository.save(order);
    }

    public Order getOrderById(Long id) {
        return repository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Order not found!"));
    }

    public List<Order> getAllOrders() {
        return repository.findAll();
    }

    public void deleteOrder(Long id) {
        repository.deleteById(id);
    }
}