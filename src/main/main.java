package main;

import javax.swing.JFrame;


public class main {

	
	public static void main(String[] args) {
		JFrame window = new JFrame("Simple Chess"); // Creating the frame the for the game 
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // if we close the windows it will auto close the game will not  stop running in background the game
		window.setResizable(false); // open in the center of the class
		
		//add Game 
		GamePanel gp =new GamePanel();
		window.add(gp);
		window.pack(); // will auto correct the window size
		
		window.setLocationRelativeTo(null); // 
		window.setVisible(true);
		
		gp.launchGame();
		
		
	}
}
