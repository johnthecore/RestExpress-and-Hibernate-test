# SQL Manager Lite for MySQL 5.5.3.46192
# ---------------------------------------
# Host     : localhost
# Port     : 3306
# Database : si


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

SET FOREIGN_KEY_CHECKS=0;

CREATE DATABASE `si`
    CHARACTER SET 'utf8'
    COLLATE 'utf8_general_ci';

USE `si`;

#
# Structure for the `t1` table : 
#

CREATE TABLE `t1` (
  `id` INTEGER(11) NOT NULL AUTO_INCREMENT,
  `context` VARCHAR(255) COLLATE utf8_general_ci NOT NULL,
  `alt_context` VARCHAR(255) COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB
AUTO_INCREMENT=6 CHARACTER SET 'utf8' COLLATE 'utf8_general_ci'
;

#
# Structure for the `t2` table : 
#

CREATE TABLE `t2` (
  `id` INTEGER(11) NOT NULL AUTO_INCREMENT,
  `created` DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `message` TEXT COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB
AUTO_INCREMENT=2 CHARACTER SET 'utf8' COLLATE 'utf8_general_ci'
;

#
# Data for the `t1` table  (LIMIT 0,500)
#

INSERT INTO `t1` (`id`, `context`, `alt_context`) VALUES
  (1,'test 1','test 1'),
  (2,'test 2','test 2'),
  (4,'test 3','test 3 alt'),
  (5,'test 4','test 4 alt');
COMMIT;

#
# Data for the `t2` table  (LIMIT 0,500)
#

INSERT INTO `t2` (`id`, `created`, `message`) VALUES
  (1,'2016-03-12 12:52:26','Db hello');
COMMIT;



/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;