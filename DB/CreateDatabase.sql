use usermanagersystem;
DROP TABLE IF EXISTS `t_user`;
create table t_user
 (
 id int unsigned not null auto_increment,
 userName varchar(20) not null ,
 password varchar(20) not null ,
 name varchar(30) not null,
 Nic varchar(20) not null,
 sex char(2) not null,
 age int,
 phone varchar(20),
 email varchar(30),
 selfshow varchar(300),
 roleId int not null,
 primary key(id)
);