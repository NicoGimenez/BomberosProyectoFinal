-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-10-2023 a las 23:35:45
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bomberos56`
--
CREATE DATABASE IF NOT EXISTS `bomberos56` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `bomberos56`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bombero`
--

CREATE TABLE `bombero` (
  `idBombero` int(11) NOT NULL,
  `dni` varchar(8) NOT NULL,
  `nombre_ape` varchar(50) NOT NULL,
  `grupo_sanguineo` varchar(3) NOT NULL,
  `fecha_nac` date NOT NULL,
  `celular` varchar(15) NOT NULL,
  `codBrigada` int(11) NOT NULL,
  `activo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `bombero`
--

INSERT INTO `bombero` (`idBombero`, `dni`, `nombre_ape`, `grupo_sanguineo`, `fecha_nac`, `celular`, `codBrigada`, `activo`) VALUES
(1, '11111111', 'Lionel Andrés Messi', 'A+', '1987-06-24', '111111111', 1, 0),
(2, '11111112', 'Carlos Alberto Solari', 'O-', '1984-02-05', '111111112', 1, 1),
(3, '11111113', 'Diego Maradona', 'B+', '1960-10-30', '111111113', 1, 1),
(4, '11111114', 'Julián Álvarez', 'AB-', '1959-08-11', '111111114', 1, 1),
(5, '11111115', 'Mick Jagger', 'A+', '1992-10-08', '111111115', 1, 1),
(6, '11111116', 'Leonardo Di Caprio', 'O-', '1990-02-10', '111111116', 1, 1),
(7, '11111117', 'Maximiliano Meza', 'A+', '1992-12-15', '111111117', 2, 1),
(8, '11111118', 'Mercedes Sosa', 'O-', '1993-12-05', '111111118', 2, 1),
(9, '11111119', 'Izzy Stradlin', 'B+', '1986-02-22', '111111119', 2, 1),
(10, '11111120', 'Willy Crook', 'AB-', '1981-12-11', '111111120', 2, 1),
(11, '11111121', 'Ariel Ortega', 'A+', '1974-03-04', '111111121', 2, 1),
(12, '11111122', 'Emma Watson', 'O-', '1988-02-12', '111111122', 2, 1),
(13, '11111123', 'David Bowie', 'B+', '1991-11-26', '111111123', 3, 1),
(14, '11111124', 'Sebastián Villa', 'A+', '1996-05-19', '111111124', 3, 1),
(15, '11111125', 'Nicolás González', 'AB-', '1990-07-13', '111111125', 3, 1),
(16, '11111126', 'Brian May', 'O-', '1989-03-01', '111111126', 3, 1),
(17, '11111127', 'George Harrison', 'A+', '1996-07-20', '111111127', 3, 1),
(18, '11111128', 'Víctor Cuesta', 'B+', '1988-02-19', '111111128', 3, 1),
(19, '11111129', 'Lautaro Martínez', 'AB-', '1997-08-22', '111111129', 4, 1),
(20, '11111130', 'Ástor Piazzolla', 'O-', '1990-05-17', '111111130', 4, 1),
(21, '11111131', 'Leandro Paredes', 'A+', '1994-06-29', '111111131', 4, 1),
(22, '11111132', 'Marcelo Gallardo', 'B+', '1994-05-06', '111111132', 4, 1),
(23, '11111133', 'Alfio Basile', 'A+', '1997-01-01', '111111133', 4, 1),
(24, '11111134', 'Giovani Lo Celso', 'O-', '1996-04-09', '111111134', 4, 1),
(25, '11111135', 'Franco Armani', 'A+', '1986-10-16', '111111135', 5, 1),
(26, '11111136', 'Nicolás Tagliafico', 'O-', '1992-08-31', '111111136', 5, 1),
(27, '11111137', 'Hans Zimmer', 'B+', '1992-03-04', '111111137', 5, 1),
(28, '11111138', 'Cristian Pavón', 'AB-', '1996-01-21', '111111138', 5, 1),
(29, '11111139', 'Juan Foyth', 'A+', '1998-01-12', '111111139', 5, 1),
(30, '11111140', 'Emiliano Martínez', 'O-', '1992-09-16', '111111140', 5, 1),
(31, '11111141', 'Marcos Rojo', 'A+', '1990-03-20', '111111141', 6, 1),
(32, '11111142', 'Carlos Gardel', 'B+', '1987-03-17', '111111142', 6, 1),
(33, '11111143', 'Diego Perotti', 'O-', '1988-07-26', '111111143', 6, 1),
(34, '11111144', 'Giovanni Simeone', 'A+', '1995-07-05', '111111144', 6, 1),
(35, '11111145', 'Rodrigo De Paul', 'AB-', '1993-05-21', '111111145', 6, 1),
(36, '11111146', 'Pedro Aznar', 'O-', '1992-05-20', '111111146', 6, 1),
(37, '11111147', 'Cristian Gabriel Álvarez', 'A+', '1987-03-18', '111111147', 7, 1),
(38, '11111148', 'Ezequiel Lavezzi', 'B+', '1985-05-03', '111111148', 7, 1),
(39, '11111149', 'Lisandro Magallán', 'O-', '1993-09-27', '111111149', 7, 1),
(40, '11111150', 'Robert Plant', 'A+', '1988-06-29', '111111150', 7, 1),
(41, '11111151', 'John Williams', 'AB-', '1994-07-11', '111111151', 7, 1),
(42, '11111152', 'Gustavo Bou', 'A+', '1990-02-28', '111111152', 7, 1),
(43, '11111153', 'César Luis Menotti', 'O-', '1987-12-10', '111111153', 8, 1),
(44, '11111154', 'Leo Mattioli', 'A+', '1986-10-10', '111111154', 8, 1),
(45, '11111155', 'Martín Palermo', 'B+', '1978-06-24', '111111155', 8, 1),
(46, '11111156', 'Javier Calamaro', 'AB-', '1989-06-20', '111111156', 8, 1),
(47, '11111157', 'Luis Alberto Spinetta', 'O-', '1986-04-10', '111111157', 8, 1),
(48, '11111158', 'Enzo Fernández', 'A+', '1991-03-05', '111111158', 8, 1),
(49, '11111159', 'Nicolás Gaitán', 'B+', '1988-02-23', '111111159', 9, 1),
(50, '11111160', 'Ezequiel Palacios', 'AB-', '1998-10-05', '111111160', 9, 1),
(51, '11111161', 'Florence Pugh', 'A+', '1991-10-28', '111111161', 9, 1),
(52, '11111162', 'Enzo Díaz', 'O-', '1991-01-07', '111111162', 9, 1),
(53, '11111163', 'Ángel Labruna', 'A+', '1994-08-13', '111111163', 9, 1),
(54, '11111164', 'Jack Nicholson', 'B+', '1981-04-12', '111111164', 9, 1),
(55, '11111165', 'Rodrigo Bueno', 'AB-', '1985-05-03', '111111165', 10, 1),
(56, '11111166', 'Federico Fernández', 'O-', '1989-02-21', '111111166', 10, 1),
(57, '11111167', 'Mariano Andújar', 'A+', '1983-07-30', '111111167', 10, 1),
(58, '11111168', 'Patricio Santos Fontanet', 'B+', '1994-08-13', '111111168', 10, 1),
(59, '11111169', 'Fabiana Cantilo', 'A+', '1992-12-15', '111111169', 10, 1),
(60, '11111170', 'Freddie Mercury', 'AB-', '1989-03-01', '111111170', 10, 1),
(61, '11111171', 'J. Robert Oppenheimer', 'A+', '1992-10-08', '111111171', 11, 1),
(62, '11111172', 'Ricardo Iorio', 'O-', '1997-08-22', '111111172', 11, 1),
(63, '11111173', 'Erik Lamela', 'B+', '1992-03-04', '111111173', 11, 1),
(64, '11111174', 'Meryl Streep', 'A+', '1988-02-12', '111111174', 11, 1),
(65, '11111175', 'Axl Rose', 'AB-', '1992-09-16', '111111175', 11, 1),
(66, '11111176', 'Federico Fazio', 'O-', '1987-03-17', '111111176', 11, 1),
(67, '11111177', 'Dante Spinetta', 'A+', '1987-03-18', '111111177', 12, 1),
(68, '11111178', 'Ricardo Mollo', 'B+', '1994-08-13', '111111178', 12, 1),
(69, '11111179', 'Marcos Acuña', 'A+', '1991-10-28', '111111179', 12, 1),
(70, '11111180', 'Luca Prodan', 'AB-', '1981-12-11', '111111180', 12, 1),
(71, '11111181', 'Carlos Alberto García', 'A+', '1984-02-05', '111111181', 12, 1),
(72, '11111182', 'Natalie Portman', 'O-', '1992-08-31', '111111182', 12, 1),
(73, '11111183', 'Matías Kranevitter', 'A+', '1993-05-21', '111111183', 13, 1),
(74, '11111184', 'Gonzalo Montiel', 'B+', '1997-01-01', '111111184', 13, 1),
(75, '11111185', 'Darío Benedetto', 'AB-', '1990-05-17', '111111185', 13, 1),
(76, '11111186', 'Alfredo Di Stéfano', 'O-', '1994-08-13', '111111186', 13, 1),
(77, '11111187', 'Ángel Di María', 'A+', '1990-07-13', '111111187', 13, 1),
(78, '11111188', 'Gabriel Batistuta', 'O-', '1993-12-05', '111111188', 13, 1),
(79, '11111189', 'Frédéric Chopin', 'A+', '1994-07-11', '111111189', 14, 1),
(80, '11111190', 'Lucas Acosta', 'AB-', '1996-07-20', '111111190', 14, 1),
(81, '11111191', 'Juan Musso', 'A+', '1994-05-06', '111111191', 14, 1),
(82, '11111192', 'Nicole Kidman', 'B+', '1988-02-12', '111111192', 14, 1),
(83, '11111193', 'Slash', 'O-', '1986-02-22', '111111193', 14, 1),
(84, '11111194', 'Manuel Lanzini', 'A+', '1960-10-30', '111111194', 14, 1),
(85, '11111195', 'Federico Moura', 'O-', '1984-02-05', '111111195', 15, 1),
(86, '11111196', 'Santiago Moreno Charpentier', 'B+', '1987-06-24', '111111196', 15, 1),
(87, '11111197', 'Ubaldo Matildo Fillol', 'AB-', '1993-12-05', '111111197', 15, 1),
(88, '11111198', 'Valentín Barco', 'A+', '1960-10-30', '111111198', 15, 1),
(89, '11111199', 'Erling Haaland', 'AB-', '1959-08-11', '111111199', 15, 1),
(90, '11111200', 'Lisandro López', 'A+', '1989-03-01', '111112000', 15, 1),
(91, '11111201', 'Robert De Niro', 'O-', '1990-02-10', '111112001', 16, 1),
(92, '11111202', 'Skay Beilinson', 'B+', '1996-04-09', '111112002', 16, 1),
(93, '11111203', 'Nicolás De La Cruz', 'AB-', '1996-05-19', '111112003', 16, 1),
(94, '11111204', 'Billy Joel', 'A+', '1987-06-24', '111112004', 16, 1),
(95, '11111205', 'Andrés Calamaro', 'O-', '1992-03-04', '111112005', 16, 1),
(96, '11111206', 'María Elena Walsh', 'A+', '1992-12-15', '111112006', 16, 1),
(97, '11111207', 'Esteban Andrada', 'B+', '1991-11-26', '111112007', 17, 1),
(98, '11111208', 'Sergio Leonel Agüero', 'AB-', '1993-12-05', '111112008', 17, 1),
(99, '11111209', 'Roberto Pettinato', 'A+', '1981-12-11', '111112009', 17, 1),
(100, '11111210', 'Carlos Tevez', 'O-', '1984-02-05', '111112010', 17, 1),
(101, '11111211', 'Wanchope Abila', 'A+', '1974-03-04', '111112011', 17, 1),
(102, '11111212', 'Nicolás Otamendi', 'O-', '1988-02-12', '111112012', 17, 1),
(103, '11111213', 'Michael Jackson', 'A+', '1989-03-01', '111112013', 18, 1),
(104, '11111214', 'Ignacio Fernández', 'B+', '1960-10-30', '111112014', 18, 1),
(105, '11111215', 'Elizabeth Olsen', 'AB-', '1959-08-11', '111112015', 18, 1),
(106, '11111216', 'Albert Einstein', 'A+', '1992-10-08', '111112016', 18, 1),
(107, '11111217', 'Al Pacino', 'O-', '1990-02-10', '111112017', 18, 1),
(108, '11111218', 'Daniel Passarella', 'A+', '1992-12-15', '111112018', 18, 1),
(109, '11111219', 'Mario Alberto Kempes', 'AB-', '1993-12-05', '111112019', 19, 1),
(110, '11111220', 'Enzo Pérez', 'B+', '1986-02-22', '111112020', 19, 1),
(111, '11111221', 'Javier Saviola', 'O-', '1981-12-11', '111112021', 19, 1),
(112, '11111222', 'Gustavo Cerati', 'A+', '1974-03-04', '111112022', 19, 1),
(113, '11111223', 'Emma Stone', 'O-', '1988-02-12', '111112023', 19, 1),
(114, '11111224', 'Jimmy Page', 'A+', '1991-11-26', '111112024', 19, 1),
(115, '11111225', 'Paulo Díaz', 'AB-', '1996-05-19', '111112025', 20, 1),
(116, '11111226', 'Eduardo Salvio', 'A+', '1990-07-13', '111112026', 20, 1),
(117, '11111227', 'John Lennon', 'O-', '1989-03-01', '111112027', 20, 1),
(118, '11111228', 'Enzo Francescoli', 'A+', '1987-06-24', '111112028', 20, 1),
(119, '11111229', 'Nikola Tesla', 'AB-', '1992-03-04', '111112029', 20, 1),
(120, '11111230', 'Lucas Alario', 'O-', '1990-02-10', '111112030', 20, 1),
(121, '11111231', 'Enrique Omar Sívori', 'A+', '1994-08-13', '111112031', 21, 1),
(122, '11111232', 'Cillian Murphy', 'B+', '1992-08-31', '111112032', 21, 1),
(123, '11111233', 'Martín Demichelis', 'AB-', '1991-10-28', '111112033', 21, 1),
(124, '11111234', 'Carlos Salvador Bilardo', 'A+', '1995-07-05', '111112034', 21, 1),
(125, '11111235', 'Marcelo Barovero', 'O-', '1993-05-21', '111112035', 21, 1),
(126, '11111236', 'Geronimo Rulli', 'A+', '1992-05-20', '111112036', 21, 1),
(127, '11111237', 'Gabriel Mercado', 'B+', '1987-03-18', '111112037', 22, 1),
(128, '11111238', 'Éver Ludueña', 'O-', '1985-05-03', '111112038', 22, 1),
(129, '11111239', 'Paul McCartney', 'A+', '1993-09-27', '111112039', 22, 1),
(130, '11111240', 'Éver Banega', 'AB-', '1988-06-29', '111112040', 22, 1),
(131, '11111241', 'Wolfgang Amadeus Mozart', 'A+', '1994-07-11', '111112041', 22, 1),
(132, '11111242', 'Nahuel Molina', 'O-', '1990-02-28', '111112042', 22, 1),
(133, '11111243', 'Gonzalo Higuaín', 'A+', '1987-12-10', '111112043', 23, 1),
(134, '11111244', 'Ezequiel Garay', 'B+', '1986-10-10', '111112044', 23, 1),
(135, '11111245', 'Juan Román Riquelme', 'AB-', '1978-06-24', '111112045', 23, 1),
(136, '11111246', 'Javier Pastore', 'A+', '1989-06-20', '111112046', 23, 1),
(137, '11111247', 'Fernando Gago', 'O-', '1986-04-10', '111112047', 23, 1),
(138, '11111248', 'Ramiro Funes Mori', 'A+', '1991-03-05', '111112048', 23, 1),
(139, '11111249', 'Tom Hanks', 'B+', '1988-02-23', '111112049', 24, 1),
(140, '11111250', 'Fito Páez', 'O-', '1998-10-05', '111112050', 24, 1),
(141, '11111251', 'Alejandro Garnacho', 'A+', '1991-10-28', '111112051', 24, 1),
(142, '11111252', 'Roberto Pereyra', 'AB-', '1991-01-07', '111112052', 24, 1),
(143, '11111253', 'Ricardo Bochini', 'A+', '1994-08-13', '111112053', 24, 1),
(144, '11111254', 'Nicolás Burdisso', 'O-', '1981-04-12', '111112054', 24, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `brigada`
--

CREATE TABLE `brigada` (
  `codBrigada` int(11) NOT NULL,
  `nombre_br` varchar(20) NOT NULL,
  `especialidad` varchar(60) NOT NULL,
  `libre` tinyint(1) NOT NULL,
  `nro_cuartel` int(11) NOT NULL,
  `activo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `brigada`
--

INSERT INTO `brigada` (`codBrigada`, `nombre_br`, `especialidad`, `libre`, `nro_cuartel`, `activo`) VALUES
(1, 'Alpha', 'Incendios en viviendas e industrias', 1, 1, 1),
(2, 'Beta', 'Salvamento en derrumbes', 1, 1, 1),
(3, 'Gamma', 'Rescates en ámbito montaña', 1, 1, 1),
(4, 'Delta', 'Rescate de personas atrapadas en accidentes de tráfico', 0, 1, 1),
(5, 'Epsilon', 'Socorrer inundaciones', 1, 1, 1),
(6, 'Zeta', 'Operativos de prevención', 1, 1, 1),
(7, 'Eta', 'Incendios en viviendas e industrias', 1, 2, 1),
(8, 'Theta', 'Salvamento en derrumbes', 1, 2, 1),
(9, 'Iota', 'Rescates en ámbito montaña', 0, 2, 1),
(10, 'Kappa', 'Rescate de personas atrapadas en accidentes de tráfico', 1, 2, 1),
(11, 'Lambda', 'Socorrer inundaciones', 1, 2, 1),
(12, 'Mu', 'Operativos de prevención', 1, 2, 1),
(13, 'Nu', 'Incendios en viviendas e industrias', 1, 3, 1),
(14, 'Xi', 'Salvamento en derrumbes', 1, 3, 1),
(15, 'Omicron', 'Rescates en ámbito montaña', 1, 3, 1),
(16, 'Pi', 'Rescate de personas atrapadas en accidentes de tráfico', 1, 3, 1),
(17, 'Rho', 'Socorrer inundaciones', 1, 3, 1),
(18, 'Sigma', 'Operativos de prevención', 1, 3, 1),
(19, 'Tau', 'Incendios en viviendas e industrias', 1, 4, 1),
(20, 'Upsilon', 'Salvamento en derrumbes', 1, 4, 1),
(21, 'Phi', 'Rescates en ámbito montaña', 1, 4, 1),
(22, 'Chi', 'Rescate de personas atrapadas en accidentes de tráfico', 1, 4, 1),
(23, 'Psi', 'Socorrer inundaciones', 1, 4, 1),
(24, 'Omega', 'Operativos de prevención', 1, 4, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuartel`
--

CREATE TABLE `cuartel` (
  `codCuartel` int(11) NOT NULL,
  `nombre_cuartel` varchar(20) NOT NULL,
  `direccion` varchar(30) NOT NULL,
  `coord_X` int(11) NOT NULL,
  `coord_Y` int(11) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `correo` varchar(30) NOT NULL,
  `activo` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cuartel`
--

INSERT INTO `cuartel` (`codCuartel`, `nombre_cuartel`, `direccion`, `coord_X`, `coord_Y`, `telefono`, `correo`, `activo`) VALUES
(1, 'Cuartel Saavedra', 'Saavedra 4567', 100, 100, '03541678', 'bomberosaavedra@gmail.com', 1),
(2, 'Cuartel 9 de Julio', '9 de Julio 2156', -200, 200, '123-456-789', 'bomberos9julio@gmail.com', 1),
(3, 'Cuartel 25 de Mayo', '25 de Mayo 1299', -300, -300, '987-654-321', 'bomberos25mayo@gmail.com', 1),
(4, 'Cuartel 1 de Mayo', '1 de Mayo 5433', 400, -400, '3564 5423121', 'bomberos1mayo@gmail.com', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `siniestro`
--

CREATE TABLE `siniestro` (
  `codigo` int(11) NOT NULL,
  `tipo` varchar(60) NOT NULL,
  `fecha_siniestro` date NOT NULL,
  `coord_X` int(11) NOT NULL,
  `coord_Y` int(11) NOT NULL,
  `detalle` text NOT NULL,
  `fecha_resol` date DEFAULT NULL,
  `puntuacion` int(11) DEFAULT NULL,
  `codBrigada` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `siniestro`
--

INSERT INTO `siniestro` (`codigo`, `tipo`, `fecha_siniestro`, `coord_X`, `coord_Y`, `detalle`, `fecha_resol`, `puntuacion`, `codBrigada`) VALUES
(1, 'Incendios en viviendas e industrias', '2001-09-11', 99, 99, 'se incendio todo todito.....', NULL, 0, 1),
(28, 'Salvamento en derrumbes', '2023-10-27', 100, 100, 'Se callo el codigo!!!!! ', '2023-10-27', 10, 2),
(29, 'Rescates en ámbito montaña', '2023-10-28', -100, 100, 'Se  perdieron los abuelos de la nada.', NULL, 0, 9),
(30, 'Rescate de personas atrapadas en accidentes de tráfico', '2023-10-07', -100, -90, 'Chano venia entre 60 y 80 kilometros por hora. ', NULL, 0, 4);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `bombero`
--
ALTER TABLE `bombero`
  ADD PRIMARY KEY (`idBombero`),
  ADD UNIQUE KEY `dni` (`dni`),
  ADD KEY `cadBigada` (`codBrigada`);

--
-- Indices de la tabla `brigada`
--
ALTER TABLE `brigada`
  ADD PRIMARY KEY (`codBrigada`),
  ADD UNIQUE KEY `UC_especialidad_nro_cuartel` (`especialidad`,`nro_cuartel`) USING BTREE,
  ADD UNIQUE KEY `UC_nombre_br` (`nombre_br`) USING BTREE,
  ADD KEY `nro_cuartel` (`nro_cuartel`);

--
-- Indices de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  ADD PRIMARY KEY (`codCuartel`);

--
-- Indices de la tabla `siniestro`
--
ALTER TABLE `siniestro`
  ADD PRIMARY KEY (`codigo`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `bombero`
--
ALTER TABLE `bombero`
  MODIFY `idBombero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=145;

--
-- AUTO_INCREMENT de la tabla `brigada`
--
ALTER TABLE `brigada`
  MODIFY `codBrigada` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;

--
-- AUTO_INCREMENT de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  MODIFY `codCuartel` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `siniestro`
--
ALTER TABLE `siniestro`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `bombero`
--
ALTER TABLE `bombero`
  ADD CONSTRAINT `bombero_ibfk_1` FOREIGN KEY (`codBrigada`) REFERENCES `brigada` (`codBrigada`);

--
-- Filtros para la tabla `brigada`
--
ALTER TABLE `brigada`
  ADD CONSTRAINT `brigada_ibfk_1` FOREIGN KEY (`nro_cuartel`) REFERENCES `cuartel` (`codCuartel`);

--
-- Filtros para la tabla `siniestro`
--
ALTER TABLE `siniestro`
  ADD CONSTRAINT `siniestro_ibfk_1` FOREIGN KEY (`codBrigada`) REFERENCES `brigada` (`codBrigada`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
