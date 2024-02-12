import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BuclesComponent } from './bucles.component';

describe('BuclesComponent', () => {
  let component: BuclesComponent;
  let fixture: ComponentFixture<BuclesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [BuclesComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(BuclesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
