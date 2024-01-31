package customer.account.management.repository;

import static org.junit.jupiter.api.Assertions.*;
import customer.account.management.model.CurrentAccount;
import customer.account.management.model.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.math.BigDecimal;
import java.util.NoSuchElementException;

@DataJpaTest
public class CurrentAccountRepositoryTests {

    @Autowired
    CurrentAccountRepository currentAccountRepository;

    @Autowired
    CustomerRepository customerRepository;

    @Test
    public void testSaveCurrentAccount(){
        Customer customer = customerRepository.findById(1L).get();
        CurrentAccount currentAccount = CurrentAccount.builder()
                .initialCredit(new BigDecimal("2000"))
                .customer(customer)
                .build();
        currentAccountRepository.save(currentAccount);
        Long savedCurrentAccountId = currentAccount.getCurrentAccountId();
        CurrentAccount currentAccountFoundById = currentAccountRepository.findById(savedCurrentAccountId).orElseThrow();
        Long foundCurrentAccountId = currentAccountFoundById.getCurrentAccountId();
        assertEquals(foundCurrentAccountId,savedCurrentAccountId);
    }
}
