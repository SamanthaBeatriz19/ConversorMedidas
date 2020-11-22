package metrics;

public class SquareMeters extends AbstractMetric{
	
	measureTypes metric = measureTypes.AREA;
	@SuppressWarnings("unused")
	private String type ;
	@SuppressWarnings("unused")
	private String unit;
        private String name;

        public SquareMeters() {
            this.unit = metric.getUnit();
            this.type = metric.getType();
            this.name = "SquareMeters(M²)";
        }
        
        @Override
        public String toString() {
            return name + " " + "[" + type + "]";
        }
	
	public float ToSquareCentimeter(float value) {
		return value*10000;
	}
	public float ToSoccerCamp(float value){
		return value/10800;
	}
}
