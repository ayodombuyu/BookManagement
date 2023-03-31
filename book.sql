-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 31, 2023 at 02:04 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `book`
--

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE `book` (
  `id` int(11) NOT NULL,
  `isbn` varchar(255) NOT NULL,
  `title` varchar(255) NOT NULL,
  `author` varchar(255) NOT NULL,
  `publisher` varchar(255) NOT NULL,
  `genre` varchar(255) NOT NULL,
  `number_of_pages` varchar(255) NOT NULL,
  `price` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`id`, `isbn`, `title`, `author`, `publisher`, `genre`, `number_of_pages`, `price`) VALUES
(1, '45yd', 'java', 'java', 'java', 'java', '23', '23000.0'),
(2, 'java2', 'java2', 'java2', 'java2', 'java2', '22', '23000.0'),
(3, 'java3', 'java3', 'java3', 'java3', 'java3', '23', '23000.0'),
(4, 'java3', 'java3', 'java3', 'java3', 'java3', '23', '23000.0'),
(5, '45yt', 'java4', 'java4', 'java4', 'java4', '23', '23000.0'),
(6, 'java6', 'java6', 'java6', 'java6', 'java', '23', '23000.0'),
(7, 'java7', 'java7', 'jav7', 'java7', 'java', '23', '23000.0'),
(8, 'java8', 'java8', 'java8', 'java8', 'jav', '23', '20000.0'),
(9, 'java10', 'java10', 'java10', 'java10', 'java', '23', '23000.0');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `book`
--
ALTER TABLE `book`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
