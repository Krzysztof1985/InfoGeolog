package pl.swingExample;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Okienko extends JFrame {

	public static void main(String[] args) {
		Okienko okno = new Okienko();

		// default operation when we close window
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setting size
		okno.setSize(width, height);

		// title
		okno.setTitle("Sample Window");

		// visibility at the start
		okno.setVisible(true);

		// allways remember that we are drawing on Panels not on Frames!
		final JPanel panel = new JPanel();
		JButton redButton = new JButton("Red");
		JButton greenButton = new JButton("Green");
		JButton blueButton = new JButton("Blue");

		panel.add(redButton);
		panel.add(greenButton);
		panel.add(blueButton);

		okno.add(panel);

		// somethind which will be listen on ever command (command could be
		// clicked, mouseover, mouseout etc)
		redButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.RED);
			}
		});
		blueButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.BLUE);
			}
		});
		greenButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				panel.setBackground(Color.GREEN);
			}
		});

	}
	private static final int width = 400;
	private static final int height = 300;
}
