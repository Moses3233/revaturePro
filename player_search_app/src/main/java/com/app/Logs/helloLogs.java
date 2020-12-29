package com.app.Logs;

import org.apache.log4j.Logger;

public class helloLogs {

	private static Logger log = Logger.getLogger(helloLogs.class);
	
	
	public void hiLog() {
		log.info("hello from the logs");
	}
	}

