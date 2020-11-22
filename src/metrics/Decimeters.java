package metrics;

public class Decimeters extends AbstractMetric{
	
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

}
