CREATE DATABASE ajs;
USE ajs;
CREATE TABLE `ajs`.`predmet` (
  `UUID` VARCHAR(36) NOT NULL,
  `NazovPredmetu` VARCHAR(150) DEFAULT NULL,
  PRIMARY KEY (`UUID`),
  UNIQUE INDEX `NazovPredmetu_UNIQUE` (`NazovPredmetu` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;