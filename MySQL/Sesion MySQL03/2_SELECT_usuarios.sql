SELECT * FROM usuarios;
SELECT * FROM usuarios WHERE email = '@gmail.com';

-- Patrones de busqueda ------------------------
-- comodin: _ donde puede buscar cualquier caracter
-- comodin: % donde puede buscar n numero de caracteres

-- Buscar todas las personas que tengan @gmail.com
SELECT * FROM usuarios WHERE email LIKE '%@gmail%' ;
-- Buscar todas las personas que NO tengan @gmail.com
SELECT * FROM usuarios WHERE email LIKE '%@gmail%' ;
SELECT * FROM usuarios WHERE email LIKE '%_____@gmail%' ;
-- Buscar todas las personas que su lada sea de CDMX (55 y 56)
SELECT * FROM usuarios WHERE telefono LIKE '55%' OR telefono LIKE '56%';

-- Funcion de caracteres ------------------------------
SELECT nombre, apellido FROM usuarios;
SELECT nombre, apellido, CONCAT(nombre, " ", apellido) AS "Nombre completo"
	FROM usuarios;
-- Longitud de nu texto
SELECT nombre, 
	LENGTH(nombre) AS longitud,
    REVERSE(nombre),
    LOWER(nombre),
    UPPER(nombre)
    FROM usuarios;
    
-- Funciones Fecha --------------------------------------
SELECT CURDATE(); -- la fecha actual
SELECT NOW(); -- fecha y hora actual
SELECT localtimestamp(); -- fecha y hora

SELECT nombre, fecha_nacimiento FROM usuarios;
SELECT nombre, fecha_nacimiento, DATE_FORMAT(fecha_nacimiento, "%d/%m/%Y") FROM usuarios
WHERE MONTH(fecha_nacimiento) = MONTH(CURDATE() + INTERVAL 1 MONTH);

SELECT nombre, fecha_nacimiento,
DATEDIFF(CURDATE(), fecha_nacimiento) AS 'Dias',
ROUND((DATEDIFF(CURDATE(), fecha_nacimiento))/365) AS 'Años'
FROM usuarios
WHERE nombre NOT LIKE "%Oswa%";

-- Hoy es el dia de corte, tienes 20 dias para pagar
SELECT NOW(), DATE_ADD( NOW(), INTERVAL 20 DAY ) AS "Fecha límite pago";