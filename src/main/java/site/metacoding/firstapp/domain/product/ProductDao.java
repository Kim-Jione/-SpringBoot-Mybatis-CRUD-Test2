package site.metacoding.firstapp.domain.product;

import java.util.List;

public interface ProductDao {
	public Product findById(Integer productId);
	public List<Product> findAll();
	public Product findByProductName(String productName);

	public void insert(Product product);
	
	public void update(Product product);

	public void delete(Integer productId);
}