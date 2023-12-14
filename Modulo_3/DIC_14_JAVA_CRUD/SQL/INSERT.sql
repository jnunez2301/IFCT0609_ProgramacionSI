-- Formas de hacer insert

-- 1. Mencionando las columnas
INSERT INTO categories
(category_id,category_name, description)
VALUES
(100,'PAPELERIA', 'Articulos para papeleria');

-- 2. No mencionar las columnas y debes darle TODOS LOS VALORES 
INSERT INTO categories
VALUES
(99, 'FERRETERIA', 'Articulos para ferreteria');

-- 3. Agregar varias filas al mismo tiempo
INSERT INTO categories
VALUES
(98, 'Peleteria', 'Articulos de cuero'),
(97, 'Herreria', 'Articulos de metal para fabricación'),
(96, 'Sastreria', 'Articulos de vestimenta o fabricación');
