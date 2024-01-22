package lk.zerocode.Customer_Loan_Service.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "loan")
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loan_ID;
    private Integer amount;
    private String status;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private LoanType loanType;
}
