package main.content;

import java.awt.*;
import javax.swing.*;

public class BookingPanel extends JPanel{

	private static final long serialVersionUID = 2L;
	
	public BookingPanel() {
		this.setBackground(Color.BLACK);
		this.setLayout(null);
		JLabel imageLabel = new JLabel();
		imageLabel.setBounds(0, 0, 1080, 635);
		imageLabel.setIcon(new ImageIcon(new ImageIcon("src/main/resources/images/Booking/hotel-book.jpg").getImage().getScaledInstance(1080, 635, Image.SCALE_DEFAULT)));
		this.setBounds(0, 0, 1080, 635);
		this.add(imageLabel);
	}
}
