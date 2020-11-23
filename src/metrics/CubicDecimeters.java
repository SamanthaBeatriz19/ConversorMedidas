package metrics;

/**Metric Class CubicDecimeters
* @author Samantha
* @version 1.00
* @since 23/11/2020
*/

public class CubicDecimeters extends AbstractMetric implements IMetrics{
	
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
        this.name = "CubicDecimeters(dm3)";
    }
    
	@Override
	public double toBasicUnit(double value) {
		// TODO Auto-generated method stub
		return value;
	}

	@Override
	public double fromBasicUnit(double value) {
		// TODO Auto-generated method stub
		return value;
	}

	@Override
	public double Convert(IMetrics metric, double value) {
		 return fromBasicUnit(metric.toBasicUnit(value));
	}
    
}
