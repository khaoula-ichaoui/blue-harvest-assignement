package customer.account.management.mapper;

import customer.account.management.dto.CustomerDto;
import customer.account.management.model.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    @Mapping(target = "name", source ="name" )
    @Mapping(target = "surname", source ="surname" )
    @Mapping(target = "currentAccountList", source ="currentAccountList" )
    CustomerDto mapToCustomerDto(Customer customer);
}
