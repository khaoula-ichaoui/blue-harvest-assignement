package customer.account.management;

import static org.junit.jupiter.api.Assertions.*;

import customer.account.management.controller.CurrentAccountController;
import customer.account.management.controller.CustomerController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CurrentAccountApplicationTests {

    @Autowired
    CustomerController customerController;

    @Autowired
    CurrentAccountController currentAccountController;

    @Test
    void contextLoads() {
        assertNotNull(customerController);
        assertNotNull(currentAccountController);
    }
}
