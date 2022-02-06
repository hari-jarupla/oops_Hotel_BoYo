package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.WindowConstants;

import main.resources.ColorPallete;

public class WelcomePage implements ActionListener, MouseListener {
	
	static JFrame welcomeFrame = new JFrame();
    JWindow offerWindow = new JWindow();
    JLabel offerLabel = new JLabel();
    JButton loginButton = new JButton("Login");
    Dimension screenSize = new Dimension(1366, 768);
    JPanel offerPanel = new JPanel();

    WelcomePage(){

        welcomeFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        welcomeFrame.setLayout(null);
        welcomeFrame.getContentPane().setBackground(new ColorPallete().getC2cream());
        welcomeFrame.setSize(screenSize);
        welcomeFrame.setLocationRelativeTo(null);
        welcomeFrame.setResizable(false);

        JLabel headingLabel = new JLabel("BoYo");
        headingLabel.setBounds(583, 50, 200, 75);
        headingLabel.setFont(new Font("Lucida Grande", Font.BOLD, 70));
        headingLabel.setHorizontalAlignment(JLabel.CENTER);
        headingLabel.setForeground(new ColorPallete().getC9darkBlue());
        welcomeFrame.add(headingLabel);

        //src/resources/images/
        offerLabel.setIcon(new ImageIcon("src/main/resources/images/WelcomePage/offer.gif"));
        offerLabel.setBounds(25, 25, 150, 150);
        offerLabel.setBackground(new ColorPallete().getC2cream());
        offerLabel.addMouseListener(this);
        welcomeFrame.add(offerLabel);

        loginButton.setBounds(screenSize.width-25-125, 25, 100, 40);
        loginButton.setFont(new Font(null, Font.PLAIN, 25));
        loginButton.setFocusable(false);
        loginButton.setForeground(Color.white);
        loginButton.setBorderPainted(false);
        loginButton.setBackground(new ColorPallete().getC9darkBlue());
        loginButton.addActionListener(this);
        welcomeFrame.add(loginButton);

        JLabel labelImage1 = new JLabel();
        ImageIcon i1 = new ImageIcon(new ImageIcon("src/main/resources/images/WelcomePage/Hotel_2.jpg").getImage().getScaledInstance(583, 250, Image.SCALE_DEFAULT));
        labelImage1.setBounds(50, 400, 583, 250);
        labelImage1.setIcon(i1);
        labelImage1.setBorder(BorderFactory.createLineBorder(new ColorPallete().getC9darkBlue(), 2));
        welcomeFrame.add(labelImage1);

        JLabel labelImage2 = new JLabel();
        ImageIcon i2 = new ImageIcon(new ImageIcon("src/main/resources/images/WelcomePage/Hotel_3.jpg").getImage().getScaledInstance(583, 250, Image.SCALE_DEFAULT));
        labelImage2.setBounds(723, 400, 583, 250);
        labelImage2.setIcon(i2);
        labelImage2.setBorder(BorderFactory.createLineBorder(new ColorPallete().getC9darkBlue(), 2));
        welcomeFrame.add(labelImage2);

        JLabel labelStatusIcon1 = new JLabel("Available");
        ImageIcon statusIcon1 = new ImageIcon(new ImageIcon("src/main/resources/images/WelcomePage/roomIcon-removebg-preview.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
        labelStatusIcon1.setIcon(statusIcon1);
        labelStatusIcon1.setBounds(350, 200, 150, 150);
        labelStatusIcon1.setBackground(new ColorPallete().getC2cream());
        labelStatusIcon1.setForeground(new ColorPallete().getC9darkBlue());
        labelStatusIcon1.setHorizontalTextPosition(JLabel.CENTER);
        labelStatusIcon1.setVerticalTextPosition(JLabel.BOTTOM);
        welcomeFrame.add(labelStatusIcon1);

        JLabel labelStatusIcon2 = new JLabel("Open");
        ImageIcon statusIcon2 = new ImageIcon(new ImageIcon("src/main/resources/images/WelcomePage/restauraIcon-removebg-preview.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
        labelStatusIcon2.setIcon(statusIcon2);
        labelStatusIcon2.setBounds(550, 200, 150, 150);
        labelStatusIcon2.setBackground(new ColorPallete().getC2cream());
        labelStatusIcon2.setForeground(new ColorPallete().getC9darkBlue());
        labelStatusIcon2.setHorizontalTextPosition(JLabel.CENTER);
        labelStatusIcon2.setVerticalTextPosition(JLabel.BOTTOM);
        welcomeFrame.add(labelStatusIcon2);

        JLabel labelStatusIcon3 = new JLabel("Available");
        ImageIcon statusIcon3 = new ImageIcon(new ImageIcon("src/main/resources/images/WelcomePage/taxiIcon-removebg-preview.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
        labelStatusIcon3.setIcon(statusIcon3);
        labelStatusIcon3.setBounds(750, 200, 150, 150);
        labelStatusIcon3.setBackground(new ColorPallete().getC2cream());
        labelStatusIcon3.setForeground(new ColorPallete().getC9darkBlue());
        labelStatusIcon3.setHorizontalTextPosition(JLabel.CENTER);
        labelStatusIcon3.setVerticalTextPosition(JLabel.BOTTOM);
        welcomeFrame.add(labelStatusIcon3);

        JLabel labelStatusIcon4 = new JLabel("Available");
        ImageIcon statusIcon4 = new ImageIcon(new ImageIcon("src/main/resources/images/WelcomePage/wifiIcon-removebg-preview.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
        labelStatusIcon4.setIcon(statusIcon4);
        labelStatusIcon4.setBounds(950, 200, 150, 150);
        labelStatusIcon4.setBackground(new ColorPallete().getC2cream());
        labelStatusIcon4.setForeground(new ColorPallete().getC9darkBlue());
        labelStatusIcon4.setHorizontalTextPosition(JLabel.CENTER);
        labelStatusIcon4.setVerticalTextPosition(JLabel.BOTTOM);
        welcomeFrame.add(labelStatusIcon4);

        offerWindow.setSize(400, 600);
        offerWindow.setLocationRelativeTo(welcomeFrame);
        offerWindow.setLocation(250, 160);
        offerPanel.setBackground(Color.white);
        offerWindow.add(offerPanel);
        offerPanel.setBorder(BorderFactory.createLineBorder(new ColorPallete().getC5brightPink(), 5));
        offersAvailable();
        offerWindow.setVisible(false);

        welcomeFrame.setVisible(true);
    }

    public void offersAvailable(){
        JLabel offer1 = new JLabel();
        ImageIcon offerImage1 = new ImageIcon(new ImageIcon("src/main/resources/images/WelcomePage/offer1.png").getImage().getScaledInstance(380, 190, Image.SCALE_DEFAULT));
        offer1.setIcon(offerImage1);
        offerPanel.add(offer1);

        JLabel offer2 = new JLabel();
        ImageIcon offerImage2 = new ImageIcon(new ImageIcon("src/main/resources/images/WelcomePage/offer2.png").getImage().getScaledInstance(380, 190, Image.SCALE_DEFAULT));
        offer2.setIcon(offerImage2);
        offerPanel.add(offer2);

        JLabel offer3 = new JLabel();
        ImageIcon offerImage3 = new ImageIcon(new ImageIcon("src/main/resources/images/WelcomePage/offer3.jpg").getImage().getScaledInstance(380, 190, Image.SCALE_DEFAULT));
        offer3.setIcon(offerImage3);
        offerPanel.add(offer3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loginButton){
            welcomeFrame.setVisible(false);
            new LoginPage();
//            new DashBoard();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        offerWindow.setVisible(true);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        offerWindow.setVisible(false);
    }
	
}