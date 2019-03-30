import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LoansRegistrationFormComponent } from './loans-registration-form.component';

describe('LoansRegistrationFormComponent', () => {
  let component: LoansRegistrationFormComponent;
  let fixture: ComponentFixture<LoansRegistrationFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LoansRegistrationFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LoansRegistrationFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
