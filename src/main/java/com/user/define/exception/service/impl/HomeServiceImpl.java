package com.user.define.exception.service.impl;

import org.springframework.stereotype.Service;

import com.user.define.exception.service.HomeService;
import com.user.define.exception.userdefineexception.NoHomePriceException;

@Service
public class HomeServiceImpl implements HomeService {

	@Override
	public Double findHomePrice(String homeNo) {

		if (homeNo.equals("HN123")) {
			return 1250000.00;
		} else {
			throw new NoHomePriceException("This house price is not available at this time");
		}

	}

}
