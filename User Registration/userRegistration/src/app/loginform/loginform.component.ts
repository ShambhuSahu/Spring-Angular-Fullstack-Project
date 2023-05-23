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



  constructor() { }

  ngOnInit(): void {


  
  }


}
