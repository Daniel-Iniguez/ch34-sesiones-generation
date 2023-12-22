-- Agrupar elementos con GROUP By

SELECT 
u.id AS idUsuario,
u.email,
co.id AS idCompras,
co.fecha_compra
FROM usuarios u
INNER JOIN compras co
ON u.id = co.usuario_id;


-- Mostrar los usuarios y el numero total de compras que han realizado
SELECT 
u.id AS idUsuario,
u.email,
COUNT(co.id) AS ComprasTotales
FROM usuarios u
INNER JOIN compras co
ON u.id = co.usuario_id
GROUP BY u.id;

--  Uso de WHERE y HAVING en agrupaciones
SELECT 
u.id AS idUsuario,
u.email,
COUNT(co.id) AS ComprasTotales
FROM usuarios u
INNER JOIN compras co
ON u.id = co.usuario_id
WHERE u.id <= 5
GROUP BY u.id
HAVING ComprasTotales >= 2 ;

-- Mostrar las compras con la sumatoria de las ventas de cada producto
SELECT 
co.id AS IDCompra,
-- chp.productos_id AS IDProducto,
-- cantidad,
-- subtotal AS precioProducto,
-- total AS costoTotalProducto
SUM(chp.total) AS totalCompra,
u.email AS emailUsuario
FROM compras co
INNER JOIN compras_has_productos chp
ON co.id = chp.compras_id
INNER JOIN usuarios u
ON u.id = co.usuario_id
GROUP BY co.id
HAVING totalCompra > 300;
