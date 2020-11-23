package metrics;

/**Metric Class Hours
* @author Samantha
* @version 1.00
* @since 23/11/2020
*/

public class Hours extends AbstractMetric implements IMetrics{
	
	measureTypes metric = measureTypes.TIME;
	

	private String type ;
	@SuppressWarnings("unused")
	private String unit;
    private String name;

    public Hours() {
        this.type = metric.getType();
        this.unit = metric.getUnit();
        this.name = "Hours(h)";
    }

    @Override
    public String toString() {
        return name +" "+ "[" + type + "]";
    }
    

	@Override
	public double toBasicUnit(double value) {
		return value*3600;
	}

	@Override
	public double fromBasicUnit(double value) {
		return value/3600;
	}

	@Override
	public double Convert(IMetrics metric, double value) {
		return fromBasicUnit(metric.toBasicUnit(value));
	}

}
