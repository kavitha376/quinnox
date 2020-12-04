import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import {HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { Route, RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { MakeloanComponent } from './makeloan/makeloan.component';
import { PayloanComponent } from './payloan/payloan.component';
import { InboxComponent } from './inbox/inbox.component';
import { ChangpasswordComponent } from './changpassword/changpassword.component';
import { CheckbalanaceComponent } from './checkbalanace/checkbalanace.component';
import { FilterPipe } from './filter.pipe';
import { ServiceComponent } from './service/service.component';
import { AdminComponent } from './admin/admin.component';
import { NewsComponent } from './news/news.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { ContactusComponent } from './contactus/contactus.component';
import { ViewloansComponent } from './viewloans/viewloans.component';
import { ViewstatusComponent } from './viewstatus/viewstatus.component';
import { FormstatusComponent } from './formstatus/formstatus.component';
import { ViewListLoansStatusComponent } from './view-list-loans-status/view-list-loans-status.component';
import { LogoutComponent } from './logout/logout.component';
import { AddLoanTypeComponent } from './add-loan-type/add-loan-type.component';
import { SearchLoanTypeComponent } from './search-loan-type/search-loan-type.component';

const routes:Route[]=[
  {path:'home',component:HomeComponent},
  {path:'login',component: LoginComponent},
  {path:'register',component:RegisterComponent},
  {path:'change',component:ChangpasswordComponent},
  {path:'inbox',component: InboxComponent},
  {path:'service',component:  ServiceComponent},
  {path:'admin',component:  AdminComponent},
  {path:'service',component:  ServiceComponent},
  {path:'news',component:  NewsComponent},
  {path:'about',component:   AboutusComponent},
  {path:'makeloan',component:   MakeloanComponent},
  {path:'contact',component: ContactusComponent},
  {path:'customerdetails',component: ViewloansComponent},
  {path:'viewstatus',component:  ViewstatusComponent},
  {path:'form',component:  FormstatusComponent},
  {path:'adminstatus',component:  ViewListLoansStatusComponent},
  {path:'logout',component:   LogoutComponent},
  {path:'addLoantype',component: AddLoanTypeComponent},
  {path:'search',component:  SearchLoanTypeComponent},
 


];

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    HeaderComponent,
    LoginComponent,
    RegisterComponent,
    MakeloanComponent,
    PayloanComponent,
    InboxComponent,
    ChangpasswordComponent,
    CheckbalanaceComponent,
    FilterPipe,
    ServiceComponent,
    AdminComponent,
    NewsComponent,
    AboutusComponent,
    ContactusComponent,
    ViewloansComponent,
    ViewstatusComponent,
    FormstatusComponent,
    ViewListLoansStatusComponent,
    LogoutComponent,
    AddLoanTypeComponent,
    SearchLoanTypeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
