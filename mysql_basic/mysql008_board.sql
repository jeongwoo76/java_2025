use mbasic;
create table board (
bno int not null auto_increment primary key,
btitle varchar(1000) not null,
bcontent text not null,
bname varchar(100) not null,
bhit int default 0,
bdate timestamp not null default current_timestamp,
bip	varchar(100) not null );
desc board;

create table sboard (
bno int not null auto_increment primary key,
bname varchar(100) not null,
bpass varchar(50) not null,
btitle varchar(1000) not null,
bcontent text not null,
bdate timestamp not null default current_timestamp,
bhit int not null default 0,
bip	varchar(50) not null );
desc sboard;
alter table sboard modify bhit int not null default 0;
