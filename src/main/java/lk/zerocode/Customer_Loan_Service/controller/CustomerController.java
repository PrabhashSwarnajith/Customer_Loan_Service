package lk.zerocode.Customer_Loan_Service.controller;

import lk.zerocode.Customer_Loan_Service.dto.request.CustomerRequest;
import lk.zerocode.Customer_Loan_Service.model.Loan;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @PostMapping(value = "/customers" , headers = "Version=v1")
    public void addCustomer(@RequestBody CustomerRequest customerRequest){
    }

    @PutMapping(value = "/customers/{customer_ID}" , headers = "Version=v1")
    public void updateCustomer(@PathVariable long customer_ID , @RequestBody CustomerRequest customerRequest){

    }

    @DeleteMapping(value = "/customers/{customer_ID}" , headers = "Version=v1")
    public void deleteCustomer(@PathVariable long customer_ID){

    }

    @GetMapping(value = "/customers" , headers = "Version=v1")
    public void getAllCustomers (){

    }

    @PostMapping(value = "/customers/{customer_ID}/loans" , headers = "Version=v1")
    public void addLoan (@PathVariable long customer_ID){

    }

}
//Retrieve all customers: GET /customers
//Retrieve a specific customer: GET /customers/{customerId}
//Create a new customer: POST /customers
//Update an existing customer: PUT /customers/{customerId}
//Delete a customer: DELETE /customers/{customerId}
//Customer loans endpoint: GET /customers/{customerId}/loans