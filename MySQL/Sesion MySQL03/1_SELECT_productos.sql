USE tienda;
-- Operaciones matematicas
SELECT 6%2;
SELECT 3*3;

-- Funciones matemáticas
SELECT ABS(-6); -- VALOR ABSOLUTO DE UN NUMERO
SELECT CEIL(8.1); --  REDONDEAR EL NUMERO ENTERO SUPERIOR
SELECT FLOOR(8.1); -- REDONDEA AL NUMERO ENTERO INFERIOR
SELECT MOD(5,2); -- RESIDUO DE UNA DIVISION
SELECT PI(); -- VALOR DE PI
SELECT POWER(3,2); -- ELEVAR UNA NUMERO A LA POTENCIA DETERMINADA
SELECT RAND(); -- ENTRE 0 Y 1
SELECT FLOOR(RAND() * 100); -- NUMERO ALEATORIO ENTRE 0 Y 100 SIN DECIMALES.
SELECT ROUND(9.5); -- REDONDEA HACIA ABAJO < 0.5 >= REDONDEA HACIA ARRIBA
SELECT TRUNCATE(5.4567, 2); -- REDONDEA LOS DECIMALES QUE INDIQUEMOS 

--
SELECT * FROM productos;
SELECT nombre, precio, precio*6 AS Multiplicado FROM productos;
-- Usar un alias en el nombre de las columnas
SELECT 
	`nombre` AS "name", 
    `precio` AS "price", 
    `precio` *6 AS "six pack" 
FROM `productos`
WHERE `precio` >= 50 -- Filtrar solo los valores que sean mayores o igual
ORDER BY `name` ASC -- ordenar de forma ascendente, DESC(descendente)
LIMIT 5 OFFSET 2; -- Limita el numero de elemntos mostrados

-- Contar el numero de elementos
SELECT COUNT(*) AS "Productos totaes" FROM productos; -- Cuenta el numero de registros

-- Cuantos productos tenemos mayores o igual a 50*
SELECT COUNT(*) AS "Productos mayores a 50" FROM productos
WHERE `precio` >= 50; 

-- Obtener el valor maximo de una columna
SELECT MAX(precio) FROM productos; -- $90
-- Obtener el valor minimo de una columna
SELECT MIN(precio) FROM productos; -- $25
-- Obtener el promedio de una columna
SELECT AVG(precio) FROM productos; -- $61.5
-- Sumatoria de los valores de una columna
SELECT SUM(precio) FROM productos; -- $1230

-- Cuantas categorias se estan usando
SELECT COUNT(DISTINCT categoria_id) AS "Categorias en uso" FROM productos;

-- Consultas anidadas ------------------
-- El producto de mayor valor
SELECT * FROM productos
WHERE precio = (SELECT MAX(precio) FROM productos);

-- Operadores Logicos
-- Mostrar los productos que sean de catergoria_id 2 y 4
SELECT * FROM productos WHERE categoria_id = 2 OR categoria_id = 4;
-- Mostrar los productos que sean de la categoria 4 y sean mayor a 50 pesos
SELECT * FROM productos WHERE categoria_id = 4 AND precio > 50;
-- Mostrat todos los porductos que no sean de la categoria 2 y 4
SELECT * FROM productos WHERE categoria_id != 2 and categoria_id != 4;

-- Operadores de rango
-- Mostrar todos lops productos que el precio sea >= 50 pero <= 100
SELECT * FROM productos WHERE precio >= 50 AND precio <= 50;
SELECT COUNT(*) FROM productos WHERE precio >= 50 AND precio <= 100; -- 17
SELECT * FROM productos WHERE precio BETWEEN 50 AND 100;
-- Mostrar los productos que el precio NO sea >= 50 y <= 100
SELECT * FROM productos WHERE precio NOT BETWEEN 50 AND 100;

-- Mostrar los productos que sean de la categoria 2 o 4
SELECT * FROM productos WHERE categoria_id IN(2,4);
-- Mostrar los productos que NO sean de la categoria 2 o 4
SELECT * FROM productos WHERE categoria_id NOT IN(2,4);
-- Buscando valores nullos IS NULL
SELECT * FROM productos WHERE categoria_id IS NULL;
SELECT * FROM productos WHERE ISNULL(categoria_id);
-- Buscando valores no nullos is NOT NULL
SELECT * FROM productos WHERE categoria_id IS NOT NULL;

