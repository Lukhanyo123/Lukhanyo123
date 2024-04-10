
package nutrfit;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class NutrFit {

    public static void main(String[] args) {
        LoginGUI frame = new LoginGUI();

        frame.pack();
        frame.setSize(925, 700);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setGUI();
        
//        SignUpGUI frame2 = new SignUpGUI();
//
//        frame2.pack();
//        frame2.setSize(925, 700);
//        frame2.setVisible(true);
//        frame2.setDefaultCloseOperation(EXIT_ON_CLOSE);
//        frame2.setGUI();
    }
    
}
