-- Drop tables if they exist
DROP TABLE IF EXISTS TablaA;
DROP TABLE IF EXISTS TablaB;

-- Create TableA
CREATE TABLE TablaA (
    valor VARCHAR(50)
);

-- Create TableB
CREATE TABLE TablaB (
    valor VARCHAR(50)
);

-- Insert data into TableA
INSERT INTO TablaA VALUES ('a'), ('b'), ('c'), ('d');

-- Insert data into TableB
INSERT INTO TablaB VALUES ('a'), ('b'), ('e'), ('f');

-- Select data from TableA
SELECT * FROM TablaA;

-- Select data from TableB
SELECT * FROM TablaB;

-- Inner Join
SELECT a.valor FROM TablaA a
INNER JOIN TablaB b ON a.valor = b.valor;

-- Left Outer Join
SELECT a.valor, b.valor FROM TablaA a
LEFT OUTER JOIN TablaB b ON a.valor = b.valor;

-- Right Outer Join
SELECT a.valor,b.valor FROM TablaA a
RIGHT OUTER JOIN TablaB b ON a.valor = b.valor;

-- Full Outer Join
SELECT a.valor, b.valor FROM TablaA a
FULL OUTER JOIN TablaB b ON a.valor = b.valor;
