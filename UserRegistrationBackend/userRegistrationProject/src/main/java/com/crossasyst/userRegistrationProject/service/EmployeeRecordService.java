package com.crossasyst.userRegistrationProject.service;

import com.crossasyst.userRegistrationProject.entity.EmployeeRecordEntity;
import com.crossasyst.userRegistrationProject.mapper.EmployeeRecordMapper;
import com.crossasyst.userRegistrationProject.model.EmployeeRecordRequest;
import com.crossasyst.userRegistrationProject.model.EmployeeRecordResponse;
import com.crossasyst.userRegistrationProject.repository.EmployeeRecordRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeRecordService {

    private final EmployeeRecordRepository employeeRecordRepository;
    private final EmployeeRecordMapper employeeRecordMapper;

    public EmployeeRecordService(EmployeeRecordRepository employeeRecordRepository, EmployeeRecordMapper employeeRecordMapper) {
        this.employeeRecordRepository = employeeRecordRepository;
        this.employeeRecordMapper = employeeRecordMapper;
    }


    public EmployeeRecordResponse createEmployeeRecord(EmployeeRecordRequest employeeRecordRequest) {

        EmployeeRecordEntity employeeRecordEntity=employeeRecordMapper.modelToEntity(employeeRecordRequest);
        employeeRecordRepository.save(employeeRecordEntity);

        EmployeeRecordResponse employeeRecordResponse=new EmployeeRecordResponse();
        employeeRecordResponse.setEmployeeId(employeeRecordEntity.getEmployeeId());
        return employeeRecordResponse;
    }

    public List<EmployeeRecordRequest> getAllEmployeeRecords() {

        List<EmployeeRecordEntity> employeeRecordEntityList=(employeeRecordRepository.findAll());
        List<EmployeeRecordRequest> employeeRecordRequestList=employeeRecordMapper.entitiesToModel(employeeRecordEntityList);
        return employeeRecordRequestList;


    }
}
