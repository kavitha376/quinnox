import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PayloanComponent } from './payloan.component';

describe('PayloanComponent', () => {
  let component: PayloanComponent;
  let fixture: ComponentFixture<PayloanComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PayloanComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PayloanComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
