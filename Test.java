package main;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import main.content.BanquetPanel;
import main.content.HomePanel;

public class Test {

	public static void main(String[] args) {
		//Home home = new Home();
		
		JFrame frame = new JFrame();
		frame.setTitle("Hotel BoYo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon im1 = new ImageIcon("kitten.png");
		frame.setIconImage(im1.getImage());		
		frame.setResizable(false);
		frame.setSize(1280, 720);
		frame.setLayout(null);		
		
		frame.add(new BanquetPanel());

		frame.setVisible(true);
	}

}
