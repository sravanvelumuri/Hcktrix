import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { FormGroup, FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-loans-dashboard',
  templateUrl: './loans-dashboard.component.html',
  styleUrls: ['./loans-dashboard.component.scss']
})
export class LoansDashboardComponent implements OnInit {

  public loans: any[];
  public filtersForm: FormGroup;

  constructor(private http: HttpClient, private fb: FormBuilder) { }

  ngOnInit() {

    this.filtersForm = this.fb.group({
      loanId: '',
      status: ''
    });

    this.http.get('assets/loans.json').subscribe(response => {

      this.loans = response;

    }); 
  }

  public applyFilters(event: any) {

    this.loans = this.loans.filter(loan => {

      return loan.loanId.indexOf(this.filtersForm.get('loanId').value) > -1 || loan.status === this.filtersForm.get('status').value;

    })

  }

}
