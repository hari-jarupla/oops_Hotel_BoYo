package main.content;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import main.resources.ColorPallete;
import main.resources.RoundedPanel;

public class FoodPanel extends JPanel implements ActionListener{

	private static final long serialVersionUID = 4L;
	
	JButton foodItem1;
	JButton foodItem2;
	JButton foodItem3;
	JButton foodItem4;
	JButton foodItem5;
	JButton foodItem6;
	JButton bevItem1;
	JButton bevItem2;
	JButton bevItem3;
	JButton bevItem4;
	JButton bevItem5;
	JButton bevItem6;
	JRadioButton orderType1 = new JRadioButton();
	JRadioButton orderType2 = new JRadioButton();
	JRadioButton orderType3 = new JRadioButton();
	JButton orderButton = new JButton();

	public FoodPanel() {
		this.setSize(1080,635);
		this.setLayout(null);
		this.setBackground(new ColorPallete().getC13green());

		JLabel foodLabel = new JLabel("Food");
		foodLabel.setBounds(new Rectangle(25, 10, 300, 50));
		foodLabel.setFont(new Font(null, Font.BOLD, 35));
		foodLabel.setHorizontalAlignment(JLabel.LEFT);
		this.add(foodLabel);

		foodItem1 = new JButton();
		foodItem1.setBounds(new Rectangle(100, 80, 75, 75));
		foodItem1.setIcon(new ImageIcon(new ImageIcon("src/main/resources/images/FoodImages/foodItem1.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
		this.add(foodItem1);

		JLabel foodItemName1 = new JLabel("ItemName");
		foodItemName1.setBounds(new Rectangle(100, 160, 75, 15));
		foodItemName1.setHorizontalAlignment(JLabel.CENTER);
		this.add(foodItemName1);

		foodItem2 = new JButton();
		foodItem2.setBounds(new Rectangle(250, 80, 75, 75));
		foodItem2.setIcon(new ImageIcon(new ImageIcon("src/main/resources/images/FoodImages/foodItem2.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
		this.add(foodItem2);

		JLabel foodItemName2 = new JLabel("ItemName");
		foodItemName2.setBounds(new Rectangle(250, 160, 75, 15));
		foodItemName2.setHorizontalAlignment(JLabel.CENTER);
		this.add(foodItemName2);

		foodItem3 = new JButton();
		foodItem3.setBounds(new Rectangle(400, 80, 75, 75));
		foodItem3.setIcon(new ImageIcon(new ImageIcon("src/main/resources/images/FoodImages/foodItem3.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
		this.add(foodItem3);

		JLabel foodItemName3 = new JLabel("ItemName");
		foodItemName3.setBounds(new Rectangle(400, 160, 75, 15));
		foodItemName3.setHorizontalAlignment(JLabel.CENTER);
		this.add(foodItemName3);

		foodItem4 = new JButton();
		foodItem4.setBounds(new Rectangle(550, 80, 75, 75));
		foodItem4.setIcon(new ImageIcon(new ImageIcon("src/main/resources/images/FoodImages/foodItem4.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
		this.add(foodItem4);

		JLabel foodItemName4 = new JLabel("ItemName");
		foodItemName4.setBounds(new Rectangle(550, 160, 75, 15));
		foodItemName4.setHorizontalAlignment(JLabel.CENTER);
		this.add(foodItemName4);

		foodItem5 = new JButton();
		foodItem5.setBounds(new Rectangle(700, 80, 75, 75));
		foodItem5.setIcon(new ImageIcon(new ImageIcon("src/main/resources/images/FoodImages/foodItem5.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
		this.add(foodItem5);

		JLabel foodItemName5 = new JLabel("ItemName");
		foodItemName5.setBounds(new Rectangle(700, 160, 75, 15));
		foodItemName5.setHorizontalAlignment(JLabel.CENTER);
		this.add(foodItemName5);

		foodItem6 = new JButton();
		foodItem6.setBounds(new Rectangle(850, 80, 75, 75));
		foodItem6.setIcon(new ImageIcon(new ImageIcon("src/main/resources/images/FoodImages/foodItem6.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
		this.add(foodItem6);

		JLabel foodItemName6 = new JLabel("ItemName");
		foodItemName6.setBounds(new Rectangle(850, 160, 75, 15));
		foodItemName6.setHorizontalAlignment(JLabel.CENTER);
		this.add(foodItemName6);

		JLabel bevLabel = new JLabel("Beverage");
		bevLabel.setBounds(new Rectangle(25, 190, 300, 50));
		bevLabel.setFont(new Font(null, Font.BOLD, 35));
		bevLabel.setHorizontalAlignment(JLabel.LEFT);
		this.add(bevLabel);

		bevItem1 = new JButton();
		bevItem1.setBounds(new Rectangle(100, 260, 75, 75));
		bevItem1.setIcon(new ImageIcon(new ImageIcon("src/main/resources/images/FoodImages/bevItem1.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
		this.add(bevItem1);

		JLabel bevItemName1 = new JLabel("ItemName");
		bevItemName1.setBounds(new Rectangle(100, 340, 75, 15));
		bevItemName1.setHorizontalAlignment(JLabel.CENTER);
		this.add(bevItemName1);

		bevItem2 = new JButton();
		bevItem2.setBounds(new Rectangle(250, 260, 75, 75));
		bevItem2.setIcon(new ImageIcon(new ImageIcon("src/main/resources/images/FoodImages/bevItem2.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
		this.add(bevItem2);

		JLabel bevItemName2 = new JLabel("ItemName");
		bevItemName2.setBounds(new Rectangle(250, 340, 75, 15));
		bevItemName2.setHorizontalAlignment(JLabel.CENTER);
		this.add(bevItemName2);

		bevItem3 = new JButton();
		bevItem3.setBounds(new Rectangle(400, 260, 75, 75));
		bevItem3.setIcon(new ImageIcon(new ImageIcon("src/main/resources/images/FoodImages/bevItem3.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
		this.add(bevItem3);

		JLabel bevItemName3 = new JLabel("ItemName");
		bevItemName3.setBounds(new Rectangle(400, 340, 75, 15));
		bevItemName3.setHorizontalAlignment(JLabel.CENTER);
		this.add(bevItemName3);

		bevItem4 = new JButton();
		bevItem4.setBounds(new Rectangle(550, 260, 75, 75));
		bevItem4.setIcon(new ImageIcon(new ImageIcon("src/main/resources/images/FoodImages/bevItem4.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
		this.add(bevItem4);

		JLabel bevItemName4 = new JLabel("ItemName");
		bevItemName4.setBounds(new Rectangle(550, 340, 75, 15));
		bevItemName4.setHorizontalAlignment(JLabel.CENTER);
		this.add(bevItemName4);

		bevItem5 = new JButton();
		bevItem5.setBounds(new Rectangle(700, 260, 75, 75));
		bevItem5.setIcon(new ImageIcon(new ImageIcon("src/main/resources/images/FoodImages/bevItem5.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
		this.add(bevItem5);

		JLabel bevItemName5 = new JLabel("ItemName");
		bevItemName5.setBounds(new Rectangle(700, 340, 75, 15));
		bevItemName5.setHorizontalAlignment(JLabel.CENTER);
		this.add(bevItemName5);

		bevItem6 = new JButton();
		bevItem6.setBounds(new Rectangle(850, 260, 75, 75));
		bevItem6.setIcon(new ImageIcon(new ImageIcon("src/main/resources/images/FoodImages/bevItem6.png").getImage().getScaledInstance(75, 75, Image.SCALE_DEFAULT)));
		this.add(bevItem6);

		JLabel bevItemName6 = new JLabel("ItemName");
		bevItemName6.setBounds(new Rectangle(850, 340, 75, 15));
		bevItemName6.setHorizontalAlignment(JLabel.CENTER);
		this.add(bevItemName6);

		JPanel customerDetailsPanel = new RoundedPanel(2);
		customerDetailsPanel.setLayout(null);
		customerDetailsPanel.setBounds(new Rectangle(100, 380, 400, 200));
		customerDetailsPanel.setBorder(BorderFactory.createTitledBorder("Customer details"));
		this.add(customerDetailsPanel);

		JPanel cartPanel = new RoundedPanel(2);
		cartPanel.setLayout(null);
		cartPanel.setBounds(new Rectangle(580, 380, 400, 150));
		cartPanel.setBorder(BorderFactory.createTitledBorder("Food Cart"));
		this.add(cartPanel);

		JLabel roomNum = new JLabel("Room No :");
		roomNum.setBounds(10, 30, 100, 30);
		roomNum.setFont(new Font(null, Font.PLAIN, 15));
		roomNum.setHorizontalAlignment(JLabel.LEADING);
		roomNum.setForeground(new ColorPallete().getC9darkBlue());
		customerDetailsPanel.add(roomNum);

		JTextField roomNumField = new JTextField();
		roomNumField.setBounds(110, 30, 100, 30);
		customerDetailsPanel.add(roomNumField);

		JLabel orderTypeLabel = new JLabel("Order Type :");
		orderTypeLabel.setBounds(10, 80, 90, 30);
		orderTypeLabel.setFont(new Font(null, Font.PLAIN, 15));
		orderTypeLabel.setHorizontalAlignment(JLabel.LEADING);
		orderTypeLabel.setForeground(new ColorPallete().getC9darkBlue());
		customerDetailsPanel.add(orderTypeLabel);

		orderType1.setText("Type1");
		orderType1.setFont(new Font(null, Font.PLAIN, 15));
		orderType1.setBounds(100, 80, 90, 30);
		orderType1.setVerticalTextPosition(JRadioButton.CENTER);
		orderType1.setHorizontalAlignment(JRadioButton.CENTER);
		orderType1.setForeground(Color.BLACK);
		orderType1.setFocusPainted(false);
		orderType1.setSelected(true);
		customerDetailsPanel.add(orderType1);

		orderType2.setText("Type2");
		orderType2.setFont(new Font(null, Font.PLAIN, 15));
		orderType2.setBounds(200, 80, 90, 30);
		orderType2.setVerticalTextPosition(JRadioButton.CENTER);
		orderType2.setHorizontalAlignment(JRadioButton.CENTER);
		orderType2.setForeground(Color.BLACK);
		orderType2.setFocusPainted(false);
		customerDetailsPanel.add(orderType2);

		orderType3.setText("Type3");
		orderType3.setFont(new Font(null, Font.PLAIN, 15));
		orderType3.setBounds(300, 80, 90, 30);
		orderType3.setVerticalTextPosition(JRadioButton.CENTER);
		orderType3.setHorizontalAlignment(JRadioButton.CENTER);
		orderType3.setForeground(Color.BLACK);
		orderType3.setFocusPainted(false);
		customerDetailsPanel.add(orderType3);

		ButtonGroup groupRole = new ButtonGroup();
		groupRole.add(orderType1);
		groupRole.add(orderType2);
		groupRole.add(orderType3);

		orderButton.setText("Order");
		orderButton.setBounds(150, 150, 100, 35);
		orderButton.setFont(new Font(null, Font.PLAIN, 25));
		orderButton.setHorizontalAlignment(JButton.CENTER);
		orderButton.setVerticalAlignment(JButton.CENTER);
		orderButton.setFocusable(false);
		orderButton.setForeground(new ColorPallete().getC13green());
		orderButton.setBorderPainted(false);
		orderButton.setBackground(Color.BLACK);
		orderButton.addActionListener(this);
		customerDetailsPanel.add(orderButton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}
	
}
