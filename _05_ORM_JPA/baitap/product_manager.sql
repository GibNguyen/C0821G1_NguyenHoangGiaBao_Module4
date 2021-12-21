create database product_management;
 use product_management;
  create table product(
  id int primary key auto_increment,
  `name` varchar(50),
  price double,
  producer varchar(50)
  );
  
  insert into product(`name`,price,producer) values ("iphone",15,"apple");
  insert into product(`name`,price,producer) values ("galaxy",20,"samsung");
  insert into product(`name`,price,producer) values ("redmi",25,"xiaomi");
  
  select * from product;
  