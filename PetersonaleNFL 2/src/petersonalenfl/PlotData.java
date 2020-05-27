/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petersonalenfl;

import java.beans.PropertyChangeSupport;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;

/**
 *
 * @author alexpeterson
 */
public class PlotData {
    
    
    private XYChart.Series series;
    private XYChart.Series series2;
        
    public PlotData(Object sourceBean) {
       

    }
    
    
    
    public ScatterChart plotFittedXY(ScatterChart sc, LearningAlgorithm currentAlgorithm, VariableArray currentXOption, VariableArray currentYOption){
        
        series = new XYChart.Series();
        series2 = new XYChart.Series();
        
        for(int i=0;i<currentXOption.array.length;i++){  
            double a = currentXOption.array[i];
            double b = currentYOption.array[i];
            System.out.println("VALUES INSIDE FUNCTION::: " + a + "::: " + b);
            series.getData().add(new XYChart.Data<>(a, b));
        }
        
        for(int i=0;i<currentAlgorithm.getX().length;i++){
            double a = currentAlgorithm.getX()[i];
            double b = (currentAlgorithm.getBetaOne() * a) + currentAlgorithm.getBetaZero();
            series2.getData().add(new XYChart.Data<>(a,b));
        }
        //System.out.println("Series consists of: " + series.dataProperty());      
        sc.getData().addAll(series, series2);
        return(sc);
        //anchorPane.getChildren().add(sc);
    }
    
    public ScatterChart plotXY(ScatterChart sc, VariableArray currentXOption, VariableArray currentYOption){
        
        series = new XYChart.Series();
        
        for(int i=0;i<currentXOption.array.length;i++){  
            double a = currentXOption.array[i];
            double b = currentYOption.array[i];
            //System.out.println("VALUES INSIDE FUNCTION::: " + a + "::: " + b);
            series.getData().add(new XYChart.Data<>(a, b));
        }
        //System.out.println("Series consists of: " + series.dataProperty());      
        sc.getData().addAll(series);
        return(sc);
        //anchorPane.getChildren().add(sc);
    }
    
}
