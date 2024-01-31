package customer.account.management.controller;

import customer.account.management.model.CurrentAccount;
import customer.account.management.service.implementation.CurrentAccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/current-accounts")
public class CurrentAccountController {

    @Autowired
    CurrentAccountServiceImpl currentAccountService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<CurrentAccount>  createCurrentAccount(@RequestParam("customerId") Long customerId,
                                               @RequestParam("initialCredit") BigDecimal initialCredit){
        CurrentAccount currentAccount = currentAccountService.createCurrentAccount(customerId, initialCredit);
        return new ResponseEntity<>(currentAccount, HttpStatus.CREATED);

    }
}
