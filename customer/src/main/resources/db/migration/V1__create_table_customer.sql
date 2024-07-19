create table customer(

    id bigint not null auto_increment,
    name varchar(100) not null,
    birthdate datetime not null,
    tel varchar(4) not null,
    email varchar(30) not null,
    primary key(id)

);