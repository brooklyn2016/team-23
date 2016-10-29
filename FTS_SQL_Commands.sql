-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
SHOW WARNINGS;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`table1`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`table1` (
)
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `mydb`.`Agent Spoken Languages`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Agent Spoken Languages` (
  `idField Agent` INT NOT NULL,
  `Language` VARCHAR(45) NOT NULL)
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `mydb`.`Survey`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Survey` (
  `QuestionNumber` INT NOT NULL,
  `question` VARCHAR(100) NULL,
  `answer` VARCHAR(45) NULL,
  `date` DATE NULL,
  `Quarter` INT NULL,
  `idField Agent` INT NOT NULL,
  `idCommunity` INT NOT NULL,
  PRIMARY KEY (`QuestionNumber`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `mydb`.`Field Agent`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Field Agent` (
  `idField Agent` INT NOT NULL,
  `lname` VARCHAR(45) NULL,
  `fname` VARCHAR(45) NULL,
  `native language` VARCHAR(45) NULL,
  PRIMARY KEY (`idField Agent`),
  CONSTRAINT `fk_Field Agent_Agent Spoken Languages1`
    FOREIGN KEY (`idField Agent`)
    REFERENCES `mydb`.`Agent Spoken Languages` (`idField Agent`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Field Agent_Survey1`
    FOREIGN KEY (`idField Agent`)
    REFERENCES `mydb`.`Survey` (`idField Agent`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `mydb`.`Community Languages`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Community Languages` (
  `idCommunity` INT NOT NULL,
  `Language` VARCHAR(45) NOT NULL,
  UNIQUE INDEX `Languages_UNIQUE` (`Language` ASC))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `mydb`.`Community`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Community` (
  `idCommunity` INT NOT NULL,
  `city` VARCHAR(45) NOT NULL,
  `state/province` VARCHAR(45) NOT NULL,
  `country` VARCHAR(45) NOT NULL,
  `population` INT NOT NULL,
  `average_income` INT NOT NULL,
  `idField Agent` INT NOT NULL,
  `DemoLanguage` VARCHAR(45) NULL,
  PRIMARY KEY (`idCommunity`),
  INDEX `fk_Community_Field Agent_idx` (`idField Agent` ASC),
  CONSTRAINT `fk_Community_Field Agent`
    FOREIGN KEY (`idField Agent`)
    REFERENCES `mydb`.`Field Agent` (`idField Agent`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Community_Community Languages1`
    FOREIGN KEY (`idCommunity`)
    REFERENCES `mydb`.`Community Languages` (`idCommunity`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Community_Survey1`
    FOREIGN KEY (`idCommunity`)
    REFERENCES `mydb`.`Survey` (`idCommunity`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
