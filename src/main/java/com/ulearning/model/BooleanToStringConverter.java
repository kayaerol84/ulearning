package com.ulearning.model;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public abstract class BooleanToStringConverter implements AttributeConverter<Boolean, String> {

	@Override
	public String convertToDatabaseColumn(Boolean value) {
		return (value != null && value) ? "Y" : "N";
	}

	@Override
	public Boolean convertToEntityAttribute(String value) {
		return "Y".equals(value);
	}

}