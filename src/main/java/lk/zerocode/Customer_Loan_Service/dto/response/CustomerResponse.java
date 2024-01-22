package lk.zerocode.Customer_Loan_Service.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerResponse {

    private String customerName;
    private Integer phone;
    private String address;
}
