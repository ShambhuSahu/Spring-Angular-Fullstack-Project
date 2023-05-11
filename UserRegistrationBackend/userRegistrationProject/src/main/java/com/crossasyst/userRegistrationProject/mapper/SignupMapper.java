package com.crossasyst.userRegistrationProject.mapper;

import com.crossasyst.userRegistrationProject.entity.SignUpEntity;
import com.crossasyst.userRegistrationProject.model.SignUpRequest;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SignupMapper {


      SignUpRequest entityToModel(SignUpEntity signUpEntity);
      SignUpEntity modelToEntity(SignUpRequest signUpRequest);
      List<SignUpRequest> entityToModel(List<SignUpEntity> signUpEntity);

}
