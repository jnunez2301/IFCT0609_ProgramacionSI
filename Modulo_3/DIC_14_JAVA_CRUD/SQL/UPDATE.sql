-- NO OLVIDAR EL WHERE
UPDATE categories 
SET category_name = 'P.ECOLOGICOS',
description = 'Articulos de papeleria ecologicos'
WHERE category_id = 100;

SELECT * FROM categories WHERE category_id = 100;

-- Consulta para obtener los productos que no tengan la categoria 100
SELECT * 
FROM products
WHERE category_id != 100;