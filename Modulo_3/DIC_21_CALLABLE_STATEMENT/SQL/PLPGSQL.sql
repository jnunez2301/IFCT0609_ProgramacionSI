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

SELECT nombre_producto(10);