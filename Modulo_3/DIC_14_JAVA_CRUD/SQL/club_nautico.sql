DROP DATABASE IF EXISTS club_nautico;

CREATE DATABASE club_nautico;

CONNECTION club_nautico;

DROP TABLE IF EXISTS salidas_barco;
DROP TABLE IF EXISTS barco_socios;
DROP TABLE IF EXISTS socios;
DROP TABLE IF EXISTS personas;

CREATE TABLE socios(
    socio_id serial PRIMARY KEY,
    primer_nombre VARCHAR(60) NOT NULL,
    segundo_nombre VARCHAR(60) NOT NULL
);

CREATE TABLE barco_socios(
    socio_id serial,
    matricula CHAR(9) NOT NULL PRIMARY KEY,
    nombre VARCHAR(60),
    numero_amarre SMALLINT NOT NULL,
    cuota DECIMAL NOT NULL,
    FOREIGN KEY (socio_id) REFERENCES socios(socio_id)
);

CREATE TABLE personas(
 	DNI CHAR(9) NOT NULL PRIMARY KEY,
	nombre_patron VARCHAR(60) NOT NULL,
	DIRECCION VARCHAR(255)
);

CREATE TABLE salidas_barco(
    matricula CHAR(9) NOT NULL PRIMARY KEY,
	DNI CHAR(9) NOT NULL,
    fecha_entrada DATE NOT NULL,
    fecha_salida DATE NOT NULL,
    destino VARCHAR(150) NOT NULL,
    FOREIGN KEY (matricula) REFERENCES barco_socios(matricula),
	FOREIGN KEY (DNI) REFERENCES personas(DNI)
);

