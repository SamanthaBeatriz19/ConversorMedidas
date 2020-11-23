package metrics;

/**Metric Class Decimeters
* @author Samantha
* @version 1.00
* @since 23/11/2020
*/

public class Decimeters extends AbstractMetric implements IMetrics{
	
	measureTypes metric = measureTypes.DISTANCE;
	

	private String type ;
	@SuppressWarnings("unused")
	private String unit;
    private String name;

    @Override
    public String toString() {
        return name + " " + "[" + type + "]";
    }
	
	public Decimeters() {
		this.type = metric.getType();
        this.unit = metric.getUnit();
        this.name = "Decimeters(dm)";
	}

	@Override
	public double toBasicUnit(double value) {
		// TODO Auto-generated method stub
		return value/10;
	}

	@Override
	public double fromBasicUnit(double value) {
		// TODO Auto-generated method stub
		return value*10;
	}

	@Override
	public double Convert(IMetrics metric, double value) {
		// TODO Auto-generated method stub
		 return fromBasicUnit(metric.toBasicUnit(value));
	}

}
