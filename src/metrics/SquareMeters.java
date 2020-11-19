package metrics;

public class SquareMeters extends AbstractMetric{
	
	measureTypes metric = measureTypes.AREA;
	@SuppressWarnings("unused")
	private String type = metric.getType() ;
	@SuppressWarnings("unused")
	private String unit = metric.getUnit();
	
	public float ToSquareCentimeter(float value) {
		return value*10000;
	}
	public float ToSoccerCamp(float value){
		return value/10800;
	}
}
