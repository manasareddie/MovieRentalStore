-- CREATE DATABASE nbad;
use nbad;
CREATE TABLE IF NOT EXISTS Movie1 (
  movie_id varchar(11) NOT NULL DEFAULT '0',
  title varchar(200) NOT NULL,
  year varchar(4) NOT NULL,
  duration varchar(11) DEFAULT NULL,
  actor varchar(100) NOT NULL DEFAULT '',
  director  varchar(20) NOT NULL DEFAULT '',
  genre varchar(20) NOT NULL DEFAULT '',
  synopsis varchar(200),
  PRIMARY KEY (movie_id)
);
drop table Movie1;
select * from Movie1;

INSERT INTO Movie1 values('1', 'Inception', '2010', '3', 'Jean-Michel', 'Christopher Nolan', 'Science Fiction', 'A thief who steals corporate secrets....');
INSERT INTO Movie1 values('2', 'The Hangover', '2009', '3', 'Joe Johnston', 'Todd Phillips', 'Comedy', 'Three buddies wake up from a bachelor party..');
INSERT INTO Movie1 values('3', 'Lord of the rings', '2001', '3', 'Paul Feig', 'Peter Jackson', 'Fantasy', 'A meek hobbit of the Shire and...');
INSERT INTO Movie1 values('4', 'Saw', '2004', '3', 'Lana Wachowski', 'James Wan', 'Horror', 'With a dead body lying between...');
INSERT INTO Movie1 values('5', 'The Matrix', '1999', '3', 'David O. Russell', 'Andy Wachowski', 'Action', 'A computer hacker learns from...');
INSERT INTO Movie1 values('6', 'The Prestige', '2006', '3', 'Lana Wachowski', 'Christopher Nolan', 'Drama', 'The rivalry between two magicians...');
INSERT INTO Movie1 values('7', 'American Psycho', '2000', '3', 'Anthony Russo', 'Mary Harron', 'Crime', 'A wealthy New York investment banking executive..');
INSERT INTO Movie1 values('8', 'Gladiator', '2000', '3', 'Andrew Douglas', 'Ridley Scott', 'Action', 'When a Roman general is betrayed and...');



-- --------------------------------------------------------
drop table customer1;
create TABLE IF NOT EXISTS Customer1 ( 
 membership_id int(11) NOT NULL auto_increment PRIMARY KEY,
  first_name varchar(25) NOT NULL,
  middle_name varchar(25) DEFAULT NULL,
  last_name varchar(25) NOT NULL,
  address varchar(100) DEFAULT NULL,  
  city varchar(20) DEFAULT NULL,
  state varchar(20) DEFAULT NULL,
  zip_code varchar(15) DEFAULT NULL,
  email varchar(80) NOT NULL,
  password varchar(16) NOT NULL
  -- cc_num varchar(10) NOT NULL,
  -- cc_cvv char(4) NOT NULL
  );
INSERT INTO Customer1 (first_name,middle_name,last_name,address,city,state,zip_code,email,password) values ('manasa','devi','karra','11005M,GraduateLane','charlotte','NC','28262','manasareddy.karra@gmail.com','manasa');
INSERT INTO Customer1 (first_name,middle_name,last_name,address,city,state,zip_code,email,password) values ('vichitra', 'reddy', 'yellolu', '9527B,UTD', 'charlotte', 'NC', '28262', 'vichitrareddy@gmail.com', 'vichitra');
INSERT INTO Customer1 (first_name,middle_name,last_name,address,city,state,zip_code,email,password) values ('HarshaVardhan', 'reddy', 'saireddygari', 'bowenpally', 'hyderabad', 'telangana', '505122', 'harshavardhanreddy1995@gmail.com', 'harsha');

SELECT * FROM Customer1;
DROP TABLE Customer1;
-- --------------------------------------------------------
CREATE TABLE IF NOT EXISTS InventoryManager (
  username varchar(20) NOT NULL,
  password varchar(20) NOT NULL,
  PRIMARY KEY (username)
);
DROP TABLE InventoryManager; 
INSERT INTO InventoryManager values('admin','123');

-- --------------------------------------------------------
CREATE TABLE IF NOT EXISTS Rental (
  membership_id int(11) NOT NULL ,
  movie_id int(11) NOT NULL,
  title varchar(200) NOT NULL,
  email varchar(80) DEFAULT NULL,
  -- cc_num varchar(10) NOT NULL,
  PRIMARY KEY (membership_id,movie_id));
  
DROP TABLE Rental;  
Select * from Rental;
delete from Rental;
-- --------------------------------------------------------