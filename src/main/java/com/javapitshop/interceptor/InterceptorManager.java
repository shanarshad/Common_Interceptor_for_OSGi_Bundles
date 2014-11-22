/**
 * 
 */
package com.javapitshop.interceptor;

import org.apache.cxf.Bus;
import org.apache.cxf.feature.AbstractFeature;
import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.interceptor.InterceptorProvider;
import org.apache.cxf.message.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author Ch.Shan
 *
 */
public class InterceptorManager extends AbstractFeature {

	private static final String COMMON_BUS_NAME = "javapitshop_bus";
	private static final Logger LOGGER = LoggerFactory.getLogger(InterceptorManager.class);
	private static final Interceptor< Message > IN = new CommonInterceptor();

	
	protected void initializeProvider(InterceptorProvider provider, Bus bus) {
		
		if ( COMMON_BUS_NAME.equals( bus.getId() ) ) {
			LOGGER.debug( " ############## Registering Common Interceptor on BUS ##############" );
			bus.getInInterceptors().add( IN );
		} else {
			LOGGER.error( " ############## Bus Id: '" + bus.getId() + "' doesn't matched with system bus id ##############" );

		}
		
	}

}
