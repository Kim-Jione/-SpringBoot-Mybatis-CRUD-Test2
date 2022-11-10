package site.metacoding.firstapp.web.dto.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class OrdersProductDto {

	// 뷰로부터 받을 값
	private Integer productId;
    private String productName;
    private Integer productQty;

	// DB로부터 가져올 값
	private Integer productCount;
	private Integer productPrice;
}
	