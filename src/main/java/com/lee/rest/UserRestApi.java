package com.lee.rest;

import com.lee.bean.UserBean;
import com.lee.service.UserMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by lcx on 2018/1/19 10:47.
 */

@Controller
@Path("user")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Api("user_rest")
public class UserRestApi {

	@Autowired
	private UserMapper userMapper;

	@ApiOperation("通过id获取用户信息")
	@GET
	@Path("/id")
	public Response getUser(@QueryParam("id") int id) {
		UserBean userBean = userMapper.getUserById(id);
		return Response.ok(userBean).build();
	}

	@ApiOperation("通过用户列表")
	@GET
	@Path("/lists")
	public Response getUserList() {
		List<UserBean> userList = userMapper.getUserList();
		return Response.ok(userList).build();
	}

}
