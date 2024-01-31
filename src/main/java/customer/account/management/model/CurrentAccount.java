package customer.account.management.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "current_accounts")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CurrentAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long currentAccountId;
    private BigDecimal initialCredit;
    private BigDecimal balance;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "customer_Id")
    private Customer customer;
    @JsonIgnore
    @OneToMany(mappedBy = "currentAccount", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Transaction> transactionList;

    public CurrentAccount(BigDecimal initialCredit, Customer customer) {
        this.initialCredit = initialCredit;
        this.customer = customer;
        this.balance = initialCredit;
    }
}
