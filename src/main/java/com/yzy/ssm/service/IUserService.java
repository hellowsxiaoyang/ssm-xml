package com.yzy.ssm.service;

import com.yzy.ssm.bean.User;

import java.util.List;

/**
 * @author 杨郑耀
 * @description
 * @create 2019-06-23-12:27
 */
public interface IUserService {
	List<User> selectAll();
}
