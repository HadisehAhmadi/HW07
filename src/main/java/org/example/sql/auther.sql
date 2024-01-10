create table if not exists auther
(
    id     serial unique primary key,
    name   varchar(20),
    family varchar(20),
    age    int
);
create table if not exists book
(
    id       serial unique primary key,
    title    varchar(20),
    year     int,
    autherID int references auther (id)
);


insert into auther
values (DEFAULT,'Charles', 'Dickens', 58);
insert into auther
values (DEFAULT,'Jane', 'Austen', 42);
insert into auther
values (DEFAULT,'Leo', 'Tolstoy', 82);


insert into book
values (DEFAULT, 'Oliver Twis', 1838,3);
insert into book
values (DEFAULT, 'A Tale of Two Cities', 1859,3);
insert into book
values (DEFAULT, 'Pride and Prejudice', 1813,1);
insert into book
values (DEFAULT, 'Anna Karenina', 1878,2);
insert into book
values (DEFAULT, 'War and Peace', 1865,2);

select *
from auther;
select *
from book;


select name, family, title
from auther
         inner join book b on auther.id = b.autherID
where name = 'Leo';


