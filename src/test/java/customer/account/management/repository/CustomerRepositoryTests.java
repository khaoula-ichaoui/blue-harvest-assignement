package customer.account.management.repository;

import static org.junit.jupiter.api.Assertions.*;
import customer.account.management.model.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.util.NoSuchElementException;

@DataJpaTest
public class CustomerRepositoryTests {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void testGetCustomer(){
        Customer customer = customerRepository.findById(1L).get();
        assertEquals(1L, customer.getCustomerId());
    }

    @Test
    public void getCustomer_throwsNoSuchElementException_IfNonExistingCustomerId(){
        NoSuchElementException noSuchElementException = assertThrows(NoSuchElementException.class,
                () -> customerRepository.findById(3L).get());

    }
}
