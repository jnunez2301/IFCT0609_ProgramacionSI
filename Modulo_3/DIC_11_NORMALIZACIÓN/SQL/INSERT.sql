-- Ejemplos de filtros
-- Obtener los productos de order_details cuyo precio sea mayor a 50
SELECT * FROM order_details WHERE unit_price > 50;
-- Obtener productos de order_details cuya cantidad sea mayor a 75
SELECT * FROM order_details WHERE quantity > 75;
-- Obtener los empleados que contengan una W en su apellido
SELECT * FROM employees WHERE last_name LIKE '%w%';
-- Obtener los productos de orders_details cuya cantidad se encuentre entre 75 y 150
SELECT product_id, quantity FROM order_details WHERE quantity BETWEEN 75 and 150;
-- Obtener los productos cuya stock esté entre 100 y 200
SELECT * FROM products WHERE units_in_stock BETWEEN 100 AND 200;
-- Obtener los productos cuyo nombre comience con C y termine con i
SELECT * FROM products WHERE product_name LIKE 'C%i';
-- Obtener los productos cuyo nombre tremienen en n
SELECT * FROM products WHERE product_name LIKE '%n';
--Obtener los productos cuyo proveedor sea 1,5, 7, 2
SELECT * FROM products WHERE supplier_id IN(1,5,7,2);
-- Obtener los productos cuyo nombre comience con A, G, R
SELECT * FROM products WHERE product_name LIKE 'A%' OR product_name LIKE 'G%' OR product_name LIKE 'R%';
-- ORDER BY <NOMBRE> ASC/DESC
SELECT * FROM products ORDER BY product_name;
-- ORDERNAR POR ID DESC
SELECT * FROM products ORDER BY product_id DESC;
-- Ordenador por categoria ASC y proveedor desc
SELECT * FROM products ORDER BY category_id, supplier_id DESC;
-- Obtener los productos cuyo nombre comience con A, G, R y ordenar por nombre del producto
SELECT * FROM products WHERE product_name LIKE 'A%' OR product_name LIKE 'G%' OR product_name LIKE 'R%' ORDER BY product_name;



