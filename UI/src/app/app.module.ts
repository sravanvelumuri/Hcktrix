import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { Routes, RouterModule } from '@angular/router';

import { LoansModule } from './loans/loans.module';

import { AppComponent } from './app.component';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    RouterModule,
    LoansModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
