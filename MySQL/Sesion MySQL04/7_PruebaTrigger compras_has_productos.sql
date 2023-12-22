SELECT * FROM compras WHERE id = 2;
-- el id 2 de compra tiene $172

-- Debo tener el nuevo valor de $80
SELECT * FROM compras_has_productos WHERE compras_id = 2;
DELETE FROM compras_has_productos WHERE compras_id = 2 and productos_id = 6;
DELETE FROM compras_has_productos WHERE compras_id = 2 and productos_id = 13;

-- el id 2 de compra tiene $80
SELECT * FROM compras WHERE id = 2;
