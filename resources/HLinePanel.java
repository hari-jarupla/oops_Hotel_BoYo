package main.resources;

import javax.swing.JPanel;
import java.awt.*;

public class HLinePanel extends JPanel{	

	private static final long serialVersionUID = 9L;

	@Override public void paint(Graphics g) {
        //Get the current size of this component
        Dimension d = this.getSize();

        //draw in black
        g.setColor(Color.BLACK);
        //draw a centered horizontal line
        g.drawLine(0,d.height/2,d.width,d.height/2);
    }
	
}
