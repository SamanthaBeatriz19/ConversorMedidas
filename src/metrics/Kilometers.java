package metrics;

/**Metric Class Kilometers
* @author Samantha
* @version 1.00
* @since 23/11/2020
*/

public class Kilometers extends AbstractMetric implements IMetrics{
	
	measureTypes metric = measureTypes.DISTANCE;
	
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
    
    @Override
    public double toBasicUnit(double value) {
        return value*1000; 
    }

    @Override
    public double fromBasicUnit(double value) {
        return value/1000; 
    }

    @Override
    public double Convert(IMetrics metric, double value) {
        return fromBasicUnit(metric.toBasicUnit(value));
    }

}
