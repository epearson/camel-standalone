/**
 * 
 */
package edu.bowdoin.routing;

import org.apache.camel.spring.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author epearson
 *
 */
public class CamelServer extends Main{

	private static final Logger logger = LoggerFactory.getLogger(CamelServer.class);
	
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String... args) throws Exception {
		CamelServer camelServer = new CamelServer();
		
		try {
			camelServer.boot(args);
		} catch (Exception ex) {
			logger.error(ex.getMessage(), ex);
		}
	}
	
	public void boot(String[] args) throws Exception {
		// allows ctrl + c to terminate the JVM
		this.enableHangupSupport();
		
		// run until you terminate the JVM
        logger.info("Starting Camel. Use ctrl + c to terminate the JVM.\n");
        this.run(args);
	}
	
	@Override
	protected void doStart() throws Exception {
		super.doStart();
		logger.debug("Start override ...");
	}
	
	@Override
	protected void doStop() throws Exception {
		super.doStop();
		logger.info("Stop override ...");
	}

}
