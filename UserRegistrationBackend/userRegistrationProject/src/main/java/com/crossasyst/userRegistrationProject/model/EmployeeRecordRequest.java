package com.crossasyst.userRegistrationProject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRecordRequest extends EmployeeRecordResponse{

    private String firstName;
    private String lastName;
    private String designation;
    private String mobileNumber;
    private String address;
    private String service;


}
