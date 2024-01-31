package customer.account.management.exception;

public class InvalidCustomerIdException extends RuntimeException{

    public InvalidCustomerIdException(Long customerId){
        super("Customer not found with Id " + customerId);
    }
}
