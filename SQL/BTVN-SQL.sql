-- bài tập buổi 2-1 --
-- 1. Tạo bảng
create table product (
product_id int,
product_name varchar(25),
price double,
quantity int
);

-- 2. Thêm 10 sản phẩm bất kỳ
insert into product (product_id, product_name, price, quantity)
value (001, 'iphone12', 12000000, 100),
		(002, 'iphone12_pro', 13000000, 100),
        (003, 'iphone12_proMax', 14000000, 100),
        (004, 'iphone13', 15000000, 100),
        (005, 'iphone13_pro', 18000000, 100),
        (006, 'iphone13_proMax', 20000000, 100),
        (007, 'iphone14_pro', 25000000, 100),
        (008, 'iphone14_proMax', 28000000, 100),
        (009, 'iphone15_pro', 30000000, 100),
        (010, 'iphone15_proMax', 35000000, 100);
        
-- 3. Thêm một trường "description"
alter table product
add description varchar(25);

-- 4. Cập nhật giá trị "price" của sản phẩm có id = 1 thành 99
SET SQL_SAFE_UPDATES = 0;
update product
set price = 99
where product_id = 001;

-- 5. Tăng giá của sản phẩm có id = 2 lên 10%
SET SQL_SAFE_UPDATES = 0;
update product
set price = price * 1.1
where product_id = 002;


-- 6. Cập nhật tên người có id = 10 thành "John Doe"
SET SQL_SAFE_UPDATES = 0;
update person
set fullname = 'John Doe'
where id = 10;

-- 7. Đổi quốc gia của người có id = 3 thành
SET SQL_SAFE_UPDATES = 0;
update person
set country = 'Canada'
where id = 3;

-- 8. Sửa ngày sinh của id = 7 thành '1990-05-15' và quốc gia thành Việt Nam
SET SQL_SAFE_UPDATES = 0;
update person
set birthday = '1990-05-15' , country = 'Viet Nam'
where id = 10;

-- 9. Tăng mức lương của id = 40 lên 10%
SET SQL_SAFE_UPDATES = 0;
update person
set salary = salary * 1.1
where id = 40;

-- 10. Giảm mức lương của những người có mức lương trên 6000 xuống 15%
SET SQL_SAFE_UPDATES = 0;
update person
set salary = salary * 0.85
where salary > 6000;

-- bài tập buổi 2-2

create table tbl_sinhvien (
id int,
ten varchar(25),
tuoi int,
gioiTinh varchar(5),
maLop varchar(25)
);

insert into tbl_sinhvien (id, ten, tuoi, gioiTinh, maLop)
value (1, 'Nguyen A', 15, 'Nam','NCT12345'),
		(2, 'Ngo B', 16, 'Nu','NCT12345'),
        (3, 'Pham C', 17, 'Nam','NCT12345'),
        (4, 'Tran D', 18, 'Nam','NCT12345'),
        (1, 'Bui F A', 19, 'Nu','NCT12345');
        
SET SQL_SAFE_UPDATES =0;
update tbl_sinhvien
set id = 5
where ten = 'Bui F A';

create table tbl_giaovien (
id int,
ten varchar(25),
gioiTinh varchar(5),
soNamKN int
);

insert into tbl_giaovien (id, ten, gioiTinh, soNamKN)
value (1, 'Nguyen ABC', 'Nam',2),
		(2, 'Ngo BCD', 'Nu',3),
        (3, 'Pham CDE', 'Nam',3),
        (4, 'Tran DEF', 'Nam',6),
        (5, 'Bui FGH', 'Nu',1);
        
alter table tbl_giaovien
add tuoi int;
        
SET SQL_SAFE_UPDATES = 0;
update tbl_giaovien
set tuoi = 35
where id = 1;

-- Bài tập buổi 3 --

-- 1. Lấy ra danh sách các nghề nghiệp (job) duy nhất mà người trong bảng không làm trùng lặp.
SELECT distinct(job) FROM person.person;

-- 2. Lấy ra danh sách các người có nghề nghiệp (job) là ‘Manager’ và lương (salary) lớn hơn 70000.
SELECT * FROM person.person where salary > 70000 and job = 'Manager';

-- 3. Lấy ra người có tuổi từ 25 đến 35.
SELECT fullname, birthday, 
YEAR(CURDATE()) - YEAR(birthday) AS age
FROM person.person
HAVING age BETWEEN 25 AND 35
ORDER BY age ASC;

-- 4. Lấy ra danh sách các quốc gia (country) và tổng số lượng người từng quốc gia.
SELECT count(id) as soLuong, country FROM person.person group by country;

-- 5. Tính số lượng nam (gender = ‘Male’) và nữ (gender = ‘Female’) trong bảng.
SELECT count(id) as soLuong, gender FROM person.person group by gender;

-- 6. Lấy ra số lượng người có cùng nghề nghiệp (job) và quốc gia (country).
SELECT count(id) as soLuong, job, country FROM person.person group by job, country;

-- 7. Lấy ra danh sách người theo thứ tự giảm dần của ngày sinh (birthday).
SELECT DAY(birthday) as day_birthday FROM person.person order by day_birthday DESC ;

-- 8. Lấy ra các nghề nghiệp (job) và tổng số lượng người làm nghề đó, nhưng chỉ hiển thị những nghề nghiệp có ít nhất 3 người làm.
SELECT count(id) as soLuong, job FROM person.person group by job having soLuong < 3;



-- Bài tập buổi 4 --

-- 1. Lấy ra tên các thành phố và tên các quốc gia tương ứng của thành phố đó
SELECT city.city, country.country
FROM city 
INNER JOIN country
on city.country_id = country.country_id;

-- 2. Lấy ra tên các thành phố của nước Mỹ
SELECT city.city as city
FROM city 
INNER JOIN country
on city.country_id = country.country_id
WHERE country.country = 'United States';

-- 3. Lấy ra các địa chỉ của thành phố Hanoi
SELECT address.address
FROM address
INNER JOIN city on address.city_id = city.city_id
WHERE city.city = 'hanoi';

-- 4. Lấy ra tên, mô tả, tên category của các bộ phim có rating = R
SELECT film.title, film.description , category.name
FROM film 
INNER JOIN film_category on film.film_id = film_category.film_id
INNER JOIN category on film_category.category_id = category.category_id
WHERE film.rating ='R';

-- 5. Lấy ra thông tin của các bộ phim mà diễn viên NICK WAHLBERG tham gia
SELECT * FROM film_actor
INNER JOIN actor on film_actor.actor_id = actor.actor_id
INNER JOIN film on film_actor.film_id = film.film_id
WHERE actor.first_name = 'NICK' and actor.last_name = 'WAHLBERG';


-- 6.Tìm email của các khách hàng ở Mỹ
SELECT customer.email , country.country FROM customer
INNER JOIN address on customer.address_id = address.address_id
INNER JOIN city on city.city_id = address.city_id
INNER JOIN country on country.country_id = city.country_id
WHERE country.country = 'United States';
