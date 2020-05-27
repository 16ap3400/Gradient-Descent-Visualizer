/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petersonalenfl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexpeterson
 */
public class GetData extends ModelTools {
    public static ArrayList<BoxScore> teamList = new ArrayList<BoxScore>();
    
    public String[] team;
    public int n;
    public double[] totalYards;
    public double[] totalYardsPerGame;
    public double[] passYards;
    public double[] passYardsPerGame;
    public double[] rushYards;
    public double[] rushYardsPerGame;
    public double[] points;
    public double[] pointsPerGame;
    
    //BoxScore b = new BoxScore("Arizona Cardinals",16,6904.0,431.5,4751.0,296.9,2153.0,134.6,434.0,27.1);
    
    public GetData(){
        teamList.add(new BoxScore("Arizona Cardinals", 16, 5467, 341.7, 3477, 217.3,1990, 124.4, 361, 22.6));
        teamList.add(new BoxScore("Atlanta Falcons", 16, 6075, 379.7, 4714, 294.6,1361, 85.1, 381, 23.8));
        teamList.add(new BoxScore("Baltimore Ravens", 16, 6521, 407.6, 3225, 201.6, 3296.0, 206.0, 531, 33.2));
        teamList.add(new BoxScore("Buffalo Bills", 16, 5283, 330.2, 3229, 201.8, 2054, 128.4, 314, 19.6));
        teamList.add(new BoxScore("Carolina Panthers", 16, 5469, 341.8, 3650, 228.1, 1819, 113.7, 340, 21.3));
        teamList.add(new BoxScore("Chicago Bears", 16, 4749, 296.8, 3291, 205.7, 1458, 91.1, 280, 17.5));
        teamList.add(new BoxScore("Cincinatti Bengals", 16, 5169, 323.1, 3652, 228.3, 1517, 94.8, 279, 17.4));
        teamList.add(new BoxScore("Cleveland Browns", 16, 5455, 340.9, 3554, 222.1, 1901, 118.8, 335, 20.9));
        teamList.add(new BoxScore("Dallas Cowboys", 16, 6904.0, 431.5, 4751.0, 296.9, 2153.0, 134.6, 434.0, 27.1));
        teamList.add(new BoxScore("Denver Broncos", 16, 4777, 298.6, 3115, 194.7, 1662, 103.9, 282, 17.6));
        teamList.add(new BoxScore("Detroit Lions", 16, 5549, 346.8, 3900, 243.8, 1649, 103.1, 341, 21.3));
        teamList.add(new BoxScore("Green Bay Packers", 16, 5528, 345.5, 3733, 233.3, 1795, 112.2, 376, 23.5));
        teamList.add(new BoxScore("Houston Texans", 16, 5792, 362, 3783, 236.4, 2009, 125.6, 378, 23.6));
        teamList.add(new BoxScore("Indianpolis Colts", 16, 5238, 327.4, 3108, 194.3, 2130, 133.1, 361, 22.6));
        teamList.add(new BoxScore("Jacksonville Jaguars", 16, 5468, 341.8, 3760, 235, 1708, 106.8, 300, 18.8));
        teamList.add(new BoxScore("Kansas City Chiefs", 16, 6067, 379.2, 4498, 281.1, 1569, 98.1, 451, 28.2));
        teamList.add(new BoxScore("Los Angeles Chargers", 16, 5879, 367.4, 4426, 276.6, 1453, 90.8, 337, 21.1));
        teamList.add(new BoxScore("Los Angeles Rams", 16, 5998, 374.9, 4499, 281.2, 1499, 93.7, 394, 24.6));
        teamList.add(new BoxScore("Miami Dolphins", 16, 4960, 310, 3804, 237.8, 1156, 72.3, 306, 19.1));
        teamList.add(new BoxScore("Minnesota Vikings", 16, 5656, 353.5, 3523, 220.2, 2133, 133.3, 407, 25.4));
        teamList.add(new BoxScore("New England Patriots", 16, 5664, 354, 3961, 247.6, 1703, 106.4, 420, 26.3));
        teamList.add(new BoxScore("New Orleans Saints", 16, 5982, 373.9, 4244, 265.3, 1738, 108.6, 458, 28.6));
        teamList.add(new BoxScore("New York Giants", 16, 5416, 338.5, 3731, 233.2, 1685, 105.3, 341, 21.3));
        teamList.add(new BoxScore("New York Jets", 16, 4368, 273, 3111, 194.4, 1257, 78.6, 276, 17.3));
        teamList.add(new BoxScore("Oakland Raiders", 16, 5819, 363.7, 3926, 245.4, 1893, 118.3, 313, 19.6));
        teamList.add(new BoxScore("Philadelphia Eagles", 16, 5772, 360.8, 3833, 239.6, 1939, 121.2, 385, 24.1));
        teamList.add(new BoxScore("Pittsburgh Steelers", 16, 4428, 276.8, 2981, 186.3, 1447, 90.4, 289, 18.1));
        teamList.add(new BoxScore("San Fransisco 49ers", 16, 6097, 381.1, 3792, 237.0, 2305, 144.1, 479, 29.9));
        teamList.add(new BoxScore("Seattle Seahawks", 16, 5991, 374.4, 3791, 236.9, 2200, 137.5, 405, 25.3));
        teamList.add(new BoxScore("Tampa Bay Buccaneers", 16, 6366, 397.9, 4845, 302.8, 1521, 95.1, 458, 28.6));
        teamList.add(new BoxScore("Tennessee Titans", 16, 5805, 362.8, 3582, 223.9, 2223, 138.9, 402, 25.1));
        teamList.add(new BoxScore("Washington Redskins", 16, 4395, 274.7, 2812, 175.8, 1583, 98.9, 266, 16.6));
        //for(int i=0;i < teamList.size();i++){
        //    System.out.println(teamList.get(i).team + teamList.get(i).pointsPerGame + teamList.get(i).totalYardsPerGame);
        //}
        int n;
        n = teamList.size();
        team = new String[n];
        totalYards = new double[n];
        totalYardsPerGame = new double[n];
        passYards = new double[n];
        passYardsPerGame = new double[n];
        rushYards = new double[n];
        rushYardsPerGame = new double[n];
        
        points = new double[n];
        pointsPerGame = new double[n];
        
        
        
        for(int i=0;i<n;i++){
            System.out.println("Points = " + teamList.get(i).points);
             
            this.totalYards[i] = teamList.get(i).totalYards;
            this.totalYardsPerGame[i] = teamList.get(i).totalYardsPerGame;
            this.passYards[i] = teamList.get(i).passYards;
            this.passYardsPerGame[i] = teamList.get(i).passYardsPerGame;
            this.rushYards[i] = teamList.get(i).rushYards;
            this.rushYardsPerGame[i] = teamList.get(i).rushYardsPerGame;
            this.points[i] = teamList.get(i).points;
            this.pointsPerGame[i] = teamList.get(i).pointsPerGame;
            this.team[i] = teamList.get(i).team;
        }
        
        this.totalYards = normalize(this.totalYards);
        this.totalYardsPerGame = normalize(this.totalYardsPerGame);
        this.passYards = normalize(this.passYards);
        this.passYardsPerGame = normalize(this.passYardsPerGame);
        this.rushYards = normalize(this.rushYards);
        this.rushYardsPerGame = normalize(this.rushYardsPerGame);
        this.points = normalize(this.points);
        this.pointsPerGame = normalize(this.pointsPerGame);
        
        
        
    }

    @Override
    public void performGradientDescent(double[] x, double[] y, double beta1val, double beta0val) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getCost(double[] x, double[] y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double[] getX() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double[] getY() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getMSE() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getBetaOne() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getBetaZero() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}    
 
    
    /*public GetData(){
        
        System.out.println(Paths.get("/Users/AlexPeterson/Documents/3330ObjectOrientedProgramming/data/data2019.csv"));
        
        
        scanCSV("/Users/AlexPeterson/Documents/3330ObjectOrientedProgramming/data/data2019.csv");
        
        //print all lines read from csv file
        for(BoxScore b : statList){
            System.out.println(b);
        }
    }
    
    public void scanCSV(String fileName){
        try {
            ArrayList list = new ArrayList();
            Scanner sc = new Scanner(new File(fileName));
            sc.useDelimiter(",");
            //int c = 0;
            while(sc.hasNext()){
                list.add(sc.next());
                if(sc.next() instanceof String){
                    //System.out.println(sc.next());
                }else{
                    //list[c] = (sc.next()).next();
                }
                
                //System.out.println(sc.next());
            }
            sc.close();
            
            for(int i = 1; i<list.size(); i++){
                System.out.println(list.get(i));
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GetData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    
    public ArrayList<BoxScore> readCSV(String fileName){
        ArrayList<BoxScore> stats = new ArrayList<BoxScore>();
        Path pathToFile = Paths.get(fileName);
         // Buffered reader
        try (BufferedReader br = Files.newBufferedReader(pathToFile)) { // read the first line from the text file 
            String line = br.readLine(); 
            // loop until all lines are read 
            while (line != null) { 
                // use string.split to load a string array with the values from 
                // each line of 
                // the file, using a comma as the delimiter 
                String[] attributes = line.split(","); 
                BoxScore item = createItem(attributes); 
                System.out.println(attributes);
                // adding book into ArrayList 
                stats.add(item); 
                // read next line before looping        
                // if end of file reached, line would be null 
                line = br.readLine(); 
            } 
        } catch (IOException ioe) { 
            System.out.println("\n\nCould not open file\n\n");
            ioe.printStackTrace(); 
        }

//@reference: Read more: https://www.java67.com/2015/08/how-to-load-data-from-csv-file-in-java.html#ixzz6LcKUEYdR
        
        return stats;
    } 
    
    private BoxScore createItem(String[] metadata){
        String team = metadata[0];
        int gamesPlayed = Integer.parseInt(metadata[1]);
        Double totalYards = Double.parseDouble(metadata[2]);
        Double totalYardsPerGame = Double.parseDouble(metadata[3]);
        Double passYards = Double.parseDouble(metadata[4]);
        Double passYardsPerGame = Double.parseDouble(metadata[5]);
        Double rushYards = Double.parseDouble(metadata[6]);
        Double rushYardsPerGame = Double.parseDouble(metadata[7]);
        Double pointsPerGame = Double.parseDouble(metadata[8]);
        
        //return new BoxScore(team, gamesPlayed, totalYards, totalYardsPerGame, passYards, passYardsPerGame, rushYards, rushYardsPerGame, pointsPerGame);
    }
    
}*/
