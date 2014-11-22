/**
 * 
 */
package com.javapitshop.interceptor;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

/**
 * @author Ch.Shan
 *
 */
public class CommonInterceptor extends AbstractPhaseInterceptor<Message> {

	public CommonInterceptor() {
		super(Phase.PRE_PROTOCOL);
	}

	public void handleMessage(Message message) throws Fault {
		
		
		/**
		 * Here write whatever logic you want to implement on each HTTP call sent to your project.
		 * 
		 * This interceptor will be called on every request that is being recieved by container and then will be sent
		 * to the relevant bundle/class for handling.
		 */
	
	}

}
