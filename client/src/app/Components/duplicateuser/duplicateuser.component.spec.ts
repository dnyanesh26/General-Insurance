import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DuplicateuserComponent } from './duplicateuser.component';

describe('DuplicateuserComponent', () => {
  let component: DuplicateuserComponent;
  let fixture: ComponentFixture<DuplicateuserComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DuplicateuserComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DuplicateuserComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
