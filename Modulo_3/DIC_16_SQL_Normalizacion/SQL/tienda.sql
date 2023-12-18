-- DROP DATABASE IF EXISTS tienda;
-- CREATE DATABASE tienda;
-- USE tienda;

DROP TABLE IF EXISTS colecciones CASCADE;

CREATE TABLE colecciones (
    id_coleccion serial PRIMARY KEY,
    volumen INTEGER NOT NULL
);

DROP TABLE IF EXISTS libros CASCADE;

CREATE TABLE libros (
    isbn CHAR(20) PRIMARY KEY,
    titulo VARCHAR(30),
    autor VARCHAR(60),
    editorial VARCHAR(60),
    id_coleccion INTEGER,
    CONSTRAINT FK_libros_colecciones FOREIGN KEY (id_coleccion) REFERENCES colecciones (id_coleccion)
);

DROP TABLE IF EXISTS provincias CASCADE;
CREATE TABLE provincias (
    id_provincia serial PRIMARY KEY,
    nombre VARCHAR(30) NOT NULL,
    extension_provincia INTEGER,
    id_almacen INTEGER NOT NULL
);

DROP TABLE IF EXISTS almacenes CASCADE;

CREATE TABLE almacenes (
    id_almacen serial PRIMARY KEY,
    f_apertura DATE NOT NULL,
    direccion VARCHAR(90),
    id_provincia INTEGER NOT NULL,
    CONSTRAINT FK_almacenes_provincia FOREIGN KEY (id_provincia) REFERENCES provincias (id_provincia)
);

DROP TABLE IF EXISTS poblaciones CASCADE;

CREATE TABLE poblaciones (
    id_poblacion serial PRIMARY KEY,
    nombre VARCHAR(60) NOT NULL,
    habitantes INTEGER NOT NULL,
    id_provincia INTEGER NOT NULL,
    CONSTRAINT FK_poblaciones_provincias FOREIGN KEY (id_provincia) REFERENCES provincias (id_provincia)
);

DROP TABLE IF EXISTS stocks CASCADE;

CREATE TABLE stocks (
    isbn CHAR(20),
    id_almacen INTEGER,
    cantidad INTEGER NOT NULL,
    PRIMARY KEY (isbn, id_almacen),
    CONSTRAINT FK_stocks_libros FOREIGN KEY (isbn) REFERENCES libros(isbn),
    CONSTRAINT FK_stocks_almacenes FOREIGN KEY (id_almacen) REFERENCES almacenes(id_almacen) -- Corrected table name
);

DROP TABLE IF EXISTS socios CASCADE;

CREATE TABLE socios(
	id_socio serial PRIMARY KEY,
	dni CHAR(9),
	nombre VARCHAR(60),
	telefono CHAR(15),
	id_poblacion INTEGER NOT NULL,
	id_socio_avalado INTEGER NOT NULL,
	CONSTRAINT FK_socios_socios FOREIGN KEY (id_socio_avalado) REFERENCES socios(id_socio)
);

DROP TABLE IF EXISTS pedidos CASCADE;

CREATE TABLE pedidos(
	id_pedido serial PRIMARY KEY,
	f_envio CHAR(5) NOT NULL,
	f_pago CHAR(5) NOT NULL,
	id_socio INTEGER NOT NULL,
	CONSTRAINT FK_pedidos_socios FOREIGN KEY (id_socio) REFERENCES socios(id_socio)
);

DROP TABLE IF EXISTS detalles_pedido CASCADE;

CREATE TABLE detalles_pedido(
	id_pedido INTEGER,
	id_consecutivo INTEGER,
	cantidad INTEGER,
	isbn CHAR(20) NOT NULL,
	CONSTRAINT PK_id_pedido_consecutivo PRIMARY KEY(id_pedido, id_consecutivo),
	CONSTRAINT FK_detalles_pedido_pedidos FOREIGN KEY (id_pedido) REFERENCES pedidos(id_pedido)
);