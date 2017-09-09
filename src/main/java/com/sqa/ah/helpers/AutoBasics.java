/**
 * File Name: AutoBasics.java<br>
 * Hesemann, Anne<br>
 * Created: Sep 9, 2017
 */
package com.sqa.ah.helpers;

import java.io.*;
import java.util.*;

import org.apache.log4j.*;

/**
 * AutoBasics //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Hesemann, Anne
 * @version 1.0.0
 * @since 1.0
 */
public class AutoBasics {

	public static String getProp(String propName, String fileLocation, String fileName, Logger logger) {
		Properties props = new Properties();
		InputStream input;
		try {
			input = new FileInputStream(fileLocation + fileName);
			props.load(input);
		} catch (FileNotFoundException e) {
			logger.warn("Can not load config properties file because it was not found: " + fileName);
		} catch (IOException e) {
			logger.warn("Can not load config properties file can not be read: " + fileName);
		}
		return props.getProperty(propName);
	}
}
