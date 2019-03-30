import { NgModule } from '@angular/core';

import { LoansRoutingModule } from './loans-routing.module';

import { LoansRegistrationFormComponent } from './components/loans-registration-form/loans-registration-form.component';
import { LoansDashboardComponent } from './components/loans-dashboard/loans-dashboard.component';
import { LoansLandingComponent } from './components/loans-landing/loans-landing.component';

@NgModule({
  declarations: [
    LoansRegistrationFormComponent,
    LoansDashboardComponent,
    LoansLandingComponent
  ],
  imports: [
    LoansRoutingModule
  ]
})
export class LoansModule { }
