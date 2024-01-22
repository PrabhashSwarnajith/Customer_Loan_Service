package lk.zerocode.Customer_Loan_Service.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoanTypeResponse {
    private String interest_rate;
    private String duration;
}
