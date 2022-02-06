package main.content;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ActivitiesPanel extends JPanel implements MouseListener{

	private static final long serialVersionUID = 1L;
	
	JPanel homePanel = new JPanel();
	SpaPanel spaPanel = new SpaPanel();
	GymPanel gymPanel = new GymPanel();
	GamingPanel gamingPanel = new GamingPanel();
	
    JButton spaButton;
    JButton gymButton;
    JButton gamingButton;
    JButton backButton;
    
    List<JComponent> window1Contents = new ArrayList<JComponent>();
    List<JComponent> window2Contents = new ArrayList<JComponent>();
    List<JComponent> window3Contents = new ArrayList<JComponent>();
    int panelToShow = 0; // 0 - First "panel",  1 - Second "panel" , 2 - 3rd panel, 3 - 4th panel
    
	
	public ActivitiesPanel() {
		this.setBackground(Color.white);
		this.setLayout(null);
		this.setBounds(0, 0, 1080, 635);
		
		homePanel.setBackground(getBackground());
		homePanel.setLayout(null);
		homePanel.setBounds(0, 0, 1080, 635);
		
		spaButton = new JButton();
        spaButton.addMouseListener(this);
        spaButton.setIcon(new ImageIcon(new ImageIcon("src/main/resources/images/spa/spa.png").getImage().getScaledInstance(300, 500, Image.SCALE_DEFAULT)));
        spaButton.setBounds(new Rectangle(45, 30, 300, 500));
        homePanel.add(spaButton);

        JLabel spaLabel = new JLabel("SPA");
        spaLabel.setBounds(new Rectangle(45, 515, 300, 100));
        spaLabel.setFont(new Font(null, Font.PLAIN, 45));
        spaLabel.setHorizontalAlignment(JLabel.CENTER);
        homePanel.add(spaLabel);

        gymButton = new JButton();
        gymButton.addMouseListener(this);
        gymButton.setIcon(new ImageIcon(new ImageIcon("src/main/resources/images/spa/gym.png").getImage().getScaledInstance(300, 500, Image.SCALE_DEFAULT)));
        gymButton.setBounds(new Rectangle(390, 30, 300, 500));
        homePanel.add(gymButton);

        JLabel gymLabel = new JLabel("GYM");
        gymLabel.setBounds(new Rectangle(390, 515, 300, 100));
        gymLabel.setFont(new Font(null, Font.PLAIN, 45));
        gymLabel.setHorizontalAlignment(JLabel.CENTER);
        homePanel.add(gymLabel);

        gamingButton = new JButton();
        gamingButton.addMouseListener(this);
        gamingButton.setIcon(new ImageIcon(new ImageIcon("src/main/resources/images/spa/gaming.png").getImage().getScaledInstance(300, 500, Image.SCALE_DEFAULT)));
        gamingButton.setBounds(new Rectangle(735, 30, 300, 500));
        homePanel.add(gamingButton);

        JLabel gameLabel = new JLabel("GAMES");
        gameLabel.setBounds(new Rectangle(735, 515, 300, 100));
        gameLabel.setFont(new Font(null, Font.PLAIN, 45));
        gameLabel.setHorizontalAlignment(JLabel.CENTER);
        homePanel.add(gameLabel);
        
        this.add(homePanel);
		
		window1Contents.add(spaPanel);
		window2Contents.add(gymPanel);
		window3Contents.add(gamingPanel);
		
	}
	
	private void addComponents(int panelNo) {
        if (panelNo == 0) {
            for (JComponent component : window1Contents) {
                this.removeAll();
                this.revalidate();
                this.add(component);
            }
        } else if (panelNo == 1){
            for (JComponent component : window2Contents) {
            	this.removeAll();
            	this.revalidate();
            	this.add(component);
            }
        } else if (panelNo == 2){
            for (JComponent component : window3Contents) {
            	this.removeAll();
            	this.revalidate();
            	this.add(component);
            }
        } else {
        	System.out.println("error 102");
        }
        this.repaint();
        this.validate();
    }

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == spaButton) {
			addComponents(panelToShow = 0);
		}
		if(e.getSource() == gymButton) {
			addComponents(panelToShow = 1);
		}
		if(e.getSource() == gamingButton) {
			addComponents(panelToShow = 2);
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

}
