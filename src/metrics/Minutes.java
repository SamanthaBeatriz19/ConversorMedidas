package metrics;


public class Minutes extends AbstractMetric{
	
	measureTypes metric = measureTypes.TIME;
	
	@SuppressWarnings("unused")
	private String type ;
	@SuppressWarnings("unused")
	private String unit;
    private String name;

    public Minutes() {
        this.type = metric.getType();
        this.unit = metric.getUnit();
        this.name = "Minutes (min)";
    }

    @Override
    public String toString() {
        return name + " " + "[" + type + "]";
    }
    
    public float ToHour(float value) {
    	return value/60;
    }
    
    public float ToSecond(float value) {
    	return value*60;
    }

}
