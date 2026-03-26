/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scoreboard.score;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

/**
 *
 * @author WernerJon26
 */
public class InfoButton extends JButton {

    public InfoButton(String text) {
        super(text);
        setMinimumSize(new Dimension(1000,1000));
        setBorder(new LineBorder(Color.BLACK));
        setBackground(Color.WHITE);
        setFont(this.getFont().deriveFont(20f));
        setOpaque(true);
    }
    
}
