package metrics;

import java.lang.Math ;

public class Milimeters extends AbstractMetric implements IMetrics{
	
	measureTypes metric = measureTypes.DISTANCE;
	
	private String type ;
	@SuppressWarnings("unused")
	private String unit;
    private String name;

	
	public Milimeters() {
		this.type = metric.getType();
        this.unit = metric.getUnit();
        this.name = "Milimeters(mm)";
	}
	
	 @Override
     public String toString() {
         return name + " " + "[" + type + "]";
     }

	@Override
	public double toBasicUnit(double value) {
		return value/1000;
	}

	@Override
	public double fromBasicUnit(double value) {
		return value*1000;
	}

	@Override
	public double Convert(IMetrics metric, double value) {
		return fromBasicUnit(metric.toBasicUnit(value));
	}
	 

}
