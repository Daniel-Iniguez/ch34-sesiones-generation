USE tienda;
DESCRIBE compras;

INSERT INTO compras(usuario_id, monto_total, fecha_compra) VALUES (11, 0, "2023-12-01");
INSERT INTO compras(usuario_id, monto_total, fecha_compra) VALUES (1, 200, "2023-12-01");
INSERT INTO compras(usuario_id, monto_total, fecha_compra) VALUES (2, 10, "2023-12-01");
INSERT INTO compras(usuario_id, monto_total, fecha_compra) VALUES (3, 110, "2023-12-01");
INSERT INTO compras(usuario_id, monto_total, fecha_compra) VALUES (4, 320, "2023-12-01");
INSERT INTO compras(usuario_id, monto_total, fecha_compra) VALUES (8, 450, "2023-12-01");
INSERT INTO compras(usuario_id, monto_total, fecha_compra) VALUES (9, 730, "2023-12-01");
INSERT INTO compras(usuario_id, monto_total, fecha_compra) VALUES (5, 20, "2023-12-01");
INSERT INTO compras(usuario_id, monto_total, fecha_compra) VALUES (6, 230, "2023-12-01");
INSERT INTO compras(usuario_id, monto_total, fecha_compra) VALUES (10, 400, "2023-12-01");


SELECT * FROM compras;
SELECT * FROM usuarios;


-- Modificar el valor del monto total
UPDATE compras SET monto_total = 540 WHERE id = 1;
-- Modificar la fecha de nacimiento de Tania
UPDATE usuarios SET fecha_nacimiento = "1997-03-09 01:05:00" WHERE id=8;