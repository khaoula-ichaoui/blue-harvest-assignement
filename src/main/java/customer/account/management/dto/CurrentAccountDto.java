package customer.account.management.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import customer.account.management.model.Transaction;
import lombok.Data;
import java.math.BigDecimal;
import java.util.List;

@Data
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CurrentAccountDto {
    private Long currentAccountId;
    private BigDecimal balance;
    private List<Transaction> transactionList;
}
