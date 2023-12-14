-- NO OLVIDAR EL WHERE
DELETE FROM categories
WHERE category_id = 100;

-- ACTUALIZAR LOS PRECIOS DE PRODUCTO Y ELEVARLOS EL 10%

UPDATE products SET unit_price = unit_price * 1.1;
-- WHERE product_id > 0; En este caso el where es innecesario

SELECT * FROM products;