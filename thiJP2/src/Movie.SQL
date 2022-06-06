CREATE  DATABASE Movie;
USE Movie;
CREATE  TABLE qlMovie(
    maMovie varchar(10) PRIMARY KEY ,
    nameMovie varchar(50),
    nameDirector varchar(50),
    datePremiere datetime,
    timeMovie int
);

insert into qlMovie values ('MV01','your name','makoto','2017/04/20 20:00',120);
insert into qlMovie values ('MV02','one piece','oda','2022/05/19 19:00',110);
insert into qlMovie values ('MV03','one punch man','murata','2016/05/22 19:30',180);
insert into qlMovie values ('MV04','A Silent voice','makoto','2015/04/29 18:00',150);
insert into qlMovie values ('MV05','Hotarubi no Mori e','Midorikawa Yuki ','2015/05/30 22:00',170);
'A
SELECT  * FROM qlMovie