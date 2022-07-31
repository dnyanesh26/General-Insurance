import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {MatToolbarModule} from '@angular/material/toolbar'; 
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MatButtonModule } from '@angular/material/button';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatIconModule } from '@angular/material/icon';
import { MatListModule } from '@angular/material/list';
import { MatCardModule } from '@angular/material/card';
import { MatSelectModule } from '@angular/material/select';
import {MatInputModule} from '@angular/material/input';
import {MatExpansionModule} from '@angular/material/expansion';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HomepageComponent } from './Components/homepage/homepage.component';
import { HeaderComponent } from './Components/header/header.component';
import { FooterComponent } from './Components/footer/footer.component';
import { LoginComponent } from './Components/login/login.component';
import { RegisterComponent } from './Components/register/register.component';
import { FAQComponent } from './Components/faq/faq.component';
import { TicketFormComponent } from './Components/ticket-form/ticket-form.component';
import { VehicleinsuranceComponent } from './Components/vehicleinsurance/vehicleinsurance.component';
import { FormControl,FormGroup,Validator } from '@angular/forms';
import { ContactusComponent } from './Components/contactus/contactus.component';
import { HelpmeComponent } from './Components/helpme/helpme.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AboutUsComponent } from './Components/about-us/about-us.component';
import { EstimateComponent } from './Components/estimate/estimate.component';
import { ClaimrecordsComponent } from './Components/claimrecords/claimrecords.component';
import { DuplicateuserComponent } from './Components/duplicateuser/duplicateuser.component';

@NgModule({
  declarations: [
    AppComponent,
    HomepageComponent,
    HeaderComponent,
    FooterComponent,
    LoginComponent,
    RegisterComponent,
    FAQComponent,
    TicketFormComponent,
    VehicleinsuranceComponent,
    ContactusComponent,
    HelpmeComponent,
    AboutUsComponent,
    EstimateComponent,
    ClaimrecordsComponent,
    DuplicateuserComponent
    
   
  ],
  imports: [
    MatToolbarModule,
    MatButtonModule,
    MatSidenavModule,
    MatIconModule,
    MatListModule,
    MatCardModule,
    MatSelectModule,
    MatInputModule,
    MatExpansionModule,
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    Ng2SearchPipeModule,
    BrowserAnimationsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
