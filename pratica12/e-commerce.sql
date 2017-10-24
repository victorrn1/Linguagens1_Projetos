CREATE DATABASE  IF NOT EXISTS `e-commerce` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `e-commerce`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: e-commerce
-- ------------------------------------------------------
-- Server version	5.7.14

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tblestoque`
--

DROP TABLE IF EXISTS `tblestoque`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblestoque` (
  `id_estoque` int(11) NOT NULL,
  `id_produto` int(11) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `fornecedor` varchar(60) NOT NULL,
  PRIMARY KEY (`id_estoque`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblestoque`
--

LOCK TABLES `tblestoque` WRITE;
/*!40000 ALTER TABLE `tblestoque` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblestoque` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblpedido`
--

DROP TABLE IF EXISTS `tblpedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblpedido` (
  `id_pedido` int(11) NOT NULL,
  `id_usuario` int(11) NOT NULL,
  `data` varchar(20) NOT NULL,
  `total` double NOT NULL,
  `status` bit(1) DEFAULT NULL,
  `forma_pagamento` varchar(20) NOT NULL,
  `endereco_entrega` varchar(45) NOT NULL,
  PRIMARY KEY (`id_pedido`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblpedido`
--

LOCK TABLES `tblpedido` WRITE;
/*!40000 ALTER TABLE `tblpedido` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblpedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblpedidoproduto`
--

DROP TABLE IF EXISTS `tblpedidoproduto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblpedidoproduto` (
  `id_pedido` int(11) NOT NULL,
  `id_produto` int(11) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `preco_unitario` double NOT NULL,
  `total` double NOT NULL,
  PRIMARY KEY (`id_pedido`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblpedidoproduto`
--

LOCK TABLES `tblpedidoproduto` WRITE;
/*!40000 ALTER TABLE `tblpedidoproduto` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblpedidoproduto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblproduto`
--

DROP TABLE IF EXISTS `tblproduto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblproduto` (
  `id_produto` int(11) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `descricao` varchar(80) NOT NULL,
  `url_imagem` varchar(200) NOT NULL,
  `preco` double NOT NULL,
  PRIMARY KEY (`id_produto`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblproduto`
--

LOCK TABLES `tblproduto` WRITE;
/*!40000 ALTER TABLE `tblproduto` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblproduto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblusuario`
--

DROP TABLE IF EXISTS `tblusuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblusuario` (
  `id_usuario` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `email` varchar(20) NOT NULL,
  `senha` varchar(10) NOT NULL,
  `cpf` varchar(20) NOT NULL,
  `endereco` varchar(45) NOT NULL,
  `telefone` varchar(20) NOT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblusuario`
--

LOCK TABLES `tblusuario` WRITE;
/*!40000 ALTER TABLE `tblusuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblusuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-10-17 11:04:02
