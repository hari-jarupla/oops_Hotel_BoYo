package main.content;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.resources.CircleBtn;
import main.resources.ColorPallete;
import main.resources.HLinePanel;
import main.resources.ImagePanel;
import main.resources.RoundedPanel;

public class BillingPanel extends JPanel implements MouseListener{

	private static final long serialVersionUID = 7L;
	RoundedPanel payMethodInfo;
	JPanel container = new JPanel();
	JPanel billPanel = new JPanel();
	RoundedPanel transactions = new RoundedPanel(4);
	RoundedPanel currPayable;
	JLabel price;
	JLabel print;
	JLabel payInfo;
	ImagePanel donation; 
	CircleBtn donate;
	String toBePaid = "44,600";//TODO total cost of user
	String imgURL = "src/main/resources/images/billing/temp_background.jpg";//TODO image url form user choice
	
	public BillingPanel() {
		
		this.setBackground(new ColorPallete().getC11whiteSmoke());
		this.setLayout(null);
		this.setBounds(0, 0, 1080, 635);
		
		
		payMethodInfo = new RoundedPanel(4);
		payMethodInfo.setBackground(new ColorPallete().getC2cream());
		payMethodInfo.setLayout(null);
		payMethodInfo.setBounds(25, 25, 350, 200);
		payMethodInfo.addMouseListener(this);
		payInfo = new JLabel();
		payInfo.setText("                   Add Payment info");
		payInfo.setFont(new Font("Roboto", Font.ITALIC, 18));
		payInfo.setLayout(null);
		payInfo.setBounds(25, 25, 350, 200);
		try {
			ImageIcon img2 = new ImageIcon(
					new ImageIcon(imgURL).getImage().getScaledInstance(
							350, 200, Image.SCALE_DEFAULT));
			//TODO this image will be taken by user, like credit card or cash
			payInfo.setIcon(img2);
		}catch(Exception e) {
			payInfo.setText("error");		
		}
		payInfo.setBackground(new ColorPallete().getC2cream());
		payInfo.setOpaque(true);
		this.add(payInfo);
		this.add(payMethodInfo);
		
		
		RoundedPanel amtPanel = new RoundedPanel(4);
		amtPanel.setBackground(new ColorPallete().getC2cream());
		amtPanel.setLayout(null);
		amtPanel.setBounds(405, 25, 125, 200);	
		JLabel money = new JLabel();
		money.setLayout(null);
		money.setBounds(28, 3, 80, 90);
		ImageIcon img = new ImageIcon("src/main/resources/images/billing/dollar.png");
		money.setIcon(img);	
		money.setBackground(new ColorPallete().getC2cream());
		money.setOpaque(true);
		amtPanel.add(money);	
		JLabel amount = new JLabel();
		amount.setLayout(null);
		amount.setBounds(25, 100, 75, 30);
		amount.setText("Amount");
		amount.setFont(new Font("Roboto", Font.BOLD, 18));
		amount.setForeground(new ColorPallete().getC4bluntPink());
		amount.setBackground(new ColorPallete().getC2cream());
		amount.setOpaque(true);
		amtPanel.add(amount);	
		currPayable = new RoundedPanel(0);
		currPayable.setLayout(null);
		currPayable.setBounds(0, 140, 121, 57);
		currPayable.addMouseListener(this);
		currPayable.setBackground(new ColorPallete().getC12grey());
		price = new JLabel();
		price.setLayout(null);
		price.setBounds(5, 3, 115, 50);
		price.setText(toBePaid);
		price.setFont(new Font("Roboto", Font.ITALIC, 21));
		ImageIcon img1 = new ImageIcon("src/main/resources/images/billing/rupee.png");
		price.setIcon(img1);	
		price.setHorizontalTextPosition(JLabel.RIGHT);
		price.setVerticalTextPosition(JLabel.CENTER);
		price.setBackground(new ColorPallete().getC12grey());
		price.setForeground(new Color(0, 0, 0));
		price.setOpaque(true);		
		currPayable.add(price);
		amtPanel.add(currPayable);	
		this.add(amtPanel);
		
		
		donation = new ImagePanel(
				new ImageIcon("src/main/resources/images/billing/donataion.jpeg").getImage().getScaledInstance(
						450, 200, Image.SCALE_DEFAULT));
		donation.setLayout(null);
		donation.setBounds(560, 25, 450, 200);
		donation.addMouseListener(this);		
		this.add(donation);
		
		
		billPanel.setBackground(new ColorPallete().getC2cream());
		billPanel.setLayout(null);
		billPanel.setBounds(25, 260, 650, 325);	
		JLabel l2 = new JLabel("Billing Info");
		l2.setFont(new Font("sheriff", Font.BOLD, 16));
		l2.setBackground(new ColorPallete().getC12grey());
		l2.setLayout(null);
		l2.setBounds(30, 265, 100, 30);
		this.add(l2);
		print = new JLabel("Print");
		print.setFont(new Font("sheriff", Font.PLAIN, 14));
		print.setBackground(new ColorPallete().getC12grey());
		print.setLayout(null);
		print.addMouseListener(this);
		print.setBounds(625, 265, 60, 30);
		this.add(print);
		HLinePanel p1 = new HLinePanel();
		p1.setLayout(null);
		p1.setBounds(25, 290, 650, 20);
		this.add(p1);
        this.add(billPanel);
		
        
		transactions.setBackground(new ColorPallete().getC2cream());
		transactions.setLayout(null);
		transactions.setBounds(735, 260, 300, 300);
		transactions.addMouseListener(this);
		RoundedPanel transactionLabel = new RoundedPanel(1);
		transactionLabel.setBackground(new ColorPallete().getC12grey());
		transactionLabel.setLayout(null);
		transactionLabel.setBounds(735, 260, 298, 50);
		JLabel l1 = new JLabel("Transactions");
		l1.setFont(new Font("Roboto", Font.BOLD, 16));
		l1.setBackground(new ColorPallete().getC12grey());
		l1.setLayout(null);
		l1.setBounds(744, 268, 100, 30);
		this.add(l1);
		this.add(transactionLabel);
		this.add(transactions);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == payMethodInfo) {	
			//TODO adding image of card or cash
			System.out.println("Payment method added");
		}
		if(e.getSource() == currPayable) {	
			//TODO Pop up to tell them final amount to be paid and link to bill print button
			System.out.println("this much to be paid");
		}
		if(e.getSource() == donation) {	
			//TODO takes to donation page
			System.out.println("donation done");
		}
		if(e.getSource() == print) {	
			//TODO generating pdf of Bill
			System.out.println("Bill printed");
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}
	
}
