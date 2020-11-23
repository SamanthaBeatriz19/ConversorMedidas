package metrics;


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
    
    public float ToCubicDecimeter(float value) {
		return value;
	}
    
    public float ToCubicMeter(float value) {
		return value/1000;
	}
    
    public float ToMililiter(float value) {
		return value/1000;
	}
    
    public float ToCentimeter(float value) {
		return value*1000;
	}
    
    @Override
    public double toBasicUnit(double value) {
        return value; //DE CENTIMETRO PARA METRO
    }

    @Override
    public double fromBasicUnit(double value) {
        return value; //DE METRO PARA CENTIMENTO
    }

    @Override
    public double Convert(IMetrics metric, double value) {
        return fromBasicUnit(metric.toBasicUnit(value));
    }

}
