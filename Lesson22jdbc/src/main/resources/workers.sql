-- auto-generated definition
create table workers
(
    id           serial
        primary key,
    login        varchar   not null,
    salary       integer   not null,
    age          integer   not null,
    created_date timestamp not null,
    description  varchar   not null,
    name         varchar   not null
);

alter table workers
    owner to postgres;

