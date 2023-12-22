SELECT * FROM categoria;

-- Intentar eliminar el ID 2
DELETE FROM categoria WHERE id = 2;

-- Modificar el id 7 cambiarlo a id 11
SELECT * FROM categoria WHERE id = 7;
UPDATE categoria SET id = 11 WHERE id = 7;

-- Eliminar el id 3 de frappes, sin eliminar los productos