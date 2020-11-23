package metrics;

import java.lang.Math;

/**Metric Class Centimeters
* @author Samantha
* @version 1.00
* @since 23/11/2020
*/

public class Centimeters extends AbstractMetric implements IMetrics {
	
	measureTypes metric = measureTypes.DISTANCE;
	
	@SuppressWarnings("unused")
	private String type;
	@SuppressWarnings("unused")
	private String unit;
        private String name;

    public Centimeters() {
        this.type = metric.getType();
        this.unit = metric.getUnit();
        this.name = "Centimeters(CM)";
    }


    @Override
    public String toString() {
        return name + " " + "[" + type + "]";
    }	  
	
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

    @Override
    public double toBasicUnit(double value) {
        return value/100;
    }

    @Override
    public double fromBasicUnit(double value) {
        return value*100; 
    }

    @Override
    public double Convert(IMetrics metric, double value) {
        return fromBasicUnit(metric.toBasicUnit(value));
    }
}
