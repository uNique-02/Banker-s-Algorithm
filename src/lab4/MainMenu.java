package lab4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenu {
	
	final int WIDTH = 600, HEIGHT = 450;
    final Dimension gameDimension = new Dimension(WIDTH, HEIGHT);
    JPanel panel;
    Input inputPage;
    Help helpPage;
    
	MainMenu(JFrame mainFrame){
		panel = new JPanel();
		panel.setPreferredSize(gameDimension);
		panel.setBackground(new Color(255,255,255));
		panel.setVisible(true);
		panel.setLayout(new BorderLayout());
		initComponents(mainFrame, panel);
		
	}
	
	public void initComponents(JFrame mainFrame, JPanel panel) {
		
		JLabel start = new JLabel();
        ImageIcon startIcon = new ImageIcon(this.getClass().getResource("resources/start.png"));
        Image startIconCopy = startIcon.getImage().getScaledInstance(181, 65, Image.SCALE_SMOOTH);
        ImageIcon tempstart = new ImageIcon(startIconCopy);
        start.setIcon(tempstart); 
        start.setBounds(330, 180, 181, 65);
        start.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        start.addMouseListener(new MouseAdapter(){
        	public void mouseClicked(MouseEvent e) {
        		mainFrame.remove(mainFrame.getContentPane());
        		inputPage = new Input(mainFrame);
        		mainFrame.setContentPane(inputPage.getPanel());
        		mainFrame.revalidate();
        		mainFrame.repaint();
        		mainFrame.pack();
        		
        	}
        	@Override
            public void mouseEntered(MouseEvent me) {
        		
            }
            
        	@Override 
        	public void mouseExited (MouseEvent e){
        		
        	}
        });
        panel.add(start);
        
        JLabel help = new JLabel();
        ImageIcon helpIcon = new ImageIcon(this.getClass().getResource("resources/help.png"));
        Image helpIconCopy = helpIcon.getImage().getScaledInstance(181, 65, Image.SCALE_SMOOTH);
        ImageIcon temphelp = new ImageIcon(helpIconCopy);
        help.setIcon(temphelp);
        help.setBounds(330, 260, 181, 65);
        help.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        help.addMouseListener(new MouseAdapter(){
        	public void mouseClicked(MouseEvent e) {
        		helpPage = new Help(mainFrame);
        		mainFrame.remove(mainFrame.getContentPane());
        		mainFrame.setContentPane(helpPage.getPanel());
        		mainFrame.revalidate();
        		mainFrame.repaint();
        		mainFrame.pack();
        		
        	}
        	@Override
            public void mouseEntered(MouseEvent me) {
        		
            }
            
        	@Override 
        	public void mouseExited (MouseEvent e){
        		
        	}
        });
        panel.add(help);
        
        JLabel exit = new JLabel();
        ImageIcon exitIcon = new ImageIcon(this.getClass().getResource("resources/exit.png"));
        Image exitIconCopy = exitIcon.getImage().getScaledInstance(181, 65, Image.SCALE_SMOOTH);
        ImageIcon tempexit = new ImageIcon(exitIconCopy);
        exit.setIcon(tempexit);
        exit.setBounds(330, 340, 181, 65);
        exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        exit.addMouseListener(new MouseAdapter(){
        	public void mouseClicked(MouseEvent e) {
        		mainFrame.dispose();
        
        	}
        	@Override
            public void mouseEntered(MouseEvent me) {
        		
            }
            
        	@Override 
        	public void mouseExited (MouseEvent e){
        		
        	}
        });
        panel.add(exit);
        
        
        ImageIcon splashImage = new ImageIcon(this.getClass().getResource("resources/menuBGF.png"));
        Image splashCopy = splashImage.getImage().getScaledInstance(600, 450, Image.SCALE_SMOOTH);
        ImageIcon splash = new ImageIcon(splashCopy);
		JLabel splashImg= new JLabel(splash);
		splashImg.setBounds(0, 0, 600,450);
		panel.add(splashImg, BorderLayout.CENTER);
	}
	 
	public JPanel getPanel() {
		return panel;
	}
}
