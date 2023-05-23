package com.crossasyst.userRegistrationProject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "signup")
public class SignUpEntity {

    @Id
    @SequenceGenerator(name = "seq_signup_id", sequenceName = "seq_signup_id", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_signup_id")
    private Long id;
    private String firstName;
    private String lastName;
    private String emailAddress;    
    private String password;
    private String mobileNumber;
    private String gender;
}
