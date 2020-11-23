package metrics;

/**Interface responsible for Converter Units
* @author Juan Santos
* @version 1.00
* @since 23/11/2020
*/

public interface IMetrics {
    
    public double toBasicUnit(double value);
    public double fromBasicUnit(double value);
    public double Convert(IMetrics metric, double value);
   
}
