package customer.account.management.mapper;

import customer.account.management.dto.CurrentAccountDto;
import customer.account.management.model.CurrentAccount;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CurrentAccountMapper {

    CurrentAccountMapper INSTANCE = Mappers.getMapper(CurrentAccountMapper.class);

    @Mapping(target = "balance", source ="balance" )
    @Mapping(target = "transactionList", source ="transactionList" )
    default CurrentAccountDto mapCurrentAccountToDto(CurrentAccount currentAccount){
        return INSTANCE.mapCurrentAccountToDto(currentAccount);
    }
}
