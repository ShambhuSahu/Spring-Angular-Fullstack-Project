import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UserFormComponent } from './user-form/user-form.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { LoginformComponent } from './loginform/loginform.component';
import {MatCardModule} from '@angular/material/card';
import { FormsModule} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { RestaurentDashComponent } from './restaurent-dash/restaurent-dash.component';
import { EmployeeDashComponent } from './employee-dash/employee-dash.component';

@NgModule({
  declarations: [
    AppComponent,
    UserFormComponent,
    LoginformComponent,
    RestaurentDashComponent,
    EmployeeDashComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatCardModule,
    FormsModule,
    HttpClientModule
    

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
