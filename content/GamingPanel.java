package main.content;

import java.awt.Color;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class GamingPanel extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	JComboBox<Object> numberOfPeople;
    JComboBox<Object> SessionTime;
    JPanel panel2;
    JLabel title;
    JButton backButton;
    JLabel movingFigure1;
    JLabel movingFigure2;
    JRadioButton Adults_button;
    JRadioButton Kids_button;
    JComboBox<Object> List_KidsActivities;
    JComboBox<Object> List_AdultsActivities;
    JButton Submit_button;
    public GamingPanel(){

        this.setSize(1080,635);
        this.setLayout(new BorderLayout());

        panel2=new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(151,768,1080,635);
        panel2.setBackground(new Color(0xb734eb));
        this.add(panel2);

        Integer[] NumberOfPeople={1,2,3,4,5,6,7,8,9,10};
        numberOfPeople=new JComboBox<>(NumberOfPeople);
        numberOfPeople.setSelectedIndex(0);
        numberOfPeople.setEditable(false);
        numberOfPeople.setBounds(550,284,100,50);

        JLabel label1=new JLabel("Number of people:");
        label1.setBounds(360,284,200,50);
        label1.setFont(new Font("Consolas",Font.BOLD,20));
        label1.setForeground(new Color(0xbde619));
        label1.add(numberOfPeople);
        panel2.add(label1);
        panel2.add(numberOfPeople);

        String[] sessionDuration={"1 hr","2 hrs","3 hrs","4 hrs"};
        SessionTime=new JComboBox<>(sessionDuration);
        SessionTime.setSelectedIndex(0);
        SessionTime.setEditable(false);
        SessionTime.setBounds(550,400,100,50);


        JLabel label2=new JLabel("Session Time:");
        label2.setBounds(400,400,300,50);
        label2.setFont(new Font("Consolas",Font.BOLD,20));
        label2.setForeground(new Color(0xbde619));
        label2.add(SessionTime);
        panel2.add(label2);
        panel2.add(SessionTime);

        title=new JLabel();
        title.setText("Indoor Activities");
        title.setBounds(500,50,240,30);
        title.setFont(new Font("Arial",Font.BOLD,30));
        title.setOpaque(true);
        title.setForeground(new Color(0x34eba5));
        title.setBackground(new Color(0xeb4634));
        panel2.add(title);


        movingFigure1=new JLabel();
        ImageIcon image1=new ImageIcon("gif1.gif");
        movingFigure1.setIcon(image1);
        movingFigure1.setBounds(850,100,300,300);
        panel2.add(movingFigure1);

        movingFigure2=new JLabel();
        ImageIcon image2=new ImageIcon("gif1.gif");
        movingFigure2.setIcon(image2);
        movingFigure2.setBounds(850,420,300,300);
        panel2.add(movingFigure2);
        
        backButton = new JButton();
        backButton.setText("Back");
		backButton.setBounds(10, 10, 100, 50);
		backButton.setFont(new Font(null, Font.PLAIN, 25));
		backButton.setHorizontalAlignment(JButton.CENTER);
		backButton.setVerticalAlignment(JButton.CENTER);
		backButton.setFocusable(false);
		backButton.setForeground(Color.white);
		backButton.setBorderPainted(false);
		backButton.setBackground(Color.BLACK);
		backButton.addActionListener(this);
        panel2.add(backButton);

        Adults_button=new JRadioButton("ADULTS");
        Adults_button.setBounds(100,100,100,45);
        Adults_button.setFocusable(false);
        Adults_button.setBackground(new Color(0x02d43a));
        Adults_button.setForeground(Color.black);
        Adults_button.addActionListener(this);

        Kids_button=new JRadioButton("KIDS");
        Kids_button.setBounds(350,100,100,45);
        Kids_button.setFocusable(false);
        Kids_button.setBackground(new Color(0x02d43a));
        Kids_button.setForeground(Color.black);
        Kids_button.addActionListener(this);

        ButtonGroup b=new ButtonGroup();
        b.add(Kids_button);
        b.add(Adults_button);

        panel2.add(Adults_button);
        panel2.add(Kids_button);

        List_KidsActivities=new JComboBox<>();
        String[] list_kids={"Carrom","Mini-Library","Fun-Area"};
        List_KidsActivities=new JComboBox<>(list_kids);
        List_KidsActivities.setSelectedIndex(0);
        List_KidsActivities.setEditable(false);
        List_KidsActivities.setVisible(false);
        List_KidsActivities.setBounds(350,200,100,50);


        List_AdultsActivities=new JComboBox<>();
        String[] list_adults={"Pool","Billiards","Badminton"};
        List_AdultsActivities=new JComboBox<>(list_adults);
        List_AdultsActivities.setSelectedIndex(0);
        List_AdultsActivities.setVisible(false);
        List_AdultsActivities.setEditable(false);
        List_AdultsActivities.setFocusable(false);
        List_AdultsActivities.setBounds(100,200,100,50);

        panel2.add(List_KidsActivities);
        panel2.add(List_AdultsActivities);

        Submit_button=new JButton("SUBMIT");
        Submit_button.setForeground(Color.black);
        Submit_button.setBackground(Color.blue);
        Submit_button.setFocusable(false);
        Submit_button.setBounds(500,500,100,50);
        panel2.add(Submit_button);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Kids_button){
            List_KidsActivities.setVisible(true);
            List_AdultsActivities.setVisible(false);
        }
        if(e.getSource()==Adults_button){
            List_AdultsActivities.setVisible(true);
            List_KidsActivities.setVisible(false);
        }
        if(e.getSource() == backButton) {
    		this.removeAll();
        	this.revalidate();
        	this.add(new ActivitiesPanel());
        	this.repaint();
            this.validate();
    	}
    }
	
}
