package nm_customer_orders.NM_Customer_Orders.repository;

import nm_customer_orders.NM_Customer_Orders.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}