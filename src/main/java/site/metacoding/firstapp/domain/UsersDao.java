package site.metacoding.firstapp.domain;

import java.util.List;

import site.metacoding.firstapp.web.dto.request.LoginDto;

public interface UsersDao {
	public Users login(LoginDto loginDto);
	public void insert(Users users); 
	public Users findById(Integer id);
	public Users findByUsername(String username);
	public List<Users> findAll();
	public void update(Users userr); 
	public void delete(Integer id);	
}