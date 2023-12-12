-- INNER JOIN, LEFT JOIN, RIGHT JOIN
-- La manera antigua
SELECT p.category_id,
category_name,
product_id,
product_name
FROM categories c, products p
WHERE c.category_id = p.category_id;

-- La manera moderna
SELECT p.category_id,
category_name,
product_id,
product_name
FROM categories c
INNER JOIN products p
ON c.category_id = p.category_id;

--Obtener el order_id, empleado y nombre completo de las tablas
-- orders y employees
SELECT 
order_id, 
order_date,
o.employee_id, 
CONCAT(e.first_name, ' ', e.last_name) AS employee_name
FROM employees e
INNER JOIN orders o
ON e.employee_id = o.employee_id
ORDER BY e.employee_id;

--Obtener el product_id, product_name, proveedor y nombre de la empresa
-- de las tablas products y suppliers
SELECT DISTINCT
p.product_id,
p.product_name,
s.supplier_id,
s.company_name
FROM products p
INNER JOIN suppliers s
ON p.supplier_id = s.supplier_id;

--Obtener las order_id, fecha, cliente(empresa) y su nombre
SELECT 
o.customer_id,
o.order_date,
c.company_name,
c.contact_name
FROM orders o
INNER JOIN customers c
ON o.customer_id = c.customer_id;
