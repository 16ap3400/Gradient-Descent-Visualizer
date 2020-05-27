/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petersonalenfl;

/**
 *
 * @author alexpeterson
 */
public class VariableArray {
    double[] array;
    private String name;
    
    public VariableArray(double[] x, String name){
        array = x;
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void end(){
        //do nothing
    }
}
