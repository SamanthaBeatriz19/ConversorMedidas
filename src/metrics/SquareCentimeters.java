package metrics;

public class SquareCentimeters extends AbstractMetric{
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
	
	public float ToSquareMeter(float value) {
		return value/10000;
	}
	public float ToSoccerCamp(float value){
		return (value/10000)/10800;
	}
}
