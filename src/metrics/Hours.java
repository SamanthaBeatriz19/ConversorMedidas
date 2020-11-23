package metrics;

public class Hours extends AbstractMetric implements IMetrics{
	
	measureTypes metric = measureTypes.TIME;
	
	@SuppressWarnings("unused")
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
    
    public float ToSecond(float value) {
    	return value*3600;
    }
    
    public float ToMinute(float value) {
    	return value*60;
    }

	@Override
	public double toBasicUnit(double value) {
		return value*3600;
	}

	@Override
	public double fromBasicUnit(double value) {
		// TODO Auto-generated method stub
		return value/3600;
	}

	@Override
	public double Convert(IMetrics metric, double value) {
		// TODO Auto-generated method stub
		return fromBasicUnit(metric.toBasicUnit(value));
	}

}
