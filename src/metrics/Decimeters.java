package metrics;

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
	
	 public float ToCentimeter(float value) {
			return value*10;
		}
	 
	 public float ToMeter(float value) {
			return value/10;
		}
	 
	 public float ToMilimeter(float value) {
			return value*100;
		}
	 
	 public float ToKiloeter(float value) {
			return value/10000;
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
	public double Convert(double from, IMetrics metrics) {
		// TODO Auto-generated method stub
		 return fromBasicUnit(metrics.toBasicUnit(from));
	}

}
