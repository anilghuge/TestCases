package com.vinsys.service.impl;

import org.springframework.stereotype.Service;

import com.vinsys.service.IIUserService;
import com.vinsys.vo.UserLoginRequestVo;
import com.vinsys.vo.UserLoginResponseVo;

@Service
public class UserServiceImpl implements IIUserService {

	@Override
	public UserLoginResponseVo login(UserLoginRequestVo userRequestVo) {
		UserLoginValidation(userRequestVo);	
		return null;
	}

	private void UserLoginValidation(UserLoginRequestVo userRequestVo) {
		if(userRequestVo==null) {
			throw new IllegalArgumentException();
		}
		if(userRequestVo.getUsername()==null && userRequestVo.getPassword()==null) {
			throw new IllegalArgumentException();
		}
		if(userRequestVo.getUsername()!=null &&userRequestVo.getPassword()==null) {
			throw new IllegalArgumentException();
		}
	}

	

}
