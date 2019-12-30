CREATE TABLE visitor
(
  id bigint(20) NOT NULL AUTO_INCREMENT,
  name varchar(100),
  email varchar(50),
  mobileNo varchar(50),
  address varchar(100),
  idProof varchar(100),
  contactPersonName varchar(100),
  contactPersonEmail varchar(100), 
  reasonForVisit varchar(100),
  contactPersonMobileNo varchar(100),
  status int not null,
  PRIMARY KEY (id)
);




