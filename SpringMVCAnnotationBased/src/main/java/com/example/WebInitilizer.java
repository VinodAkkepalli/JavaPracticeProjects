package com.example;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 
 * @author Vinod Akkepalli
 * 
 * WebInitializer file replicating web.xml file configurations
 *
 */

public class WebInitilizer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * @see org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer#getServletConfigClasses()
	 * to specify (list of)servlet classes
	 */
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {MainServletConfig.class};
	}

	/*
	 * (non-Javadoc)
	 * @see org.springframework.web.servlet.support.AbstractDispatcherServletInitializer#getServletMappings()
	 * to specify servlet mapping url pattern
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
