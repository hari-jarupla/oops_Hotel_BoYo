package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

import main.resources.ColorPallete;

public class CreateAccount implements ActionListener {
	
	JFrame createAccountFrame = new JFrame();
    Dimension screenSize = new Dimension(1280, 720);
    JButton signUpButton = new JButton("Sign Up");
    JTextField emailIDTextField = new JTextField();
    JTextField firstNameTextField = new JTextField();
    JTextField lastNameTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JPasswordField confirmPasswordField = new JPasswordField();
    JButton clickHere = new JButton("<html><font color=black>Already have an account?</font>  <font color=blue>click here.</font></html>");

    CreateAccount(){
        createAccountFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        createAccountFrame.setLayout(null);
        createAccountFrame.getContentPane().setBackground(new ColorPallete().getC2cream());
        createAccountFrame.setSize(screenSize);
        createAccountFrame.setLocationRelativeTo(null);
        createAccountFrame.setResizable(false);

        JLabel signUpLabel = new JLabel("SignUp");
        signUpLabel.setBounds(440, 50, 400, 75);
        signUpLabel.setFont(new Font(null, Font.PLAIN, 60));
        signUpLabel.setForeground(new ColorPallete().getC9darkBlue());
        signUpLabel.setHorizontalAlignment(JLabel.CENTER);
        createAccountFrame.add(signUpLabel);

        JLabel firstName = new JLabel("First Name");
        firstName.setBounds(400, 200, 200, 30);
        firstName.setFont(new Font(null, Font.PLAIN, 25));
        firstName.setForeground(new ColorPallete().getC9darkBlue());
        firstName.setHorizontalAlignment(SwingConstants.RIGHT);
        createAccountFrame.add(firstName);

        firstNameTextField.setBounds(625, 200, 240, 30);
        createAccountFrame.add(firstNameTextField);

        JLabel lastName = new JLabel("Last Name");
        lastName.setBounds(400, 260, 200, 30);
        lastName.setFont(new Font(null, Font.PLAIN, 25));
        lastName.setForeground(new ColorPallete().getC9darkBlue());
        lastName.setHorizontalAlignment(SwingConstants.RIGHT);
        createAccountFrame.add(lastName);

        lastNameTextField.setBounds(625, 260, 240, 30);
        createAccountFrame.add(lastNameTextField);

        JLabel emailID = new JLabel("E-mail ID");
        emailID.setBounds(400, 320, 200, 30);
        emailID.setFont(new Font(null, Font.PLAIN, 25));
        emailID.setForeground(new ColorPallete().getC9darkBlue());
        emailID.setHorizontalAlignment(SwingConstants.RIGHT);
        createAccountFrame.add(emailID);

        emailIDTextField.setBounds(625, 320, 240, 30);
        createAccountFrame.add(emailIDTextField);

        JLabel password = new JLabel("Password");
        password.setBounds(400, 380, 200, 30);
        password.setFont(new Font(null, Font.PLAIN, 25));
        password.setForeground(new ColorPallete().getC9darkBlue());
        password.setHorizontalAlignment(SwingConstants.RIGHT);
        createAccountFrame.add(password);

        passwordField.setBounds(625, 380, 240, 30);
        createAccountFrame.add(passwordField);

        JLabel confirmPassword = new JLabel("Confirm Password");
        confirmPassword.setBounds(400, 440, 200, 30);
        confirmPassword.setFont(new Font(null, Font.PLAIN, 25));
        confirmPassword.setForeground(new ColorPallete().getC9darkBlue());
        confirmPassword.setHorizontalAlignment(SwingConstants.RIGHT);
        createAccountFrame.add(confirmPassword);

        confirmPasswordField.setBounds(625, 440, 240, 30);
        createAccountFrame.add(confirmPasswordField);

        signUpButton.setBounds(570, 550, 140, 40);
        signUpButton.setFont(new Font(null, Font.PLAIN, 25));
        signUpButton.setFocusable(false);
        signUpButton.setForeground(Color.white);
        signUpButton.setBorderPainted(false);
        signUpButton.setBackground(new ColorPallete().getC9darkBlue());
        signUpButton.addActionListener(this);
        createAccountFrame.add(signUpButton);

        clickHere.setBounds(500, 590, 300, 40);
        clickHere.setFont(new Font(null, Font.PLAIN, 15));
        clickHere.setFocusable(false);
        clickHere.setForeground(Color.blue);
        clickHere.setBorderPainted(false);
        clickHere.setBackground(new ColorPallete().getC2cream());
        clickHere.addActionListener(this);
        clickHere.setContentAreaFilled(false);
        createAccountFrame.add(clickHere);

        createAccountFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==signUpButton){
            try {
                if(new LoginAndSignup().signin(emailIDTextField.getText(), String.valueOf(passwordField.getPassword()), String.valueOf(confirmPasswordField.getPassword()), firstNameTextField.getText() + lastNameTextField.getText())){
                    CurrentUser.ID = emailIDTextField.getText();
                    System.out.println("sign in successful");
                    new DashBoard();
                    createAccountFrame.setVisible(false);
                    createAccountFrame.dispose();
                }
                else {
                    System.out.println("sign in error");
//                    TODO: show error dialogue box
                }
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        else if(e.getSource()==clickHere){
            createAccountFrame.setVisible(false);
            new LoginPage();
            createAccountFrame.dispose();
        }
    }
	
}
