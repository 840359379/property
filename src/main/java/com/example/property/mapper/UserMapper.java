/*
 *
 *  * 盛建辉：毕设
 *  *
 *  * 版权归本公司所有，不得私自使用、拷贝、修改、删除，否则视为侵权
 *
 */

package com.example.property.mapper;

import com.example.property.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
	/**
	 * 登录
	 * @param id
	 * @param pw
	 * @return
	 */
	public User record(String id, String pw);

	/**
	 * 新增账号
	 * @param user
	 * @return
	 */
	public boolean register(User user);

	/**
	 * 新改用户信息
	 * @param user
	 * @return
	 */
	public boolean modify(User user);

	/**
	 * 根据用户名查找
	 * @param id
	 * @return
	 */
	public List<User> chaname(String id);

}
