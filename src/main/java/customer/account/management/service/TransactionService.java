package customer.account.management.service;

import customer.account.management.model.CurrentAccount;
import java.math.BigDecimal;

public interface TransactionService {

    void createTransaction(BigDecimal amount, CurrentAccount currentAccount);
}
