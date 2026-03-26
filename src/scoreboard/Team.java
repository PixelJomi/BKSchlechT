/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoreboard;

import scoreboard.score.TeamScorePanel;

/**
 *
 * @author WernerJon26
 */
public class Team {
    private Team root;
    private final TeamScorePanel teamScorePanel;
    private final String name;
    private int score;
    private int sets;
    
    public Team(String name) {
        this.name = name;
        this.teamScorePanel = new TeamScorePanel(this);
    }
    
    public void setup(Team root) {
        this.root = root;
        this.teamScorePanel.setRootTwo(root);
    }

    public TeamScorePanel getTeamScorePanel() {
        return teamScorePanel;
    }
    
    public String getName() {
        return name;
    }
    
    public int getScore() {
        return score;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }
    
    public void setScore(int score) {
        if (score > 99) score = 99;
        if (score < 0) score = 0;
        
        if (score >= 25 && Math.abs(root.getScore() - score) >= 2) {
            System.out.println("WEEEEE :3");
            score = 0;
            this.sets += 1;
            teamScorePanel.setSets(this.sets);
            root.setScore(0);
        }
        
        this.score = score;
        teamScorePanel.setScore(score);
        
        
    }
    
    
}
