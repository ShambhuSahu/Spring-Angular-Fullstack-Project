package com.crossasyst.userRegistrationProject.controller;

import com.crossasyst.userRegistrationProject.model.SignUpRequest;
import com.crossasyst.userRegistrationProject.model.SignUpResponse;
import com.crossasyst.userRegistrationProject.service.SignUpService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins = "http://localhost:4200")
@Controller
//@RequestMapping("/vi")
public class SignupController {

    @Autowired
    private final SignUpService signUpService;

    public SignupController(SignUpService signUpService) {
        this.signUpService = signUpService;
    }

    @PostMapping("/signup")
    public ResponseEntity<SignUpResponse> createSignUp(@RequestBody  @Valid SignUpRequest signUpRequest)
    {
        SignUpResponse signUpResponse=signUpService.createSignUp(signUpRequest);
        return new ResponseEntity<>(signUpResponse, HttpStatus.CREATED);
    }


}
