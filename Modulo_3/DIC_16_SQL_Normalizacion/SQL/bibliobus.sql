-- DROP DATABASE IF EXISTS bibliobus;
-- CREATE DATABASE bibliobus;
DROP TABLE IF EXISTS prestamo_libro CASCADE;
DROP TABLE IF EXISTS libros CASCADE;
DROP TABLE IF EXISTS socios CASCADE;
DROP TABLE IF EXISTS temas CASCADE;

CREATE TABLE temas(
	tema_id serial PRIMARY KEY,
	descripcion VARCHAR(60)
);


CREATE TABLE socios(
	socio_id SERIAL,
	num_dni char(9) PRIMARY KEY NOT NULL,
	nombre VARCHAR(60) NOT NULL,
	direccion VARCHAR(120)
);


CREATE TABLE libros(
	isbn CHAR(20) PRIMARY KEY,
	libro_nombre VARCHAR(155) NOT NULL,
	libro_autor VARCHAR(60) NOT NULL,
	tema_id integer NOT NULL,
	numero_ejemplares integer,
	CONSTRAINT fk_tema FOREIGN KEY (tema_id)
	REFERENCES temas(tema_id)
);


CREATE TABLE prestamo_libro(
	isbn CHAR(20) NOT NULL,
	num_dni CHAR(9) NOT NULL,
	f_prestamo DATE,
	f_devolución DATE,
	CONSTRAINT PK_prestamos PRIMARY KEY(isbn, num_dni),
	CONSTRAINT fk_libro_prestamo FOREIGN KEY (isbn)
	REFERENCES libros(isbn),
	CONSTRAINT fk_socio_libro_prestamo FOREIGN KEY
	(num_dni) REFERENCES socios(num_dni)
);

INSERT INTO temas(descripcion)
VALUES
('Terror'),
('Psicologia'),
('Aventura'),
('Informática'),
('Romance');

-- ISBN LENGTH 20
INSERT INTO libros
VALUES
('978-84-415-4163-4', 'Programación en C#', 'Joan Pradels', 4, 3),
('978-84-415-4343-4', 'Weightlifting for Fun', 'Rony Coleman', 3, 5),
('978-84-415-4344-4', 'Las Grandes Aventuras de Tintin', 'George Remi', 3, 20);

INSERT INTO socios(num_dni, nombre, direccion)
VALUES
('Y4927072M', 'Jhonatan', 'Monte Perdido 152'),
('Y4298320M', 'Moises', 'Monte Encontrado 152');

INSERT INTO prestamo_libro(isbn, num_dni, f_prestamo)
VALUES
('978-84-415-4163-4', 'Y4927072M', NOW()),
('978-84-415-4343-4', 'Y4298320M', NOW()),
('978-84-415-4344-4', 'Y4298320M', NOW());

SELECT * FROM prestamo_libro;
SELECT * FROM libros;
SELECT * FROM temas;
SELECT * FROM socios;

SELECT pl.f_prestamo, s.num_dni, s.nombre, l.libro_nombre, l.libro_autor, t.descripcion, l.numero_ejemplares
FROM prestamo_libro pl
INNER JOIN socios s ON pl.num_dni = s.num_dni
INNER JOIN libros l ON pl.isbn = l.isbn
INNER JOIN temas t ON l.tema_id = t.tema_id
ORDER BY pl.f_prestamo;