
DROP TABLE IF EXISTS libros;
Create table libros
(
	isbn char(20) primary key,
	titulo varchar(50) not null
);

DROP TABLE IF EXISTS autores;
create table autores
(
dni char(9) primary key,
nombre varchar(60) not null
);

DROP TABLE IF EXISTS libros_autores;

CREATE TABLE libros_autores
(
isbn char(20),
dni char(9),
constraint pk_libros_autores primary key(isbn,dni),
constraint fk_libros_autores_libros foreign key (isbn) references libros(isbn),
constraint fk_libros_autores_autores foreign key (dni) references autores(dni)	
);

insert into autores
values
('12345678A','Roberto Gómez'),
('12345678B','Eduardo García'),
('12345678C','Ana Flores');

insert into libros
values
('12345','Python desde cero'),
('23456','Java desde cero'),
('34567','HTML desde cero');

insert into libros_autores
values
('12345','12345678A'),
('12345','12345678B'),
('12345','12345678C'),
('23456','12345678A'),
('23456','12345678B'),
('23456','12345678C');