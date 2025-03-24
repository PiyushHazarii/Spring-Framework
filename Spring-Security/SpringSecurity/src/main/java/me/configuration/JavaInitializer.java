package me.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import me.security.WebSecurityConfig;

// in replacement of myds servlet.xml file
public class JavaInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {WebSecurityConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {JavaWEBConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}


}