package metrics;

public class AbstractMetric {
	
	//this is an example that should be followed for any other metric in the package
	
	private String type;
	private String unit;
	
	public String getType() {
		return type;
	}
	public final String getUnit() {
		return unit;
	}
	
	public void setMetric(String type, String unit) {
		this.type = type;
		this.unit = unit;
	}
}
