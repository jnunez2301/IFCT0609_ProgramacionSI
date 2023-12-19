DROP TABLE IF EXISTS alumnos CASCADE;
DROP TABLE IF EXISTS clase_alumno CASCADE;

CREATE TABLE alumnos(
	num_alumno serial PRIMARY KEY,
	nombre VARCHAR(255)	NOT NULL,
	salon VARCHAR(10) NOT NULL
);

CREATE TABLE clase_alumno (
    num_alumno INTEGER NOT NULL,
    salon VARCHAR(10) NOT NULL,
	asignatura VARCHAR(50) NOT NULL,
    CONSTRAINT PK_clase_alumno PRIMARY KEY (num_alumno, salon),
    CONSTRAINT FK_alumno_alumnos FOREIGN KEY (num_alumno) REFERENCES alumnos(num_alumno)
);

INSERT INTO alumnos(nombre, salon)
VALUES
('Juan Gonzalez', 'A1-100'),
('Ana Flores', 'A1-100'),
('Ana Flores', 'A1-200');

INSERT INTO clase_alumno
VALUES
(1, 'A1-100', 'Arquitectura'),
(2, 'A1-100', 'Biologia'),
(2, 'A1-200', 'Psicologia');

SELECT * FROM clase_alumno;