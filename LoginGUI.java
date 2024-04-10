package nutrfit;

import mySets.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginGUI extends JFrame {

    JButton btnLogin;
    JLabel lblUsername, lblPassword, lblSignUpQuery, lblSignUp, logo;
    JTextField txtUsername;
    JPasswordField txtPassword;
    JPanel pnlLeft, pnlRight, pnlLogin, pnlLoginInput, pnlLoginSubmit, pnlBtn, pnlQuery;
    ImageIcon icon = new ImageIcon("D:\\Java Programs\\ICT.AppDev.Year2\\NutrFit\\icons\\Nutri_Fit_Icon.png");
    ImageIcon logoIcon = new ImageIcon("D:\\Java Programs\\ICT.AppDev.Year2\\NutrFit\\icons\\Nutri_Fit_Logo_Round.png");

    Btn btn = new Btn();
    Lbl lbl = new Lbl();

    public LoginGUI() {
        super("NutriFit™: Login");
        
        Image logoImg = logoIcon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon logoIconRe = new ImageIcon(logoImg);

        //JButton
        btnLogin = new JButton("Login");
        btn.medBtnBlack(btnLogin);

        //JLabel
        lblUsername = new JLabel("Username");
        lbl.smlLblBlackBold(lblUsername);

        lblPassword = new JLabel("Password");
        lbl.smlLblBlackBold(lblPassword);

        lblSignUpQuery = new JLabel("Don't have an account?");
        lbl.smlLblBlack(lblSignUpQuery);

        lblSignUp = new JLabel("Sign Up");
        lbl.smlLblWhiteBold(lblSignUp);

        logo = new JLabel(logoIconRe);

        //JTextField
        txtUsername = new JTextField();
        txtUsername.setPreferredSize(new Dimension(350, 35));

        //JPasswordField
        txtPassword = new JPasswordField();
        txtPassword.setPreferredSize(new Dimension(350, 35));

        //JPanel
        pnlLeft = new JPanel();
        pnlLeft.setPreferredSize(new Dimension(450, 650));
        pnlLeft.setBackground(Colours.limeGreen());

        pnlRight = new JPanel();
        pnlRight.setPreferredSize(new Dimension(450, 650));
        pnlRight.setBackground(Colours.limeGreenLight());

        pnlLogin = new JPanel();
        pnlLogin.setPreferredSize(new Dimension(430, 400));
        pnlLogin.setBackground(Colours.limeGreen());

        pnlLoginInput = new JPanel();
        pnlLoginInput.setBackground(Colours.limeGreen());

        pnlLoginSubmit = new JPanel();
        pnlLoginSubmit.setBackground(Colours.limeGreen());

        pnlBtn = new JPanel();
        pnlBtn.setBackground(Colours.limeGreen());

        pnlQuery = new JPanel();
        pnlQuery.setBackground(Colours.limeGreen());
    }

    public void setGUI() {
        pnlLeft.setLayout(new FlowLayout());
        pnlLeft.add(logo);

        GroupLayout right = new GroupLayout(pnlRight);
        pnlRight.setLayout(right);

        right.setAutoCreateGaps(true);
        right.setAutoCreateContainerGaps(true);

        right.setHorizontalGroup(right.createParallelGroup(GroupLayout.Alignment.CENTER)
                .addComponent(pnlLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE));

        right.setVerticalGroup(right.createSequentialGroup()
                .addComponent(pnlLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE));

//        pnlRight.setLayout(new FlowLayout());
//        pnlRight.add(pnlLogin);

        GroupLayout login = new GroupLayout(pnlLogin);
        pnlLogin.setLayout(login);

        login.setAutoCreateGaps(true);
        login.setAutoCreateContainerGaps(true);

        login.setHorizontalGroup(login.createParallelGroup(GroupLayout.Alignment.CENTER)
                .addComponent(pnlLoginInput)
                .addComponent(pnlLoginSubmit));

        login.setVerticalGroup(login.createSequentialGroup()
                .addComponent(pnlLoginInput)
                .addComponent(true, pnlLoginSubmit));

        GroupLayout loginInp = new GroupLayout(pnlLoginInput);
        pnlLoginInput.setLayout(loginInp);

        loginInp.setAutoCreateGaps(true);
        loginInp.setAutoCreateContainerGaps(true);

        loginInp.setHorizontalGroup(loginInp.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(lblUsername)
                .addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(lblPassword)
                .addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE));

        loginInp.setVerticalGroup(loginInp.createSequentialGroup()
                .addComponent(lblUsername)
                .addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(lblPassword)
                .addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE, GroupLayout.PREFERRED_SIZE));

//        pnlLoginInput.setLayout(new FlowLayout());
//        pnlLoginInput.add(lblUsername);
//        pnlLoginInput.add(txtUsername);
//        pnlLoginInput.add(lblPassword);
//        pnlLoginInput.add(txtPassword);

        pnlLoginSubmit.add(pnlBtn, BorderLayout.NORTH);
        pnlLoginSubmit.add(pnlQuery, BorderLayout.SOUTH);

        pnlBtn.setLayout(new FlowLayout());
        pnlBtn.add(btnLogin);

        pnlQuery.setLayout(new FlowLayout());
        pnlQuery.add(lblSignUpQuery);
        pnlQuery.add(lblSignUp);

        this.add(pnlLeft);
        this.add(pnlRight);
        this.setLayout(new GridLayout(1, 2));
        this.setIconImage(icon.getImage());
    }
}
