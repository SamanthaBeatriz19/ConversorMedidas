package metrics;



public class CubicDecimeters extends AbstractMetric{
	
	measureTypes metric = measureTypes.VOLUME;
	
	private String type ;
	@SuppressWarnings("unused")
	private String unit;
    private String name;
    
    @Override
    public String toString() {
        return name + " " + "[" + type + "]";
    }
    
    public CubicDecimeters() {
    	this.type = metric.getType();
        this.unit = metric.getUnit();
        this.name = "Cubic Decimeters(dm3)";
    }
    
    public float ToCubicMeter(float value) {
		return value/1000;
	}
    
    public float ToCubicCentimeter(float value) {
		return value*1000;
	}
    
    public float ToMililiter(float value) {
		return value*1000;
	}
    
    public float ToLiter(float value) {
		return value;
	}
    
}
