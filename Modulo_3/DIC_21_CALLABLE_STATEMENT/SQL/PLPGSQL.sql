CREATE OR REPLACE FUNCTION cantidades_existencia()
returns integer
AS $$
declare
	c_existencias integer;
begin
	SELECT sum(units_in_stock) INTO c_existencias FROM products;
	RETURN c_existencias;
END
$$ LANGUAGE 'plpgsql';
-- Probamos la funcion
SELECT cantidades_existencia();

CREATE OR REPLACE FUNCTION nombre_producto(p_id integer)
returns varchar
AS $$
declare
	n_producto text;
begin
	SELECT product_name INTO n_producto FROM products WHERE product_id = p_id;
	RETURN n_producto;
END
$$ LANGUAGE 'plpgsql';

-- Probamos la función
SELECT nombre_producto(10);

--CRUD

SELECT * FROM categories;

-- INSERT

INSERT INTO categories(category_id, category_name)
VALUES(100, 'testing');

-- INSERT
CREATE OR REPLACE FUNCTION add_category(category_id integer, category_name varchar(15))
	RETURNS TEXT AS $$
DECLARE 
	
BEGIN
	INSERT INTO categories(category_id, category_name)
	VALUES(category_id, category_name);
	RETURN CONCAT(category_name, ' insertada');
END
$$ LANGUAGE 'plpgsql';

SELECT add_category(100, 'funcion');

-- COMPROBAMOS
SELECT * FROM categories;

-- DELETE
CREATE OR REPLACE FUNCTION delete_category(c_id integer)
	RETURNS TEXT AS $$
DECLARE 
	
BEGIN
	DELETE FROM categories WHERE category_id = c_id;
	RETURN 'eliminado';
END
$$ LANGUAGE 'plpgsql';

SELECT delete_category(100);
-- COMPROBAMOS
SELECT * FROM categories;