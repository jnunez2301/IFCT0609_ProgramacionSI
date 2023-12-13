-- Group by
-- Having se suele utilizar para filtros de cantidad que se calculan en tiempo real
-- Obtener por producto las cantidades que se han vendido y que su suma sea mayor a 850
SELECT 
product_id,
sum(quantity) as cantidad_vendida
FROM order_details
GROUP BY product_id
HAVING sum(quantity) > 850
ORDER BY product_id;
-- ORDER BY siempre va al final!

--Obtener los empleados que han vendido más de 100 ordenes
SELECT 
employee_id,
COUNT(order_id)
FROM orders
GROUP BY employee_id
HAVING count(order_id) > 100
ORDER BY employee_id;

--Obtener el número de ordenes por pais, únicamente de los paises USA, SPAIN
SELECT 
ship_country,
COUNT(order_id)
FROM orders
WHERE ship_country IN('Spain', 'USA')
GROUP BY ship_country;

--Cuales son los proveedores que nos surten más de 1 producto, msotrar el proveedor
-- mostrar la cantidad de productos, pero únicamente de la categoria 1 de la tabla productos
SELECT supplier_id, count(product_id) as cantidad
FROM products
WHERE category_id = 1
GROUP BY supplier_id
HAVING count(product_id) > 1
ORDER BY supplier_id;

--CONTAR LAS ORDENES POR EMPLEADO DE LOS PAISES USA, CANADA, SPAIN (ShipCountry)
--MOSTRAR UNICAMENTE LOS EMPLEADOS CUYO CONTADOR DE ORDENES SEA MAYOR A 20

SELECT 
employee_id,
COUNT(order_id)
FROM orders
WHERE ship_country IN('USA', 'Canada', 'Spain')
GROUP BY employee_id
HAVING count(order_id) > 20
ORDER BY employee_id;

--OBTENER EL PRECIO PROMEDIO DE LOS PRODUCTOS POR PROVEEDOR
--UNICAMENTE DE AQUELLOS CUYO PROMEDIO SEA MAYOR A 20
SELECT 
avg(unit_price) as promedio,
supplier_id
FROM products
GROUP BY supplier_id
HAVING avg(unit_price) > 20
ORDER BY supplier_id;

--CONTAR LAS ORDENES POR EMPLEADO DE LOS PAISES (ShipCountry)
--USA, CANADA, SPAIN
--CUYO CONTADOR SEA MAYOR A 25
SELECT 
employee_id,
COUNT(order_id)
FROM orders
WHERE ship_country IN('USA', 'Canada', 'Spain')
GROUP BY employee_id
HAVING count(order_id) > 25
ORDER BY employee_id;

--OBTENER LAS VENTAS (Quantity * UnitPrice) AGRUPADAS POR PRODUCTO 
--(Orders details) Y CUYA SUMA DE VENTAS SEA MAYOR A 50.000

SELECT 
SUM(quantity * unit_price) as ventas,
product_id
FROM order_details
GROUP BY product_id
HAVING SUM(quantity * unit_price) > 50
ORDER BY product_id;

