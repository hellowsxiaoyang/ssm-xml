package com.yzy.ssm.service.impl;

import com.yzy.ssm.bean.User;
import com.yzy.ssm.mapper.IUserMapper;
import com.yzy.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 杨郑耀
 * @description
 * @create 2019-06-23-12:27
 */
@Service("userService")
public class IUserServiceImpl implements IUserService {

	@Autowired
	private IUserMapper iUserMapper;

	@Override
	public List<User> selectAll() {
		return iUserMapper.selectAll();
	}
}
