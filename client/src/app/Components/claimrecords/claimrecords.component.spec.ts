import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ClaimrecordsComponent } from './claimrecords.component';

describe('ClaimrecordsComponent', () => {
  let component: ClaimrecordsComponent;
  let fixture: ComponentFixture<ClaimrecordsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ClaimrecordsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ClaimrecordsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
