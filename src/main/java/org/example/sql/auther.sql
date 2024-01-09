create table if not exists auther (id serial primary key ,name varchar(20), family varchar(20),age int);
create table if not exists book(id serial primary key ,title varchar(20),year int);
create table if not exists authers_books(id serial primary key, autherID int references auther(id),bookID int references book(id));

insert into auther values (1,'Charles','Dickens',58);
insert into auther values (2,'Jane','Austen',42);
insert into auther values (3,'Leo','Tolstoy',82);


insert into book values (1,'Oliver Twis',1838);
insert into book values (2,'A Tale of Two Cities',1859);
insert into book values (3,'Pride and Prejudice',1813);
insert into book values (4,'Anna Karenina',1878);
insert into book values (5,'War and Peace',1865);

insert into authers_books values (1,1,1);
insert into authers_books values (2,1,2);
insert into authers_books values (3,2,3);
insert into authers_books values (4,3,4);
insert into authers_books values (5,3,5);

select * from auther;
select * from book;
select * from authers_books;

select name,family,title from authers_books
                inner join auther a on autherID = a.id
                inner join book b on bookID = b.id;

