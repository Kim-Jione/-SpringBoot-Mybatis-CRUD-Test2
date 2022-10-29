package site.metacoding.firstapp.web;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.domain.Users;
import site.metacoding.firstapp.domain.UsersDao;
import site.metacoding.firstapp.web.dto.request.JoinDto;

@Service
@RequiredArgsConstructor
public class UsersService {
	
	private final UsersDao usersDao;
	public void 회원가입(JoinDto joinDto) {
		Users users = joinDto.toEntity();
		usersDao.insert(users);
	}
	
	public boolean 유저네임중복확인(String username) {
		Users usersPS = usersDao.findByUsername(username);
		if(usersPS == null) { // 아이디가 중복 안됨
			return false;
		}else { // 아이디가 중복됨
			return true;
		}
	}
}
