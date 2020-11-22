package metrics;


public class Liters extends AbstractMetric{
	
measureTypes metric = measureTypes.VOLUME;
	
	private String type ;
	@SuppressWarnings("unused")
	private String unit;
    private String name;
    
    @Override
    public String toString() {
        return name + " " + "[" + type + "]";
    }
    
    public Liters() {
    	this.type = metric.getType();
        this.unit = metric.getUnit();
        this.name = "Liters (L)";
    }
    
    public float ToCubicDecimeter(float value) {
		return value;
	}
    
    public float ToCubicMeter(float value) {
		return value/1000;
	}
    
    public float ToMililiter(float value) {
		return value/1000;
	}
    
    public float ToCentimeter(float value) {
		return value*1000;
	}
    
    

}
