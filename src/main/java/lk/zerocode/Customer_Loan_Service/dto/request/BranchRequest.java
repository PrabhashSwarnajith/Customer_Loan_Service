package lk.zerocode.Customer_Loan_Service.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BranchRequest {

    private String branchName;
    private String location;
    private String manager_name;
}
