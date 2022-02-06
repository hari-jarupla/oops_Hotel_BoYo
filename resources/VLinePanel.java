package main.resources;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import javax.swing.JPanel;

public class VLinePanel extends JPanel{
	private static final long serialVersionUID = 10L;

	@Override public void paint(Graphics g) {
		super.paintComponent(g);
        //Get the current size of this component
        Dimension d = this.getSize();
    
        Line2D verticalLine = new Line2D.Float(d.width / 2, 0,d.width / 2, d.height);
        
        g.setColor(Color.BLACK);

        Graphics2D g2 = (Graphics2D) g;

        g2.draw(verticalLine);
    }
}
