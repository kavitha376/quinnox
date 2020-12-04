import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, NgForm, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-makeloan',
  templateUrl: './makeloan.component.html',
  styleUrls: ['./makeloan.component.css']
})
export class MakeloanComponent implements OnInit {
 
  Loans = new Array();
  error: string;
  message;
  selectedLoans;
  constructor(private auth: ServiceService , private router: Router) {
    this.display();
   }
  ngOnInit(): void {
    // throw new Error('Method not implemented.');
  }

  SendRequest(form:NgForm){
    // this.error = null;
  
    this.auth.AddCust(form.value).subscribe(res => {
        console.log(res);
        form.reset();
      }, err => {
        console.log(err);
        this.error = err.error.message;
      });
  }
  display() {
    this.auth.getAllType().subscribe( data =>{
      console.log(data);
      this.Loans = data
    });
  }

  // SendRequest(form:NgForm){
  //   console.log(form.value);
  //   const userDetails =JSON.parse(localStorage.getItem('userDetails'));
  //   console.log('customer details',userDetails);
  //   const applicationId= userDetails.users[0].applicationId;

  //   this.auth.requestcust(form,applicationId).subscribe(data=>{
  //   this.message="resquest sent to d loanagent";
  //     console.log(data);
  //     this.display();
  //   });
  // }
    // SendRequest(form:NgForm){
    // console.log(form.value);
    // this.router.navigateByUrl("/viewstatus");

    // console.log(form.value);
    // this.auth.requestLoans..push(form);
    // console.log(this.auth.selectedLoans);
    // }

  }
  



