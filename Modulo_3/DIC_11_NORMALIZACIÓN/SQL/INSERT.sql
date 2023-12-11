-- CREAR TABLA DATOS
DROP TABLE IF EXISTS datos;
CREATE TABLE datos(a numeric);
-- Insertar datos
INSERT INTO datos
VALUES
(8),
(7),
(null),
(5);
-- 
SELECT * FROM datos;

-- suma la columna A 
SELECT SUM(A) from datos;
-- OTRA TABLA
DROP TABLE IF EXISTS datos2;
CREATE TABLE datos2(a numeric, b numeric);


INSERT into datos2
VALUES
(8, 2),
(7,3),
(null, 3),
(5,5);

-- Datos 2
SELECT * FROM datos2;
-- Sumar datos
SELECT a+b AS total FROM datos2;

SELECT avg(a) FROM DATOS;

-- obtener el precio promedio, maximo y minimo de productos
SELECT AVG(unit_price) as promedio, max(unit_price) as maximo, min(unit_price) as minimo FROM products;
--Obtener la cantidad promedio, maximo y minimo de order_details
SELECT AVG(quantity) as promedio, max(quantity) as maximo, min(quantity) as minimo FROM order_details;
-- OBTENER UNIDADES EN STOCK DE PRODUCTOS
SELECT SUM(units_in_stock) FROM products;



