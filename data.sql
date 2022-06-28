create table product
(
ID int auto_increment,
name VARCHAR(128) not null,
image VARCHAR(2048) not null,
price DOUBLE not null,
title VARCHAR(2048) not null,
description varchar(2048) not null,
cID int not null,
sell_ID int not null,
PRIMARY KEY (id)
);
create table cart(
idCart int not null,
idKhachHang int not null ,
idSanPham int not null,
image varchar(2048) not null,
tenSanPham varchar(256) not null,
gia double not null,
soLuong int not null,
primary key (idCart, idKhachHang,idSanPham)
 );
 create table account
(
ID int auto_increment,
username VARCHAR(128) not null,
pass VARCHAR(128) not null,
isSell VARCHAR(128) not null,
isAdmin VARCHAR(128) not null,
PRIMARY KEY (ID)
);
create table category
(
cID int auto_increment,
cName VARCHAR(128) not null,
PRIMARY KEY (cID)
);
 
 
select * from account ;
 select * from product ;
  select * from category ;
  select * from cart ;
  
  insert into product value (1,'Bún thịt nướng','images/bunthitnuong.jpg',20000,'Bún thịt nướng thơm ngon','Nếu ai đang vội vàng mua một món gì đó để mang lên công ty ăn vội thì chắc không dám mang món bánh canh cá lóc bởi vì sợ tanh',1,1);
insert into product value (2, 'Gà rán','https://www.bing.com/th?id=OIP.qx736LB5ZajtF2JDaPJE7QHaHa&w=206&h=206&c=8&rs=1&qlt=90&o=6&dpr=1.1&pid=3.1&rm=2',40000,'Gà rán nhà làm thơm ngon mời bạn ăn nha', 'Đây là món gà rán mà mọi người nhà nhà đều thích',4,1);
insert into product value (3,'Cơm rang dưa bò', 'https://dbk.vn/uploads/news/images/trua-nay-an-gi-2(2).jpg',30000, 'Cơm rang dưa bò','Đây là một món ăn khá ngon miệng mà lại đầy đủ dinh dưỡng và đủ no cho một bữa trưa nhiều năng lượng . ',2,1);
 insert into product value (4,'Cơm gà xối mỡ','https://dbk.vn/uploads/news/images/trua-nay-an-gi-4(1).jpg','30000','Cơm gà ','Cơm gà xối mỡ là một món ăn được rất nhiều anh, chị em công sở lựa chọn bởi vừa ngon miệng,.',2,1);
 insert into product value (5, 'Chã giò','https://www.bing.com/th?id=OIP.JS9ZFoIu-WwRcbrIHf5MCgEyDM&w=137&h=100&c=8&rs=1&qlt=90&o=6&dpr=1.1&pid=3.1&rm=2',25000,'Chã giò nhà làm', 'Chã giò thơm ngon mà người nào cũng thích',3,1);
 insert into product value (6,'Cơm trộn Hàn Quốc','https://dbk.vn/uploads/news/images/trua-nay-an-gi-3.jpg', 35000, 'Cơm trộn Hàn Quốc còn được gọi bằng một cái tên vô cùng dễ thương là bibimbap','Đây là một ăn đặc trưng mang đậm nền ẩm thực của xứ sở kim chi.',4,1);
 
  insert into category value(1, "Đồ ăn sáng");
   insert into category value(2, "Đồ ăn trưa");
    insert into category value(3, "Đồ ăn chiều");
     insert into category value(4, "Đồ ăn tối");
     
      insert into account value (1, 'admin' , '123', 0,1 );
	insert into account value (2, 'Nhan' , '123', 0,0 );
  insert into account value ( 3,'test' , '123', 0,0 );
 