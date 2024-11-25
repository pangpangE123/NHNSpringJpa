-- TODO 3 스키마와 db에 age 추가
create table if not exists `user`
(
    id       varchar(50) not null,
    password varchar(50) not null,
    age int,
    primary key (id)
);
