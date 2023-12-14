-- Consultas de más de una tabla
-- Mostrar product_id, product_name, importe sum(unit_price * quantity)
SELECT 
od.product_id, 
p.product_name,
(od.unit_price * od.quantity) as importe
FROM order_details od
INNER JOIN products p 
ON od.product_id = p.product_id
ORDER BY product_id;

--AGRUPAR POR PRODUCTO
SELECT 
od.product_id, 
p.product_name,
sum(od.unit_price * od.quantity) as importe
FROM order_details od
INNER JOIN products p 
ON od.product_id = p.product_id
GROUP BY od.product_id, p.product_name
ORDER BY od.product_id;

--Contar las ordenes por cliente y empleado obteniendo
-- nombre completo del empleado y nombre de la empresa
SELECT
CONCAT(first_name, ' ', last_name) nombre_empleado,
company_name,
count(order_id) as contador
FROM orders o
INNER JOIN employees e
ON o.employee_id = e.employee_id
INNER JOIN customers c
ON o.customer_id = c.customer_id
GROUP BY nombre_empleado, c.company_name
ORDER BY nombre_empleado;


--Obtener el category_name, company_name importe vendido de la tabla de order_details
-- por category_id y supplier_id
SELECT 
category_name,
company_name,
sum(od.quantity * od.unit_price) as importe_vendido
FROM categories c
INNER JOIN products p
ON c.category_id = p.category_id
INNER JOIN suppliers s
ON  p.supplier_id = s.supplier_id
INNER JOIN order_details od
ON p.product_id = od.product_id
GROUP BY category_name, company_name
ORDER BY category_name, company_name;
