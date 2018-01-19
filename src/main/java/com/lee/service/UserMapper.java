package com.lee.service;

import com.lee.bean.UserBean;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by lcx on 2018/1/19 11:04.
 */

public interface UserMapper {

	@Select("SELECT user.id, user.name FROM user INNER JOIN id_test ON id_test.user_id = user.id AND user.id = #{ID}")
	UserBean getUserById(@Param("ID") int id);

	@Select("SELECT * FROM user")
	List<UserBean> getUserList();
}
