package customer.account.management.service.implementation;

import customer.account.management.dto.CustomerDto;
import customer.account.management.exception.CustomerNotFoundException;
import customer.account.management.mapper.CustomerMapper;
import customer.account.management.model.Customer;
import customer.account.management.repository.CustomerRepository;
import customer.account.management.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer getCustomer(Long customerId){
        return customerRepository.findById(customerId).orElseThrow(() -> new CustomerNotFoundException(customerId));
    }

    @Override
    public CustomerDto getCustomerDto(Long customerId){

        try {
            return CustomerMapper.INSTANCE.mapToCustomerDto(getCustomer(customerId));
        }
        catch (CustomerNotFoundException customerNotFoundException){
            throw new CustomerNotFoundException(customerId);
        }
    }
}