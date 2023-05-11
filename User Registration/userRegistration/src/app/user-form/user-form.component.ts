import { Component, OnInit } from '@angular/core';
import { SignupUser } from '../signUpUser/SignUp';
import { UserRegisterService } from '../service/user-register.service';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.scss']
})
export class UserFormComponent implements OnInit {

  
  signUpUser:SignupUser=new SignupUser();

  SignUpForm:any;

  constructor(private userRegisterService:UserRegisterService) { }

  ngOnInit(): void {

    this.SignUpForm = new FormGroup({
      firstName: new FormControl(this.signUpUser.firstName, [
        Validators.required,
        Validators.minLength(4)
      ]),
    });
  }
  


  onSubmit() {
    console.log(this.signUpUser);
  this.userRegisterService.signupUser(this.signUpUser).subscribe(data=>{
    alert("sucessfully user is created...")

  },error=>alert("error occure"))
}


}
