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
public interface LearningAlgorithm {
    
    public void performGradientDescent(double[] x, double[] y, double beta1val, double beta0val);
    
    public double getCost(double[] x, double[] y);
    
    public double[] getX();
    
    public double[] getY();
    
    public double getMSE();
    
    public double getBetaOne();
    
    public double getBetaZero();
    
    public String getName();
    
    //public double[] predictY(double[] x, double beta1, double beta0);
    
    
}
