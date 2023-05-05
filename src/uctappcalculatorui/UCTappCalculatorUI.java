
package uctappcalculatorui;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

/**
 *
 * @author Lukhanyo Mweli
 */
public class UCTappCalculatorUI extends JFrame {

    
    public static void main(String[] args) {
        
        ImageIcon image = new ImageIcon("desk.png");
        Border border = BorderFactory.createLineBorder(Color.red,2);
        
        
        JLabel label = new JLabel("Student_Desk");
        label.setIcon(new ImageIcon("desk.png"));
        label.setHorizontalTextPosition(JLabel.RIGHT);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBounds(0, 0, 700, 100);
        label.setBackground(new Color(0,255,255));
        label.setForeground(Color.red);
        label.setIconTextGap(5);
        label.setBorder(border);
        label.setOpaque(true);
        
        
        JFrame frame = new JFrame("UI Design");
        frame.setSize(700, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.add(label);
        frame.setVisible(true);
        
        
    }
    
}
