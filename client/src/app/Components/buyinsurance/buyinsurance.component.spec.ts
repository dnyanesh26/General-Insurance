import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BuyinsuranceComponent } from './buyinsurance.component';

describe('BuyinsuranceComponent', () => {
  let component: BuyinsuranceComponent;
  let fixture: ComponentFixture<BuyinsuranceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BuyinsuranceComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(BuyinsuranceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
