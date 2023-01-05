package com.taxcalc.employee.controller;

import com.taxcalc.employee.model.Employee;
import com.taxcalc.employee.repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SaveController {

    @Autowired
    EmpRepo empRepo;

    @PostMapping(value = "/saveDetails")
    public ResponseEntity<String> saveEmployee(@RequestBody Employee emp){
        empRepo.save(emp);
        return ResponseEntity.ok("success");
    }
}
