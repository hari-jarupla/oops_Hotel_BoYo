package main.content;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;

import main.resources.ColorPallete;
import main.resources.RoundedPanel;
import main.resources.VLinePanel;

public class HomePanel extends JPanel implements MouseListener{
	
	private static final long serialVersionUID = 1L;
	
	JLabel l = new JLabel();
	JWindow offerWindow = new JWindow();
    JLabel offerLabel = new JLabel();
    JPanel offerPanel = new JPanel();
    RoundedPanel stats = new RoundedPanel(5);
    String numGuest = "234";//TODO total number of guest in hotel
    String numRoom = "45";//TODO total numbers of rooms available

	public HomePanel() {	
		this.setBackground(new ColorPallete().getC11whiteSmoke());
		this.setLayout(null);
		this.setBounds(0, 0, 1080, 635);		
		
		offerLabel.setIcon(new ImageIcon("src/main/resources/images/WelcomePage/offer.gif"));
        offerLabel.setBounds(20, 20, 150, 150);
        offerLabel.setBackground(new ColorPallete().getC2cream());
        offerLabel.addMouseListener(this);
        this.add(offerLabel);
        
        offerWindow.setSize(325, 480);
        offerWindow.setLocationRelativeTo(this);
        offerWindow.setLocation(380, 150);
        offerPanel.setBackground(Color.white);
        offerWindow.add(offerPanel);
        offerPanel.setBorder(BorderFactory.createLineBorder(new ColorPallete().getC5brightPink(), 5));
        offersAvailable();
        offerWindow.setVisible(false);
		
        JLabel labelStatusIcon1 = new JLabel("Available");
        ImageIcon statusIcon1 = new ImageIcon(new ImageIcon("src/main/resources/images/WelcomePage/roomIcon-removebg-preview.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
        labelStatusIcon1.setIcon(statusIcon1);
        labelStatusIcon1.setBounds(200, 125, 150, 150);
        labelStatusIcon1.setBackground(new ColorPallete().getC2cream());
        labelStatusIcon1.setForeground(new ColorPallete().getC9darkBlue());
        labelStatusIcon1.setHorizontalTextPosition(JLabel.CENTER);
        labelStatusIcon1.setVerticalTextPosition(JLabel.BOTTOM);
        this.add(labelStatusIcon1);

        JLabel labelStatusIcon2 = new JLabel("Open");
        ImageIcon statusIcon2 = new ImageIcon(new ImageIcon("src/main/resources/images/WelcomePage/restauraIcon-removebg-preview.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
        labelStatusIcon2.setIcon(statusIcon2);
        labelStatusIcon2.setBounds(400, 125, 150, 150);
        labelStatusIcon2.setBackground(new ColorPallete().getC2cream());
        labelStatusIcon2.setForeground(new ColorPallete().getC9darkBlue());
        labelStatusIcon2.setHorizontalTextPosition(JLabel.CENTER);
        labelStatusIcon2.setVerticalTextPosition(JLabel.BOTTOM);
        this.add(labelStatusIcon2);

        JLabel labelStatusIcon3 = new JLabel("Available");
        ImageIcon statusIcon3 = new ImageIcon(new ImageIcon("src/main/resources/images/WelcomePage/taxiIcon-removebg-preview.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
        labelStatusIcon3.setIcon(statusIcon3);
        labelStatusIcon3.setBounds(600, 125, 150, 150);
        labelStatusIcon3.setBackground(new ColorPallete().getC2cream());
        labelStatusIcon3.setForeground(new ColorPallete().getC9darkBlue());
        labelStatusIcon3.setHorizontalTextPosition(JLabel.CENTER);
        labelStatusIcon3.setVerticalTextPosition(JLabel.BOTTOM);
        this.add(labelStatusIcon3);

        JLabel labelStatusIcon4 = new JLabel("Available");
        ImageIcon statusIcon4 = new ImageIcon(new ImageIcon("src/main/resources/images/WelcomePage/wifiIcon-removebg-preview.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT));
        labelStatusIcon4.setIcon(statusIcon4);
        labelStatusIcon4.setBounds(800, 125, 150, 150);
        labelStatusIcon4.setBackground(new ColorPallete().getC2cream());
        labelStatusIcon4.setForeground(new ColorPallete().getC9darkBlue());
        labelStatusIcon4.setHorizontalTextPosition(JLabel.CENTER);
        labelStatusIcon4.setVerticalTextPosition(JLabel.BOTTOM);
        this.add(labelStatusIcon4);
        
        stats.setBackground(new ColorPallete().getC2cream());
        stats.setLayout(null);
        stats.setBounds(200, 280, 680, 100);
        VLinePanel l1 = new VLinePanel();
        l1.setBackground(new ColorPallete().getC2cream());
        l1.setLayout(null);
        l1.setBounds(536, 281, 5, 94);
        this.add(l1);
        JLabel noOfGuest = new JLabel();
        noOfGuest.setText(numGuest);
        noOfGuest.setFont(new Font("sheriff", Font.BOLD, 34));
        noOfGuest.setBackground(new ColorPallete().getC2cream());
        noOfGuest.setForeground(new ColorPallete().getC5brightPink());
        noOfGuest.setLayout(null);
        noOfGuest.setBounds(340, 285, 70, 40);
		this.add(noOfGuest);
        JLabel gg = new JLabel("guests being served by US");
        gg.setFont(new Font("sheriff", Font.ITALIC, 18));
		gg.setBackground(new ColorPallete().getC2cream());
		gg.setForeground(Color.BLACK);
		gg.setLayout(null);
		gg.setBounds(260, 330, 250, 30);
		this.add(gg);
		JLabel noOfRooms = new JLabel();
		noOfRooms.setText(numRoom);
		noOfRooms.setFont(new Font("sheriff", Font.BOLD, 34));
		noOfRooms.setBackground(new ColorPallete().getC2cream());
		noOfRooms.setForeground(new ColorPallete().getC5brightPink());
		noOfRooms.setLayout(null);
		noOfRooms.setBounds(700, 285, 70, 40);
		this.add(noOfRooms);
		JLabel ll = new JLabel("rooms available");
		ll.setFont(new Font("sheriff", Font.ITALIC, 18));
		ll.setBackground(new ColorPallete().getC2cream());
		ll.setForeground(Color.BLACK);
		ll.setLayout(null);
		ll.setBounds(660, 330, 250, 30);
		this.add(ll);
        this.add(stats);
        
        
        JLabel labelImage1 = new JLabel();
        ImageIcon i1 = new ImageIcon(new ImageIcon("src/main/resources/images/WelcomePage/Hotel_2.jpg").getImage().getScaledInstance(400, 180, Image.SCALE_DEFAULT));
        labelImage1.setBounds(125, 400, 400, 180);
        labelImage1.setIcon(i1);
        labelImage1.setBorder(BorderFactory.createLineBorder(new ColorPallete().getC9darkBlue(), 2));
        this.add(labelImage1);

        JLabel labelImage2 = new JLabel();
        ImageIcon i2 = new ImageIcon(new ImageIcon("src/main/resources/images/WelcomePage/Hotel_3.jpg").getImage().getScaledInstance(400, 180, Image.SCALE_DEFAULT));
        labelImage2.setBounds(550, 400, 400, 180);
        labelImage2.setIcon(i2);
        labelImage2.setBorder(BorderFactory.createLineBorder(new ColorPallete().getC9darkBlue(), 2));
        this.add(labelImage2);    
        
        this.setVisible(true);
	}
	
	public void offersAvailable(){
        JLabel offer1 = new JLabel();
        ImageIcon offerImage1 = new ImageIcon(new ImageIcon("src/main/resources/images/WelcomePage/offer1.png").getImage().getScaledInstance(300, 150, Image.SCALE_DEFAULT));
        offer1.setIcon(offerImage1);
        offerPanel.add(offer1);

        JLabel offer2 = new JLabel();
        ImageIcon offerImage2 = new ImageIcon(new ImageIcon("src/main/resources/images/WelcomePage/offer2.png").getImage().getScaledInstance(300, 150, Image.SCALE_DEFAULT));
        offer2.setIcon(offerImage2);
        offerPanel.add(offer2);

        JLabel offer3 = new JLabel();
        ImageIcon offerImage3 = new ImageIcon(new ImageIcon("src/main/resources/images/WelcomePage/offer3.jpg").getImage().getScaledInstance(300, 150, Image.SCALE_DEFAULT));
        offer3.setIcon(offerImage3);
        offerPanel.add(offer3);
    }

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
