package site.metacoding.firstapp.domain.buy;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Buy {
	private Integer id;
	private Integer productId;
	private Integer UsersId;
	private Integer amount;
	private Timestamp createdAt;	
}