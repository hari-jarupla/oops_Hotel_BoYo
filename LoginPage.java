package main;

import javax.swing.*;

import main.resources.ColorPallete;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage implements ActionListener {
	
	static JFrame loginFrame = new JFrame();
    Dimension screenSize = new Dimension(1280, 720);
    JButton backButton = new JButton();
    JButton loginButton = new JButton("Login");
    JTextField emailIDTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JRadioButton userRadioButton = new JRadioButton();
    JRadioButton adminRadioButton = new JRadioButton();
    JButton clickHere = new JButton("<html><font color=black>Don't have an account?</font>  <font color=blue>click here.</font></html>");

    LoginPage(){
        loginFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        loginFrame.setLayout(null);
        loginFrame.getContentPane().setBackground(new ColorPallete().getC2cream());
        loginFrame.setSize(screenSize);
        loginFrame.setLocationRelativeTo(null);
        loginFrame.setResizable(false);

        backButton.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\yashe\\OneDrive\\Pictures\\Saved Pictures\\backButtonnn-removebg.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
        backButton.setBackground(new ColorPallete().getC2cream());
        backButton.setBounds(25, 25, 50, 50);
        backButton.setFocusPainted(false);
        backButton.setBorderPainted(false);
        backButton.addActionListener(this);
        loginFrame.add(backButton);

        JLabel loginLabel = new JLabel("LOGIN");
        loginLabel.setBounds(440, 50, 400, 75);
        loginLabel.setFont(new Font(null, Font.PLAIN, 70));
        loginLabel.setHorizontalAlignment(JLabel.CENTER);
        loginLabel.setForeground(new ColorPallete().getC9darkBlue());
        loginFrame.add(loginLabel);

        JLabel emailID = new JLabel("E-mail ID");
        emailID.setBounds(400, 250, 240, 30);
        emailID.setFont(new Font(null, Font.PLAIN, 25));
        emailID.setHorizontalAlignment(JLabel.CENTER);
        emailID.setForeground(new ColorPallete().getC9darkBlue());
        loginFrame.add(emailID);

        emailIDTextField.setBounds(600, 250, 240, 30);
        loginFrame.add(emailIDTextField);

        JLabel password = new JLabel("Password");
        password.setBounds(400, 325, 240, 30);
        password.setFont(new Font(null, Font.PLAIN, 25));
        password.setHorizontalAlignment(JLabel.CENTER);
        password.setForeground(new ColorPallete().getC9darkBlue());
        loginFrame.add(password);

        passwordField.setBounds(600, 325, 240, 30);
        loginFrame.add(passwordField);

        userRadioButton.setText("user");
        userRadioButton.setFont(new Font(null, Font.PLAIN, 20));
        userRadioButton.setBounds(500, 400, 150, 30);
        userRadioButton.setVerticalTextPosition(JRadioButton.CENTER);
        userRadioButton.setForeground(new ColorPallete().getC9darkBlue());
        userRadioButton.setBackground(new ColorPallete().getC2cream());
        userRadioButton.setFocusPainted(false);
        userRadioButton.setSelected(true);
        loginFrame.add(userRadioButton);

        adminRadioButton.setText("admin");
        adminRadioButton.setFont(new Font(null, Font.PLAIN, 20));
        adminRadioButton.setBounds(700, 400, 150, 30);
        adminRadioButton.setVerticalTextPosition(JRadioButton.CENTER);
        adminRadioButton.setForeground(new ColorPallete().getC9darkBlue());
        adminRadioButton.setBackground(new ColorPallete().getC2cream());
        adminRadioButton.setFocusPainted(false);
        loginFrame.add(adminRadioButton);

        ButtonGroup groupRole = new ButtonGroup();
        groupRole.add(userRadioButton);
        groupRole.add(adminRadioButton);

        loginButton.setBounds(590, 475, 100, 40);
        loginButton.setFont(new Font(null, Font.PLAIN, 25));
        loginButton.setFocusable(false);
        loginButton.setForeground(Color.white);
        loginButton.setBorderPainted(false);
        loginButton.setBackground(new ColorPallete().getC9darkBlue());
        loginButton.addActionListener(this);
        loginFrame.add(loginButton);

        clickHere.setBounds(500, 515, 300, 40);
        clickHere.setFont(new Font(null, Font.PLAIN, 15));
        clickHere.setFocusable(false);
        clickHere.setForeground(Color.blue);
        clickHere.setBorderPainted(false);
        clickHere.setBackground(new ColorPallete().getC2cream());
        clickHere.addActionListener(this);
        clickHere.setContentAreaFilled(false);
        loginFrame.add(clickHere);

        loginFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==backButton){
            loginFrame.setVisible(false);
            WelcomePage.welcomeFrame.setVisible(true);
            loginFrame.dispose();
        }
        else if(e.getSource()==clickHere){
            loginFrame.setVisible(false);
            new CreateAccount();
            loginFrame.dispose();
        }
        else if(e.getSource()==loginButton){
            try {
                if(new LoginAndSignup().login(userRadioButton.isSelected()? "user" : "admin", emailIDTextField.getText(), String.valueOf(passwordField.getPassword()))){
                    CurrentUser.ID = emailIDTextField.getText();
                    System.out.println("login successful");
                    new DashBoard();
                    loginFrame.dispose();
                }
                else {
                    System.out.println("login error");
//                    TODO: show error dialogue box
                }
            } catch (Exception exception) {
                exception.printStackTrace();
                System.out.println("login error");
            }
        }
    }
	
}
