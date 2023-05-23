package com.crossasyst.userRegistrationProject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employeeRecord")
public class EmployeeRecordEntity {
    @Id
    @SequenceGenerator(name = "seq_employee_id", sequenceName = "seq_employee_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_employee_id")
    private Long employeeId;
    private String firstName;
    private String lastName;
    private String designation;
    private String mobileNumber;
    private String address;
    private String service;
}
