import { NgModule } from '@angular/core';

import { LoansRoutingModule } from './loans-routing.module';

import { LoansRegistrationFormComponent } from './components/loans-registration-form/loans-registration-form.component';
import { LoansDashboardComponent } from './components/loans-dashboard/loans-dashboard.component';
import { LoansLandingComponent } from './components/loans-landing/loans-landing.component';
import { CommonModule } from '@angular/common';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

@NgModule({
  
  imports: [
    LoansRoutingModule,
    CommonModule, FormsModule,
    ReactiveFormsModule
  ],
  declarations: [
    LoansRegistrationFormComponent,
    LoansDashboardComponent,
    LoansLandingComponent
  ]
})
export class LoansModule { }
