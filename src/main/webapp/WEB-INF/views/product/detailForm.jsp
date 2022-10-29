<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<div class="container">
	<form action="/product/add" method="post">
		<div class="mb-3 mt-3">상품명 : ${detail.productName}</div>
		<div class="mb-3 mt-3">상품가격 : ${detail.productPrice}</div>
		<div class="mb-3 mt-3">상품재고 : ${detail.productQty}</div>
	</form>
	
	<form action="" method="">
		<button class="btn btn-danger">구매하기</button>
	</form>
	
</div>
<%@ include file="../layout/footer.jsp"%>
