package metrics;



public class Meters extends AbstractMetric implements IMetrics{
	
	measureTypes metric = measureTypes.DISTANCE;
	
	@SuppressWarnings("unused")
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
	
        
        
	public float ToCentimeter(float value) {
		return value*100;
	}
	
	public float Tokilometer(float value) {
		return value/1000;
	}
	
	public float ToMilimeter(float value) {
		return value*1000;
	}
	
	public float ToDecimeter(float value) {
		return value*10;
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
    public double Convert(double from, IMetrics metrics) {
         return fromBasicUnit(metrics.toBasicUnit(from));//To change body of generated methods, choose Tools | Templates.
    }
	
	

}
