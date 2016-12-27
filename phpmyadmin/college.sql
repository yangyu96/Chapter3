-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 18, 2014 at 09:10 AM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `college`
--

-- --------------------------------------------------------

--
-- Table structure for table `applicant_hostel`
--

CREATE TABLE IF NOT EXISTS `applicant_hostel` (
  `StudentId` int(11) NOT NULL,
  `RoomMateId` int(11) NOT NULL DEFAULT '0',
  `RoomNo` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `application`
--

CREATE TABLE IF NOT EXISTS `application` (
  `ApplicationID` int(20) NOT NULL DEFAULT '0',
  `StudentId` int(11) NOT NULL,
  `Percentage` double NOT NULL,
  `RoomNo` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`ApplicationID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `aryabhatt`
--

CREATE TABLE IF NOT EXISTS `aryabhatt` (
  `RoomNo` varchar(10) CHARACTER SET utf8 NOT NULL DEFAULT '',
  `Availability` varchar(3) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`RoomNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `aryabhatt`
--

INSERT INTO `aryabhatt` (`RoomNo`, `Availability`) VALUES
('F-I-1', 'YES'),
('F-I-10', 'YES'),
('F-I-2', 'YES'),
('F-I-3', 'YES'),
('F-I-4', 'YES'),
('F-I-5', 'YES'),
('F-I-6', 'YES'),
('F-I-7', 'YES'),
('F-I-8', 'YES'),
('F-I-9', 'YES'),
('G-I-1', 'YES'),
('G-I-10', 'YES'),
('G-I-2', 'YES'),
('G-I-3', 'YES'),
('G-I-4', 'YES'),
('G-I-5', 'YES'),
('G-I-6', 'YES'),
('G-I-7', 'YES'),
('G-I-8', 'YES'),
('G-I-9', 'YES');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE IF NOT EXISTS `login` (
  `LoginId` int(11) NOT NULL DEFAULT '0',
  `Password` varchar(120) DEFAULT NULL,
  PRIMARY KEY (`LoginId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`LoginId`, `Password`) VALUES
(12230, '1234'),
(12247, '1234'),
(12256, '1234'),
(136311, '1234'),
(136510, '1234'),
(136709, '1234'),
(136908, '1234'),
(137107, '1234'),
(137306, '1234'),
(137505, '1234'),
(137704, '1234'),
(137903, '1234'),
(138102, '1234'),
(138301, '1234'),
(138312, '1234');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE IF NOT EXISTS `student` (
  `StudentId` int(11) NOT NULL DEFAULT '0',
  `Name` varchar(50) DEFAULT NULL,
  `Percentage` double DEFAULT NULL,
  `Semester` int(2) DEFAULT NULL,
  PRIMARY KEY (`StudentId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`StudentId`, `Name`, `Percentage`, `Semester`) VALUES
(12230, 'PRASHANT SHARMA', 85.6, 4),
(12247, 'SHWET KAMAL', 80.2, 4),
(12256, 'BIPIN SRIVASTAVA', 84.8, 4),
(136311, 'SUMIT KUMAR YADAV ', 73, 4),
(136510, 'SUBHAM CHAUDHARY ', 71, 4),
(136709, 'SHWETA VERMA ', 60, 4),
(136908, 'SHRUTI DWIVEDI ', 73, 4),
(137107, 'RUPENDRA BAHADUR SINGH ', 78, 4),
(137306, 'RAJAT SHRIVASTAV ', 82, 4),
(137505, 'MANOJ KUMAR ', 75, 4),
(137704, 'MANISH TRIPATHI ', 81.6, 4),
(137903, 'ARVIND KUMAR RAWAT ', 69, 4),
(138102, 'ALOK RANJAN ', 75.6, 4),
(138301, 'ALKA GAUTAM ', 65.5, 4),
(138312, 'VIJAY KUMAR ', 74, 4);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
