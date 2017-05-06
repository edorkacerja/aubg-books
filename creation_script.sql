CREATE TABLE `author` (
  `author_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `biography` varchar(100) NOT NULL,
  `nationality` varchar(45) NOT NULL,
  PRIMARY KEY (`author_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;


CREATE TABLE `book` (
  `book_id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(45) DEFAULT NULL,
  `author_id` int(11) DEFAULT NULL,
  `pages` int(11) DEFAULT NULL,
  `book_printing_house_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`book_id`),
  KEY `author_id_idx` (`author_id`),
  KEY `book_printing_house_id_idx` (`book_printing_house_id`),
  CONSTRAINT `author_id` FOREIGN KEY (`author_id`) REFERENCES `author` (`author_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `book_printing_house_id` FOREIGN KEY (`book_printing_house_id`) REFERENCES `book_printing_house` (`book_printing_house_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;


CREATE TABLE `book_printing_house` (
  `book_printing_house_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  PRIMARY KEY (`book_printing_house_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
