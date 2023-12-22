DESCRIBE usuarios;
-- Insertar nuevos usuarios
INSERT INTO usuarios(nombre,apellido,direccion,telefono,email,fecha_nacimiento,rol_id)
	VALUES ("Sergio","Torres","Sempre viva 100","5555556610","torres@gmail.com","1983-12-08",3),
    ("Daniel","Iñiguez","Toluca ","5523476610","daniel@gmail.com","1999-10-22",4),
    ("Santiago","Mondragon","Zina 200","5335556610","santi@gmail.com","1998-11-20",2),
    ("Gerardo","Montiel","Carranza 10","5556756610","gera@gmail.com","1998-04-07",1),
    ("Valentin","Zepeda","Toto 132","5518556610","vale@gmail.com","1999-02-20",1),
    ("David","Ruiz","Metepec","5599556610","david@gmail.com","1999-09-27",1),
    ("Juan Pablo","Estrada","Carranza 5","5552345661","juanpablo@gmail.com","1999-01-30",1),
    ("Tania","Gayosso","Estado MX","5538646610","tan@gmail.com","1994-03-21",5),
    ("Sahary","Escobedo","Tijuana","5512356610","sahary@gmail.com","1993-06-12",5),
    ("Andy","Derbez","USA","5556614357","andy@gmail.com","1997-07-16",3),
    ("Nancy","Moreno","FrioLanida","5512556645","nancy@gmail.com","1989-04-04",5);
    
SELECT * FROM usuarios;