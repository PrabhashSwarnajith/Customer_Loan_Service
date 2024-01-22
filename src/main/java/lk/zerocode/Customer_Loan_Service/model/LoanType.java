package lk.zerocode.Customer_Loan_Service.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "loan_Type")
public class LoanType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long loanType_Id;
    private String interest_rate;
    private String duration;

    @OneToMany(mappedBy = "loanType")
    private List<Loan> loan;

    @JoinTable(name = "loanType_Branch" ,
            joinColumns = {@JoinColumn(name = "loanType_ID")},
            inverseJoinColumns = {@JoinColumn(name = "branch_ID")}
    )
   @ManyToMany
    private List<Branch> branches;
}
