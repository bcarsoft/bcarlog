-- create database bcarlog
create database if not exists bcarlog;

-- use database bcarlog
use bcarlog;

-- create table account
CREATE TABLE IF NOT EXISTS tbAccount (
    idAcc INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idAcc),
    nameAcc VARCHAR(256) NOT NULL,
    genderAcc VARCHAR(256) NOT NULL,
    monthAcc INT NOT NULL,
    dayAcc INT NOT NULL,
    yearAcc INT NOT NULL,
    userAcc VARCHAR(256) NOT NULL,
    emailAcc VARCHAR(256) NOT NULL,
    passAcc VARCHAR(256) NOT NULL,
    mobileAcc VARCHAR(256) NOT NULL
)  AUTO_INCREMENT=1;

-- create table login
CREATE TABLE IF NOT EXISTS tbLogin (
    idLogin INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idLogin),
    siteLogin VARCHAR(256) NOT NULL,
    urlSiteLogin VARCHAR(256) NOT NULL,
    userLogin VARCHAR(256) NOT NULL,
    emailLogin VARCHAR(256) NOT NULL,
    passLogin VARCHAR(256) NOT NULL,
    idAcc INT NOT NULL,
    FOREIGN KEY (idAcc)
        REFERENCES tbAccount (idAcc)
)  AUTO_INCREMENT=1;

-- create table site
CREATE TABLE IF NOT EXISTS tbSite (
    idSite INT NOT NULL AUTO_INCREMENT,
    PRIMARY KEY (idSite),
    nameSite VARCHAR(256) NOT NULL,
    urlSite VARCHAR(256) NOT NULL,
    idAcc INT NOT NULL,
    FOREIGN KEY (idAcc)
        REFERENCES tbAccount (idAcc)
)  AUTO_INCREMENT=1;
