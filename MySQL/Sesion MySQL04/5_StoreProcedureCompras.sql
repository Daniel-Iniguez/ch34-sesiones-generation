
DELIMITER $$

CREATE PROCEDURE `updateMontoTotal_Compras`(IN idCompra BIGINT)
BEGIN
	UPDATE compras SET monto_total = (SELECT 
		SUM(total) AS Total
		FROM compras_has_productos
		WHERE compras_id = idCompra)
	WHERE id = idCompra;
END$$

DELIMITER ;
