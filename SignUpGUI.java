package nutrfit;

import mySets.*;
import java.awt.*;
import javax.swing.*;

public class SignUpGUI extends JFrame {

    JButton btnLogin, btnSignUp;
    JPanel pnlCenter;
    Btn btn = new Btn();

    public SignUpGUI() {
        btnLogin = new JButton("Login");
        btnSignUp = new JButton("Sign Up");
        btn.smlBtnGreen(btnLogin);
        btn.lrgBtnBlack(btnSignUp);

        pnlCenter = new JPanel();
    }

    public void setGUI() {
        pnlCenter.setLayout(new FlowLayout());

        pnlCenter.add(btnLogin);
        pnlCenter.add(btnSignUp);

        this.add(pnlCenter);
    }
}
