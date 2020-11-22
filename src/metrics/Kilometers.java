package metrics;



public class Kilometers extends AbstractMetric{
	
	measureTypes metric = measureTypes.DISTANCE;
	
	@SuppressWarnings("unused")
	private String type ;
	@SuppressWarnings("unused")
	private String unit;
    private String name;

    public Kilometers() {
        this.type = metric.getType();
        this.unit = metric.getUnit();
        this.name = "Kilometers(KM)";
    }

    @Override
    public String toString() {
        return name + " " + "[" + type + "]";
    }
    
    public float ToMeter(float value) {
		return value*1000;
	}
    
    public float ToDecimeter(float value) {
		return value*10000;
	}
    
    public float ToCentimeter(float value) {
		return value*100000;
	}
    
    public float ToMilimeter(float value) {
		return (float) (value* Math.pow(10,6));
	}

}