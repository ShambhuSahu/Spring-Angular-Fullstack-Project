import { Component, OnInit } from '@angular/core';
import { SignupUser } from '../signUpUser/SignUp';
import { FormBuilder, FormControl, FormGroup } from '@angular/forms';
import { UserRegisterService } from '../service/user-register.service';

@Component({
  selector: 'app-loginform',
  templateUrl: './loginform.component.html',
  styleUrls: ['./loginform.component.scss']
})
export class LoginformComponent implements OnInit {

  signUpUser:SignupUser=new SignupUser();
  SignUpForm:any;


  constructor(private formBuilder:FormBuilder,private userRegisterService:UserRegisterService) { }

  ngOnInit(): void {


  
  }


  onSubmit() {
    console.log(this.signUpUser);
  this.userRegisterService.signupUser (this.signUpUser).subscribe(data=>{
    alert("sucessfully user is created...")

  },error=>alert("error occure"))
}

}
