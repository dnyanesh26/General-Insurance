import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BuyinsuranceComponent } from './Components/buyinsurance/buyinsurance.component';
import { FAQComponent } from './Components/faq/faq.component';
import { HomepageComponent } from './Components/homepage/homepage.component';
import { LoginComponent } from './Components/login/login.component';
import { RegisterComponent } from './Components/register/register.component';

const routes: Routes = [
  { path:'',component:HomepageComponent},
  { path:'login',component:LoginComponent},
  { path:'register',component:RegisterComponent},
  {path:'faq',component:FAQComponent},
  {path:'buyinsurance',component:BuyinsuranceComponent}
  

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
