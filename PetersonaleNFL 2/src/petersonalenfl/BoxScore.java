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
public class BoxScore {
    String team;
    int gamesPlayed; 
    double totalYards; 
    double totalYardsPerGame; 
    double passYards; 
    double passYardsPerGame; 
    double rushYards; 
    double rushYardsPerGame; 
    double points;
    double pointsPerGame;
    
    
    public BoxScore(String team, int gamesPlayed, double totalYards, double totalYardsPerGame, double passYards, double passYardsPerGame, double rushYards, double rushYardsPerGame, double points, double pointsPerGame){
        this.team = team;
        this.gamesPlayed = gamesPlayed;
        this.totalYards = totalYards;
        this.totalYardsPerGame = totalYardsPerGame;
        this.passYards = passYards;
        this.passYardsPerGame = passYardsPerGame;
        this.rushYards = rushYards;
        this.rushYardsPerGame = rushYardsPerGame;
        this.points = points;
        this.pointsPerGame = pointsPerGame;
    }
    
}
