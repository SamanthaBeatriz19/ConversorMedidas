package conversorInterface;

import javax.swing.JComboBox;


public class Converter {
    
    @SuppressWarnings("unused")
	public String MeasureConverter(String from, JComboBox<String> string1, JComboBox<String> string2)
    {
        float a = Float.parseFloat(from);
        System.out.println(string1.getSelectedItem());
        System.out.println(string1.getClass());
        System.out.println(string2.getSelectedItem());
 

        return "";
    }
    
}
