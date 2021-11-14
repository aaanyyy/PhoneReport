CREATE SCHEMA `test_calls` ;

create table role(
id int primary key auto_increment,
rolename varchar(20)
);

create table number(
id int primary key auto_increment,
number varchar(20)
);


create table usr(
id int primary key auto_increment,
first_name varchar(20),
last_name varchar(20),
begin_date date,
end_date date,
role_id int,
foreign key (role_id) references role(id),
login varchar(20),
password varchar(40),
email varchar(20)
);




create table number_ownership(
id int primary key auto_increment,
number_id int,
FOREIGN key (number_id) REFERENCES numbers(id),
user_id int,
FOREIGN key (user_id) REFERENCES usr(id),
begin_date date,
end_date date
);

create table call_type(
id int primary key auto_increment,
type varchar (20)
);


create table call(
id int primary key auto_increment,
call_type_id int,
FOREIGN key (call_type_id) REFERENCES call_type(id),
called_number varchar(20),
number_id int,
FOREIGN key (number_id) REFERENCES numbers(id),
duration int,
is_private BOOL
);


create table bill_status(
id int primary key auto_increment,
status varchar(20)
);

create table month(
id int primary key auto_increment,
year int,
month int
);

create table private_number(
id int primary key auto_increment,
user_id int,
FOREIGN key (user_id) REFERENCES usr(id),
number varchar(20)
);



create table bill(
id int primary key AUTO_Increment,
month_id int,
FOREIGN key (month_id) REFERENCES month(id),
status_id int,
FOREIGN key (status_id) REFERENCES bill_status(id),
total_amount double,
private_amount double
);



