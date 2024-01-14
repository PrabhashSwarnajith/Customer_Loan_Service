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
    private Long id;
    private String type;

    @OneToMany(mappedBy = "loan")
    private List<Loan> loan;

    @JoinTable(name = "branch" ,
            joinColumns = {@JoinColumn(name = "loan_Type_Id")},
            inverseJoinColumns = {@JoinColumn(name = "branch_Id")}
    )
   @ManyToMany
    private List<Branch> branches;
}
