/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoreboard.score;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import scoreboard.Team;

/**
 *
 * @author WernerJon26
 */
public class ScorePanel extends JPanel {
    
    public ScorePanel(Team[] teams) {
        
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 2;
        c.gridx = 0;
        c.gridy = 0;
        
        add(new InfoLabel("SWING YOUR DING"), c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 200;
        c.gridwidth = 1;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 1;
        add(teams[0].getTeamScorePanel(), c);
        
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 200;
        c.gridwidth = 1;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 1;
        add(teams[1].getTeamScorePanel(), c);
    }
}
