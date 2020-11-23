package metrics;

import java.lang.Math ;

public class CubicCentimeters extends AbstractMetric implements IMetrics{
	
	measureTypes metric = measureTypes.VOLUME;
	
	private String type ;
	@SuppressWarnings("unused")
	private String unit;
    private String name;
    
    @Override
    public String toString() {
        return name + " " + "[" + type + "]";
    }
    
    public CubicCentimeters() {
		this.type = metric.getType();
        this.unit = metric.getUnit();
        this.name = "Cubic centimeter(cm3)";
	}
    
    public float ToCubicMeter(float value) {
		return value/(float)Math.pow(10, 6);
	}
    
    public float ToCubicDecimeter(float value) {
		return value*(float)Math.pow(10, 3);
	}
    
    public float ToLiter(float value) {
		return value/(float)Math.pow(10, 3);
	}
    
    public float ToMililiter(float value) {
		return value;
	}

	@Override
	public double toBasicUnit(double value) {
		// TODO Auto-generated method stub
		return value/1000;
	}

	@Override
	public double fromBasicUnit(double value) {
		// TODO Auto-generated method stub
		return value*1000;
	}

	@Override
	public double Convert(IMetrics metric, double value) {
		 return fromBasicUnit(metric.toBasicUnit(value));
	}

}
