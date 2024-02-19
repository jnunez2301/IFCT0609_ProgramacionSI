import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EmpleadoDinamicoComponent } from './empleado-dinamico.component';

describe('EmpleadoDinamicoComponent', () => {
  let component: EmpleadoDinamicoComponent;
  let fixture: ComponentFixture<EmpleadoDinamicoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [EmpleadoDinamicoComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(EmpleadoDinamicoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
