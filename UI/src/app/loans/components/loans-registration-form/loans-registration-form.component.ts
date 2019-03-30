import { Component, OnInit } from '@angular/core';

import { FormGroup, FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-loans-registration-form',
  templateUrl: './loans-registration-form.component.html'
})
export class LoansRegistrationFormComponent implements OnInit {
  public registrationForm: FormGroup;

  constructor(private fb :FormBuilder) { }

  ngOnInit() {
    this.registrationForm = this.fb.group({
      name:'',
      salary:'',
      pan:'',
      adhaar:'',
      loanAmount:''

    })
  }

  registerLoan(){

    console.log("Registraton Form",this.registrationForm.value);

  }

}
