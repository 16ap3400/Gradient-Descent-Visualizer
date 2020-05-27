/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petersonalenfl;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Locale.Category;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

/**
 *
 * @author alexpeterson
 */
public class FXMLDocumentController extends Thread implements Initializable, PropertyChangeListener {
    @FXML
    private GridPane gpane;
    
    @FXML
    private AnchorPane anchorPane;
    
    @FXML
    private Menu visualizersMenu;
    
    @FXML
    private TextField field1;
    @FXML
    private TextField field2;
    @FXML
    private TextField field3;
    @FXML
    private TextField field4;
    @FXML
    private TextField field5;
    @FXML
    private TextField field6;
    @FXML
    private TextField field7;
    @FXML
    private TextField field8;
    
    @FXML
    private TextField bfield1;
    @FXML
    private TextField bfield2;
    @FXML
    private TextField bfield3;
    @FXML
    private TextField bfield4;
    @FXML
    private TextField bfield5;
    @FXML
    private TextField bfield6;
    @FXML
    private TextField bfield7;
    @FXML
    private TextField bfield8;
    
    @FXML
    private TextField cfield1;
    @FXML
    private TextField cfield2;
    @FXML
    private TextField cfield3;
    @FXML
    private TextField cfield4;
    @FXML
    private TextField cfield5;
    @FXML
    private TextField cfield6;
    @FXML
    private TextField cfield7;
    @FXML
    private TextField cfield8;
    
    @FXML
    private TextField dfield1;
    @FXML
    private TextField dfield2;
    @FXML
    private TextField dfield3;
    @FXML
    private TextField dfield4;
    @FXML
    private TextField dfield5;
    @FXML
    private TextField dfield6;
    @FXML
    private TextField dfield7;
    @FXML
    private TextField dfield8;
    
    @FXML
    private TextField efield1;
    @FXML
    private TextField efield2;
    @FXML
    private TextField efield3;
    @FXML
    private TextField efield4;
    @FXML
    private TextField efield5;
    @FXML
    private TextField efield6;
    @FXML
    private TextField efield7;
    @FXML
    private TextField efield8;
    
    @FXML
    private TextField ffield1;
    @FXML
    private TextField ffield2;
    @FXML
    private TextField ffield3;
    @FXML
    private TextField ffield4;
    @FXML
    private TextField ffield5;
    @FXML
    private TextField ffield6;
    @FXML
    private TextField ffield7;
    @FXML
    private TextField ffield8;
    
    @FXML
    private TextField gfield1;
    @FXML
    private TextField gfield2;
    @FXML
    private TextField gfield3;
    @FXML
    private TextField gfield4;
    @FXML
    private TextField gfield5;
    @FXML
    private TextField gfield6;
    @FXML
    private TextField gfield7;
    @FXML
    private TextField gfield8;
    
    @FXML
    private TextField hfield1;
    @FXML
    private TextField hfield2;
    @FXML
    private TextField hfield3;
    @FXML
    private TextField hfield4;
    @FXML
    private TextField hfield5;
    @FXML
    private TextField hfield6;
    @FXML
    private TextField hfield7;
    @FXML
    private TextField hfield8;
    
    @FXML
    private TextField ifield1;
    @FXML
    private TextField ifield2;
    @FXML
    private TextField ifield3;
    @FXML
    private TextField ifield4;
    @FXML
    private TextField ifield5;
    @FXML
    private TextField ifield6;
    @FXML
    private TextField ifield7;
    @FXML
    private TextField ifield8;
    

    
    
    
   
    
    @FXML
    private Menu xVariable;
    @FXML
    private Menu yVariable;
    @FXML
    private Menu algorithm;
    
    
    
    @FXML
    private TextField beta1;
    @FXML
    private TextField beta0;
    @FXML
    private TextField mse;
    @FXML
    private Text xvar;
    @FXML
    private Text yvar;
    @FXML
    private Text algorithmText;
    
    private ArrayList<VariableArray> xOptions;
    private ArrayList<VariableArray> yOptions;
    private VariableArray currentXOption;
    private VariableArray currentYOption;
    private ModelTools currentAlgorithm;
    private XYChart.Series series;
    
    VariableArray totalYards;
    VariableArray totalYardsPerGame;
    VariableArray passYards;
    VariableArray passYardsPerGame;
    VariableArray rushYards;
    VariableArray rushYardsPerGame;
    VariableArray points;
    VariableArray pointsPerGame;
    
    private double beta1val;
    private double beta0val;
        
    
    
    
    @FXML
    private Label label;
    
    @FXML
    public ScatterChart<?,?> sc;
    
    @FXML
    XYChart.Series series1;
    @FXML
    XYChart.Series series2;
    
    @FXML
    NumberAxis xAxis = new NumberAxis("Predictor", 0, 3, 0.25);
    
    @FXML
    NumberAxis yAxis = new NumberAxis("Response", 0, 3, 0.25);
   
    
    GetData var;
    
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        //may need to take this off to work
        
            System.out.println("FIRED PROPERTY CHANGE" + evt.getNewValue());
                     
            //setCharts(0,3,0.25,0,3,0.25);
//            System.out.println("CONFIRM ALTERATION" + (double) evt.getOldValue());
//            plotDuringGradient((double) evt.getOldValue(), (double) evt.getNewValue());
        
        //System.out.println("FIRED PROPERTY CHANGE" + evt.getNewValue());
                
    }
    
    @FXML
    private void runAlgorithm(ActionEvent event){
        
        try{
            currentAlgorithm.performGradientDescent(currentXOption.array, currentYOption.array, 1, 0);
        
            double cost;
            cost = currentAlgorithm.getCost(currentXOption.array, currentYOption.array);
            //thread this one to run later to avoid error
            Platform.runLater(() -> {
                mse.setText(Double.toString(cost));
                beta1.setText(Double.toString(currentAlgorithm.getBetaOne()));
                beta0.setText(Double.toString(currentAlgorithm.getBetaZero()));
                if (!sc.getData().isEmpty()){ 
                    sc.getData().clear();
                    anchorPane.getChildren().remove(sc);
                }
            });
            
            Platform.runLater(() -> {
                setCharts(0,3,0.25,0,3,0.25);
                //PlotData ne = new PlotData();
            
                plotFittedXY();
            });
        }catch(NullPointerException ex){
            System.out.println(ex);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
    @FXML
    private void clearChart(ActionEvent event){
        
        
        
        if (!sc.getData().isEmpty()){ 
            //sc.getData().remove((int)(Math.random()*(sc.getData().size()-1)));
            sc.getData().clear();
            anchorPane.getChildren().remove(sc);
            
        }
        
        //setCharts(1,500,50,1,50,10);
    }
    
    @FXML
    private void handleSetChartAction(ActionEvent event){
        
        //System.out.println("SC is NULL: " + (!sc.getData().isEmpty()));
        
//        if (!sc.getData().isEmpty()){ 
//            sc.getData().remove((int)(Math.random()*(sc.getData().size()-1)));
//        }
        
        try{
            System.out.println("X: " + currentXOption.getName() + currentXOption.array[1] + "Y: " + currentYOption.getName() + currentYOption.array[1]);
            setChart(currentXOption, currentYOption);
            plotXY(currentXOption, currentYOption);
        }catch(NullPointerException ex){
            System.out.println(ex);
        }catch(Exception ex){
            System.out.println(ex);
        }
        
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        setTeamNames(var);       
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        algorithmText.setText("Alorithm");
        
        var = new GetData();
        
        for(int i=0; i<var.n;i++){
            System.out.println("Points: " + var.points[i]);
        }
        
        totalYards = new VariableArray(var.totalYards, "Total Yards");
        totalYardsPerGame = new VariableArray(var.totalYardsPerGame, "Total Yards Per Game");
        passYards = new VariableArray(var.passYards, "Total Pass Yards");
        passYardsPerGame = new VariableArray(var.passYardsPerGame, "Pass Yards Per Game");
        rushYards = new VariableArray(var.rushYards, "Total Rush Yards");
        rushYardsPerGame = new VariableArray(var.rushYardsPerGame, "Rush Yards Per Game");
        points = new VariableArray(var.points, "Total Points");
        pointsPerGame = new VariableArray(var.pointsPerGame, "Points Per Game");
        
        xOptions = new ArrayList<VariableArray>();
        xOptions.add(totalYards);
        xOptions.add(totalYardsPerGame);
        xOptions.add(passYards);
        xOptions.add(passYardsPerGame);
        xOptions.add(rushYards);
        xOptions.add(rushYardsPerGame);
        xOptions.add(points);
        xOptions.add(pointsPerGame);
        
        yOptions = new ArrayList<VariableArray>();
        yOptions.add(totalYards);
        yOptions.add(totalYardsPerGame);
        yOptions.add(passYards);
        yOptions.add(passYardsPerGame);
        yOptions.add(rushYards);
        yOptions.add(rushYardsPerGame);
        yOptions.add(points);
        yOptions.add(pointsPerGame);
        
        for (VariableArray xOption : xOptions) {
            MenuItem menuItem = new MenuItem(xOption.getName());
            menuItem.setUserData(xOption);
            menuItem.setOnAction((ActionEvent event) -> {
                selectXOption(event);
            });
            xVariable.getItems().add(menuItem);
        }
        
        currentXOption = xOptions.get(0);
        System.out.println("Current X Option is: " + currentXOption.getName());
        xvar.setText(currentXOption.getName());
        
        for (VariableArray yOption : yOptions) {
            MenuItem menuItem = new MenuItem(yOption.getName());
            menuItem.setUserData(yOption);
            menuItem.setOnAction((ActionEvent event) -> {
                selectYOption(event);
            });
            yVariable.getItems().add(menuItem);
        }
        
        currentYOption = yOptions.get(0);
        System.out.println("Current Y Option is: " + currentYOption.getName());
        yvar.setText(currentYOption.getName());
        
        LinearRegression linmod = new LinearRegression(currentXOption.array, currentYOption.array);
        
        ArrayList<ModelTools> algorithmList = new ArrayList<ModelTools>();
        algorithmList.add(linmod);
        //algorithmList.add();
        for (ModelTools algorithms : algorithmList) {
            MenuItem menuItem = new MenuItem(algorithms.getName());
            menuItem.setUserData(algorithms);
            menuItem.setOnAction((ActionEvent event) -> {
                selectAlgorithm(event);
            });
            algorithm.getItems().add(menuItem);
        }
        
        currentAlgorithm = algorithmList.get(0);
        System.out.println("Current Algorithm is: " + currentAlgorithm.getName());
        algorithmText.setText(currentAlgorithm.getName());
        currentAlgorithm.addPropertyChangeListener(this);
    }
    
    public void selectAlgorithm(ActionEvent event){
        MenuItem menuItem = (MenuItem) event.getSource();
        ModelTools algorithms = (ModelTools) menuItem.getUserData();
        changeAlgorithm(algorithms);
    }
    
    @FXML
    public void selectXOption(ActionEvent event){
        MenuItem menuItem = (MenuItem) event.getSource();
        VariableArray xOption = (VariableArray) menuItem.getUserData();
        changeXVariable(xOption);
    }
    
    @FXML
    public void selectYOption(ActionEvent event){
        MenuItem menuItem = (MenuItem) event.getSource();
        VariableArray yOption = (VariableArray) menuItem.getUserData();
        changeYVariable(yOption);
    }
    
    private void changeXVariable(VariableArray xOption) {
//        if (currentXOption != null) {
//            currentXOption.end();
//        }
        currentXOption = xOption;
        System.out.println("Current X Option is: " + currentXOption.getName());
        xvar.setText(currentXOption.getName()); 
        //xAxis.setLabel(currentXOption.getName());
    }
    
    private void changeAlgorithm(ModelTools alg){
        currentAlgorithm = alg;
        System.out.println("Current Algorithm is: " + currentAlgorithm.getName());
        algorithmText.setText(currentAlgorithm.getName());
    }
    
    private void changeYVariable(VariableArray yOption) {
//        if (currentYOption != null) {
//            currentYOption.end();
//        }
        currentYOption = yOption;
        System.out.println("Current Y Option is: " + currentYOption.getName());
        yvar.setText(currentYOption.getName()); 
        //yAxis.setLabel(currentYOption.getName());
    }
    
    
    

    
    public void setChart(VariableArray x, VariableArray y){
        // FUNCTIONS NEED TO BE CREATED
        double xLow = findMin(x.array);
        double xHigh = findMax(x.array);
        double stepX = (xHigh - xLow)/10;
        double yLow = findMin(y.array);
        double yHigh = findMax(y.array);
        double stepY = (yHigh - yLow)/10;
        
        xLow =  xLow - stepX;
        xHigh = xHigh + stepX;
        yLow =  yLow - stepY;
        yHigh = yHigh + stepY;
        
        //setCharts(xLow,xHigh,stepX,yLow,yHigh,stepY);
        setCharts(0,3,0.25,0,3,0.25);
    }
//@Reference https://docs.oracle.com/javase/8/javafx/user-interface-tutorial/scatter-chart.htm#CIHDEACI
    public void setCharts(double xLow,double xHigh, double stepX, double yLow, double yHigh, double stepY){
        //clearChart();
        yAxis.setLabel(currentYOption.getName());
        xAxis.setLabel(currentXOption.getName());
        //final NumberAxis xAxis = new NumberAxis(xLow, xHigh, stepX);
        //final NumberAxis yAxis = new NumberAxis(yLow, yHigh, stepY);        
        sc = new ScatterChart<>(xAxis,yAxis);
        //xAxis.setLabel("Predictor");                
        //yAxis.setLabel("Response");
        //sc.setTitle("Points vs. Yards");
        sc.setLayoutX(510);
        sc.setLayoutY(390);
        
        
        //series1.setName("Season2019");
        
        anchorPane.getChildren().add(sc);
    }
    
    public void plotDuringGradient(double beta1, double beta0){
        
        series = new XYChart.Series();
        series2 = new XYChart.Series();
        
        for(int i=0;i<currentXOption.array.length;i++){  
            double a = currentXOption.array[i];
            double b = currentYOption.array[i];
            //System.out.println("VALUES INSIDE FUNCTION::: " + a + "::: " + b);
            series.getData().add(new XYChart.Data<>(a, b));
        }
        
        for(int i=0;i<currentXOption.array.length;i++){
            double a = currentXOption.array[i];
            double b = (beta1 * a) + beta0;
            series2.getData().add(new XYChart.Data<>(a,b));
        }
        //System.out.println("Series consists of: " + series.dataProperty());      
        Platform.runLater(() -> {
            sc.getData().addAll(series, series2);
        });
        
        
        

//anchorPane.getChildren().add(sc);
    }
    
    public void plotFittedXY(){
        
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
        Platform.runLater(() -> {
            sc.getData().addAll(series, series2);
        });
        
     
        //anchorPane.getChildren().add(sc);
    }
    
    public void plotXY(VariableArray x, VariableArray y){
        
        series = new XYChart.Series();
        
        for(int i=0;i<x.array.length;i++){  
            double a = x.array[i];
            double b = y.array[i];
            System.out.println("VALUES INSIDE FUNCTION::: " + a + "::: " + b);
            series.getData().add(new XYChart.Data<>(a, b));
        }
        //System.out.println("Series consists of: " + series.dataProperty());      
        Platform.runLater(() -> {
            sc.getData().addAll(series);
        });
        
        //anchorPane.getChildren().add(sc);
    }
    
    
    public double findMin(double[] x){
        double min = x[1];
       
        for(int i = 0;i<x.length;i++){
            if(x[i] < min){
                min = x[i];
            }
        }
                
        return min;
    }
    
    public double findMax(double[] x){
        double max = x[1];
       
        for(int i = 0;i<x.length;i++){
            if(x[i] > max){
                max = x[i];
            }
        }
                
        return max;
    }
    
    public void setTeamNames(GetData var){
        try{
            gpane.setRowIndex(field1,0);
        gpane.setColumnIndex(field1,0);
        
        gpane.setRowIndex(field2,1);
        gpane.setColumnIndex(field2,0);
        
        gpane.setRowIndex(field3,2);
        gpane.setColumnIndex(field3,0);
        
        gpane.setRowIndex(field4,3);
        gpane.setColumnIndex(field4,0);
        
        gpane.setRowIndex(field5,4);
        gpane.setColumnIndex(field5,0);
        
        gpane.setRowIndex(field6,5);
        gpane.setColumnIndex(field6,0);
        
        gpane.setRowIndex(field7,6);
        gpane.setColumnIndex(field7,0);
        
        gpane.setRowIndex(field8,7);
        gpane.setColumnIndex(field8,0);
        
//        gpane.setRowIndex(field9,8);
//        gpane.setColumnIndex(field9,0);
//        
//        gpane.setRowIndex(field10,9);
//        gpane.setColumnIndex(field10,0);
//        
//        gpane.setRowIndex(field11,10);
//        gpane.setColumnIndex(field11,0);
//        
//        gpane.setRowIndex(field12,11);
//        gpane.setColumnIndex(field12,0);
//        
//        gpane.setRowIndex(field13,12);
//        gpane.setColumnIndex(field13,0);
//        
//        gpane.setRowIndex(field14,13);
//        gpane.setColumnIndex(field14,0);
//        
//        gpane.setRowIndex(field15,14);
//        gpane.setColumnIndex(field15,0);
//        
//        gpane.setRowIndex(field16,15);
//        gpane.setColumnIndex(field16,0);
//        
//        gpane.setRowIndex(field17,16);
//        gpane.setColumnIndex(field17,0);
//        
//        gpane.setRowIndex(field18,17);
//        gpane.setColumnIndex(field18,0);
//        
//        gpane.setRowIndex(field19,18);
//        gpane.setColumnIndex(field19,0);
//        
//        gpane.setRowIndex(field20,19);
//        gpane.setColumnIndex(field20,0);
//        
//        gpane.setRowIndex(field21,20);
//        gpane.setColumnIndex(field21,0);
//        
//        gpane.setRowIndex(field22,21);
//        gpane.setColumnIndex(field22,0);
//        
//        gpane.setRowIndex(field23,22);
//        gpane.setColumnIndex(field23,0);
//        
//        gpane.setRowIndex(field24,23);
//        gpane.setColumnIndex(field24,0);
//        
//        gpane.setRowIndex(field25,24);
//        gpane.setColumnIndex(field25,0);
//        
//        gpane.setRowIndex(field26,25);
//        gpane.setColumnIndex(field26,0);
//        
//        gpane.setRowIndex(field27,26);
//        gpane.setColumnIndex(field27,0);
//        
//        gpane.setRowIndex(field28,27);
//        gpane.setColumnIndex(field28,0);
//        
//        gpane.setRowIndex(field29,28);
//        gpane.setColumnIndex(field29,0);
//        
//        gpane.setRowIndex(field30,29);
//        gpane.setColumnIndex(field30,0);
//        
//        gpane.setRowIndex(field31,30);
//        gpane.setColumnIndex(field31,0);
        //LinearRegression linmod = new LinearRegression(var.x1, var.y1);
        Platform.runLater(() -> {
            field1.setText((GetData.teamList.get(0).team));
        field2.setText((GetData.teamList.get(2).team));
        field3.setText((GetData.teamList.get(3).team));
        field4.setText((GetData.teamList.get(4).team));
        field5.setText((GetData.teamList.get(5).team));
        field6.setText((GetData.teamList.get(6).team));
        field7.setText((GetData.teamList.get(7).team));
        field8.setText((GetData.teamList.get(8).team));
                
        bfield1.setText(Double.toString(GetData.teamList.get(1).totalYards));
        bfield2.setText(Double.toString(GetData.teamList.get(2).totalYards));
        bfield3.setText(Double.toString(GetData.teamList.get(3).totalYards));
        bfield4.setText(Double.toString(GetData.teamList.get(4).totalYards));
        bfield5.setText(Double.toString(GetData.teamList.get(5).totalYards));
        bfield6.setText(Double.toString(GetData.teamList.get(6).totalYards));
        bfield7.setText(Double.toString(GetData.teamList.get(7).totalYards));
        bfield8.setText(Double.toString(GetData.teamList.get(8).totalYards));
        
        cfield1.setText(Double.toString(GetData.teamList.get(1).totalYardsPerGame));
        cfield2.setText(Double.toString(GetData.teamList.get(2).totalYardsPerGame));
        cfield3.setText(Double.toString(GetData.teamList.get(3).totalYardsPerGame));
        cfield4.setText(Double.toString(GetData.teamList.get(4).totalYardsPerGame));
        cfield5.setText(Double.toString(GetData.teamList.get(5).totalYardsPerGame));
        cfield6.setText(Double.toString(GetData.teamList.get(6).totalYardsPerGame));
        cfield7.setText(Double.toString(GetData.teamList.get(7).totalYardsPerGame));
        cfield8.setText(Double.toString(GetData.teamList.get(8).totalYardsPerGame));
       
        dfield1.setText(Double.toString(GetData.teamList.get(1).passYards));
        dfield2.setText(Double.toString(GetData.teamList.get(2).passYards));
        dfield3.setText(Double.toString(GetData.teamList.get(3).passYards));
        dfield4.setText(Double.toString(GetData.teamList.get(4).passYards));
        dfield5.setText(Double.toString(GetData.teamList.get(5).passYards));
        dfield6.setText(Double.toString(GetData.teamList.get(6).passYards));
        dfield7.setText(Double.toString(GetData.teamList.get(7).passYards));
        dfield8.setText(Double.toString(GetData.teamList.get(8).passYards));
        
        efield1.setText(Double.toString(GetData.teamList.get(1).passYardsPerGame));
        efield2.setText(Double.toString(GetData.teamList.get(2).passYardsPerGame));
        efield3.setText(Double.toString(GetData.teamList.get(3).passYardsPerGame));
        efield4.setText(Double.toString(GetData.teamList.get(4).passYardsPerGame));
        efield5.setText(Double.toString(GetData.teamList.get(5).passYardsPerGame));
        efield6.setText(Double.toString(GetData.teamList.get(6).passYardsPerGame));
        efield7.setText(Double.toString(GetData.teamList.get(7).passYardsPerGame));
        efield8.setText(Double.toString(GetData.teamList.get(8).passYardsPerGame));
       
        ffield1.setText(Double.toString(GetData.teamList.get(1).rushYards));
        ffield2.setText(Double.toString(GetData.teamList.get(2).rushYards));
        ffield3.setText(Double.toString(GetData.teamList.get(3).rushYards));
        ffield4.setText(Double.toString(GetData.teamList.get(4).rushYards));
        ffield5.setText(Double.toString(GetData.teamList.get(5).rushYards));
        ffield6.setText(Double.toString(GetData.teamList.get(6).rushYards));
        ffield7.setText(Double.toString(GetData.teamList.get(7).rushYards));
        ffield8.setText(Double.toString(GetData.teamList.get(8).rushYards));
       
        gfield1.setText(Double.toString(GetData.teamList.get(1).rushYardsPerGame));
        gfield2.setText(Double.toString(GetData.teamList.get(2).rushYardsPerGame));
        gfield3.setText(Double.toString(GetData.teamList.get(3).rushYardsPerGame));
        gfield4.setText(Double.toString(GetData.teamList.get(4).rushYardsPerGame));
        gfield5.setText(Double.toString(GetData.teamList.get(5).rushYardsPerGame));
        gfield6.setText(Double.toString(GetData.teamList.get(6).rushYardsPerGame));
        gfield7.setText(Double.toString(GetData.teamList.get(7).rushYardsPerGame));
        gfield8.setText(Double.toString(GetData.teamList.get(8).rushYardsPerGame));
        
        hfield1.setText(Double.toString(GetData.teamList.get(1).points));
        hfield2.setText(Double.toString(GetData.teamList.get(2).points));
        hfield3.setText(Double.toString(GetData.teamList.get(3).points));
        hfield4.setText(Double.toString(GetData.teamList.get(4).points));
        hfield5.setText(Double.toString(GetData.teamList.get(5).points));
        hfield6.setText(Double.toString(GetData.teamList.get(6).points));
        hfield7.setText(Double.toString(GetData.teamList.get(7).points));
        hfield8.setText(Double.toString(GetData.teamList.get(8).points));
        
        ifield1.setText(Double.toString(GetData.teamList.get(1).pointsPerGame));
        ifield2.setText(Double.toString(GetData.teamList.get(2).pointsPerGame));
        ifield3.setText(Double.toString(GetData.teamList.get(3).pointsPerGame));
        ifield4.setText(Double.toString(GetData.teamList.get(4).pointsPerGame));
        ifield5.setText(Double.toString(GetData.teamList.get(5).pointsPerGame));
        ifield6.setText(Double.toString(GetData.teamList.get(6).pointsPerGame));
        ifield7.setText(Double.toString(GetData.teamList.get(7).pointsPerGame));
        ifield8.setText(Double.toString(GetData.teamList.get(8).pointsPerGame));
        });
     }catch(NullPointerException ex){
            System.out.println(ex);
     }catch(Exception ex){
            System.out.println(ex);
     }
        
        
        
        
        
    }

    
    
}
