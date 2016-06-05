package com.ulearning.utils;

import java.text.MessageFormat;

public class DaoUtils {
	
	public static void validateNotEmpty(String param, String parameterName) {

		validateNoNull(param, parameterName);

		if (param.trim().length() == 0) {
			throw new IllegalArgumentException(
					MessageFormat.format("The {0} can not be null or empty string.", parameterName));
		}
	}

	public static void validateNoNull(Object param, String parameterName) {

		if (param == null) {
			throw new IllegalArgumentException(MessageFormat.format("The '{0}' can not be null.", parameterName));
		}
	}

}
