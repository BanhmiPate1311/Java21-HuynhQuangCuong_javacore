CREATE database QLBanSach

use QLBanSach;

create table khachhang(
	id bigint AUTO_INCREMENT,
	taikhoan varchar(50),
	hoten varchar(50),
	matkhau varchar(50),
	email varchar(50),
	diachi varchar(100),
	dienthoai varchar(15),
	gioitinh varchar(50),
	ngaysinh date,
		
-- 	Audit
	
-- 	Chỉ định một hoặc nhiều cột là khóa chính
	primary key(id)
);

create table sach(
	id bigint AUTO_INCREMENT,
	tensach varchar(50),
	soluongton int,
	ngaycapnhat date,
	anhbia varchar(50),
	mota varchar(100),
	giaban double,
	
	primary key(id)
);

CREATE table nhaxuatban(
	id bigint AUTO_INCREMENT,
	tenNSB varchar(50),
	diachi varchar(50),
	dienthoai varchar(15),
	
	primary key(id)
);

CREATE table chude(
	id bigint AUTO_INCREMENT,
	tenchude varchar(50),
	
	primary key(id)
);

CREATE table tacgia(
	id bigint AUTO_INCREMENT,
	tentacgia varchar(50),
	diachi varchar(50),
	tieusu varchar(50),	
	dienthoai varchar(15),
	
	primary key(id)
);

drop table sach;

alter table sach add column maNSX_id bigint not null;
alter table sach add constraint FK_sach_maNSX_id foreign key(maNSX_id) references nhaxuatban(id);

alter table sach add column chude_id bigint not null;
alter table sach add constraint FK_sach_chude_id foreign key(chude_id) references chude(id);

CREATE table sach_tacgia(
	sach_id bigint not null,
	tacgia_id bigint not null,
	vaitro varchar(50),
	vitri varchar(50)
	
);

alter table sach_tacgia add constraint FK_sach_tacgia_sach_id foreign key(sach_id) references sach(id);
alter table sach_tacgia add constraint FK_sach_tacgia_tacgia_id foreign key(tacgia_id) references tacgia(id);

CREATE table donhang(
	id bigint not null,
	dathanhtoan varchar(50),
	tinhtrangGH varchar(50),
	ngaydat date,
	ngaygiao date,
	khachhang_id bigint not null,
	sach_id bigint not null,
	
	primary key(id)
);

alter table donhang add constraint FK_donhang_khachhang_id foreign key(khachhang_id) references khachhang(id);
alter table donhang add constraint FK_donhang_sach_id foreign key(sach_id) references sach(id);


















