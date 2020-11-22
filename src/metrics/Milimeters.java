package metrics;

import java.lang.Math ;

public class Milimeters extends AbstractMetric{
	
	measureTypes metric = measureTypes.DISTANCE;
	
	private String type ;
	@SuppressWarnings("unused")
	private String unit;
    private String name;

	
	public Milimeters() {
		this.type = metric.getType();
        this.unit = metric.getUnit();
        this.name = "Meters(mm)";
	}
	
	 @Override
     public String toString() {
         return name + " " + "[" + type + "]";
     }
	 
	 public float ToCentimeter(float value) {
			return value/10;
		}
	 
	 public float ToMeter(float value) {
			return value/1000;
		}
	 
	 public float ToDecimeter(float value) {
			return value/100;
		}
	 public float ToKilometer(float value) {
			return (float) (value/ Math.pow(10,6));
		}
	 

}
