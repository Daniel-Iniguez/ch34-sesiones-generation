DESCRIBE roles;

-- Insertar roles
INSERT INTO roles(nombre, descripcion) VALUES("cliente", "Cliente de la tienda");
INSERT INTO roles(nombre, descripcion) VALUES("admin", "Administrador de la tienda");
INSERT INTO roles(nombre, descripcion) VALUES("almacen", "Prsona encargada del almacen");
INSERT INTO roles(nombre, descripcion) VALUES("propietario", "Propiera de la tienda");
INSERT INTO roles(nombre, descripcion) VALUES("vendedor", "Vendedor de producto");

-- Mostrar todos los registros
SELECT * FROM roles;
