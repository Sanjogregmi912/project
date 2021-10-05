use paitent;
select * from register;
insert into register(first_name,last_name,age,address,department
,time_Of_registration,contact,time_to_visit,username,password)
values("SANJOG","REGMI",1,"ktm","opd","5:4:5",546,"5:5:4","jdj","nnn");
create table register(
id int not null auto_increment, 
first_name varchar(100),
last_name varchar(50),
age int,
address varchar(50),
department varchar(50),
time_Of_registration time,
contact varchar(50),
time_to_visit time,
username varchar(50),
password varchar(250),
primary key(id)

);
create table admin (
adminid int auto_increment primary key,
 first_name varchar(50),
 last_name varchar(50),
 age varchar(50),
 email varchar(50),
 address varchar(50),
 phone_num varchar(50),
 username varchar(50),
 password varchar(50)
 

);
select * from admin;
select * from register;
select  * from doc;
create table doc(
doc_id int not null auto_increment, 
first_name varchar(100),
last_name varchar(50),
age int,
address varchar(50),
department varchar(50),
contact varchar(50),
username varchar(50),
password varchar(250),
primary key(doc_id)
);
create table report(
paitent_name varchar(50),
report_address text
);
drop table report;
select * from report;
select count(adminid) as "no of admin" from admin;
select count(id)from register where department="OPD" ;
select count(id) from register where time_to_visit="09:12:00";

