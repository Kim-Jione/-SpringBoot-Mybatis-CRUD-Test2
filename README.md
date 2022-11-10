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
    users_id int,
    created_at TIMESTAMP NOT null
);

create table orders(
    orders_id int primary KEY auto_increment,
    product_id int,
    users_id int,
    product_count int,
    created_at TIMESTAMP
);
```

### 5. 더미데이터

```sql
insert into users(username, password, email, createdAt) values('ssar', '1234', 'ssar@nate.com', NOW());
insert into users(username, password, email, createdAt) values('cos', '1234', 'cos@nate.com', NOW());
insert into users(username, password, email, createdAt) values('hong', '1234', 'hong@nate.com', NOW());

INSERT INTO product(product_name, product_price, product_qty, created_at) VALUES('바나나', 3000, 98,1, NOW());
INSERT INTO product(product_name, product_price, product_qty, created_at) VALUES('딸기', 2000, 100,2, NOW());

INSERT INTO orders(product_id, users_id, product_count, created_at) VALUES(1, 1, 10, NOW());
INSERT INTO orders(product_id, users_id, product_count, created_at) VALUES(2, 2, 20, NOW());

```

### 6. 페이지
