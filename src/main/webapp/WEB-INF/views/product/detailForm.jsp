<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ include file="../layout/header.jsp"%>
<div class="container">
    <div>
        <input id="usersId" type="hidden" value="${detail.usersId}" />
        <div class="mb-3 mt-3">상품명 : ${detail.productName}</div>
        <div class="mb-3 mt-3">상품가격 : ${detail.productPrice}&nbsp;원</div>
        <div class="mb-3 mt-3">상품재고 : ${detail.productQty}&nbsp;개</div>
    </div>

    <form>
        <input type="hidden" name="productId" value="${detail.productId}" />
        <select>
            <c:forEach begin="1" end="10" var="i">
                <option value="${i}">${i}</option>
            </c:forEach></select
        >&nbsp;개

        <button id="btnBuy" class="btn btn-danger" type="submit">
            구매하기
        </button>
    </form>
</div>

<script>
    $("#btnBuy").click(() => {
        buyProduct();
    });

    function buyProduct() {
        alert("구매되었습니다.");
    }
</script>
<%@ include file="../layout/footer.jsp"%>
