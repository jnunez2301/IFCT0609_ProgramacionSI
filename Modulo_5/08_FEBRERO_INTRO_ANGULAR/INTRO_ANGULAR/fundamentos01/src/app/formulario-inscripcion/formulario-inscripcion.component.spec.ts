import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormularioInscripcionComponent } from './formulario-inscripcion.component';

describe('FormularioInscripcionComponent', () => {
  let component: FormularioInscripcionComponent;
  let fixture: ComponentFixture<FormularioInscripcionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FormularioInscripcionComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(FormularioInscripcionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
