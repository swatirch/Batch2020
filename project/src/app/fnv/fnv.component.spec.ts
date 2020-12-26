import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FnvComponent } from './fnv.component';

describe('FnvComponent', () => {
  let component: FnvComponent;
  let fixture: ComponentFixture<FnvComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FnvComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FnvComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
