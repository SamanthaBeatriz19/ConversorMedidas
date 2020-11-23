package metrics;



public class Meters extends AbstractMetric implements IMetrics{
	
	measureTypes metric = measureTypes.DISTANCE;

	private String type ;
	@SuppressWarnings("unused")
	private String unit;
        private String name;

        public Meters() {
            this.type = metric.getType();
            this.unit = metric.getUnit();
            this.name = "Meters(CM)";
        }

        @Override
        public String toString() {
            return name + " " + "[" + type + "]";
        }
	
        
    @Override
    public double toBasicUnit(double value) {
        return value; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double fromBasicUnit(double value) {
        return value; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double Convert(IMetrics metric, double value) {
         return fromBasicUnit(metric.toBasicUnit(value));//To change body of generated methods, choose Tools | Templates.
    }
}
