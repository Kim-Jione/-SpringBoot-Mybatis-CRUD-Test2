# 연습문제 MyBatis

### 1. View 생성

-   로그인 페이지
-   회원가입 페이지
-   상품목록 페이지
-   상품 상세보기 페이지
-   구매목록 페이지

### 2. 기능 (ajax 필요 없음) (서비스 만들 필요 없음)

서버1 (판매자 서버) - DB 를 공유
서버2 (구매자 서버)
(구매 테이블 필요)
(유저 테이블 필요) - 구매자

-   회원가입
-   로그인
-   상품목록 보기 (기존과 동일)
-   상품상세 보기 (기존과 다름 : 구매하기 버튼)
-   구매 후 상품 재고 수정
-   구매목록 보기

## 3. 고급 기능

-   상품 등록시 동일한 상품명 못들어가게 하기

### 4. 테이블 생성

```sql
create table users(
    users_id int primary KEY auto_increment,
    username VARCHAR(20) NOT NULL UNIQUE,
    password varchar(20) NOT NULL,
    email varchar(50) NOT NULL,
    createdAt TIMESTAMP
);

create table product(
    product_id int primary KEY auto_increment,
    product_name varchar(20) NOT null UNIQUE,
    product_price INT NOT null,
    product_qty INT NOT null,
    created_at TIMESTAMP NOT null
);

create table orders(
    orders_id int primary KEY auto_increment,
    orders_name varchar(20) NOT null,
    orders_price int NOT null,
    orders_count int NOT null,
    product_id int NOT null,
    users_id int NOT null,
    created_at TIMESTAMP
);
```

### 5. 더미데이터

```sql
insert into users(username, password, email, createdAt) values('ssar', '1234', 'ssar@nate.com', NOW());
insert into users(username, password, email, createdAt) values('cos', '1234', 'cos@nate.com', NOW());

INSERT INTO product(product_name, product_price, product_qty, created_at) VALUES('바나나', 3000, 98,1, NOW());
INSERT INTO product(product_name, product_price, product_qty, created_at) VALUES('딸기', 2000, 100,2, NOW());

INSERT INTO orders(orders_name, orders_price, orders_count,  product_id, users_id,  created_at) VALUES('바나나', 3000, 10, 1, 1,  NOW());
INSERT INTO orders(orders_name, orders_price, orders_count,  product_id, users_id,  created_at) VALUES('딸기', 2000, 20, 2, 2,  NOW());

```

### 6. 페이지

회원가입 페이지

<img src="https://user-images.githubusercontent.com/106166409/201482799-f65b1ef1-8ba9-4754-b2d7-c7596a54cc9c.png"  width="1000"/>

로그인 페이지
<img src="https://user-images.githubusercontent.com/106166409/201482979-d188b845-cfb1-440b-b313-ef1a414869f3.png"  width="1000"/>

상품목록 페이지

<img src="https://user-images.githubusercontent.com/106166409/201483036-4b430ef2-3f00-4f73-8cb4-7fdbd86272ba.png"  width="1000"/>

상품 상세보기 페이지

<img src="https://user-images.githubusercontent.com/106166409/201483108-c3ae0278-896a-4012-af4a-7968d31cd63c.png"  width="1000"/>

구매목록 페이지

<img src="https://user-images.githubusercontent.com/106166409/201483146-76658161-6548-4a61-8a69-f81b562c9e10.png"  width="1000"/>

### 7. 구현기능

상품 구매시 재고 변경
<img src="https://user-images.githubusercontent.com/106166409/201495490-4d08f858-afdf-435c-a02b-6d1c1b5b2603.gif"  width="1000"/>

상품 재고 0 미만 될시 구매되지 않고 메인 페이지로 이동
<img src="https://user-images.githubusercontent.com/106166409/201495551-f01ae086-519b-471d-945d-025efad96114.gif"  width="1000"/>

비로그인 상태로 구매시 로그인 페이지로 이동
<img src="https://user-images.githubusercontent.com/106166409/201495589-b786c75f-1fc6-4498-a0f9-b87911f61598.gif"  width="1000"/>
