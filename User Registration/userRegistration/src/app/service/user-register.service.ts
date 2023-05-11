import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { SignupUser } from '../signUpUser/SignUp';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserRegisterService {

  apiUsignUpUrl="http://localhost:8080/signup";


  constructor(private http:HttpClient) { }


  signupUser(signupUser:SignupUser):Observable<Object>{

    console.log(signupUser)
    return this.http.post(this.apiUsignUpUrl,signupUser);

  }

}
