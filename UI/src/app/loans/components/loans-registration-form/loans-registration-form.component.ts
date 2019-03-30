import { Component, OnInit } from '@angular/core';

import { FormGroup, FormBuilder } from '@angular/forms';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-loans-registration-form',
  templateUrl: './loans-registration-form.component.html'
})
export class LoansRegistrationFormComponent implements OnInit {
  public registrationForm: FormGroup;

  constructor(private fb :FormBuilder, private http: HttpClient, private router: Router) { }

  ngOnInit() {
    this.registrationForm = this.fb.group({
      name:'',
      salary:'',
      pan:'',
      loanAmount:'',
      adhaar: ''
    })
  }

  registerLoan(){

    console.log("Registraton Form",this.registrationForm.value);

    let url = 'http://localhost:8080/registerUser';

    this.http.post(url, this.registrationForm.value).subscribe(res => {

      alert('Loan request raised successfully.');

      this.router.navigate(['/'])
    })

  }

}
