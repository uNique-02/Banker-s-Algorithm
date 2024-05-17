package lab4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Input {
	final int WIDTH = 600, HEIGHT = 450;
    final Dimension gameDimension = new Dimension(WIDTH, HEIGHT);
    JPanel panel;
    MainMenu mainMenu;
    
    Input(JFrame mainFrame){
		panel = new JPanel();
		panel.setPreferredSize(gameDimension);
		panel.setBackground(new Color(255,255,255));
		panel.setVisible(true);
		panel.setLayout(new BorderLayout());
		initComponents(mainFrame, panel);
	}
    
    public void initComponents(JFrame mainFrame, JPanel panel) {
    	
    	JLabel random = new JLabel();
        ImageIcon randomIcon = new ImageIcon(this.getClass().getResource("resources/randombut.png"));
        Image randomIconCopy = randomIcon.getImage().getScaledInstance(131, 50, Image.SCALE_SMOOTH);
        ImageIcon tempRandom = new ImageIcon(randomIconCopy );
        random.setIcon(tempRandom); 
        random.setBounds(65, 210, 131, 50);
        random.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        random.addMouseListener(new MouseAdapter(){
        	public void mouseClicked(MouseEvent e) {
        		
        	}
        	@Override
            public void mouseEntered(MouseEvent me) {
        		
            }
            
        	@Override 
        	public void mouseExited (MouseEvent e){
        		
        	}
        });
        panel.add(random);
        
        JLabel text = new JLabel();
        ImageIcon textIcon = new ImageIcon(this.getClass().getResource("resources/textbut.png"));
        Image textIconCopy = textIcon.getImage().getScaledInstance(141, 49, Image.SCALE_SMOOTH);
        ImageIcon tempText = new ImageIcon(textIconCopy);
        text.setIcon(tempText); 
        text.setBounds(230, 210, 141, 49);
        text.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        text.addMouseListener(new MouseAdapter(){	
        	public void mouseClicked(MouseEvent e) {
        		
        	}
        	@Override
            public void mouseEntered(MouseEvent me) {
        		
            }
            
        	@Override 
        	public void mouseExited (MouseEvent e){
        		
        	}
        });
        panel.add(text);
        
        JLabel user = new JLabel();
        ImageIcon userIcon = new ImageIcon(this.getClass().getResource("resources/userdefine.png"));
        Image userIconCopy = userIcon.getImage().getScaledInstance(141, 49, Image.SCALE_SMOOTH);
        ImageIcon tempUser = new ImageIcon(userIconCopy);
        user.setIcon(tempUser); 
        user.setBounds(400, 210, 141, 49);
        user.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        user.addMouseListener(new MouseAdapter(){	
        	public void mouseClicked(MouseEvent e) {
        		
        	}
        	@Override
            public void mouseEntered(MouseEvent me) {
        		
            }
            
        	@Override 
        	public void mouseExited (MouseEvent e){
        		
        	}
        });
        panel.add(user);
    	
    	JLabel back = new JLabel();
        ImageIcon backIcon = new ImageIcon(this.getClass().getResource("resources/backk.png"));
        Image backIconCopy = backIcon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon tempback = new ImageIcon(backIconCopy);
        back.setIcon(tempback);
        back.setBounds(15, 385, 50, 50);
        back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        back.addMouseListener(new MouseAdapter(){
        	public void mouseClicked(MouseEvent e) {
        		mainMenu = new MainMenu(mainFrame);
        		mainFrame.remove(mainFrame.getContentPane());
        		mainFrame.setContentPane(mainMenu.getPanel());
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
        panel.add(back);
        
        ImageIcon splashImage = new ImageIcon(this.getClass().getResource("resources/inputBG.png"));
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
