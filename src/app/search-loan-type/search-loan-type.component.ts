import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-search-loan-type',
  templateUrl: './search-loan-type.component.html',
  styleUrls: ['./search-loan-type.component.css']
})
export class SearchLoanTypeComponent implements OnInit {

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

}
// }
  // SendRequest(loan){
  //   console.log(loan);
  //   const userDetails =JSON.parse(localStorage.getItem('userDetails'));
  //   console.log('loantype details',userDetails);
  //   const id= userDetails.users[0].id;
  // }
  //   this.auth.requestLoans(id,loan).subscribe(data=>{
  //   this.msg="resquest sent to d loan agent";
  //     console.log(data);
  //     this.display();
  //   });
  // }
  



  


