package site.metacoding.firstapp.domain.orders;

import java.util.List;

public interface OrdersDao {
	public void insert(Orders orders); 
	public List<Orders> findAll(Integer usersId);
	public Orders findById(Integer usersId);
	public void update(Orders orders);
	public void deleteById(Integer buyId);
}
