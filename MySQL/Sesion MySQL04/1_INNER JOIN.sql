SELECT 
u.id AS userID, 
email, 
rol_id,
r.nombre
FROM usuarios u
INNER JOIN roles r
ON u.rol_id = r.id;
    
-- Mostras los porductos con el nombre de la categoria asignada
SELECT 
p.nombre AS Producto,
c.nombre AS Categoria
FROM productos p
INNER JOIN categorias c
ON p.categoria_id = c.id
ORDER BY c.nombre DESC, p.nombre ASC;

-- INNER JOIN 3 TABLAS
SELECT  
u.id AS usuarioID, 
u.nombre AS nombreUsuario,
u.email,
r.nombre AS Rol,
c.id AS compraID,
c.fecha_compra
FROM usuarios u 
INNER JOIN roles r
ON u.rol_id = r.id
INNER JOIN compras c
ON u.id = c.usuario_id;

-- Agregando where a la consulta
SELECT  
	u.id AS usuarioID, 
	u.nombre AS nombreUsuario,
	u.email,
	r.nombre AS Rol,
	c.id AS compraID,
	c.fecha_compra,
	chp.productos_id AS productoID,
	p.nombre AS nombreProducto,
    ca.nombre AS nombreCategoria
	FROM usuarios u 
	INNER JOIN roles r
	ON u.rol_id = r.id
	INNER JOIN compras c
	ON u.id = c.usuario_id
	INNER JOIN compras_has_productos chp
	ON c.id = chp.compras_id
	INNER JOIN productos p
	ON chp.productos_id = p.id
    LEFT JOIN categorias ca
    ON p.categoria_id = ca.id
	WHERE u.id IN(1,4);
    
-- Establecer en null los productos de la categoria Frappé
SELECT * FROM productos WHERE categoria_id IS NULL;
UPDATE productos
	SET categoria_id = NULL
	WHERE categoria_id = 3;
SELECT * FROM categoria WHERE nombre LIKE "%Frap%";

-- Para poder quitar la opción de Not Null al campo categoria de productos, deshabilitamos priovisionalmente las restricciones
SET foreign_key_checks = 0;
ALTER TABLE productos
CHANGE COLUMN categoria_id categoria_id BIGINT NULL;
SET foreign_key_checks = 1;