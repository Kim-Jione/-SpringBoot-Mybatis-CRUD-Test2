package site.metacoding.firstapp.web.dto.response;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BuyListDto {
    private Integer productId;
    private String productName;
    private Integer productPrice;
    private Integer productQty;
    private Integer usersId;
    private Timestamp createdAt;
}
