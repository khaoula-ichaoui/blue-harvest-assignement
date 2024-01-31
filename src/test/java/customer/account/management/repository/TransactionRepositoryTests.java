package customer.account.management.repository;

import static org.junit.jupiter.api.Assertions.*;
import customer.account.management.model.Transaction;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.math.BigDecimal;

@DataJpaTest
public class TransactionRepositoryTests {

    @Autowired
    TransactionRepository transactionRepository;

    @Test
    public void testSaveTransaction(){
        Transaction transaction = Transaction.builder()
                .amount(new BigDecimal("5000.570"))
                .build();
        transactionRepository.save(transaction);
        Long savedTransactionId = transaction.getTransactionId();
        Transaction transactionFoundById = transactionRepository.findById(savedTransactionId).orElseThrow();
        Long foundTransactionId = transactionFoundById.getTransactionId();
        assertEquals(foundTransactionId,savedTransactionId);
    }
}
