package site.metacoding.firstapp.domain;

import java.util.List;


public interface UsersDao {
	public void insert(Users users); 
	public Users findById(Integer id);
	public Users findByUsername(String username);
	public List<Users> findAll();
	public void update(Users userr); 
	public void delete(Integer id);	
}