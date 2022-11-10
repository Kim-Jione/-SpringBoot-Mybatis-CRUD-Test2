package site.metacoding.firstapp.domain.orders;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Orders {
	private Integer ordersId;
	private Integer productId;
	private Integer usersId;
	private Integer productCount;
	private Timestamp createdAt;
}