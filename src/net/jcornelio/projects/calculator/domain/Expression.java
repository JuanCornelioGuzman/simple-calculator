package net.jcornelio.projects.calculator.domain;

import java.util.ArrayList;
import java.util.HashMap;
import net.jcornelio.projects.calculator.util.Constants;

/***************************************************
 * @author: Juan Cornelio S. Guzman
 * @since: September 09, 2013
 * @version: 1.0
 **************************************************/
public class Expression {

    private ArrayList<String> operands;
    private ArrayList<String> operators;
    private HashMap<String, Integer> operationExecution;
    private String result;
    private static Expression expr;
    
    private Expression(){
        operands = new ArrayList<String>();
        operators = new ArrayList<String>();
        operationExecution = new HashMap<String, Integer>();
    }
    
    /**
     *
     * @return
     */
    public static Expression getInstance(){
        return (expr==null)? new Expression() : expr;
    }
    
    /**
     *
     * @param opr
     */
    public void addOperator(String opr){
        operators.add(opr);
    }
    
    /**
     *
     * @param opr
     */
    public void removeOperator(String opr){
        operators.remove(opr);
    }
    
    /**
     *
     * @param index
     */
    public void removeOperator(int index){
        operators.remove(index);
    }
    
    /**
     *
     * @param opd
     */
    public void addOperand(String opd){
        operands.add(opd);
    }
    
    /**
     *
     * @param opd
     * @param index
     */
    public void addOperand(String opd, int index){
        operands.add(index, opd);
    }
    
    /**
     *
     * @param opd
     */
    public void removeOperand(String opd){
        operands.remove(opd);
    }
    
    /**
     *
     * @param index
     */
    public void removeOperand(int index){
        operands.remove(index);
    }
    
    /**
     *
     * @return
     */
    public ArrayList<String> getOperands() {
        return operands;
    }

    /**
     *
     * @param operands
     */
    public void setOperands(ArrayList<String> operands) {
        this.operands = operands;
    }

    /**
     *
     * @return
     */
    public ArrayList<String> getOperators() {
        return operators;
    }

    /**
     *
     * @param operators
     */
    public void setOperators(ArrayList<String> operators) {
        this.operators = operators;
    }
    
    /**
     *
     * @return
     */
    public String getResult() {
        return result;
    }

    /**
     *
     * @param result
     */
    public void setResult(String result) {
        this.result = result;
    }
    
    /**
     *
     * @param op
     * @param precedence
     */
    public void addOperationInExecution(String op, Integer precedence){
        operationExecution.put(op, precedence);
    }
    
    /**
     *
     * @return
     */
    public HashMap<String, Integer> getOperationExecution(){
        return operationExecution;
    }
    
    /**
     *
     */
    public void clearOperators(){
        operators.clear();
    }
    
    /**
     *
     */
    public void clearOperands(){
        operands.clear();
    }
    
    /**
     *
     * @param index
     * @return
     */
    public String getOperand(int index){
        return operands.get(index);
    }
    
    /**
     *
     * @param index
     * @return
     */
    public String getOperator(int index){
        return operators.get(index);
    }
    
    /**
     *
     */
    public void clearAll(){
        operators.clear();
        operands.clear();
        operationExecution.clear();
        result = Constants.BLANK;
    }
}
