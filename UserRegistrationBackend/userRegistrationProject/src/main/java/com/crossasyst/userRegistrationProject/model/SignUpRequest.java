package com.crossasyst.userRegistrationProject.model;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignUpRequest {
    @NotNull(message = "firstname should not null")
    private String firstName;

    @NotNull(message = "lastname should not null")
    private String lastName;

    @Email
    private String emailAddress;
    private String password;

    @NotNull
    @Pattern(regexp = "^\\d{10}$",message = "please enter valid mobileNumber")
    private String mobileNumber;

    private String gender;


}
