-- --------------------------------------------------------
-- Host:                         localhost
-- Server version:               8.0.26 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Version:             11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for kuliah
CREATE DATABASE IF NOT EXISTS `kuliah` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `kuliah`;

-- Dumping structure for table kuliah.mahasiswa
CREATE TABLE IF NOT EXISTS `mahasiswa` (
  `id_mhs` varchar(50) NOT NULL,
  `nama_depan` varchar(50) DEFAULT NULL,
  `nama_belakang` varchar(50) DEFAULT NULL,
  `ttl_mhs` varchar(50) DEFAULT NULL,
  `alamat_mhs` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_mhs`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table kuliah.mahasiswa: ~5 rows (approximately)
/*!40000 ALTER TABLE `mahasiswa` DISABLE KEYS */;
INSERT INTO `mahasiswa` (`id_mhs`, `nama_depan`, `nama_belakang`, `ttl_mhs`, `alamat_mhs`) VALUES
	('6720109023', 'Panca', 'Perkasa', '01 november 2001', 'Jakarta'),
	('672019001', 'Alam', 'Badri', 'Bandung', 'Cikarang'),
	('672019012', 'Bella', 'Warman', '25 Desember 1993', 'Kemang'),
	('672019032', 'Merviani', 'Permata', '05 April 2002', 'Tanah Abang'),
	('672019465', 'Surya', 'Iriani', '31 Oktober 1967', 'Bekasi');
/*!40000 ALTER TABLE `mahasiswa` ENABLE KEYS */;

-- Dumping structure for table kuliah.perpustakaan
CREATE TABLE IF NOT EXISTS `perpustakaan` (
  `id_buku` varchar(50) NOT NULL,
  `nama_buku` varchar(50) DEFAULT NULL,
  `pengarang_buku` varchar(50) DEFAULT NULL,
  `penerbit_buku` varchar(50) DEFAULT NULL,
  `tahun_rilis` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id_buku`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table kuliah.perpustakaan: ~5 rows (approximately)
/*!40000 ALTER TABLE `perpustakaan` DISABLE KEYS */;
INSERT INTO `perpustakaan` (`id_buku`, `nama_buku`, `pengarang_buku`, `penerbit_buku`, `tahun_rilis`) VALUES
	('001', 'The Glass Hotel', 'Emily St. John Mandel', 'HarperCollins', '2020'),
	('002', 'Luster', 'Raven Leilani', 'Farrar, Straus and Giroux', '2020'),
	('003', 'Shuggie Bain', 'Douglas Stuart', 'Grove Press ', '2020'),
	('004', 'The Catcher in the Rye', 'J. D. Salinger', 'Little, Brown and Company', '1951'),
	('005', 'Beloved', 'Toni Morrison', 'Alfred A. Knopf Inc.', '1987');
/*!40000 ALTER TABLE `perpustakaan` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
