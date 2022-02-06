package main.content;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import main.resources.RoundedPanel;

public class BanquetPanel extends JPanel{

	private static final long serialVersionUID = 6L;
	
	JLabel Corporate_title;
	JLabel Public_title;
	JLabel Main_title_banquets;
	JLabel title_party;
	JLabel performer;
	JLabel title_meet;

	JPanel Party_panel;
	JPanel Meet_panel;

	JComboBox<Object> performers;
	JComboBox<Object> SessionTime;
	JComboBox<Object> tech_support;
	JComboBox<Object> numberOfPeople;

	JButton food_button;
	JButton Birthday_button;
	JButton Wedding_button;
	JButton Custom_button;

	public BanquetPanel() {

		super();
		this.setBackground(new Color(0xe609c4));
		this.setLayout(null);
		this.setBounds(0, 0, 1080, 635);

		String[] sessionDuration={"10 AM - 11 AM","11 AM - 12 PM","12 PM - 01 PM","01 PM - 02 PM","02 PM - 03 PM","03 PM - 04 PM","04 PM - 05 PM","05 PM - 06 PM"};
		SessionTime=new JComboBox<>(sessionDuration);
		SessionTime.setSelectedIndex(0);
		SessionTime.setEditable(false);
		SessionTime.setFocusable(false);
		SessionTime.setBounds(550,150,150,50);

		JLabel label2=new JLabel("Session Time:");
		label2.setBounds(380,150,300,50);
		label2.setFont(new Font("Consolas",Font.BOLD,20));
		label2.setForeground(Color.cyan);
		this.add(label2);
		this.add(SessionTime);

		JLabel label1=new JLabel("Number of People:");
		label1.setBounds(350,120,200,20);
		label1.setFont(new Font("Consolas",Font.BOLD,20));
		label1.setForeground(Color.cyan);
		this.add(label1);

		String[] number_people={"25","100","150","200","More than 200"};
		numberOfPeople=new JComboBox<>(number_people);
		numberOfPeople.setBounds(550,100,100,40);
		numberOfPeople.setFocusable(false);
		this.add(numberOfPeople);


		Main_title_banquets=new JLabel("Banquets & Halls");
		Main_title_banquets.setBounds(350,20,400,40);
		Main_title_banquets.setFont(new Font("MV Boli",Font.ITALIC,40));
		Main_title_banquets.setForeground(new Color(0x3c0080));
		this.add(Main_title_banquets);

		Party_panel=new RoundedPanel(5);
		Party_panel.setBounds(20,250,450,350);
		Party_panel.setLayout(null);
		Party_panel.setBackground(new Color(0x120c33));
		this.add(Party_panel);

		Birthday_button=new JButton("BIRTHDAY");
		Birthday_button.setFocusable(false);
		Birthday_button.setForeground(new Color(0x80031c));
		Birthday_button.setBackground(new Color(0xff9696));
		Birthday_button.setBounds(20,50,100,40);
		Party_panel.add(Birthday_button);

		Wedding_button=new JButton("WEDDING");
		Wedding_button.setFocusable(false);
		Wedding_button.setForeground(new Color(0x8c007e));
		Wedding_button.setBackground(new Color(0xff73fd));
		Wedding_button.setBounds(170,50,100,40);
		Party_panel.add(Wedding_button);

		Custom_button=new JButton("CUSTOM");
		Custom_button.setFocusable(false);
		Custom_button.setForeground(new Color(0x010154));
		Custom_button.setBackground(new Color(0x6969f5));
		Custom_button.setBounds(320,50,100,40);
		Party_panel.add(Custom_button);

		title_party=new JLabel("HOST A PARTY!");
		title_party.setForeground(new Color(0x05fafa));
		title_party.setBounds(140,20,200,20);
		title_party.setFont(new Font("Consolas",Font.BOLD,20));
		Party_panel.add(title_party);

		performer=new JLabel("performers:");
		performer.setFont(new Font("Consolas",Font.BOLD,20));
		performer.setBounds(20,160,150,20);
		performer.setForeground(Color.cyan);
		Party_panel.add(performer);

		String[] list_performers={"Artist","Singer","Dancer","DJ","Host"};
		performers=new JComboBox<>(list_performers);
		performers.setBounds(150,150,80,40);
		performers.setFocusable(false);
		Party_panel.add(performers);

		food_button=new JButton("FOOD AND BEVERAGES");
		food_button.setBounds(700,100,300,40);
		food_button.setFocusable(false);
		food_button.setFont(new Font("Consolas",Font.BOLD,20));
		food_button.setForeground(new Color(0x380c36));
		food_button.setBackground(new Color(0xffa1fa));
		this.add(food_button);

		Meet_panel=new RoundedPanel(5);
		Meet_panel.setBounds(580,250,450,350);
		Meet_panel.setLayout(null);
		Meet_panel.setBackground(new Color(0x9dfc0d));
		this.add(Meet_panel);

		title_meet=new JLabel("HOST A MEETING!");
		title_meet.setForeground(new Color(0x47008a));
		title_meet.setBounds(140,20,200,20);
		title_meet.setFont(new Font("Consolas",Font.BOLD,20));
		Meet_panel.add(title_meet);

		JLabel label4=new JLabel("Tech Support:");
		label4.setFont(new Font("Consolas",Font.BOLD,20));
		label4.setBounds(20,160,150,20);
		label4.setForeground(Color.darkGray);
		Meet_panel.add(label4);

		String[] list_tech_team={"Projecter & Screen","Laptop","Green Screen","Portable utilities","VRs"};
		tech_support=new JComboBox<>(list_tech_team);
		tech_support.setBounds(170,150,150,40);
		tech_support.setFocusable(false);
		Meet_panel.add(tech_support);
	}
}
