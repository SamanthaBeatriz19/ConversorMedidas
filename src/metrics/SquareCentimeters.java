package metrics;

/**Metric Class SquareCentimeters
* @author Samantha
* @version 1.00
* @since 23/11/2020
*/

public class SquareCentimeters extends AbstractMetric implements IMetrics{
	measureTypes metric = measureTypes.AREA;
	
	private String type ;
	@SuppressWarnings("unused")
	private String unit;
        private String name;
        

        public SquareCentimeters() {
            this.unit = metric.getUnit();
            this.type = metric.getType();
            this.name = "SquareCentimeters(CM²)";
        }
        
        @Override
        public String toString() {
            return name + " " + "[" + type + "]";
        }
	

	
	  @Override
	    public double toBasicUnit(double value) {
	        return value/10000; 
	    }

	    @Override
	    public double fromBasicUnit(double value) {
	        return value*10000; 
	    }

	    @Override
	    public double Convert(IMetrics metric, double value) {
	        return fromBasicUnit(metric.toBasicUnit(value));
	    }
}
