package customer.account.management.service;

import static org.junit.jupiter.api.Assertions.*;
import customer.account.management.model.Customer;
import customer.account.management.repository.CustomerRepository;
import customer.account.management.service.implementation.CustomerServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CustomerServiceTests {

    @InjectMocks
    CustomerServiceImpl customerService;

    @Mock
    CustomerRepository customerRepository;

    @BeforeEach
    public void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetCustomer(){
        Customer actualCustomer = customerService.getCustomer(1L);
        Customer expectedCustomer = customerRepository.findById(1L).get();
        assertEquals(expectedCustomer,actualCustomer);
    }
}
