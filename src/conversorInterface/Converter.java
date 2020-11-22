/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversorInterface;

import javax.swing.JComboBox;

/**
 *
 * @author juan-
 */
public class Converter {
    
    public String MeasureConverter(String from, JComboBox<String> string1, JComboBox<String> string2)
    {
        float a = Float.parseFloat(from);
        System.out.println(string1.getSelectedItem());
        System.out.println(string1.getClass());
        System.out.println(string2.getSelectedItem());
        

        

        return "";
    }
    
}
