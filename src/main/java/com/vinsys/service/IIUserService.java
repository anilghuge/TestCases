package com.vinsys.service;

import com.vinsys.vo.UserLoginRequestVo;
import com.vinsys.vo.UserLoginResponseVo;

public interface IIUserService {
	UserLoginResponseVo login(UserLoginRequestVo userRequestVo);
}
