package metrics;

public interface IMetrics {
    
    public double toBasicUnit(double value);
    public double fromBasicUnit(double value);
    public double Convert(IMetrics metric, double value);
   
}
