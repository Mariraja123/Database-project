create table admin(username varchar2(30) not null primary key,
password varchar2(30)not null);
----user detail
create table user_detail(user_name varchar2(30) not null primary key,password varchar2(30));
--employee table
create table employee2(employee_id varchar2(30)not null primary key,
employee_name varchar2(30)not null,
company_name varchar2(100)not null,
job_title varchar2(30)not null,
phonenumber number not null);

--customer table
create table customer_detail(customer_name varchar2(30)not null,
phone number not null,
email varchar2(30)not null primary key,
address varchar2(30) not null,foreign key(customer_name) references user_detail(user_name));
--product detail
create table product_detail(product_id varchar2(30) not null primary key,
product_name varchar2(30) not null,
descrpition varchar2(200),geartype varchar2(30),
fueltype varchar2(30),cartype varchar2(40));
---price detail
create table price_detail(product_id varchar2(30) not null,
product_name varchar2(30)not null,
showroom_price varchar2(100) not null,onroad_price number not null,
road_tax varchar2(100)not null,
insurance number not null,  foreign key (product_id) references product_detail(product_id));
--showroom 
create table showroom(showroom_id varchar2(30),location varchar2(100),
employee_id varchar2(60),showroom_name varchar2(100),
foreign key(employee_id)
references employee2(employee_id));
