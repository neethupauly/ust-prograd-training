create database College;
create table College.Student(
Id int,
Name varchar(20),
department varchar(25),
contact int,
Marks int);

select * from College.Student;
insert into College.Student values(101,"Neethu","MCA",97880234,84);
insert into College.Student values(102,"Neenu","CSE",97836234,90);
insert into College.Student values(103,"Anu","BCA",3467834,80);
insert into College.Student values(104,"Arun","MCA",974334,74);
select Id,Name from College.Student;
SET SQL_SAFE_UPDATES = 0;
delete from College.Student where id=102;
alter table College.Student add primary key(Id);
select * from College.Student where Marks > 80;
