import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewListLoansStatusComponent } from './view-list-loans-status.component';

describe('ViewListLoansStatusComponent', () => {
  let component: ViewListLoansStatusComponent;
  let fixture: ComponentFixture<ViewListLoansStatusComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewListLoansStatusComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewListLoansStatusComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
