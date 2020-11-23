package metrics;

public class SquareCentimeters extends AbstractMetric implements IMetrics{
	measureTypes metric = measureTypes.AREA;
	@SuppressWarnings("unused")
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
	        return value/10000; //DE CENTIMETRO PARA METRO
	    }

	    @Override
	    public double fromBasicUnit(double value) {
	        return value*10000; //DE METRO PARA CENTIMENTO
	    }

	    @Override
	    public double Convert(double from, IMetrics metrics) {
	        return fromBasicUnit(metrics.toBasicUnit(from));
	    }
}
