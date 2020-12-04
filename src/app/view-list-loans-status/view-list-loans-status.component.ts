import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-view-list-loans-status',
  templateUrl: './view-list-loans-status.component.html',
  styleUrls: ['./view-list-loans-status.component.css']
})
export class ViewListLoansStatusComponent implements OnInit {

  loanReques=new Array();
  constructor( private serivce: ServiceService ,private route: Router) {
    this.display();
  }
  ngOnInit() {
  }
  display() {
    this.serivce.getAllType().subscribe( data =>{
      console.log(data);
      this.loanReques = data
    });
  }

}
