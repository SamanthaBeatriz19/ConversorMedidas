package metrics;

public class Centimeters extends AbstractMetric {
	
	measureTypes metric = measureTypes.DISTANCE;
	
	@SuppressWarnings("unused")
	private String type = metric.getType() ;
	@SuppressWarnings("unused")
	private String unit = metric.getUnit();
	
	
	/*
	public void setMetric(String type, String unit) {
		this.type = type;
		this.unit = unit;
	}*/
}
