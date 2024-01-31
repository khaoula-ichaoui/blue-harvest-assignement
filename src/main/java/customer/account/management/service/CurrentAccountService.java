package customer.account.management.service;

import customer.account.management.model.CurrentAccount;
import java.math.BigDecimal;

public interface CurrentAccountService {

    CurrentAccount createCurrentAccount(Long customerId, BigDecimal initialCredit);
}
