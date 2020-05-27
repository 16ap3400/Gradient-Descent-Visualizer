/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petersonalenfl;

import static java.lang.Math.sqrt;
import java.util.ArrayList;

/**
 *
 * @author alexpeterson
 */
public class LinearRegression extends ModelTools implements LearningAlgorithm{
    
    private String name = "Linear Regression";
    
    double[] x;
    double[] y;
    
    private double a1;
    private double a0;
   
    private double costMSE;
    int n;
    
    private double sumSectionA1 = 0;
    private double sumSectionA0 = 0;
    
    public LinearRegression(double[] x, double[] y){
        this.x = x;
        this.y = y;
        this.a1 = 1;
        this.a0 = 1;
    }
    
    @Override
    public double[] getX(){
        return normalize(x);
    }
    
    @Override
    public double[] getY(){
        return normalize(y);
    }
    
    @Override
    public String getName(){
        return this.name;
    }
    
    @Override
    public double getMSE(){
        return this.costMSE;
    }
    
    @Override
    public double getBetaOne(){
        return this.a1;
    }
    
    @Override
    public double getBetaZero(){
        return this.a0;
    }

@Override    
public void performGradientDescent(double[] x1,double[] y1, double beta1val, double beta0val){
    n = x.length;
    double theta1 = beta1val;
    double theta0 = beta0val;
    double yPredicted;
    double learningRate = 0.01;
    double multiplier;
    double epochs = 5; //iterations of gradient descent to perform.
    
    //Normalize
    x = normalize(x1);
    y = normalize(y1);
    
    for(int j=0;j<epochs;j++){
        System.out.println("ITERATION: " + j);
        sumSectionA1 = 0;
        sumSectionA0 = 0;
        for(int i=0;i<x.length;i++){
            
            yPredicted = ((theta1 * x[i]) + theta0);
            sumSectionA1 += (x[i] * (yPredicted - y[i]));
            System.out.println("Sum before being applied to learning rate: " + x[i] + " * " + "( " + yPredicted + " - " + y[i] + " )");
            System.out.println("Is equal to: " + sumSectionA1);
            sumSectionA0 += (yPredicted - y[i]);  
            
            
        }
        multiplier = learningRate;
        System.out.println("Multiplier: " + multiplier + "  N: " + n);
        theta1 = theta1 - (multiplier * (sumSectionA1/n));
        theta0 = theta0 - (multiplier * (sumSectionA0/n));
        System.out.println("Beta 1:"+ theta1 + " - "+ theta0 + "\n");   
     
        System.out.println("Beta 1: "+ theta1 + "Y intercept: "+ theta0 + "\n");   
        a1 = theta1;
        a0 = theta0;
        firePropertyChange("Gradient", theta1, theta0);
    }
    
    
    
}

//    private double[] normalize(double[] x){
//        double sum = 0;
//        double mean;
//        double sd;
//        
//        for(int i=0;i<x.length;i++){
//            sum += x[i];
//        }
//        
//        mean = sum/x.length;
//        
//        double sumResidualSquared = 0;
//        for(int i=0;i<x.length;i++){
//            sumResidualSquared += (x[i] - mean) * (x[i] - mean);
//        }
//        
//        sd = sqrt(sumResidualSquared/x.length);
//        
//        double[] normX = new double[x.length];
//        for(int i=0;i<x.length;i++){
//            normX[i] = (x[i] - mean)/sd;
//        }
//        
//        return normX;
//    }
    

@Override
public double getCost(double[] x, double[] y){
    double sumResult = 0; //store the sum of squared residuals
    double yPredicted = 0; //store predicted value
    
    for(int i=0;i<x.length;i++){
        yPredicted = ((a1 * x[i]) + a0);
        sumResult += ((y[i] - yPredicted) * (y[i] - yPredicted));
    }
    
    costMSE = (yPredicted/n); //Calculate MSE
    return costMSE;
}
/*
public void calculateRSquared(double[] x, double[] y){
    double sumDenominator = 0;
    double sumNumerator = 0;
    double yPredicted = 0;
    double yMean = 0;
    
    
    
    for(int i=0;i<x.length;i++){
        yPredicted = ((a1 * x[i]) + a0);
        sumDenominator =+ (y[i] - yPredicted) * (y[i] - yPredicted);
    }
}*/
    
}
