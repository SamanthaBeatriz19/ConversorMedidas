/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrics;

import javax.swing.JComboBox;

/**
 *
 * @author juan-
 */
public interface IMetrics {
    
    public double toBasicUnit(double value);
    public double fromBasicUnit(double value);
    public double Convert(double from, IMetrics metric);
   
}

