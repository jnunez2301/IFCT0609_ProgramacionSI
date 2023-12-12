-- COLUMNAS CALCULADAS
-- Incremetar en 10% el precio de los productos de la tabla productos
SELECT (unit_price * 1.1) as nuevo_precio FROM products;

-- Calcular el valor del invetario = units_in_stock * unit_price
SELECT product_id, 
(units_in_stock * unit_price) as inventario 
FROM products ORDER BY product_id;
-- En la tabla order_details calcular el importe de cada aproducto
-- importe = cantidad * precio
-- Los datos de consulta: order_id, product_id, importe
SELECT order_id, product_id, (quantity*unit_price)  as importe
FROM order_details ORDER BY order_id;

--Obtener el importe por orden de la tabla de detalle de ordenes
SELECT order_id,
sum(quantity*unit_price) as total
FROM ordeR_details
GROUP BY order_id
ORDER BY order_id;

--Obtener una consulta que muestre el valor del inventario por categoria
SELECT  category_id, sum(units_in_stock) as inventario
FROM products
GROUP BY category_id
ORDER BY category_id;

--Contar los clientes por pais
SELECT country, 
count(customer_id) as cliente_pais FROM customers
GROUP BY country
ORDER BY country;