package lk.zerocode.Customer_Loan_Service.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerRequest {

    private String customerName;
    private Integer phone;
    private String address;

}
