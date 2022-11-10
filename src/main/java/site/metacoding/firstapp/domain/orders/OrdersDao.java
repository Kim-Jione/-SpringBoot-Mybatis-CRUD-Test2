package site.metacoding.firstapp.domain.orders;

import java.util.List;

import site.metacoding.firstapp.web.dto.request.OrdersProductDto;

public interface OrdersDao {

	public void insert(Orders orders);

	public Orders findById(Integer ordersId);

	public List<OrdersProductDto> findAll(Integer usersId);

	public void update(Orders orders);

	public void delete(Integer ordersId);
}
