package main.content;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class GymPanel extends JPanel implements ActionListener{
	
	private static final long serialVersionUID = 1L;
    
	JComboBox<?> numberOfPeople;
    JComboBox<?> SessionTime;
    JPanel dashbar;
    JPanel panel2;
    JLabel title;
    JButton backButton;
    JLabel movingFigure1;
    JLabel movingFigure2;

	JComboBox<?> List_GymActivities;
    JButton Submit_button;
    public GymPanel(){
        this.setSize(1080,635);
        this.setLayout(new BorderLayout());

        panel2=new JPanel();
        panel2.setLayout(null);
        panel2.setBounds(151,768,1080,635);
        panel2.setBackground(new Color(0x19e6ce));
        this.add(panel2);

        Integer[] NumberOfPeople={1,2,3,4,5,6,7,8,9,10};
        numberOfPeople= new JComboBox<Object>(NumberOfPeople);
        numberOfPeople.setSelectedIndex(0);
        numberOfPeople.setEditable(false);
        numberOfPeople.setBounds(550,284,100,50);

        JLabel label1 = new JLabel("Number of people:");
        label1.setBounds(360,284,200,50);
        label1.setFont(new Font("Consolas",Font.BOLD,20));
        label1.setForeground(new Color(0x008a07));
        panel2.add(label1);
        panel2.add(numberOfPeople);

        String[] sessionDuration={"1 hr","2 hrs","3 hrs","4 hrs"};
        SessionTime=new JComboBox<Object>(sessionDuration);
        SessionTime.setSelectedIndex(0);
        SessionTime.setEditable(false);
        SessionTime.setBounds(550,400,100,50);


        JLabel label2=new JLabel("Session Time:");
        label2.setBounds(400,400,300,50);
        label2.setFont(new Font("Consolas",Font.BOLD,20));
        label2.setForeground(new Color(0x008a07));
        panel2.add(label2);
        panel2.add(SessionTime);

        title=new JLabel();
        title.setText("GYM");
        title.setBounds(500,50,80,30);
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

        JLabel label3=new JLabel("Gym Activities:");
        label3.setBounds(330,150,200,50);
        label3.setFont(new Font("Consolas",Font.BOLD,20));
        label3.setForeground(new Color(0x008a07));
        panel2.add(label3);

        List_GymActivities=new JComboBox<Object>();
        String[] list_activities={"Cardio","Back","Biceps & Triceps","Lower body","Chest & Shoulders","Calisthenics"};
        List_GymActivities=new JComboBox<Object>(list_activities);
        List_GymActivities.setEditable(false);
        List_GymActivities.setBounds(500,150,200,50);

        panel2.add(List_GymActivities);

        Submit_button=new JButton("SUBMIT");
        Submit_button.setForeground(Color.black);
        Submit_button.setBackground(new Color(0x199be6));
        Submit_button.setFocusable(false);
        Submit_button.setBounds(500,500,100,50);
        panel2.add(Submit_button);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    	if(e.getSource() == backButton) {
    		this.removeAll();
        	this.revalidate();
        	this.add(new ActivitiesPanel());
        	this.repaint();
            this.validate();
    	}
    }
	
}
