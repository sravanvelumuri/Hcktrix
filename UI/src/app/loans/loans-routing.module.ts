import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { LoansDashboardComponent } from './components/loans-dashboard/loans-dashboard.component';
import { LoansLandingComponent } from './components/loans-landing/loans-landing.component';
import { LoansRegistrationFormComponent } from './components/loans-registration-form/loans-registration-form.component';

const routes: Routes = [{
    path: '', component: LoansLandingComponent
}, {
    path: 'register', component: LoansRegistrationFormComponent
}, {
    path: 'dashboard', component: LoansDashboardComponent
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)]
})
export class LoansRoutingModule { }
