package net.jcornelio.projects.calculator.operation;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: September 09, 2013
 * @version: 1.0
 **************************************************/
public class DivisionOperation implements Operation{

    /**
     *
     * @param num1
     * @param num2
     * @return
     */
    @Override
	public double performCalculation(double num1, double num2) {
		return num1/num2;
	}
           
        public String toString(){
            return "Division";
        }
}
