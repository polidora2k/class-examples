package com.teksystems.examples;

import org.apache.logging.log4j.*;

public class Examples3 {

	private static final Logger logger = LogManager.getLogger(Examples3.class); 
	
	public static void main(String[] args) {
//		logger.trace("We've just greeted the user!");
//        logger.debug("We've just greeted the user!");
//        logger.info("We've just greeted the user!");
//        logger.warn("We've just greeted the user!");
//        logger.error("We've just greeted the user!");
//        logger.fatal("We've just greeted the user!");
		breakContinue();
	}
	
	public static void loopExamples() {
		
		for (int i = 0; i < 100; i++) {
			logger.log(Level.INFO, "This is a info!\n");
		}
		
		System.out.println("=================================");
		
		for (int i = 100; i > 0; i--) {
			System.out.printf("%-4s Welcome Down to Java World!\n", i + "." );
		}
		
		System.out.println("=================================");
		System.out.println("Numbers Divisible by 5 from 1-100:");
		
		for (int i = 1; i <= 100; i++) {
			if (i % 5 == 0) {
				System.out.println(i);
			}
		}
	}
	
	public static void breakContinue() {
		System.out.println("Starting the loop");
		for (int i = 1; i <= 5; i++) {
			if (i % 2 != 0) {
				continue;
			}
			
			System.out.println(i);
			
			if (i == 4) {
				break;
			}
		}
		System.out.println("Ending the loop");
	}
}
