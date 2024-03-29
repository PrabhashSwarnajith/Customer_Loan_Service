package lk.zerocode.Customer_Loan_Service.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Entity
@Data
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customer_ID;
    private String customerName;
    private Integer phone;
    private String address;

    @OneToMany(mappedBy = "customer")
    private List<Loan> loan;

}
