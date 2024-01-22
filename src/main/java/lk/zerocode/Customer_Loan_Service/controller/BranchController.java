package lk.zerocode.Customer_Loan_Service.controller;

import lk.zerocode.Customer_Loan_Service.dto.request.BranchRequest;
import org.springframework.web.bind.annotation.*;

@RestController
public class BranchController {

    @PostMapping(value = "/branches" , headers = "Version=v1")
    public void addBranch (@RequestBody BranchRequest branchRequest){

    }

    @PutMapping(value = "/branches/{branch_Id}" ,headers = "Version=v1")
    public void updateBranch(@PathVariable long branch_Id , @RequestBody BranchRequest branchRequest){

    }

    @DeleteMapping(value = "/branches/{branch_Id}" , headers = "Version=v1")
    public void deleteBranch(@PathVariable long branch_Id){

    }

    @GetMapping(value = "/branches" , headers = "Version=v1")
    public void getAllBranches(){

    }

    @GetMapping(value = "/branches/{branch_Id}" , headers = "Version=v1")
    public void getBranch(@PathVariable long branch_Id){

    }

    @GetMapping(value = "/branches/{branch_Id}/loans" , headers = "Version=v1")
    public void getBranchLoans(@PathVariable long branch_Id){

    }

}

//Retrieve all branches: GET /branches
//Retrieve a specific branch: GET /branches/{branchId}
//Create a new branch: POST /branches
//Update an existing branch: PUT /branches/{branchId}
//Delete a branch: DELETE /branches/{branchId}
//Branch loans endpoint: GET /branches/{branchId}/loans