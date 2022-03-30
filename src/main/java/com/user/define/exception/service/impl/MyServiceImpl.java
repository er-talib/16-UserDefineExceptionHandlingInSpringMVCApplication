package com.user.define.exception.service.impl;

import org.springframework.stereotype.Service;

import com.user.define.exception.service.MyService;
import com.user.define.exception.userdefineexception.NoBuyarNameFoundException;

@Service
public class MyServiceImpl implements MyService {

	@Override
	public String providerName(String name) {

		if (name.equals("Muhammad Talib")) {
			return "Muhammad Talib ...!!!";
		} else {
			throw new NoBuyarNameFoundException(" Buyar name is not found");

		}

	}

}
