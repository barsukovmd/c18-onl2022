-- auto-generated definition
create table students
(
    id      serial
        constraint students_db_pkey
            primary key,
    name    varchar not null,
    surname varchar not null,
    age     integer not null,
    course  integer not null,
    city_id integer
        constraint students_city_id_fk
            references city
);

alter table students
    owner to postgres;

