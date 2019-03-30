import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LoansLandingComponent } from './loans-landing.component';

describe('LoansLandingComponent', () => {
  let component: LoansLandingComponent;
  let fixture: ComponentFixture<LoansLandingComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LoansLandingComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LoansLandingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
