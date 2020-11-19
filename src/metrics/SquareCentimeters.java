package metrics;

public class SquareCentimeters extends AbstractMetric{
	measureTypes metric = measureTypes.AREA;
	@SuppressWarnings("unused")
	private String type = metric.getType() ;
	@SuppressWarnings("unused")
	private String unit = metric.getUnit();
	
	public float ToSquareMeter(float value) {
		return value/10000;
	}
	public float ToSoccerCamp(float value){
		return (value/10000)/10800;
	}
}
