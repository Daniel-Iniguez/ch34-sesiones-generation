-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: tienda
-- ------------------------------------------------------
-- Server version	8.0.35

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `categoria`
--

DROP TABLE IF EXISTS `categoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `categoria` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `descripcion` varchar(300) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categoria`
--

LOCK TABLES `categoria` WRITE;
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` VALUES (1,'Café','Variedades de café caliente'),(2,'Bebidas','Refrescos y bebidas frías'),(3,'Frappés','Bebidas frías y espumosas'),(4,'Especialidades','Productos especiales del chef'),(5,'Bagels','Panecillos de bagel con diversos rellenos'),(6,'Paninis','Sandwiches calientes prensados'),(7,'Cuernitos','Productos de panadería en forma de cuerno'),(8,'Waffles','Waffles dulces y salados'),(9,'Panes','Variedades de pan fresco');
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `compras`
--

DROP TABLE IF EXISTS `compras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `compras` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `usuario_id` bigint NOT NULL,
  `monto_total` decimal(9,2) NOT NULL,
  `fecha_compra` timestamp NOT NULL,
  PRIMARY KEY (`id`),
  KEY `usuario_id_idx` (`usuario_id`),
  CONSTRAINT `usuario_id` FOREIGN KEY (`usuario_id`) REFERENCES `usuarios` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compras`
--

LOCK TABLES `compras` WRITE;
/*!40000 ALTER TABLE `compras` DISABLE KEYS */;
/*!40000 ALTER TABLE `compras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `compras_has_productos`
--

DROP TABLE IF EXISTS `compras_has_productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `compras_has_productos` (
  `compras_id` bigint NOT NULL AUTO_INCREMENT,
  `productos_id` bigint NOT NULL,
  `cantidad` int DEFAULT NULL,
  `subtotal` decimal(9,2) DEFAULT NULL,
  `descuento` decimal(9,2) DEFAULT NULL,
  `total` decimal(9,2) DEFAULT NULL,
  PRIMARY KEY (`compras_id`,`productos_id`),
  KEY `fk_compras_has_productos_productos1_idx` (`productos_id`),
  KEY `fk_compras_has_productos_compras1_idx` (`compras_id`),
  CONSTRAINT `fk_compras_has_productos_compras1` FOREIGN KEY (`compras_id`) REFERENCES `compras` (`id`),
  CONSTRAINT `fk_compras_has_productos_productos1` FOREIGN KEY (`productos_id`) REFERENCES `productos` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `compras_has_productos`
--

LOCK TABLES `compras_has_productos` WRITE;
/*!40000 ALTER TABLE `compras_has_productos` DISABLE KEYS */;
/*!40000 ALTER TABLE `compras_has_productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productos` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nombre` varchar(120) NOT NULL,
  `precio` decimal(9,2) NOT NULL,
  `categoria_id` bigint NOT NULL,
  PRIMARY KEY (`id`),
  KEY `productos_has_categoria_idx` (`categoria_id`),
  CONSTRAINT `productos_has_categoria` FOREIGN KEY (`categoria_id`) REFERENCES `categoria` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES (1,'Café Americano',50.00,1),(2,'Espresso',25.00,1),(3,'Matcha Latte',50.00,2),(4,'Chai Latte',55.00,2),(5,'Chocolate',45.00,2),(6,'Café Frappé',65.00,3),(7,'Oreo Frappé',65.00,3),(8,'Mocha Frappé',65.00,3),(9,'Sea Salt Caramel',60.00,3),(10,'Dark Horchata Ice',55.00,3),(11,'Bagel Clásico',65.00,4),(12,'Bagel Serrano',80.00,4),(13,'Bagel Dulce/Salado',40.00,4),(14,'Panini Italiano',70.00,5),(15,'Pizanini',70.00,5),(16,'Panini Vegetariano',70.00,5),(17,'Cuernito Clásico',65.00,6),(18,'Cuernito Italiano',65.00,6),(19,'Waffle Tradicional',80.00,7),(20,'Waffle con Helado o Fresas',90.00,7);
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `roles` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` VALUES (1,'cliente','Cliente de la tienda'),(2,'admin','Administrador de la tienda'),(3,'almacen','Prsona encargada del almacen'),(4,'propietario','Propiera de la tienda'),(5,'vendedor','Vendedor de producto');
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `nombre` varchar(70) NOT NULL,
  `apellido` varchar(70) NOT NULL,
  `direccion` varchar(300) DEFAULT NULL,
  `telefono` varchar(30) DEFAULT NULL,
  `email` varchar(100) NOT NULL,
  `fecha_nacimiento` timestamp NULL DEFAULT NULL,
  `rol_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email_UNIQUE` (`email`),
  KEY `fk_clientes_roles1_idx` (`rol_id`),
  CONSTRAINT `fk_clientes_roles1` FOREIGN KEY (`rol_id`) REFERENCES `roles` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'Sergio','Torres','Sempre viva 100','5555556610','torres@gmail.com','1983-12-08 06:00:00',3),(2,'Daniel','Iñiguez','Toluca ','5523476610','daniel@gmail.com','1999-10-22 06:00:00',4),(3,'Santiago','Mondragon','Zina 200','5335556610','santi@gmail.com','1998-11-20 06:00:00',2),(4,'Gerardo','Montiel','Carranza 10','5556756610','gera@gmail.com','1998-04-07 06:00:00',1),(5,'Valentin','Zepeda','Toto 132','5518556610','vale@gmail.com','1999-02-20 06:00:00',1),(6,'David','Ruiz','Metepec','5599556610','david@gmail.com','1999-09-27 06:00:00',1),(7,'Juan Pablo','Estrada','Carranza 5','5552345661','juanpablo@gmail.com','1999-01-30 06:00:00',1),(8,'Tania','Torres','Estado MX','5538646610','tan@gmail.com','1994-03-21 06:00:00',5),(9,'Sahry','Torres','Tijuana','5512356610','sahry@gmail.com','1993-06-12 06:00:00',5),(10,'Andy','Derbez','USA','5556614357','andy@gmail.com','1997-07-16 06:00:00',3),(11,'Nancy','Moreno','FrioLanida','5512556645','nancy@gmail.com','1989-04-04 06:00:00',5);
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-19 13:58:25
