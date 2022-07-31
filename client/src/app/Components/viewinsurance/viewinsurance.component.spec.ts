import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewinsuranceComponent } from './viewinsurance.component';

describe('ViewinsuranceComponent', () => {
  let component: ViewinsuranceComponent;
  let fixture: ComponentFixture<ViewinsuranceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ViewinsuranceComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ViewinsuranceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
