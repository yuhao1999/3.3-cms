package com.yh.service.Impl;

import org.apache.dubbo.config.annotation.Service;

import com.yh.service.UserService;

/**
 * @于浩
 */
@Service(interfaceClass=UserService.class,version="1.0.0")
public class UserServiceImpl implements UserService {

	public boolean login(String userName, String passWord) {
		// TODO Auto-generated method stub
		return "admin".equals(userName) && "123456".equals(passWord);
	}

}
