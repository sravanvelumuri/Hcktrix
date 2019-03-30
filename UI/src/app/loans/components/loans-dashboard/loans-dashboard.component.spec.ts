import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LoansDashboardComponent } from './loans-dashboard.component';

describe('LoansDashboardComponent', () => {
  let component: LoansDashboardComponent;
  let fixture: ComponentFixture<LoansDashboardComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LoansDashboardComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LoansDashboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
