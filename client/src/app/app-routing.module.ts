import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BuyinsuranceComponent } from './Components/buyinsurance/buyinsurance.component';
import { ClaimrecordsComponent } from './Components/claimrecords/claimrecords.component';
import { ContactusComponent } from './Components/contactus/contactus.component';
import { FAQComponent } from './Components/faq/faq.component';
import { HelpmeComponent } from './Components/helpme/helpme.component';
import { HomepageComponent } from './Components/homepage/homepage.component';
import { LoginComponent } from './Components/login/login.component';
import { RegisterComponent } from './Components/register/register.component';
import { TicketFormComponent } from './Components/ticket-form/ticket-form.component';
import { VehicleinsuranceComponent } from './Components/vehicleinsurance/vehicleinsurance.component';
import { AboutUsComponent } from './Components/about-us/about-us.component';
import { EstimateComponent } from './Components/estimate/estimate.component';
import { ViewinsuranceComponent } from './Components/viewinsurance/viewinsurance.component';
import { PolicyComponent } from './Components/policy/policy.component';
import { MyclaimsComponent } from './Components/myclaims/myclaims.component';
import { AdminLoginComponent } from './Components/admin-login/admin-login.component';
import { AdminInsComponent } from './Components/admin-ins/admin-ins.component';
import { AdminClaimComponent } from './Components/admin-claim/admin-claim.component';

const routes: Routes = [
  { path:'',component:HomepageComponent},
  { path:'login',component:LoginComponent},
  { path:'register',component:RegisterComponent},
  { path:'faq',component:FAQComponent},
  { path:'buyinsurance',component:BuyinsuranceComponent},
  { path:'vehicleinsurance',component:VehicleinsuranceComponent},
  { path:'claimrecords',component:ClaimrecordsComponent},
  { path:'ticket-form',component:TicketFormComponent},
  { path:'help',component:HelpmeComponent},
  { path:'contactus',component:ContactusComponent},
  { path:'aboutUs',component:AboutUsComponent},
  { path:'estimate',component:EstimateComponent},
  { path:'myclaims',component:MyclaimsComponent},
  { path:'viewinsurance',component:ViewinsuranceComponent},
  { path:'policy',component:PolicyComponent},
  { path:'adminlogin',component:AdminLoginComponent},
  { path:'admin/viewinsurance',component:AdminInsComponent},
  { path:'admin/myclaims',component:AdminClaimComponent}

  

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
