package com.empleados.sistema.util;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogerUtil {

	private static final Logger LOGGER = Logger.getLogger(LogerUtil.class.getName());
	
	private LogerUtil() {
		
	}

    public static void logException(Exception e, String message) {
        LOGGER.log(Level.SEVERE, message, e);
    }

    public static void logMessage(String message) {
        LOGGER.log(Level.INFO, message);
    }
}
