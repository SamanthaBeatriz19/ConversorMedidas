package metrics;

import java.lang.Math;

public class Centimeters extends AbstractMetric {
	
	measureTypes metric = measureTypes.DISTANCE;
	
	@SuppressWarnings("unused")
	private String type = metric.getType();
	@SuppressWarnings("unused")
	private String unit = metric.getUnit();
	
	
	public float ToMeter(int value) {
		return value/100;
	}
	
	public float ToKilometer(float value){
		return value/100000;
	}
	
	public float ToMilimeter(float value) {
		return value*100;
	}
	
	
	public double ToNanometer(double value){
		value = value*Math.pow(10,7);
		return value;
	}
}
