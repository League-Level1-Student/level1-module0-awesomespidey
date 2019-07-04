package _08_jack_in_the_box;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class JackInTheBox implements ActionListener {
	public static void main(String[] args) {
		JackInTheBox BOX = new JackInTheBox();
		BOX.showButton();
	}
	 static int pressed = 0;
	public void showButton() {
		
			JFrame frame = new JFrame();
			JButton button = new JButton("Click me 100 times");
			JPanel panel = new JPanel();
			
			frame.add(panel);
			panel.add(button);
			
			button.addActionListener(this);
			frame.setTitle("FRAME");
			
			

			frame.setVisible(true);
			frame.pack();
			
			
	
		
       }
	private void showPicture(String fileName) { 
	     try {
	          JLabel imageLabel = createLabelImage(fileName);
	          JFrame frame = new JFrame();
	          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (Exception e) {
	          e.printStackTrace();
	     
	     }
	}

	private JLabel createLabelImage(String fileName) {
	     try {
	          URL imageURL = getClass().getResource(fileName);
	          if (imageURL == null) {
	               System.err.println("Could not find image " + fileName);
	               return new JLabel();
	          } else {
	               Icon icon = new ImageIcon(imageURL);
	               JLabel imageLabel = new JLabel(icon);
	               return imageLabel;
	          }
	     } catch (Exception e) {
	          System.err.println("Could not find image " + fileName);
	          return new JLabel();
	     }
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		pressed++;
		System.out.println(pressed);
		if (pressed == 100) {
			showPicture("_08_jack_in_the_box/Otherjackinthebox.jpeg");
			playSound("_08_jack_in_the_box/homer-woohoo.wav");
		}
		
	
	}
	private void playSound(String soundFile) { 
	     try {
	          AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
	          sound.play();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

}

