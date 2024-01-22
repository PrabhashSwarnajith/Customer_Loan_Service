package lk.zerocode.Customer_Loan_Service.controller;

import lk.zerocode.Customer_Loan_Service.dto.request.LoanRequest;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoanController {

    @PostMapping(value = "/loans", headers = "Version=v1")
    public void addLoan(@RequestBody LoanRequest loanRequest){

    }

    @GetMapping(value = "/loans/{loan_ID}" , headers = "Version=v1")
    public void getLoan (@PathVariable long loan_ID){

    }

    @GetMapping(value = "/loans" , headers = "Version=v1")
    public void getAllLoans (){

    }

    @DeleteMapping(value = "/loans/{loan_ID}" , headers = "Version=v1")
    public void deleteLoan(@PathVariable long loan_ID){

    }

    @PutMapping(value = "/loans/{loan_ID}" , headers = "Version=v1")
    public void updateLoan (@PathVariable long loan_ID, @RequestBody LoanRequest loanRequest){

    }

    @PostMapping(value = "/loans/{loan_ID}/approve" , headers = "Version=v1")
    public void approveLoan (@PathVariable long loan_ID , @RequestBody LoanRequest loanRequest){

    }

    @PostMapping(value = "/loans/{loan_ID}/reject" , headers = "Version=v1")
    public void rejectLoan (@PathVariable long loan_ID , @RequestBody LoanRequest loanRequest){

    }


}
//Retrieve all loans: GET /loans
//Retrieve a specific loan: GET /loans/{loanId}
//Create a new loan: POST /loans
//Update an existing loan: PUT /loans/{loanId}
//Delete a loan: DELETE /loans/{loanId}
//Loan approval endpoint: POST /loans/{loanId}/approve
//Loan rejection endpoint: POST /loans/{loanId}/reject