import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { SignupUser } from '../signUpUser/SignUp';
import { Observable, map } from 'rxjs';
import { EmployeeRecords } from '../signUpUser/EmployeeRecord';

@Injectable({
  providedIn: 'root'
})
export class UserRegisterService {

  apiUsignUpUrl="http://localhost:8080/signup";
  apiEmployeeUrl="http://localhost:8080/employeeRecords"


  constructor(private http:HttpClient) { }


  signupUser(signupUser:SignupUser):Observable<Object>{

    console.log(signupUser)
    return this.http.post(this.apiUsignUpUrl,signupUser);

  }


  postEmployeeRecords(employeerecord:EmployeeRecords)
  {
    console.log(employeerecord)
    return this.http.post(this.apiEmployeeUrl,employeerecord);

  }

  getEmployeeRecord()
  {
    return this.http.get<any>("http://localhost:8080/employeeRecords").pipe(map((res:any)=>{
      return res;
    }))


  }


  updateEmployeerecord(employeerecord:EmployeeRecords,id:number)
  {
    return this.http.put<EmployeeRecords>(this.apiEmployeeUrl+id,employeerecord).pipe(map((res:EmployeeRecords)=>{
      return res;
    }))
  }


}
