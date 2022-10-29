package site.metacoding.firstapp.domain;

import java.util.List;

public interface ProductDao {
	public Product findById(Integer productId);
	public List<Product> findAll();
	public Product findByProductName(String productName);
}