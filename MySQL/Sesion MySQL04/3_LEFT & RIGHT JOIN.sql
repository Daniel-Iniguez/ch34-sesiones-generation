-- Mostrar todos los porductos que tenga una categoria
SELECT 
p.id,
p.nombre,
ca.nombre AS categoria
FROM productos p
INNER JOIN categorias ca
ON ca.id = p.categoria_id;

SELECT 
COUNT(p.id)
FROM productos p
INNER JOIN categorias ca
ON ca.id = p.categoria_id; -- 15 PRODUCTOS MOSTRADOS

-- Mostrar todos los porductos tengan o no una categoria asignada
SELECT 
p.id,
p.nombre,
ca.nombre AS categoria
FROM productos p
LEFT JOIN categorias ca
ON ca.id = p.categoria_id;

-- Mostrar todas las categorias tengan o no un producto asignado
-- total de registros
SELECT 
p.id,
p.nombre,
ca.nombre AS categoria
FROM productos p
RIGHT JOIN categorias ca
ON ca.id = p.categoria_id;