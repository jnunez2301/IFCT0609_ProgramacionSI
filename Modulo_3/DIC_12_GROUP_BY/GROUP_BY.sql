-- GROUP BY
-- ORDER BY
-- HAVING
SELECT * FROM products
ORDER BY category_id;

-- Contar los productos por categoria
SELECT category_id,
COUNT(category_id) AS num_productos FROM products
GROUP BY category_id
ORDER BY category_id;

--Obtener el precio promedio por categoria de la tabla productos
SELECT avg(unit_price) AS precio_promedio, category_id FROM products
GROUP BY category_id
ORDER BY category_id;

--Obtener las unidades en stock, su maximo y minimo por proveedor
SELECT supplier_id, 
sum(units_in_stock) as stock, 
max(units_in_stock) as minimo_proveedor, 
min(units_in_stock) as minimo_proveedor
FROM products
GROUP BY supplier_id
ORDER BY supplier_id;

-- Obtener los productos vendidos por orden de la tabla detalle de ordenes
SELECT order_id, sum(quantity) as total FROM order_details
GROUP BY order_id
ORDER BY order_id;

--Obtener la cantidad de ordenes por empleado de la tabla de ordenes
SELECT employee_id, count(order_id) as ordenes_empleado FROM orders
GROUP BY employee_id
ORDER BY employee_id;

--Obtener la cantidad de ordenes por cliente de la tabla de ordenes
SELECT customer_id, count(customer_id) as total FROM orders
GROUP BY customer_id
ORDER BY customer_id;

--Obtener el total de productos vendidos por producto de la tabla order_details
SELECT product_id, sum(quantity) FROM order_details
GROUP BY product_id
ORDER BY product_id;
