package com.crossasyst.userRegistrationProject.service;

import com.crossasyst.userRegistrationProject.entity.SignUpEntity;
import com.crossasyst.userRegistrationProject.mapper.SignupMapper;
import com.crossasyst.userRegistrationProject.model.SignUpRequest;
import com.crossasyst.userRegistrationProject.model.SignUpResponse;
import com.crossasyst.userRegistrationProject.repository.SignUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignUpService {

    @Autowired
    private final SignUpRepository signUpRepository;
    private final SignupMapper signupMapper;

    public SignUpService(SignUpRepository signUpRepository, SignupMapper signupMapper) {
        this.signUpRepository = signUpRepository;
        this.signupMapper = signupMapper;
    }


    public SignUpResponse createSignUp(SignUpRequest signUpRequest) {

        SignUpEntity signUpEntity=signupMapper.modelToEntity(signUpRequest);

        signUpRepository.save(signUpEntity);

        SignUpResponse signUpResponse=new SignUpResponse();
        signUpResponse.setId(signUpEntity.getId());

        return signUpResponse;
    }
}
