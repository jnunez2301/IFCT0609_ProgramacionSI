SELECT * FROM categories;
-- TODAS LAS COLUMNAS/FILAS DE PRODUCTOS

SELECT * FROM products;
-- TODAS LAS COLUMNAS / FILAS DE CLIENTES
SELECT * FROM customers;
-- TODAS LAS COLUMNAS / FILAS DE CLIENTES
SELECT * FROM orders;

SELECT category_id, category_name FROM categories;

SELECT product_id,product_name, unit_price FROM products;

SELECT order_id, product_id, quantity FROM order_details;

SELECT employee_id, first_name, last_name, reports_to FROM employees;

-- FILTROS

-- OPERADORES COMPARACION -> > < <> <= >=
-- AND OR NOT
-- BETWEEN
-- IN -- define si esta en el conjunto del valor asignado
-- LIKE para buscar patrones
SELECT employee_id, first_name, last_name, reports_to FROM employees WHERE reports_to IS NULL;

-- OBTENER LOS PRODUCTOS CUYO PRECIO SEA MAYOR A 50
SELECT * FROM products
WHERE unit_price > 50;

SELECT * FROM products
WHERE unit_price < 100 ORDER BY unit_price DESC;
-- OBTENER LOS PRODUCTOS CUYA CATEGORIA = 1, 6 Y 7 

SELECT * FROM products
WHERE category_id = 1 OR category_id = 6 OR category_id = 7;

-- MEJOR USAR ESTO
SELECT * FROM products
WHERE category_id IN(1, 6, 7);

-- OBTENER LOS PRODUCTOS QUE TENGAN EL PRECIO ENTRE 35 Y 75

SELECT * FROM products
WHERE unit_price BETWEEN 35 AND 75;

-- OBTENER LOS PRODUCTOS QUE COMIENZEN CON P

SELECT * FROM products
WHERE product_name LIKE 'P%'