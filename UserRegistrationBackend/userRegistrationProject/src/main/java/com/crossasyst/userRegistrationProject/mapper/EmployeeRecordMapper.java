package com.crossasyst.userRegistrationProject.mapper;

import com.crossasyst.userRegistrationProject.entity.EmployeeRecordEntity;
import com.crossasyst.userRegistrationProject.model.EmployeeRecordRequest;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EmployeeRecordMapper {

    EmployeeRecordRequest entityToModel(EmployeeRecordEntity employeeRecordEntity);
    EmployeeRecordEntity modelToEntity(EmployeeRecordRequest employeeRecordRequest);
    List<EmployeeRecordRequest> entitiesToModel(List<EmployeeRecordEntity> employeeRecordEntityList);
}
