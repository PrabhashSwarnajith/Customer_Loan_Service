package lk.zerocode.Customer_Loan_Service.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoanTypeRequest {
    private String interest_rate;
    private String duration;
}
