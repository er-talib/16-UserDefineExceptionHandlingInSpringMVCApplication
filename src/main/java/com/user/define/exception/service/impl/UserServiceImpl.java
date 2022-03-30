package com.user.define.exception.service.impl;

import org.springframework.stereotype.Service;

import com.user.define.exception.service.UserService;
import com.user.define.exception.userdefineexception.NoUserNameException;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public String homeBuyersName(String name) {

		if (name.equals("Amir Khan")) {
			return "Amir Khan ...!!!";
		} else {
			throw new NoUserNameException("User is not found");
		}

	}

}
