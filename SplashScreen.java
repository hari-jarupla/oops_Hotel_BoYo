package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.border.EmptyBorder;

import main.database.SqlSetUP;
import main.resources.ColorPallete;


public class SplashScreen {
	

    JWindow splashWindow = new JWindow();
    JProgressBar progressBar = new JProgressBar();

    SplashScreen() throws IOException{

        splashWindow.setSize(450, 450);
        splashWindow.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(new ColorPallete().getC2cream());
        splashWindow.add(panel);
        panel.setLayout(new FlowLayout());

        JLabel label = new JLabel();     
        ImageIcon img = new ImageIcon("src/main/resources/Boyo_logo.png");        
        label.setBorder(new EmptyBorder(100, 0, 50,0));
        label.setIcon(img);
        panel.add(label, JLabel.CENTER);
        
        progressBar.setStringPainted(true);
        progressBar.setBackground(Color.white);
        progressBar.setForeground(new ColorPallete().getC9darkBlue());
        progressBar.setPreferredSize(new Dimension(300, 15));
        panel.add(progressBar);

        splashWindow.setVisible(true);
        
        //all happening after this is while loading is happening
        fill();
        
        

        splashWindow.setVisible(false);

        new SqlSetUP("boyodb", "root", "Yashesh#07");

        new WelcomePage();

        splashWindow.dispose();
    }

    private void fill(){
        int count = 0;
        while(count<=100){
            progressBar.setValue(count);
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
        }
    }
	
}