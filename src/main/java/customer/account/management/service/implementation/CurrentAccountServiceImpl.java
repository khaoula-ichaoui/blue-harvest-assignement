package customer.account.management.service.implementation;

import customer.account.management.exception.CustomerNotFoundException;
import customer.account.management.exception.InvalidCustomerIdException;
import customer.account.management.model.CurrentAccount;
import customer.account.management.model.Customer;
import customer.account.management.repository.CurrentAccountRepository;
import customer.account.management.service.CurrentAccountService;
import customer.account.management.service.CustomerService;
import customer.account.management.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.security.InvalidParameterException;

@Service
public class CurrentAccountServiceImpl implements CurrentAccountService {

    @Autowired
    CurrentAccountRepository currentAccountRepository;

    @Autowired
    CustomerService customerService;

    @Autowired
    TransactionService transactionService;

    @Override
    public CurrentAccount createCurrentAccount(Long customerId, BigDecimal initialCredit){
        try {
            Customer customer = customerService.getCustomer(customerId);
            CurrentAccount currentAccount = new CurrentAccount(initialCredit,customer);
            if (initialCredit.signum() > 0){
                transactionService.createTransaction(initialCredit,currentAccount);
            } else if (initialCredit.signum() < 0) {
                throw new InvalidParameterException("Amount should be positive");
            }
            return currentAccountRepository.save(currentAccount);
        }
        catch (CustomerNotFoundException customerNotFoundException){
            throw new InvalidCustomerIdException(customerId);
        }
    }
}
