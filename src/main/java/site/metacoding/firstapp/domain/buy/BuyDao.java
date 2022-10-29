package site.metacoding.firstapp.domain.buy;

import java.util.List;

public interface BuyDao {
	public void insert(Buy buy); 
	public List<Buy> findAll();
	public Buy findById(Integer id);
	public void update(Buy buy);
	public void deleteById(Integer id);
}
