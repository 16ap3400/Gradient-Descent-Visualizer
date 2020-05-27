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
public class NeuralNetwork extends LinearRegression {
    
    private String name = "Polynomial Regression";
    
    double[] x;
    double[] y;
    
    private double a1;
    private double a0;
   
    private double costMSE;
    int n;
    
    private double sumSectionA1 = 0;
    private double sumSectionA0 = 0;
    
    public NeuralNetwork(double[] x, double[] y) {
        super(x, y);
    }
    
    @Override
    public void performGradientDescent(double[] x1,double[] y1, double beta1val, double beta0val){
    n = x.length;
    double theta1 = beta1val;
    double theta0 = beta0val;
    double theta2 = 1;
    double[] x2 = new double[n];
    for(int i=0;i<n;i++){
        x2[i] = (x1[i] * x1[i]);
    }
    double yPredicted;
    double learningRate = 0.01;
    double multiplier;
    double epochs = 5; //iterations of gradient descent to perform.
    
    //Normalize
    x2 = normalize(x2);
    x = normalize(x1);
    y = normalize(y1);
    
    for(int j=0;j<epochs;j++){
        System.out.println("ITERATION: " + j);
        sumSectionA1 = 0;
        sumSectionA0 = 0;
        for(int i=0;i<x.length;i++){
            
            yPredicted = ((theta2 * x2[i]) + (theta1 * x[i]) + theta0);
            sumSectionA1 += (x[i] * (yPredicted - y[i]));
            System.out.println("Sum before being applied to learning rate: " + x[i] + " * " + "( " + yPredicted + " - " + y[i] + " )");
            System.out.println("Is equal to: " + sumSectionA1);
            sumSectionA0 += (yPredicted - y[i]);  
            
            
        }
        multiplier = learningRate;
        System.out.println("Multiplier: " + multiplier + "  N: " + n);
        theta2 = theta1 - (multiplier * (sumSectionA1/n));
        theta1 = theta0 - (multiplier * (sumSectionA0/n));
        System.out.println("Beta 1:"+ theta1 + " - "+ theta0 + "\n");   
     
        System.out.println("Beta 1: "+ theta1 + "Y intercept: "+ theta0 + "\n");   
        a1 = theta1;
        a0 = theta0;
        firePropertyChange("Gradient", theta1, theta0);
    }
    
    
    
}
    
}
