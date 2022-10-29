package site.metacoding.firstapp.domain.buy;

import java.util.List;

public interface BuyDao {
	public void insert(Buy buy); 
	public List<Buy> findAll(Integer usersId);
	public Buy findById(Integer usersId);
	public void update(Buy buy);
	public void deleteById(Integer buyId);
	public void updateQty(Integer amount);
}
