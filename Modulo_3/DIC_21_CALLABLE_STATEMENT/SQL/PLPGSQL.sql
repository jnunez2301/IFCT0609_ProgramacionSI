CREATE OR REPLACE FUNCTION cantidades_existencia()
returns integer
AS $$
declare
	c_existencias integer;
begin
	SELECT sum(units_in_stock) INTO c_existencias FROM products;
	RETURN c_existencias
END
$$ LANGUAGE 'plpgsql';