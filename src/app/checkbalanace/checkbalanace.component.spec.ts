import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CheckbalanaceComponent } from './checkbalanace.component';

describe('CheckbalanaceComponent', () => {
  let component: CheckbalanaceComponent;
  let fixture: ComponentFixture<CheckbalanaceComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CheckbalanaceComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CheckbalanaceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
