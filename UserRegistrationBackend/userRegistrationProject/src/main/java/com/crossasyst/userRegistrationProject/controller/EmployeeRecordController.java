package com.crossasyst.userRegistrationProject.controller;

import com.crossasyst.userRegistrationProject.model.EmployeeRecordRequest;
import com.crossasyst.userRegistrationProject.model.EmployeeRecordResponse;
import com.crossasyst.userRegistrationProject.service.EmployeeRecordService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class EmployeeRecordController {

    private final EmployeeRecordService employeeRecordService;

    public EmployeeRecordController(EmployeeRecordService employeeRecordService) {
        this.employeeRecordService = employeeRecordService;
    }

    @PostMapping("/employeeRecords")
    public ResponseEntity<EmployeeRecordResponse> createEmployeeRecord(@RequestBody EmployeeRecordRequest employeeRecordRequest)
    {
        EmployeeRecordResponse employeeRecordResponse=employeeRecordService.createEmployeeRecord(employeeRecordRequest);
        return new ResponseEntity<>(employeeRecordResponse, HttpStatus.CREATED);
    }

    @GetMapping("/employeeRecords")
    public ResponseEntity<List<EmployeeRecordRequest>> getAllEmployeeRecords()
    {
        List<EmployeeRecordRequest> employeeRecordRequestList=employeeRecordService.getAllEmployeeRecords();
        return new ResponseEntity<>(employeeRecordRequestList,HttpStatus.OK);
    }
}
