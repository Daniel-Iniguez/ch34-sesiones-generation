-- Eliminar todos los datos
DELETE FROM compras_has_productos;

-- Resetear el valor de AUTO_INCREMENT
ALTER TABLE compras_has_productos AUTO_INCREMENT = 1;

INSERT INTO roles(id,nombre, descripcion) VALUES(100,"N/A", "Valor temporal");

-- Eliminar todos los datos y el reset autoincrement
TRUNCATE TABLE roles;

-- Mostrar todos los registros
SELECT * FROM roles;

