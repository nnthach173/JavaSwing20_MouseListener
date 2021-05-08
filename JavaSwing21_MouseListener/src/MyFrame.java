import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements MouseListener {

	JLabel label;
	ImageIcon smile;
	ImageIcon smug;
	ImageIcon pain;
	ImageIcon dizzy;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		label = new JLabel();
		label.addMouseListener(this);
		
		smile = new ImageIcon("smile.png");
		dizzy = new ImageIcon("dizzy.png");
		smug = new ImageIcon("smug.png");
		pain = new ImageIcon("pain.png");
	
		
		label.setIcon(smile);
		
		this.add(label);
		this.pack();
		this.setLocationRelativeTo(null);
		
		
		/*
		label = new JLabel();
		label.setBounds(0,0,100,100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		label.addMouseListener(this);
		*/
		
		//this.add(label);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// Invoked when the mouse button has been clicked (pressed and released)
		//System.out.println("You clicked the mouse");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// Invoked when the mouse button has been pressed
		//System.out.println("You pressed the mouse");
		//label.setBackground(Color.yellow);
		label.setIcon(smug);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//Invoked when a mouse button has been released 
		//System.out.println("You released a mouse");
		//label.setBackground(Color.green);
		label.setIcon(dizzy);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//Invoked when the mouse enters a component
		//System.out.println("You entered the component");
		//label.setBackground(Color.blue);
		
		label.setIcon(pain);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		//Invoked when the mouse exits a component
		//System.out.println("You exited the component");
		//label.setBackground(Color.red);
		label.setIcon(smile);
	}
	
}
