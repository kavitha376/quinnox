import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchLoanTypeComponent } from './search-loan-type.component';

describe('SearchLoanTypeComponent', () => {
  let component: SearchLoanTypeComponent;
  let fixture: ComponentFixture<SearchLoanTypeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchLoanTypeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchLoanTypeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
