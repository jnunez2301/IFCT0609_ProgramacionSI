DO $$
declare
nombre varchar(20) := 'Juan Lopez';
begin
	raise notice 'Bievenido %', nombre;
--  Sería el equivalente a `Bienivenido ${nombre}`
end
$$ language 'plpgsql';
-- Se le dice el lenguaje de programación a utilizar

DO $$
DECLARE
edad int := 18;
begin
	raise notice 'Su edad es %', edad;
END 
$$ LANGUAGE 'plpgsql';

DO $$
DECLARE
	genero CHAR(1) := 'F';
BEGIN
	raise notice 'Gender: %', genero;
END 
$$ LANGUAGE 'plpgsql';

DO $$
DECLARE
	usuario VARCHAR(20) := 'admin';
BEGIN
	if(usuario = 'admin') THEN
	 raise notice 'Bienvenido %', usuario;
	else
	 raise notice 'No se puede logear, no tiene permiso';
	end if;
END 
$$ LANGUAGE 'plpgsql';

-- definir una variable edad, decir si es mayor de edad o menor de edad
DO $$
DECLARE
	edad INTEGER = 20;
BEGIN
	if(edad > 18) THEN
		raise notice 'Es mayor de edad';
	else
		raise notice 'Es menor de edad';
	end if;
END
$$ LANGUAGE 'plpgsql';

-- definir una variable numerica que diga si es par o impar
DO $$
DECLARE
 	numero int = 3;
BEGIN
	if(numero % 2 = 0) THEN
		raise notice 'Es par';
	else
		raise notice 'Es impar';
	end if;
END
$$ LANGUAGE 'plpgsql';

-- estado civil
DO $$
DECLARE
	ESTADO_CIVIL char:=	'v';
BEGIN
	CASE
		when(estado_civil = 's')THEN raise notice 'Es soltero';
		when(estado_civil = 'c')THEN raise notice 'Es casado';
		when(estado_civil = 'v')THEN raise notice 'Es viudo';
		when(estado_civil = 'd')THEN raise notice 'Es divorciado';
		else
			raise notice 'valor invalido';
	END CASE;		
END
$$ LANGUAGE 'plpgsql';

--Estructuras de bucle

DO $$
DECLARE
contador INTEGER := 1;
begin
	loop
		contador := contador + 1;
		raise notice 'iteración %', contador;
	exit when contador = 10;
	end loop;
end
$$ language 'plpgsql';

DO $$
DECLARE
contador int := 1;
begin
	while(contador < 10) loop
		contador := contador + 1;
		raise notice 'iterador %', contador;
	end loop;
end
$$ LANGUAGE 'plpgsql';

-- Funciones
CREATE OR REPLACE FUNCTION sin_param()
returns TEXT
as $$
begin
	return 'Funciona';
end
$$ language 'plpgsql';

-- Ejecutar función
SELECT sin_param();

CREATE OR REPLACE FUNCTION cantidades_existencias()
RETURNS INTEGER
AS $$
DECLARE
	cantidad_existencias INTEGER;
BEGIN
	SELECT SUM(units_in_stock) INTO cantidad_existencias FROM products;
	RETURN cantidad_existencias;
END
$$ LANGUAGE 'plpgsql';

SELECT cantidades_existencias();

-- en base al id del  producto se devuelve el nombre

CREATE OR REPLACE FUNCTION nombre_producto( p_id integer)
RETURNS VARCHAR
AS $$
DECLARE
	nombre_producto VARCHAR;
BEGIN
	SELECT product_name INTO nombre_producto FROM products WHERE product_id = p_id;
	RETURN nombre_producto;
END
$$ LANGUAGE 'plpgsql';

SELECT nombre_producto(4);

-- Obtener el número de ordenes por empleado
-- parametro de entrada -> employee_id
-- parametro de salida -> numero_ordenes | count(*)

CREATE OR REPLACE FUNCTION num_ordenes_empleado(e_id integer)
returns integer
as $$
declare
	num_ordenes_empleado integer;
begin
	SELECT COUNT(order_id) INTO num_ordenes_empleado FROM orders
	WHERE employee_id = e_id;
	RETURN num_ordenes_empleado;
END
$$ LANGUAGE 'plpgsql';

SELECT num_ordenes_empleado(2);


-- Obtener en base de un id de producto obtener la suma de las
-- cantidades vendidas
CREATE OR REPLACE FUNCTION cantidades_vendidas(p_id integer)
returns integer
as $$
declare
	cant_vend integer;
begin
	SELECT SUM(unit_price * quantity) INTO cant_vend FROM ORDER_DETAILS WHERE product_id = p_id;
	return cant_vend;
END
$$ LANGUAGE 'plpgsql';

SELECT cantidades_vendidas(18);