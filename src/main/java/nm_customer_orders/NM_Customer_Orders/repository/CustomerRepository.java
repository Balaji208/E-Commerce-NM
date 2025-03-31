package nm_customer_orders.NM_Customer_Orders.repository;


import nm_customer_orders.NM_Customer_Orders.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}