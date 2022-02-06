package main.content;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import main.resources.ColorPallete;


public class HousePanel extends JPanel implements ActionListener{

	private static final long serialVersionUID = 3L;
	
	private JLabel title;
	private JLabel roomNo;
	private JTextField tname;
	private JLabel mno;
	private JTextField tmno;
	private JLabel cleaningType;
	//private ButtonGroup gengp;
	private JLabel time;
	private JComboBox<Object> hour;
	private JComboBox<Object> minute;
	private JComboBox<Object> meridiem;
	private JLabel add;
	private JTextArea message;
	private JCheckBox term;
	private JButton sub;
	private JButton reset;
	private JTextArea tout;
	private JLabel res;
	private JTextArea resadd;
	private JComboBox<Object> box;

	private String hours[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
	private String minutes[] = {"00", "15", "30", "45"};
	private String meridiems[] = {"PM", "AM"};


	public HousePanel() {

		ColorPallete houseColor= new ColorPallete();

		this.setBackground(houseColor.getC1greenishBlue());
		this.setLayout(null);
		this.setBounds(0, 0, 1080, 635);

		title = new JLabel("Housekeeping form");
		title.setFont(new Font("Arial", Font.BOLD, 30));
		title.setBackground(Color.ORANGE);
		title.setOpaque(true);
		title.setSize(300, 30);
		title.setLocation(300, 30);
		this.add(title);

		roomNo = new JLabel("Room No.");
		roomNo.setFont(new Font("Verdana", Font.PLAIN, 20));
		roomNo.setForeground(Color.green);
		roomNo.setSize(100, 20);
		roomNo.setLocation(100, 100);
		this.add(roomNo);

		tname = new JTextField();
		tname.setFont(new Font("Arial", Font.PLAIN, 15));
		tname.setSize(190, 20);
		tname.setLocation(200, 100);
		this.add(tname);

		mno = new JLabel("Mobile");
		mno.setFont(new Font("Verdana", Font.PLAIN, 20));
		mno.setForeground(Color.green);
		mno.setSize(200, 20);
		mno.setLocation(100, 150);
		this.add(mno);

		tmno = new JTextField();
		tmno.setFont(new Font("Arial", Font.PLAIN, 15));
		tmno.setSize(150, 20);
		tmno.setLocation(200, 150);
		this.add(tmno);

		cleaningType = new JLabel("Type");
		cleaningType.setFont(new Font("Verdana", Font.PLAIN, 20));
		cleaningType.setForeground(Color.green);
		cleaningType.setSize(100, 20);
		cleaningType.setLocation(100, 200);
		this.add(cleaningType);

		String[] array = {"Sweeping", "Dusting", "Mopping", "Custom (type in message)"};
		box = new JComboBox<>(array);
		box.setEditable(true);
		box.setSize(190, 20);
		box.setLocation(200, 200);
		this.add(box);

		time = new JLabel("Time");
		time.setFont(new Font("Verdana", Font.PLAIN, 20));
		time.setForeground(Color.green);
		time.setSize(100, 20);
		time.setLocation(100, 250);
		this.add(time);

		hour = new JComboBox<>(hours);
		hour.setFont(new Font("Arial", Font.PLAIN, 15));
		hour.setSize(50, 20);
		hour.setLocation(200, 250);
		this.add(hour);

		minute = new JComboBox<>(minutes);
		minute.setFont(new Font("Arial", Font.PLAIN, 15));
		minute.setSize(60, 20);
		minute.setLocation(250, 250);
		this.add(minute);

		meridiem = new JComboBox<>(meridiems);
		meridiem.setFont(new Font("Arial", Font.PLAIN, 15));
		meridiem.setSize(60, 20);
		meridiem.setLocation(320, 250);
		this.add(meridiem);

		add = new JLabel("Message");
		add.setFont(new Font("Verdana", Font.PLAIN, 20));
		add.setForeground(Color.green);
		add.setSize(100, 20);
		add.setLocation(100, 300);
		this.add(add);

		message = new JTextArea();
		message.setFont(new Font("Arial", Font.PLAIN, 15));
		message.setSize(200, 75);
		message.setLocation(200, 300);
		message.setLineWrap(true);
		this.add(message);

		sub = new JButton("Submit");
		sub.setFont(new Font("Arial", Font.PLAIN, 15));
		sub.setBackground(new Color(0x0087CEEB));
		sub.setSize(100, 20);
		sub.setLocation(150, 450);
		sub.addActionListener(this);
		this.add(sub);

		reset = new JButton("Reset");
		reset.setFont(new Font("Arial", Font.PLAIN, 15));
		reset.setBackground(new Color(0x0087CEEB));
		reset.setSize(100, 20);
		reset.setLocation(270, 450);
		reset.addActionListener(this);
		this.add(reset);

		tout = new JTextArea();
		tout.setFont(new Font("Arial", Font.PLAIN, 15));
		tout.setSize(300, 400);
		tout.setLocation(500, 100);
		tout.setLineWrap(true);
		tout.setEditable(false);
		this.add(tout);

		res = new JLabel("");
		res.setFont(new Font("Arial", Font.PLAIN, 20));
		res.setSize(500, 25);
		res.setLocation(100, 500);
		this.add(res);

		resadd = new JTextArea();
		resadd.setFont(new Font("Arial", Font.PLAIN, 15));
		resadd.setSize(200, 75);
		resadd.setLocation(580, 175);
		resadd.setLineWrap(true);
		this.add(resadd);

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == sub) {
			String data1;
			if (box.getSelectedIndex() == 0) {
				data1 = "Sweeping";
			} else if (box.getSelectedIndex() == 1) {
				data1 = "Dusting";
			} else if (box.getSelectedIndex() == 2) {
				data1 = "Mopping";
			} else {
				data1 = "";
			}

			String data2 = (String) hour.getSelectedItem() + ":" + (String) minute.getSelectedItem() + " " + (String) meridiem.getSelectedItem();

//			s = new SqlStatementManager();
//			try {
//				s.enter(tname.getText(), tmno.getText(), data1, data2, message.getText());
//			} catch (Exception e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}

			String data0  = "Room No. : " + tname.getText() + "\n" + "Mobile : " + tmno.getText() + "\n";
	
			data1= "Type : "+data1+ "\n";
			data2= "Preffered Time : "+ data2 + "\n";
			String data3= "Message : " + message.getText();
	
			tout.setText(data0 + data1 + data2 + data3);
			tout.setEditable(false);
		}
		else if (e.getSource() == reset) {
			String def = "";
			tname.setText(def);
			message.setText(def);
			tmno.setText(def);
			res.setText(def);
			tout.setText(def);
			term.setSelected(false);
			hour.setSelectedIndex(0);
			minute.setSelectedIndex(0);
			meridiem.setSelectedIndex(0);
			resadd.setText(def);
		}
		
	}

}
