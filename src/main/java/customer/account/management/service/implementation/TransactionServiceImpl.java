package customer.account.management.service.implementation;

import customer.account.management.model.CurrentAccount;
import customer.account.management.model.Transaction;
import customer.account.management.repository.TransactionRepository;
import customer.account.management.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    TransactionRepository transactionRepository;

    @Override
    public void createTransaction(BigDecimal amount, CurrentAccount currentAccount){
        Transaction transaction = new Transaction(amount,currentAccount);
        transactionRepository.save(transaction);
    }
}
