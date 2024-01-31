package customer.account.management.controller;

import customer.account.management.dto.CustomerDto;
import customer.account.management.model.Customer;
import customer.account.management.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/{id}")
    public ResponseEntity<CustomerDto> getCustomerById(@PathVariable(value = "id") Long customerId) {
        return ResponseEntity.ok().body(customerService.getCustomerDto(customerId));
    }
}
