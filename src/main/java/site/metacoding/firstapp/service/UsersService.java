package site.metacoding.firstapp.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.domain.users.Users;
import site.metacoding.firstapp.domain.users.UsersDao;
import site.metacoding.firstapp.web.dto.request.JoinDto;
import site.metacoding.firstapp.web.dto.request.LoginDto;

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
		if (usersPS == null) { // 아이디가 중복 안됨
			return false;
		} else { // 아이디가 중복됨
			return true;
		}
	}

	public Users 로그인(LoginDto loginDto) {
		Users usersPS = usersDao.findByUsername(loginDto.getUsername());
		if (usersPS == null) {
			return null;
		}
		if (usersPS.getPassword().equals(loginDto.getPassword())) {
			return usersPS;
		} else {
			return null;
		}
	}
}
