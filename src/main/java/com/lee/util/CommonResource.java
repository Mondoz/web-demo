package com.lee.util;

import java.io.File;

public class CommonResource {

	private static CommonUtil commonUtil = new CommonUtil();

	public static final String BASE_PACKAGE = commonUtil.getPropertys("/console.properties", "base.package");
	public static final boolean SWAGGER_INIT = Boolean.parseBoolean(commonUtil.getPropertys("/console.properties", "swagger.init"));
	public static final String SWAGGER_VERSION = commonUtil.getPropertys("/console.properties", "swagger.version");
	public static final String SWAGGER_TITLE = commonUtil.getPropertys("/console.properties", "swagger.title");
	public static final String SWAGGER_HOST = commonUtil.getPropertys("/console.properties", "swagger.host");
	public static final String SWAGGER_BASE_PATH = commonUtil.getPropertys("/console.properties", "swagger.base.path");
}
