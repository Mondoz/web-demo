package com.lee.app;

import com.lee.util.CommonResource;
import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;

public class MyApplication extends ResourceConfig{
	public MyApplication() {
		packages(CommonResource.BASE_PACKAGE)
		.register(JacksonFeature.class)
		.register(MultiPartFeature.class);
		
		if(CommonResource.SWAGGER_INIT){
			register(ApiListingResource.class);
			register(SwaggerSerializers.class);
			initSwagger();
		}
		
	}
	
	private void initSwagger(){
		BeanConfig beanConfig = new BeanConfig();
		beanConfig.setVersion(CommonResource.SWAGGER_VERSION);
		beanConfig.setTitle(CommonResource.SWAGGER_TITLE);
		beanConfig.setHost(CommonResource.SWAGGER_HOST);
		beanConfig.setBasePath(CommonResource.SWAGGER_BASE_PATH);
		beanConfig.setResourcePackage(CommonResource.BASE_PACKAGE);
		beanConfig.setScan();
	}
}
