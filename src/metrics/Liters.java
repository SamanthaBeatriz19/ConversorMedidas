package metrics;

/**Metric Class Liters
* @author Samantha
* @version 1.00
* @since 23/11/2020
*/
public class Liters extends AbstractMetric implements IMetrics{
	
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
    
    @Override
    public double toBasicUnit(double value) {
        return value; 
    }

    @Override
    public double fromBasicUnit(double value) {
        return value; 
    }

    @Override
    public double Convert(IMetrics metric, double value) {
        return fromBasicUnit(metric.toBasicUnit(value));
    }

}
