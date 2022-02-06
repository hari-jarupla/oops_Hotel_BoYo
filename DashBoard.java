package main;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.content.*;
import main.resources.CircleBtn;
import main.resources.ColorPallete;

public class DashBoard implements MouseListener{

	JFrame frame = new JFrame();	
	JPanel menuPanel;
	JPanel contentPanel = new JPanel();
	JPanel titlePanel;
	JLabel logo;
	JLabel userInfo;
	JLabel menuItemHome;
	JLabel menuItemBooking;
	JLabel menuItemHouse;
	JLabel menuItemFood;
	JLabel menuItemSpa;
	JLabel menuItemBanquet;
	JLabel menuItemBilling;
	JButton button;
	CardLayout cl = new CardLayout();
	
	HomePanel homePanel = new HomePanel();
	BookingPanel bookingPanel = new BookingPanel();
	HousePanel housePanel = new HousePanel();
	FoodPanel foodPanel = new FoodPanel();
	ActivitiesPanel activityPanel = new ActivitiesPanel();
	BanquetPanel banquetPanel = new BanquetPanel();
	BillingPanel billingPanel = new BillingPanel();
	
	CircleBtn logOut;	
	ColorPallete colors = new ColorPallete();
	
	String username;
	final static String HOMEPANEL = "x000y";
    final static String BOOKINGPANEL = "x001y";
    final static String HOUSEPANEL = "x002y";
    final static String FOODPANEL = "x003y";
    final static String ACTIVITYPANEL = "x004y";
    final static String BANQUETPANEL = "x005y";
    final static String BILLINGPANEL = "x006y";
	
	
	DashBoard(){
		frame.setTitle("Hotel BoYo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // do nothing on clicking x
		ImageIcon im1 = new ImageIcon("kitten.png");
		frame.setIconImage(im1.getImage()); //Icon image insertion		
		//frame.getContentPane().setBackground(colors.getC2cream());
		frame.setResizable(false);
		frame.setSize(1280, 720);
		frame.setLayout(null);
		//frame.setUndecorated(true);
		
		titlePanelMaker();
		frame.add(titlePanel);
		
		menuPanelMaker();
		frame.add(menuPanel);		
		
		contentPanelMaker();
		frame.add(contentPanel);
		
		//frame set visible THE LAST STEP
		frame.setVisible(true);
	}
	
	private void titlePanelMaker() {
		titlePanel = new JPanel();
		titlePanel.setBounds(200, 0, 1080, 85);
		titlePanel.setBackground(Color.white);
		titlePanel.setLayout(null);
		
		logo = new JLabel();
		logo.setBounds(0 , 0, 200, 100);
		ImageIcon img = new ImageIcon("src/main/resources/images/dashboard/titleImg.png");
		logo.setIcon(img);	
		logo.setBackground(Color.white);
		logo.setOpaque(true);
		titlePanel.add(logo);
		
		logOut = new CircleBtn("Log Out", colors.getC8purpleBlue(), Color.black, 15);
		logOut.setBounds(950, 20, 100, 50);
		logOut.setForeground(Color.white);
		logOut.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		logOut.setBackground(colors.getC10greyBlue());
		logOut.setFocusable(false);
		logOut.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//TODO
				System.out.println("Logged out");			
			}
			
		});
		titlePanel.add(logOut);
		
	}
	
	private void contentPanelMaker(){		
		contentPanel.setLayout(cl);
		contentPanel.setBounds(200, 85, 1080, 635);
		contentPanel.setBackground(colors.getC11whiteSmoke());	
		
		contentPanel.add(homePanel, HOMEPANEL);
		contentPanel.add(bookingPanel, BOOKINGPANEL);
		contentPanel.add(housePanel, HOUSEPANEL);
		contentPanel.add(foodPanel, FOODPANEL);
		contentPanel.add(activityPanel, ACTIVITYPANEL);
		contentPanel.add(banquetPanel, BANQUETPANEL);
		contentPanel.add(billingPanel, BILLINGPANEL);
		
		cl.show(contentPanel, HOMEPANEL);
		
	}

	private void menuPanelMaker(){
		menuPanel = new JPanel();
		menuPanel.setBounds(0, 0, 200, 720);
		menuPanel.setBackground(colors.getC10greyBlue());
		menuPanel.setLayout(null);
		
		userInfo = new JLabel();
		username = "Alex Tamboli";
		userInfo.setText(username);
		userInfo.setFont(new Font("Roboto", Font.BOLD, 16));
		userInfo.setBounds(0 , 0, 200, 85);
		userInfo.setForeground(Color.black);
		ImageIcon img = new ImageIcon("src/main/resources/images/dashboard/icons8-user-48.png");
		userInfo.setIcon(img);
		userInfo.setIconTextGap(10);
		userInfo.setHorizontalTextPosition(JLabel.RIGHT);//u can set text LEFT, RIGHT, CENTER of image icon
		userInfo.setVerticalTextPosition(JLabel.CENTER);// sets text TOP, BOTTOM, CENTER of the image icon
		userInfo.setBackground(colors.getC8purpleBlue());
		userInfo.setOpaque(true);
		userInfo.addMouseListener(this);
		menuPanel.add(userInfo);
		
		menuItemHome = new JLabel();
		menuItemHome = menuItemLabel(new JLabel(), 5, 85, "Home", "src/main/resources/images/dashboard/icons8-home-24.png");
		menuPanel.add(menuItemHome);
		
		menuItemBooking = new JLabel();
		menuItemBooking = menuItemLabel(new JLabel(), 5, 160, "Booking", "src/main/resources/images/dashboard/icons8-event-24.png");
		menuPanel.add(menuItemBooking);
		
		menuItemHouse = new JLabel();
		menuItemHouse = menuItemLabel(new JLabel(), 5, 235, "Housekeeping", "src/main/resources/images/dashboard/housekeeping.png");
		menuPanel.add(menuItemHouse);
		
		menuItemFood = new JLabel();
		menuItemFood = menuItemLabel(new JLabel(), 5, 310, "Food and Beverages", "src/main/resources/images/dashboard/icons8-food-24.png");
		menuPanel.add(menuItemFood);
		
		menuItemSpa = new JLabel();
		menuItemSpa = menuItemLabel(new JLabel(), 5, 385, "Spa", "src/main/resources/images/dashboard/icons8-joystick-24.png");
		menuPanel.add(menuItemSpa);
		
		menuItemBanquet = new JLabel();
		menuItemBanquet = menuItemLabel(new JLabel(), 5, 460, "Host Meets", "src/main/resources/images/dashboard/icons8-meeting-room-24.png");
		menuPanel.add(menuItemBanquet);
		
		menuItemBilling = new JLabel();
		menuItemBilling = menuItemLabel(new JLabel(), 5, 535, "Billing", "src/main/resources/images/dashboard/icons8-check-dollar-24.png");
		menuPanel.add(menuItemBilling);	
		
	}
	
	private JLabel menuItemLabel(JLabel label, int x, int y, String text, String imgPath) {
		label.setText(text);
		ImageIcon imageIcon = new ImageIcon(new ImageIcon(imgPath).getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		label.setIcon(imageIcon);
		label.setHorizontalTextPosition(JLabel.RIGHT);// here text On the Image, u can set text LEFT, RIGHT, CENTER of image icon
		label.setVerticalTextPosition(JLabel.CENTER);// sets text TOP, BOTTOM, CENTER of the image icon
		label.setForeground(colors.getC12grey());
		label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
		label.setIconTextGap(10); //set gap between text and image icon
		label.setBackground(colors.getC10greyBlue()); // set background color of label
		label.setOpaque(true);// make the label background visible and not transparent
		//Border border = BorderFactory.createLineBorder(Color.yellow, 3);
		//label.setBorder(border);// set border around label
		label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
		label.setHorizontalAlignment(JLabel.LEFT); //set vertical position of icon+text within label
		label.setBounds(x, y, 200, 75); //set X,Y coordinate for label relative to its parent panel/frame as well as size of the label
		label.addMouseListener(this);
		return label;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == logOut) {
			
		}
		if(e.getSource() == menuItemHome) {	
			cl.show(contentPanel, HOMEPANEL);
			frame.setVisible(true);
			System.out.println("Home");
		}
		if(e.getSource() == menuItemBooking) {
			cl.show(contentPanel, BOOKINGPANEL);
			java.awt.EventQueue.invokeLater(new Runnable() {
				public void run() {
					new ui_booking().setVisible(true);
				}
			});
			frame.setVisible(true);
			System.out.println("Book");
		}
		if(e.getSource() == menuItemHouse) {
			cl.show(contentPanel, HOUSEPANEL);
			frame.setVisible(true);
			System.out.println("House");
		}
		if(e.getSource() == menuItemFood) {
			cl.show(contentPanel, FOODPANEL);
			frame.setVisible(true);
			System.out.println("Food");
		}
		if(e.getSource() == menuItemSpa) {
			cl.show(contentPanel, ACTIVITYPANEL);
			frame.setVisible(true);
			System.out.println("Spa");
		}
		if(e.getSource() == menuItemBanquet) {
			cl.show(contentPanel, BANQUETPANEL);
			frame.setVisible(true);
			System.out.println("Banquet");
		}
		if(e.getSource() == menuItemBilling) {
			cl.show(contentPanel, BILLINGPANEL);
			frame.setVisible(true);
			System.out.println("billing");
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getSource() == logOut) {

		}		
		if(e.getSource() == userInfo) {
			userInfo.setFont(new Font("Roboto", Font.BOLD, 16));
			userInfo.setForeground(Color.gray);
		}
		if(e.getSource() == menuItemHome) {
			menuItemHome.setFont(new Font("Roboto Condensed", Font.BOLD, 16));
			menuItemHome.setForeground(Color.white);
		}
		if(e.getSource() == menuItemBooking) {
			menuItemBooking.setFont(new Font("Roboto Condensed", Font.BOLD, 16));
			menuItemBooking.setForeground(Color.white);
		}
		if(e.getSource() == menuItemHouse) {
			menuItemHouse.setFont(new Font("Roboto Condensed", Font.BOLD, 16));
			menuItemHouse.setForeground(Color.white);
		}
		if(e.getSource() == menuItemFood) {
			menuItemFood.setFont(new Font("Roboto Condensed", Font.BOLD, 16));
			menuItemFood.setForeground(Color.white);
		}
		if(e.getSource() == menuItemSpa) {
			menuItemSpa.setFont(new Font("Roboto Condensed", Font.BOLD, 16));
			menuItemSpa.setForeground(Color.white);
		}
		if(e.getSource() == menuItemBanquet) {
			menuItemBanquet.setFont(new Font("Roboto Condensed", Font.BOLD, 16));
			menuItemBanquet.setForeground(Color.white);
		}
		if(e.getSource() == menuItemBilling) {
			menuItemBilling.setFont(new Font("Roboto Condensed", Font.BOLD, 16));
			menuItemBilling.setForeground(Color.white);
		}
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.getSource() == logOut) {

		}	
		if(e.getSource() == userInfo) {
			userInfo.setFont(new Font("Roboto", Font.BOLD, 16));
			userInfo.setForeground(Color.black);
		}
		if(e.getSource() == menuItemHome) {
			menuItemHome.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
			menuItemHome.setForeground(colors.getC12grey());
		}
		if(e.getSource() == menuItemBooking) {
			menuItemBooking.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
			menuItemBooking.setForeground(colors.getC12grey());
		}
		if(e.getSource() == menuItemHouse) {
			menuItemHouse.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
			menuItemHouse.setForeground(colors.getC12grey());
		}
		if(e.getSource() == menuItemFood) {
			menuItemFood.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
			menuItemFood.setForeground(colors.getC12grey());
		}
		if(e.getSource() == menuItemSpa) {
			menuItemSpa.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
			menuItemSpa.setForeground(colors.getC12grey());
		}
		if(e.getSource() == menuItemBanquet) {
			menuItemBanquet.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
			menuItemBanquet.setForeground(colors.getC12grey());
		}
		if(e.getSource() == menuItemBilling) {
			menuItemBilling.setFont(new Font("Roboto Condensed", Font.PLAIN, 16));
			menuItemBilling.setForeground(colors.getC12grey());
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}
	
}
