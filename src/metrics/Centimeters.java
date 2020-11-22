package metrics;

import java.lang.Math;

public class Centimeters extends AbstractMetric {
	
	measureTypes metric = measureTypes.DISTANCE;
	
	@SuppressWarnings("unused")
	private String type;
	@SuppressWarnings("unused")
	private String unit;
        private String name;

    public Centimeters() {
        this.type = metric.getType();
        this.unit = metric.getUnit();
        this.name = "Centimeters(CM)";
    }

<<<<<<< Updated upstream
=======
    @Override
    public String toString() {
        return name + " " + "[" + type + "]";
    }
    

>>>>>>> Stashed changes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
        

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
	
        
	
	public float ToMeter(int value) {
		return value/100;
	}
	
	public float ToKilometer(float value){
		return value/100000;
	}
	
	public float ToMilimeter(float value) {
		return value*100;
	}
	
	
	public double ToNanometer(double value){
		value = value*Math.pow(10,7);
		return value;
	}
}
