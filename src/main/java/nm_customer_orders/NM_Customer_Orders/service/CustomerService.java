package nm_customer_orders.NM_Customer_Orders.service;


import nm_customer_orders.NM_Customer_Orders.exception.ResourceNotFoundException;
import nm_customer_orders.NM_Customer_Orders.model.Customer;
import nm_customer_orders.NM_Customer_Orders.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    public Customer addCustomer(Customer customer) {
        return repository.save(customer);
    }

    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }

    public Customer getCustomerById(Long id) {
        return repository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Customer not found!"));
    }

    public void deleteCustomerById(Long id) {
        repository.deleteById(id);
    }
}