package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class frotuneCookie implements ActionListener {

	JFrame frame = new JFrame();
	JButton button = new JButton("Get my frotune");

	public void createUI() {

		frame.add(button);
		frame.setTitle("FRAME");

		button.addActionListener(this);

		frame.setVisible(true);
		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int randy = new Random().nextInt(5);
		if (randy == 0) {
			JOptionPane.showMessageDialog(null,
					"A beautiful, smart, and loving person will be coming into your life. ");
		} else if (randy == 1) {
			JOptionPane.showMessageDialog(null, "A good friend asks only for your time not your money.");
		} else if (randy == 2) {
			JOptionPane.showMessageDialog(null, "Adventure can be real happiness.");
		} else if (randy == 3) {
			JOptionPane.showMessageDialog(null, "Allow compassion to guide your decisions.");
		} else {
			JOptionPane.showMessageDialog(null, "Be careful or you could fall for some tricks today.");
		}
	}

}
