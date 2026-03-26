/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoreboard.score;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import scoreboard.Team;

/**
 *
 * @author WernerJon26
 */
public class TeamScorePanel extends JPanel implements ActionListener {

    private final Team root;
    private Team root2;
    private final InfoLabel teamName;
    private final InfoLabel teamSets;
    private final InfoButton teamScore;
    
    public TeamScorePanel(Team team, Team teamTwo) {
        this(team);
        setRootTwo(teamTwo);
    }
    
    public TeamScorePanel(Team team) {
        setLayout(new GridLayout(3,1));
        root = team;
        teamName = new InfoLabel(team.getName());
        teamScore = new InfoButton(String.valueOf(team.getScore()));
        teamSets = new InfoLabel(String.valueOf(team.getScore()));
        teamScore.addActionListener(this);
        
        add(teamName);
        add(teamScore);
        add(teamSets);
    }
    
    public void setRootTwo(Team root) {
        root2 = root;
    }
    
    public void setScore(int score) {
        teamScore.setText(String.valueOf(score));
    }
    
    public void setSets(int set) {
        teamSets.setText(String.valueOf(set));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (teamName.getBackground().equals(Color.white)) {
            teamName.setBackground(Color.green); 
            root.setScore(root.getScore() + 1);
        }
        else {
            teamName.setBackground(Color.white);
        }
    }
}
