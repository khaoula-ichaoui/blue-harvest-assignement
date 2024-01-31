package customer.account.management.service;

import customer.account.management.dto.CustomerDto;
import customer.account.management.model.Customer;

public interface CustomerService {

    Customer getCustomer(Long customerId);
    CustomerDto getCustomerDto(Long customerId);
}
