--1) Obtener todas las columnas y filas de la tabla de resultados
SELECT * FROM resultados;

--2) Obtener las columnas clase, tipo, pais y desplazamiento de la tabla de clases
SELECT clase, tipo, pais, desplazamiento from clases;

--3) Obtener las columnas clase,numarmas sumandole un 20%, calibre de la tabla de clases
SELECT (numarmas * 1.2) as num_armas, calibre FROM clases;

--4) Obtener los barcos que comiencen con C
SELECT * FROM barcos WHERE nombre LIKE 'C%';

--5) Obtener las batallas cuya segunda posicion sea o
SELECT * FROM batallas WHERE nombre LIKE '_o%';

--6) Nombres de clases de barco y países de las clases de barco que llevaban armas con un
--calibre mayor o igual a 16 pulgadas.
SELECT clase, pais, calibre FROM clases WHERE calibre >= 16;
--resultado 4 registros

--7) Barcos con desplazamiento superior a 35.000 toneladas de la tabla de barcos.
SELECT c.clase, b.nombre, c.desplazamiento
FROM clases c
INNER JOIN barcos b ON c.clase = b.clase
WHERE desplazamiento > 35000
ORDER BY desplazamiento;
--resultado 8

--8) Obtener el promedio de armas, el calibre mínimo de la tabla de clases
SELECT avg(numarmas) AS promedio_armas, MIN(calibre) AS  calibre_minimo FROM clases;

--9) Obtener la información de resultados ordenado por resultado
SELECT * FROM resultados ORDER BY resultado;

--10) Para cada clase, encontrar el año en el que fue botado el barco más antiguo de la clase.
SELECT c.clase, b.nombre,b.botado 
FROM clases c
INNER JOIN barcos b ON c.clase = b.clase
ORDER BY b.botado;

--11) Contar cuantos barcos tiene cada batalla de la tabla de resultados
SELECT barco, COUNT(barco) AS barco_batalla
FROM resultados 
GROUP BY barco; 

--12)Batallas en las que participaron barcos de la clase Congo.
SELECT c.clase, b.nombre, COUNT(r.batalla), r.batalla
FROM clases c
INNER JOIN barcos b ON c.clase = b.clase
INNER JOIN resultados r ON b.nombre = r.barco
WHERE c.clase = 'Congo'
GROUP BY r.batalla, c.clase, b.nombre;

--resultado 2

--13) Nombre, desplazamiento y número de armas de todos los barcos que participaron en la
--batalla de Guadalcanal.
SELECT r.batalla, b.nombre, c.desplazamiento, c.numarmas
FROM resultados r
INNER JOIN barcos b ON r.barco = b.nombre
INNER JOIN clases c ON b.clase = c.clase
WHERE batalla = 'Guadalcanal';
--resultado 2
--14) Nombre de las clases de barcos tales que al menos dos barco de la clase se hundió en una
--batalla.

SELECT b.clase, COUNT(resultado = 'hundido')
FROM resultados r
INNER JOIN barcos b ON r.barco = b.nombre
INNER JOIN clases c ON b.clase = c.clase
GROUP BY b.clase
HAVING count(resultado = 'hundido') >= 2;
-- Correción

select c.clase from resultados r
inner join barcos b
on b.nombre = r.barco
inner join clases c
on c.clase = b.clase
where resultado = 'hundido'
group by c.clase 
having count(b.nombre)>=2
--15) Batallas en las que participaron al menos tres barcos del mismo país.
SELECT c.pais, count(c.pais)
FROM clases c
INNER JOIN barcos b ON c.clase = b.clase
INNER JOIN resultados r ON b.nombre = r.barco
GROUP BY c.pais
HAVING count(c.pais) >=  3;
--resultado 1







