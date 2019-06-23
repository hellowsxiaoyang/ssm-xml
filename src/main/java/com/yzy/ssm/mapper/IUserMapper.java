package com.yzy.ssm.mapper;

import com.yzy.ssm.bean.User;

import java.util.List;

/**
 * @author 杨郑耀
 * @description
 * @create 2019-06-23-12:24
 */
public interface IUserMapper {
	List<User> selectAll();
}
