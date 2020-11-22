package metrics;

public class AbstractMetric {
	public enum measureTypes
	{
		DISTANCE("distance","meters(m)"),
		AREA("area","square meters(m^2)"),
		VOLUME("volume","liters(L)"),
		TIME("time","seconds(s)"),
		SPEED("speed","m/s"),
		MASS("mass","kilograms(Kg)");
		
		
	
	//this is an example that should be followed for any other metric in the package
		private String type;
		private String unit;
		
		
		public String getType() {
			return type;
		}
		public final String getUnit() {
			return unit;
		}
		
		measureTypes(String type, String unit) {
			this.type = type;
			this.unit = unit;
		}
		
	}
}
