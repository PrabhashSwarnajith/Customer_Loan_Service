package lk.zerocode.Customer_Loan_Service.controller;

import lk.zerocode.Customer_Loan_Service.dto.request.LoanTypeRequest;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoanTypeController {

    @PostMapping(value = "/loan-types" , headers = "Version=v1")
    public void addLoneTypes(@RequestBody LoanTypeRequest loanTypeRequest){

    }

    @GetMapping(value = "/loan-types" , headers = "Version=v1")
    public void getAllLoanTypes(){

    }

    @GetMapping(value = "/loan-types/{loanType_Id}" , headers = "Version=v1")
    public void getLoanType(@PathVariable long loanType_Id){

    }

    @DeleteMapping (value = "/loan-types/{loanType_Id}" , headers = "Version=v1")
    public void deleteLoanType(@PathVariable long loanType_Id){

    }

    @PutMapping(value = "/loan-types/{loanType_Id}" , headers = "Version=v1")
    public void updateLoanType(@PathVariable long loanType_Id){

    }

    @GetMapping(value = "/loan-types/{loanType_Id}/details" , headers = "Version=v1")
    public void getLoanTypeDetails(@PathVariable long loanType_Id){

    }

}

//Retrieve all loan types: GET /loan-types
//Retrieve a specific loan type: GET /loan-types/{loanTypeId}
//Create a new loan type: POST /loan-types
//Update an existing loan type: PUT /loan-types/{loanTypeId}
//Delete a loan type: DELETE /loan-types/{loanTypeId}
//Loan type details endpoint: GET /loan-types/{loanTypeId}/details