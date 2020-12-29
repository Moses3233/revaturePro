package com.app.main;

import org.apache.log4j.Logger;

import com.app.Logs.helloLogs;

public class helloLogMain {

	private static Logger log = Logger.getLogger(helloLogMain.class);

	public static void main(String[] args) {
		
		log.trace("Hello trace");
		log.info("Hello there!");
		log.error("Is there an echo?");
		log.warn("- No");
		log.fatal("Okay then...");
	
		helloLogs logService = new helloLogs();
		logService.hiLog();
	}

}
