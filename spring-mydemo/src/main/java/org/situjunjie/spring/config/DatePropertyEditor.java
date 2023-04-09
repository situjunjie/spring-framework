package org.situjunjie.spring.config;

import lombok.Data;

import java.beans.PropertyEditorSupport;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
public class DatePropertyEditor extends PropertyEditorSupport {

	private String format = "yyyy-MM-dd";

	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try {
			Date d = sdf.parse(text);
			this.setValue(d);
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
