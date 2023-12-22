DELIMITER //
CREATE TRIGGER updateMontoTotal_INSERT
AFTER INSERT ON compras_has_productos
FOR EACH ROW
BEGIN
    CALL updateMontoTotal_Compras(NEW.compras_id);
END;

CREATE TRIGGER updateMontoTotal_UPDATE
AFTER UPDATE ON compras_has_productos
FOR EACH ROW
BEGIN
    CALL updateMontoTotal_Compras(NEW.compras_id);
END;

CREATE TRIGGER updateMontoTotal_DELETE
AFTER DELETE ON compras_has_productos
FOR EACH ROW
BEGIN
    CALL updateMontoTotal_Compras(OLD.compras_id);
END;

//
DELIMITER;

