drop table if exists orders;
create table orders(id bigint auto_increment primary key,sn varchar(30));

insert into orders(sn) value ("abc");
insert into orders(sn) value ("bcd");

select * from orders;