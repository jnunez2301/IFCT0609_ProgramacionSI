-- Libreria
-- Drop existing tables
DROP TABLE IF EXISTS libro_autor;
DROP TABLE IF EXISTS libro;
DROP TABLE IF EXISTS autor;
DROP TABLE IF EXISTS tienda;

-- Create tables
CREATE TABLE tienda (
    tienda_id SERIAL PRIMARY KEY,
    direccion VARCHAR(60) NOT NULL,
    ventas INTEGER
);

CREATE TABLE autor (
    dni CHAR(9) PRIMARY KEY,
    nombre VARCHAR(60) NOT NULL
);

CREATE TABLE libro (
    isbn CHAR(9) PRIMARY KEY,
    titulo VARCHAR(60) NOT NULL
);

CREATE TABLE libro_autor (
    isbn CHAR(9),
    dni CHAR(9),
    PRIMARY KEY (isbn, dni),
    FOREIGN KEY (isbn) REFERENCES libro(isbn),
    FOREIGN KEY (dni) REFERENCES autor(dni)
);

-- Insert data into the 'autor' table
INSERT INTO autor (dni, nombre) VALUES
    ('123456789', 'John Doe'),
    ('987654321', 'Jane Smith'),
    ('111223344', 'Alice Johnson'),
    ('555666777', 'Bob Williams'),
    ('888999000', 'Eva Brown');

-- Insert data into the 'libro' table
INSERT INTO libro (isbn, titulo) VALUES
    ('111111111', 'Introduction to SQL'),
    ('222222222', 'Programming in Python'),
    ('333333333', 'Data Science Essentials'),
    ('444444444', 'Web Development Basics'),
    ('555555555', 'Java Fundamentals');
-- Insert data into the 'libro_autor' table
INSERT INTO libro_autor (isbn, dni) VALUES
    ('111111111', '123456789'),  -- John Doe wrote Introduction to SQL
    ('222222222', '987654321'),  -- Jane Smith wrote Programming in Python
    ('333333333', '111223344'),  -- Alice Johnson wrote Data Science Essentials
    ('444444444', '555666777'),  -- Bob Williams wrote Web Development Basics
    ('555555555', '888999000');  -- Eva Brown wrote Java Fundamentals


SELECT la.isbn, l.titulo, au.nombre
FROM libro_autor la
INNER JOIN libro l ON la.isbn = l.isbn
INNER JOIN autor au ON la.dni = au.dni;
