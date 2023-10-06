-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-10-2023 a las 23:24:21
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
(1, '33445566', 'Juan Lopez', 'A+', '1991-05-15', '345567789', 1, 0),
(2, '11111111', 'Juan Pérez', 'A+', '1990-01-01', '111-111-111', 1, 1),
(3, '22222222', 'María González', 'B-', '1995-02-02', '222-222-222', 1, 1),
(4, '33333333', 'Luis Rodríguez', 'AB+', '1985-03-03', '333-333-333', 1, 1),
(5, '44444444', 'Ana Martínez', 'O+', '1988-04-04', '444-444-444', 1, 1),
(6, '55555555', 'Carlos Sánchez', 'A-', '1993-05-05', '555-555-555', 1, 1),
(7, '66666666', 'Laura López', 'B+', '1992-06-06', '666-666-666', 1, 1),
(8, '77777777', 'Pedro Ruiz', 'A+', '1991-07-07', '777-777-777', 4, 1),
(9, '88888888', 'Sofía Torres', 'B-', '1989-08-08', '888-888-888', 4, 1),
(10, '99999999', 'Miguel González', 'AB+', '1987-09-09', '999-999-999', 4, 1),
(11, '10101010', 'Elena Rodríguez', 'O+', '1996-10-10', '101-101-101', 4, 1),
(12, '11111112', 'Javier Fernández', 'A-', '1994-11-11', '111-111-112', 4, 1),
(13, '12121212', 'Silvia López', 'B+', '1997-12-12', '121-121-121', 4, 1),
(14, '13131313', 'Ricardo Pérez', 'A+', '1980-03-03', '131-131-131', 7, 1),
(15, '14141414', 'Isabel Martínez', 'B-', '1981-04-04', '141-141-141', 7, 1),
(16, '15151515', 'Fernando Sánchez', 'AB+', '1982-05-05', '151-151-151', 7, 1),
(17, '16161616', 'Carmen Torres', 'O+', '1983-06-06', '161-161-161', 8, 1),
(18, '17171717', 'Manuel González', 'A-', '1984-07-07', '171-171-171', 8, 1),
(19, '18181818', 'Patricia Rodríguez', 'B+', '1985-08-08', '181-181-181', 8, 1),
(22, '37000000', 'Bombita Explo', 'A+', '1990-03-23', '154626421', 1, 0),
(33, '37000002', 'Bombita Explo 2', 'A+', '1990-03-23', '01114568', 21, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `brigada`
--

CREATE TABLE `brigada` (
  `codBrigada` int(11) NOT NULL,
  `nombre_br` varchar(20) NOT NULL,
  `especialidad` varchar(30) NOT NULL,
  `libre` tinyint(1) NOT NULL,
  `nro_cuartel` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `brigada`
--

INSERT INTO `brigada` (`codBrigada`, `nombre_br`, `especialidad`, `libre`, `nro_cuartel`) VALUES
(1, 'omega', 'Socorrer inundaciones', 1, 1),
(2, 'Brigada 1A', 'Incendios', 1, 1),
(3, 'Brigada 1B', 'Derrumbes', 1, 1),
(4, 'Brigada 1C', 'Rescate_Montaña', 1, 1),
(5, 'Brigada 1D', 'Rescate_Trafico', 1, 1),
(6, 'Brigada 1E', 'Inundaciones', 1, 1),
(7, 'Brigada 1F', 'Prevencion', 1, 1),
(8, 'Brigada 2A', 'Incendios', 1, 2),
(9, 'Brigada 2B', 'Derrumbes', 1, 2),
(10, 'Brigada 2C', 'Rescate_Montaña', 1, 2),
(11, 'Brigada 2D', 'Rescate_Trafico', 1, 2),
(12, 'Brigada 2E', 'Inundaciones', 1, 2),
(13, 'Brigada 2F', 'Prevencion', 1, 2),
(14, 'Brigada 3A', 'Incendios', 1, 3),
(15, 'Brigada 3B', 'Derrumbes', 1, 3),
(16, 'Brigada 3C', 'Rescate_Montaña', 1, 3),
(17, 'Brigada 3D', 'Rescate_Trafico', 1, 3),
(18, 'Brigada 3E', 'Inundaciones', 1, 3),
(19, 'Brigada 3F', 'Prevencion', 1, 3),
(21, 'test', 'Incendios', 1, 4);

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
(1, '56', 'Saavedra 4567', 0, 0, '03541678', 'juanperez@gmail.com', 1),
(2, 'Cuartel A', '9 de Julio 2156', 10, 200, '123-456-789', 'cuartel_a@gmail.com', 1),
(3, 'Cuartel B', '25 de Mayo 1299', 920, -921, '987-654-321', 'cuartel_b@gmail.com', 1),
(4, 'Cuartel C', '1 de Mayo 5433', -312, -322, '555-555-555', 'cuartel_c@gmail.com', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `siniestro`
--

CREATE TABLE `siniestro` (
  `codigo` int(11) NOT NULL,
  `tipo` varchar(20) NOT NULL,
  `fecha_siniestro` date NOT NULL,
  `coord_X` int(11) NOT NULL,
  `coord_Y` int(11) NOT NULL,
  `detalle` text NOT NULL,
  `fecha_resol` date NOT NULL,
  `puntuacion` int(11) NOT NULL,
  `codBrigada` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

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
  ADD UNIQUE KEY `UC_nombre_br` (`nombre_br`) USING BTREE,
  ADD UNIQUE KEY `UC_especialidad_nro_cuartel` (`especialidad`,`nro_cuartel`) USING BTREE,
  ADD KEY `nro_cuartel` (`nro_cuartel`) USING BTREE;

--
-- Indices de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  ADD PRIMARY KEY (`codCuartel`);

--
-- Indices de la tabla `siniestro`
--
ALTER TABLE `siniestro`
  ADD PRIMARY KEY (`codigo`),
  ADD KEY `codBrigada` (`codBrigada`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `bombero`
--
ALTER TABLE `bombero`
  MODIFY `idBombero` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;

--
-- AUTO_INCREMENT de la tabla `brigada`
--
ALTER TABLE `brigada`
  MODIFY `codBrigada` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT de la tabla `cuartel`
--
ALTER TABLE `cuartel`
  MODIFY `codCuartel` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `siniestro`
--
ALTER TABLE `siniestro`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT;

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
