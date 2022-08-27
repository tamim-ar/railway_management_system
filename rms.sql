-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 18, 2022 at 08:55 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rms`
--

-- --------------------------------------------------------

--
-- Table structure for table `addtrain`
--

CREATE TABLE `addtrain` (
  `tno` int(20) NOT NULL,
  `tname` varchar(80) NOT NULL,
  `splace` varchar(80) NOT NULL,
  `desplace` varchar(80) NOT NULL,
  `price` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `addtrain`
--

INSERT INTO `addtrain` (`tno`, `tname`, `splace`, `desplace`, `price`) VALUES
(114, 'Bangladesh Express', 'Jamalpur', 'Tongi', 500),
(114, 'Bangladesh Express', 'Dhaka', 'Tongi', 200),
(115, 'Tista Express', 'Nandina', 'Jamalpur', 50),
(115, 'Tista Express', 'Nandina', 'Dhaka', 500);

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `adminid` int(9) NOT NULL,
  `firstname` varchar(20) NOT NULL,
  `lastname` varchar(20) NOT NULL,
  `phone` varchar(11) NOT NULL,
  `email` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `post` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`adminid`, `firstname`, `lastname`, `phone`, `email`, `password`, `post`) VALUES
(201153289, 'Tamim', 'Ahasan', '01913131281', 'tamim15-3289@diu.edu.bd', 'tamim123', 'Admin');

-- --------------------------------------------------------

--
-- Table structure for table `ticket`
--

CREATE TABLE `ticket` (
  `pname` varchar(30) NOT NULL,
  `startp` varchar(30) NOT NULL,
  `destp` varchar(30) NOT NULL,
  `tnum` int(20) NOT NULL,
  `tname` varchar(30) NOT NULL,
  `price` int(20) NOT NULL,
  `date` varchar(20) NOT NULL,
  `seat` int(20) NOT NULL,
  `total` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ticket`
--

INSERT INTO `ticket` (`pname`, `startp`, `destp`, `tnum`, `tname`, `price`, `date`, `seat`, `total`) VALUES
('gfh', 'Dhaka', 'Khulna', 114, 'Bangladesh Express', 1200, '2022-04-05', 5, 6000),
('Tamim', 'Jamalpur', 'DSC', 420, 'Tamim Express', 500, '2022-04-04', 4, 2000),
('Tamim', 'Dhaka', 'Khulna', 114, 'Bangladesh Express', 1200, '2022-04-05', 5, 6000),
('Tamim', 'Dhaka', 'Khulna', 114, 'Bangladesh Express', 1200, '2022-04-05', 5, 6000),
('454', 'Dhaka', 'Khulna', 114, 'Bangladesh Express', 1200, '2022-04-06', 454, 544800),
('fgdfgdf', 'Dhaka', 'Khulna', 114, 'Bangladesh Express', 1200, '2022-04-01', 100, 120000);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `firstname` varchar(15) NOT NULL,
  `lastname` varchar(15) NOT NULL,
  `username` varchar(30) NOT NULL,
  `phone` int(15) NOT NULL,
  `email` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`firstname`, `lastname`, `username`, `phone`, `email`, `password`) VALUES
('Tamim', 'Ahasan', 'tamimahasan', 1913131281, 'tamim15-3289@diu.edu.bd', 'tamim123'),
('Shafin', 'Tamim', 'shafintamim', 1875676707, 'shafin15-3233@diu.edu.bd', 'shafin123'),
('Meherun ', 'Nesa', 'meherunnesa', 1829873996, 'meherun15-3558@diu.edu.bd', 'nisu123'),
('Sheikh', 'Lubna', 'sheikhlubna', 45456, 'sheikh15-3590@diu.edu.bd', 'tamim123'),
('Tamim', 'Ahasan Rijon', 'tamimar', 1913131281, 'tamim15-3289@gmail.com', 'tamim123');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
