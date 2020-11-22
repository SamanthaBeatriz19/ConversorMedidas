package metrics;

public class Seconds extends AbstractMetric{
	
	measureTypes metric = measureTypes.TIME;
	
	@SuppressWarnings("unused")
	private String type ;
	@SuppressWarnings("unused")
	private String unit;
    private String name;

    public Seconds() {
        this.type = metric.getType();
        this.unit = metric.getUnit();
        this.name = "Seconds (s)";
    }

    @Override
    public String toString() {
        return name + " " + "[" + type + "]";
    }
    
    public float ToHour(float value) {
    	return value/3600;
    }
    
    public float ToMinute(float value) {
    	return value/60;
    }
    

}
