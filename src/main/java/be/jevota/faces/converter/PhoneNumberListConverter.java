package be.jevota.faces.converter;

import java.util.ArrayList;
import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.inject.Named;

import org.apache.commons.lang.StringUtils;

@Named
public class PhoneNumberListConverter implements Converter {

	public Object getAsObject(FacesContext context, UIComponent component,
			String value) {
		List<String> result = new ArrayList<String>();
		for(String number: StringUtils.split(StringUtils.remove(value, '\r'), '\n')) {
			if(StringUtils.isNotBlank(number)) {
				result.add(number);
			}
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	public String getAsString(FacesContext context, UIComponent component,
			Object value) {
		return StringUtils.join((List<String>) value, "\n");
	}

}
