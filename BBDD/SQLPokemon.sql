-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 20, 2023 at 02:07 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.1.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pokemon`
--

-- --------------------------------------------------------

--
-- Table structure for table `entrenador`
--

CREATE TABLE `entrenador` (
  `id_entrenador` int(11) NOT NULL,
  `nombre_entrenador` varchar(255) DEFAULT NULL,
  `contraseña_entrenador` varchar(255) DEFAULT NULL,
  `pokedollar` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `entrenador`
--
-- --------------------------------------------------------

--
-- Table structure for table `mochila`
--

CREATE TABLE `mochila` (
  `id_objeto` decimal(5,0) DEFAULT NULL,
  `cant_objeto` decimal(2,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `movimiento`
--

CREATE TABLE `movimiento` (
  `id_movimiento` decimal(5,0) NOT NULL,
  `nombre_movimiento` varchar(20) NOT NULL,
  `nivel_aprendizaje` int(3) NOT NULL,
  `potencia` int(3) NOT NULL,
  `nombre_estado` varchar(15) NOT NULL,
  `turnos_estado` int(1) NOT NULL,
  `nombre_mejora` varchar(15) NOT NULL,
  `turnos_mejora` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `objeto`
--

CREATE TABLE `objeto` (
  `id_objeto` decimal(5,0) NOT NULL,
  `nombre_objeto` varchar(15) DEFAULT NULL,
  `precio` decimal(10,0) DEFAULT NULL,
  `estadistica_mejora` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `pokedex`
--

CREATE TABLE `pokedex` (
  `num_pokedex` decimal(5,0) NOT NULL,
  `nombre_pokemon` varchar(20) NOT NULL,
  `tipo1` varchar(15) NOT NULL,
  `tipo2` varchar(15) DEFAULT NULL,
  `img_frente` varchar(200) DEFAULT NULL,
  `img_espaldas` varchar(200) DEFAULT NULL,
  `sonido` varchar(200) DEFAULT NULL,
  `nivel_evo` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pokedex`
--

INSERT INTO `pokedex` (`num_pokedex`, `nombre_pokemon`, `tipo1`, `tipo2`, `img_frente`, `img_espaldas`, `sonido`, `nivel_evo`) VALUES
(1, 'Bulbasaur', 'Planta', 'Veneno', 'sprites pokeproject/BulbasaurRFVH.png', 'sprites pokeproyect/Bulbasaur_espalda_G3.png', NULL, NULL),
(2, 'Ivysaur', 'Planta', 'Veneno', 'sprites pokeproject/IvysaurRFVH.png', 'sprites pokeproject/Ivysaur_espalda_G3.png', NULL, '36'),
(3, 'Venusaur', 'Planta', 'Veneno', 'sprites pokeproject/VenusaurRFVH.png', 'sprites pokeproject/Venusaur_espalda_G3.png', NULL, NULL),
(4, 'Charmander', 'Fuego', NULL, 'sprites pokeproject/CharmanderRFVH.png', 'sprites pokeproject/Charmander_espalda_G3.png', NULL, NULL),
(5, 'Charmeleon', 'Fuego', NULL, 'sprites pokeproject/CharmeleonRFVH.png', 'sprites pokeproject/Charmeleon_espalda_G3.png', NULL, NULL),
(6, 'Charizard', 'Fuego', 'Volador', 'sprites pokeproject/CharizardRFVH.png', 'sprites pokeproject/Charizard_espalda_G3.png', NULL, NULL),
(7, 'Squirtle', 'Agua', NULL, 'sprites pokeproject/SquirtleRFVH.png', 'sprites pokeproject/Squirtle_espalda_G3.png', NULL, NULL),
(8, 'Wartortle', 'Agua', NULL, 'sprites pokeproject/WartortleRFVH.png', 'sprites pokeproject/Wartortle_espalda_G3.png', NULL, NULL),
(9, 'Blastoise', 'Agua', NULL, 'sprites pokeproject/BlastoiseRFVH.png', 'sprites pokeproject/Blastoise_espalda_G3.png', NULL, NULL),
(10, 'Caterpie', 'Bicho', NULL, 'sprites pokeproject/CaterpieRFVH.png', 'sprites pokeproject/Caterpie_espalda_G3.png', NULL, NULL),
(11, 'Metapod', 'Bicho', NULL, 'sprites pokeproject/MetapodRFVH.png', 'sprites pokeproject/Metapod_espalda_G3.png', NULL, NULL),
(12, 'Butterfree', 'Bicho', 'Volador', 'sprites pokeproject/ButterfreeRFVH.png', 'sprites pokeproject/Butterfree_espalda_G3.png', NULL, NULL),
(13, 'Weedle', 'Bicho', 'Veneno', 'sprites pokeproject/WeedleRFVH.png', 'sprites pokeproject/Weedle_espalda_G3.png', NULL, NULL),
(14, 'Kakuna', 'Bicho', 'Veneno', 'sprites pokeproject/KakunaRFVH.png', 'sprites pokeproject/Kakuna_espalda_G3.png', NULL, NULL),
(15, 'Beedrill', 'Bicho', 'Veneno', 'sprites pokeproject/BeedrillRFVH.png', 'sprites pokeproject/Beedrill_espalda_G3.png', NULL, NULL),
(16, 'Pidgey', 'Normal', 'Volador', 'sprites pokeproject/PidgeyRFVH.png', 'sprites pokeproject/Pidgey_espalda_G3.png', NULL, NULL),
(17, 'Pidgeotto', 'Normal', 'Volador', 'sprites pokeproject/PidgeottoRFVH.png', 'sprites pokeproject/Pidgeotto_espalda_G3.png', NULL, NULL),
(18, 'Pidgeot', 'Normal', 'Volador', 'sprites pokeproject/PidgeotRFVH.png', 'sprites pokeproject/Pidgeot_espalda_G3.png', NULL, NULL),
(19, 'Rattata', 'Normal', NULL, 'sprites pokeproject/RattataRFVH.png', 'sprites pokeproject/Rattata_espalda_G3.png', NULL, NULL),
(20, 'Raticate', 'Normal', NULL, 'sprites pokeproject/RaticateRFVH.png', 'sprites pokeproject/Raticate_espalda_G3.png', NULL, NULL),
(21, 'Spearow', 'Normal', 'Volador', 'sprites pokeproject/SpearowRFVH.png', 'sprites pokeproject/Spearow_espalda_G3.png', NULL, NULL),
(22, 'Fearow', 'Normal', 'Volador', 'sprites pokeproject/FearowRFVH.png', 'sprites pokeproject/Fearow_espalda_G3.png', NULL, NULL),
(23, 'Ekans', 'Veneno', NULL, 'sprites pokeproject/EkansRFVH.png', 'sprites pokeproject/Ekans_espalda_G3.png', NULL, NULL),
(24, 'Arbok', 'Veneno', NULL, 'sprites pokeproject/ArbokRFVH.png', 'sprites pokeproject/Arbok_espalda_G3.png', NULL, NULL),
(25, 'Pikachu', 'Eléctrico', NULL, 'sprites pokeproject/PikachuRFVH.png', 'sprites pokeproject/Pikachu_espalda_G3.png', NULL, NULL),
(26, 'Raichu', 'Eléctrico', NULL, 'sprites pokeproject/RaichuRFVH.png', 'sprites pokeproject/Raichu_espalda_G3.png', NULL, NULL),
(27, 'Sandshrew', 'Tierra', NULL, 'sprites pokeproject/SandshrewRFVH.png', 'sprites pokeproject/Sandshrew_espalda_G3.png', NULL, NULL),
(28, 'Sandslash', 'Tierra', NULL, 'sprites pokeproject/SandslashRFVH.png', 'sprites pokeproject/Sandslash_espalda_G3.png', NULL, NULL),
(29, 'Nidoran', 'Veneno', NULL, 'sprites pokeproject/Nidoran_hembraRFVH.png', 'sprites pokeproject/Nidoran_hembra_espalda_G3.png', NULL, NULL),
(30, 'Nidorina', 'Veneno', NULL, 'sprites pokeproject/NidorinaRFVH.png', 'sprites pokeproject/Nidorina_espalda_G3.png', NULL, NULL),
(31, 'Nidoqueen', 'Veneno', 'Tierra', '/sprites pokeproject/NidoqueenRFVH.png', 'sprites pokeproject/Nidoqueen_espalda_G3.png', NULL, NULL),
(32, 'Nidoran♂', 'Veneno', NULL, 'sprites pokeproject/Nidoran_machoRFVH.png', 'sprites pokeproject/Nidoran_macho_espalda_G3.png', NULL, NULL),
(33, 'Nidorino', 'Veneno', NULL, 'sprites pokeproject/NidorinoRFVH.png', 'sprites pokeproject/Nidorino_espalda_G3.png', NULL, NULL),
(34, 'Nidoking', 'Veneno', 'Tierra', 'sprites pokeproject/NidokingRFVH.png', 'sprites pokeproject/Nidoking_espalda_G3.png', NULL, NULL),
(35, 'Clefairy', 'Hada', NULL, 'sprites pokeproject/ClefairyRFVH.png', 'sprites pokeproject/Clefairy_espalda_G3.png', NULL, NULL),
(36, 'Clefable', 'Hada', NULL, 'sprites pokeproject/ClefableRFVH.png', 'sprites pokeproject/Clefable_espalda_G3.png', NULL, NULL),
(37, 'Vulpix', 'Fuego', NULL, 'sprites pokeproject/VulpixRFVH.png', 'sprites pokeproject/Vulpix_espalda_G3.png', NULL, NULL),
(38, 'Ninetales', 'Fuego', NULL, 'sprites pokeproject/NinetalesRFVH.png', 'sprites pokeproject/Ninetales_espalda_G3.png', NULL, NULL),
(39, 'Jigglypuff', 'Normal', 'Hada', 'sprites pokeproject/JigglypuffRFVH.png', 'sprites pokeproject/Jigglypuff_espalda_G3.png', NULL, NULL),
(40, 'Wigglytuff', 'Normal', 'Hada', 'sprites pokeproject/WigglytuffRFVH.png', 'sprites pokeproject/Wigglytuff_espalda_G3.png', NULL, NULL),
(41, 'Zubat', 'Veneno', 'Volador', 'sprites pokeproject/ZubatRFVH.png', 'sprites pokeproject/Zubat_espalda_G3.png', NULL, NULL),
(42, 'Golbat', 'Veneno', 'Volador', 'sprites pokeproject/GolbatRFVH.png', 'sprites pokeproject/Golbat_espalda_G3.png', NULL, NULL),
(43, 'Oddish', 'Planta', 'Veneno', 'sprites pokeproject/OddishRFVH.png', 'sprites pokeproject/Oddish_espalda_G3.png', NULL, NULL),
(44, 'Gloom', 'Planta', 'Veneno', 'sprites pokeproject/GloomRFVH.png', 'sprites pokeproject/Gloom_espalda_G3.png', NULL, NULL),
(45, 'Vileplume', 'Planta', 'Veneno', 'sprites pokeproject/VileplumeRFVH.png', 'sprites pokeproject/Vileplume_espalda_G3.png', NULL, NULL),
(46, 'Paras', 'Bicho', 'Planta', 'sprites pokeproject/ParasRFVH.png', 'sprites pokeproject/Paras_espalda_G3.png', NULL, NULL),
(47, 'Parasect', 'Bicho', 'Planta', 'sprites pokeproject/ParasectRFVH.png', 'sprites pokeproject/Parasect_espalda_G3.png', NULL, NULL),
(48, 'Venonat', 'Bicho', 'Veneno', 'sprites pokeproject/VenonatRFVH.png', 'sprites pokeproject/Venonat_espalda_G3.png', NULL, NULL),
(49, 'Venomoth', 'Bicho', 'Veneno', 'sprites pokeproject/VenomothRFVH.png', 'sprites pokeproject/Venomoth_espalda_G3.png', NULL, NULL),
(50, 'Diglett', 'Tierra', NULL, 'sprites pokeproject/DiglettRFVH.png', 'sprites pokeproject/Diglett_espalda_G3.png', NULL, NULL),
(51, 'Dugtrio', 'Tierra', NULL, 'sprites pokeproject/DugtrioRFVH.png', 'sprites pokeproject/Dugtrio_espalda_G3.png', NULL, NULL),
(52, 'Meowth', 'Normal', NULL, 'sprites pokeproject/MeowthRFVH.png', 'sprites pokeproject/Meowth_espalda_G3.png', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `pokemon`
--

CREATE TABLE `pokemon` (
  `id_entrenador` int(11) DEFAULT NULL,
  `id_pokemon` int(11) NOT NULL,
  `num_pokedex` decimal(5,0) DEFAULT NULL,
  `mote` varchar(30) DEFAULT NULL,
  `sexo` varchar(1) NOT NULL,
  `nivel` decimal(3,0) NOT NULL,
  `vitalidad` int(3) NOT NULL,
  `ataque` int(3) NOT NULL,
  `defensa` int(3) DEFAULT NULL,
  `ata_especial` int(3) NOT NULL,
  `def_especial` int(3) NOT NULL,
  `velocidad` int(3) NOT NULL,
  `estamina` int(3) NOT NULL,
  `fertilidad` int(1) NOT NULL,
  `equipo` int(1) DEFAULT NULL,
  `nombre_pokemon` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pokemon`
--

--
-- Table structure for table `poke_movi`
--

CREATE TABLE `poke_movi` (
  `id_pokemon` decimal(5,0) DEFAULT NULL,
  `id_movimiento` decimal(5,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `entrenador`
--
ALTER TABLE `entrenador`
  ADD PRIMARY KEY (`id_entrenador`);

--
-- Indexes for table `movimiento`
--
ALTER TABLE `movimiento`
  ADD PRIMARY KEY (`id_movimiento`);

--
-- Indexes for table `objeto`
--
ALTER TABLE `objeto`
  ADD PRIMARY KEY (`id_objeto`);

--
-- Indexes for table `pokedex`
--
ALTER TABLE `pokedex`
  ADD PRIMARY KEY (`num_pokedex`);

--
-- Indexes for table `pokemon`
--
ALTER TABLE `pokemon`
  ADD PRIMARY KEY (`id_pokemon`),
  ADD KEY `pok_pok_fk` (`num_pokedex`),
  ADD KEY `pok_ent_fk` (`id_entrenador`);

--
-- Indexes for table `poke_movi`
--
ALTER TABLE `poke_movi`
  ADD KEY `id_pokemon` (`id_pokemon`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `entrenador`
--
ALTER TABLE `entrenador`
  MODIFY `id_entrenador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `pokemon`
--
ALTER TABLE `pokemon`
  MODIFY `id_pokemon` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=52;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `pokemon`
--
ALTER TABLE `pokemon`
  ADD CONSTRAINT `pok_ent_fk` FOREIGN KEY (`id_entrenador`) REFERENCES `entrenador` (`id_entrenador`),
  ADD CONSTRAINT `pok_pok_fk` FOREIGN KEY (`num_pokedex`) REFERENCES `pokedex` (`num_pokedex`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
