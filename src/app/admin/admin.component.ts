import { Component, OnInit } from '@angular/core';
import { Form, FormGroup, NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {
  // ngForm:form;
  Loans= new Array();
  selectedType;
  message;
  search:string;
loan;
  // message:string;
  constructor( private serivce: ServiceService ,private route: Router) {
    this.display();
  }
  ngOnInit(): void {
    // throw new Error('Method not implemented.');
  }
  
  display() {
    this.serivce.getAllType().subscribe( data =>{
      console.log(data);
      this.Loans = data
    });
  }
  updateLoanType(loan) {
       console.log(loan);
       this.selectedType= loan;
     }

 
  deleteLoanType(id){
    this.serivce.deleteLoansType(id).subscribe(data=>{
      console.log(data);
      this.message="loanType Deleted Successfully";
      this.display();
    });

  }
  editType(form:NgForm) {

    console.log(form.value);
  
    this.serivce.updateLoanType(form.value).subscribe(data => {
      console.log(data);
      this.message = data.message;
      // this.route.navigate(['get-alltype']);
      form.resetForm();

    }, () =>{
      console.log('success');   
    });
  }
  }

  
 
// }
 
  // editTypes(type) {
  //   console.log(type.value);
  //   this.serivce.updateLoanType(type.value).subscribe( data => {
  //     console.log(data);
  //     this.message = data.message;
  //     this.route.navigate['get-alltype'];
  //   }, err => {
  //     console.log('error');
  //   }, () =>{
  //     console.log('success');
  //   });
  // }


  // updateLoanType(loan) {
  //   console.log(loan);
  //   this.selectedType= loan;
  // }
  // deleteLoansType(id) {
  //   this.serivce.deleteLoansType(id).subscribe(data=>{
  //     console.log(data);
  //     this.message="Loantype Deleted Successfully";
  //     this.getAll();
  //   });
    
    // this.selectedProduct = product;
  
  
  
  // display() {
  //   this.serivce.getAllType().subscribe( data =>{
  //     console.log(data.bean);
  //     this.Loans = data.bean;
  //   }, err=>{
  //     console.log('error');
  //   }, () => {
  //     console.log('success')
  //   });
  // }






// }
