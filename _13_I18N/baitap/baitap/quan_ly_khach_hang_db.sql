drop database if exists quan_ly_khach_hang;

create database quan_ly_khach_hang;

use  quan_ly_khach_hang;

create table khach_hang(
id int primary key,
ten varchar(50),
ngay_sinh date,
so_dien_thoai varchar(50));