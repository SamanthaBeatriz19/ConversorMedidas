package metrics;

import java.lang.Math;

public class Meters extends AbstractMetric{
	
	measureTypes metric = measureTypes.DISTANCE;
	
	@SuppressWarnings("unused")
	private String type = metric.getType() ;
	@SuppressWarnings("unused")
	private String unit = metric.getUnit();
	
	public float ToCentimeter(float value) {
		return value*100;
	}
	
	public float Tokilometer(float value) {
		return value/1000;
	}
	
	public float ToMilimeter(float value) {
		return value*1000;
	}
}
