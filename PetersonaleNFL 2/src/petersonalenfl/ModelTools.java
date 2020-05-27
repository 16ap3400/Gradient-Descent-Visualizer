/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petersonalenfl;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import static java.lang.Math.sqrt;

/**
 *
 * @author alexpeterson
 */
public abstract class ModelTools {
    public abstract void performGradientDescent(double[] x, double[] y, double beta1val, double beta0val);
    
    public abstract double getCost(double[] x, double[] y);
    
    public abstract double[] getX();
    
    public abstract double[] getY();
    
    public abstract double getMSE();
    
    public abstract double getBetaOne();
    
    public abstract double getBetaZero();
    
    public abstract String getName();
    
    
    protected double[] normalize(double[] x){
        double sum = 0;
        double mean;
        double sd;
        
        for(int i=0;i<x.length;i++){
            sum += x[i];
        }
        
        mean = sum/x.length;
        
        double sumResidualSquared = 0;
        for(int i=0;i<x.length;i++){
            sumResidualSquared += (x[i] - mean) * (x[i] - mean);
        }
        
        sd = sqrt(sumResidualSquared/x.length);
        
        double[] normX = new double[x.length];
        for(int i=0;i<x.length;i++){
            normX[i] = (x[i] - mean)/sd;
        }
        
        return normX;
    }
    
    protected double[] predictY(double[] x, double beta1, double beta0){
        double[] yPredicted = new double[x.length];
        
        for(int i=0;i<x.length;i++){
            yPredicted[i] = (beta1 * x[i]) + beta0;
        }
        
        return yPredicted;
    }
    
    protected PropertyChangeSupport propertyChangeSupport;
    
    public ModelTools(){
        propertyChangeSupport = new PropertyChangeSupport(this);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener){
        propertyChangeSupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener){
        propertyChangeSupport.removePropertyChangeListener(listener);
    }
    
    public void firePropertyChange(String propertyName, Object oldValue, Object newValue){
        propertyChangeSupport.firePropertyChange(propertyName, oldValue, newValue);
    }
}
