package lk.zerocode.Customer_Loan_Service.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "loan_Type")
public class LoanType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
}
