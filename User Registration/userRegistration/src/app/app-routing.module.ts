import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UserFormComponent } from './user-form/user-form.component';
import { LoginformComponent } from './loginform/loginform.component';

const routes: Routes = [
  {path:'userform',component:UserFormComponent },
  {path:'loginform',component:LoginformComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
