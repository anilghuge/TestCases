package com.vinsys.test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.vinsys.dao.IUserDAO;
import com.vinsys.service.IIUserService;
import com.vinsys.vo.UserLoginRequestVo;

@SpringBootTest
@DisplayName("Test User Service Implementation")
class TestUserServiceImpl {

	@Autowired
	IIUserService userService;
	
	@MockBean
	IUserDAO userRepo;
	
	
	@Test
	@DisplayName("Test user password is null")
	void userPasswordisNull() {
		UserLoginRequestVo requestvo=new UserLoginRequestVo();
		requestvo.setUsername("amit");
		requestvo.setPassword(null);
		assertThrows(IllegalArgumentException.class,()->{
			userService.login(requestvo);
		});
		
		
	}
	
}
