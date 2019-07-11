package _10_cuteness_tv;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Cuteness implements ActionListener {
	 JFrame frame = new JFrame();
	 JButton button = new JButton("Duck");
	 JButton button1 = new JButton("frog");
	 JButton button2 = new JButton("FluffyUnicorns");
	 JPanel panel = new JPanel ();
		public void createUI() {
			frame.add(panel);
			
			panel.add(button);
			panel.add(button1);
			panel.add(button2);
			frame.setTitle("Cuteness!!!!!!!!!!!!!!!!!!!!!!!!!");
			
			button.addActionListener(this);
			button1.addActionListener(this);
			button2.addActionListener(this);
			
			frame.setVisible(true);
			frame.pack();
		}

			void showDucks() {
			     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
			}

			void showFrog() {
			     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
			}

			void showFluffyUnicorns() {
			     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
			}

			void playVideo(String videoID) {
			     try {
			          URI uri = new URI(videoID);
			          java.awt.Desktop.getDesktop().browse(uri);
			     } catch (Exception e) {
			          e.printStackTrace();
			     }
			
		}

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource() == button ) {
					showDucks();
				}
				else if(e.getSource() == button1) {
					showFrog();
				}
				else {
					showFluffyUnicorns();
				}
			}
}

