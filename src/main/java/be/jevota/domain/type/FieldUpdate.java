package be.jevota.domain.type;

public class FieldUpdate {

	private String fieldName;
	private Object oldValue;
	private Object newValue;
	
	public FieldUpdate(String fieldName, Object oldValue, Object newValue) {
		this.fieldName = fieldName;
		this.oldValue = oldValue;
		this.newValue = newValue;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public Object getOldValue() {
		return oldValue;
	}

	public void setOldValue(Object oldValue) {
		this.oldValue = oldValue;
	}

	public Object getNewValue() {
		return newValue;
	}

	public void setNewValue(Object newValue) {
		this.newValue = newValue;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(fieldName).append(":\n");
		sb.append("Oude waarde: ").append(oldValue).append("\n");
		sb.append("Nieuwe waarde: ").append(newValue);
		return sb.toString();
	}

}
