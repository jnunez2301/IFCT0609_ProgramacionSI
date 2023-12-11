-- Funciones de agregación: count, su, avg, max, min
-- SOLO COUNT ACEPTA EL ASTERISCO
-- El resto el nombre de una columna o operación aritmetica
SELECT COUNT(*) AS num_registros	
FROM products;
-- TAMBIÉN PUEDE SER
SELECT COUNT(*) num_registros
FROM products;
-- OBTENER EL NÚMERO DE FILAS DE LA TABLA EMPLEADOS
SELECT COUNT(*) registros FROM employees;
-- CONTAR REGIONES 
-- P.D: __Excluye los nulos automaticamente__
SELECT COUNT(region) FROM employees;
-- PARA MEJORAR RENDIMIENTO EN COUNT USAMOS LA ID
SELECT COUNT(employee_id) FROM employees;
-- Gestión de nulos
SELECT * FROM datos;