import { Component, OnInit } from '@angular/core';
import { EmployeeRecords } from '../signUpUser/EmployeeRecord';
import { UserRegisterService } from '../service/user-register.service';

@Component({
  selector: 'app-restaurent-dash',
  templateUrl: './restaurent-dash.component.html',
  styleUrls: ['./restaurent-dash.component.scss']
})
export class RestaurentDashComponent implements OnInit {

  employeeRecord:EmployeeRecords=new EmployeeRecords()
  alllrestdata!: any[];


  constructor(private userRegisterService:UserRegisterService) { }

  ngOnInit(): void {
this.getallData();
  }

  onSubmit() {
    console.log(this.employeeRecord);
  this.userRegisterService.postEmployeeRecords(this.employeeRecord).subscribe(data=>{
    alert("sucessfully user is created...")

  },error=>alert("error occure"))
}


getallData(){
  this.userRegisterService.getEmployeeRecord().subscribe(res=>{
    console.log(res)
    this.alllrestdata=res;

    
  })
}

}
