package metrics;


public class Minutes extends AbstractMetric implements IMetrics{
	
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
    

	@Override
	public double toBasicUnit(double value) {
		return value*60;
	}

	@Override
	public double fromBasicUnit(double value) {
		return value/60;
	}

	@Override
	public double Convert(double from, IMetrics metrics) {
		return fromBasicUnit(metrics.toBasicUnit(from));
	}

}
