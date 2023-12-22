-- Creacion de una vista
CREATE VIEW `edades` AS
SELECT nombre, fecha_nacimiento,
DATEDIFF(CURDATE(), fecha_nacimiento) AS 'Dias',
ROUND((DATEDIFF(CURDATE(), fecha_nacimiento))/365) AS 'Años'
FROM usuarios
WHERE nombre NOT LIKE "%Oswa%";