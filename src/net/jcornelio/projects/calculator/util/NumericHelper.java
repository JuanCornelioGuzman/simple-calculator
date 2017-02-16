package net.jcornelio.projects.calculator.util;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: Sep 24, 2013
 * @version: 1.0
 **************************************************/
public final class NumericHelper {
    
    /**
     * Rounds the given value from the desired decimal place
     * 
     * @param numOfDecimalPlace
     * @param value
     * @return
     */
    public static String roundOff(int numOfDecimalPlace, Double value){
        String format = "%."+numOfDecimalPlace+"f";
        return String.format(format, value);
    }
    
    private NumericHelper(){}
}

