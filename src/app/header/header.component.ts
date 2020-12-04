import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {
  constructor(private router:Router){}
  // router: any;
  
ngOnInit(){

}
  isLoggedIn(): boolean {
    const userDetails = JSON.parse(localStorage.getItem('userDetails'));
    if (userDetails) {
      return true;
    } else {
      return false;
    }
  }

  isAdmin() {
    const userDetails = JSON.parse(localStorage.getItem('userDetails'));
    if (userDetails && userDetails.users[0].role === 'admin') {
      return true;
    } else {
      return false;
    }
  }
  isLad() {
    const userDetails = JSON.parse(localStorage.getItem('userDetails'));
    if (userDetails && userDetails.users[0].role === 'lad') {
      
      return true;
    } else {
      return false;
    }
  }


  isCustomer() {
    const userDetails = JSON.parse(localStorage.getItem('userDetails'));
    if (userDetails && userDetails.users[0].role ==='customer') {
      return true;
    } else {
      return false;
    }
  }

  logout() {
    localStorage.removeItem('userDetails');
    this.router.navigateByUrl('/');
  }

}
