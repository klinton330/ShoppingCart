package com.shopping.dispatch;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.shopping.config.ShoppingConfig;

public class ShoppingDispatcher extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
	 Class [] cls = {ShoppingConfig.class};
		return cls;
	}

	@Override
	protected String[] getServletMappings() {
		String [] map= {"/shopping/*"};
		return map;
	}

}
