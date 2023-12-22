SELECT * FROM usuarios;
SELECT * FROM edades;

-- Insertar una persona de 10 años
INSERT INTO usuarios(nombre,apellido,direccion,telefono,email,fecha_nacimiento,rol_id)
	VALUES("Fernando","Juarez","Fondo de Vkini","578123567", "ferjuarez@gmail.com", "2000-02-01", 1);
    
SELECT * FROM compras_has_productos;
SELECT * FROM compras;
    
-- Hacer una consulta que nos entregue la sumatoria del total de cada compra de cada producto del id_compra 3
SELECT 
SUM(total) AS Total
FROM compras_has_productos
WHERE compras_id = 3;
    
-- Modificar el campo monto_total de la tabla compras
-- para que actualice el valor con el select anterior
UPDATE compras SET monto_total = (SELECT 
	SUM(total) AS Total
	FROM compras_has_productos
	WHERE compras_id = 3)
WHERE id = 3;

CALL updateMontoTotal_Compras(1);
CALL updateMontoTotal_Compras(2);
CALL updateMontoTotal_Compras(4);
CALL updateMontoTotal_Compras(5);