drop database if exists thong_tin_bai_hat;

create database thong_tin_bai_hat;

use thong_tin_bai_hat;

create table bai_hat (
id int primary key auto_increment,
ten_bai_hat varchar(50),
nghe_si varchar(50),
the_loai_nhac varchar(20)
);

insert into bai_hat value 
(1, "doi giay vai", "lam truong", "jazz"),
(2, "mai mai", "lam truong", "bolero"),
(3, "tinh khuc vang", "dan truong", "tru tinh");

select * from bai_hat;
