package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable {

	// game screen  
	public static final int WIDIH = 1100;
	public static final int HEIGHT = 800;
	final int FPS = 60 ;
	Thread  gameThread;
	
	public GamePanel() {
	  setPreferredSize(new Dimension(WIDIH,HEIGHT));
	  setBackground(Color.black);
	  
	}
	
	public void launchGame() {
		gameThread = new Thread(this);
		gameThread.start();
	}
	public void run() {
		
	}
	
	private void update() {
		
	}
	public void paintComponet(Graphics g) {
			super.paintComponents(g);
			Graphics2D g2 =(Graphics2D)g;
			
			g2.setColor(Color.white);
			g2.fillRect(100,100,tileSize,tileSize);
}
	
}
