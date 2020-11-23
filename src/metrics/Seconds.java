package metrics;

/**Metric Class Seconds
* @author Samantha
* @version 1.00
* @since 23/11/2020
*/

public class Seconds extends AbstractMetric implements IMetrics{
	
	measureTypes metric = measureTypes.TIME;
	
	@SuppressWarnings("unused")
	private String type ;
	@SuppressWarnings("unused")
	private String unit;
    private String name;

    public Seconds() {
        this.type = metric.getType();
        this.unit = metric.getUnit();
        this.name = "Seconds(s)";
    }

    @Override
    public String toString() {
        return name + " " + "[" + type + "]";
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
