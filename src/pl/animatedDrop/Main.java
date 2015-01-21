package pl.animatedDrop;

import java.awt.BorderLayout;
import java.awt.Rectangle;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main extends JFrame {

	public static void main(String[] args) {
		new Main().setVisible(true);
	}

	public Main() {
		panelButtons.add(buttonStart);
		this.setTitle("Animacja kropelki");
		animationPanel.setBackground(Color.GRAY);
		buttonStart.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				startAnimation();
			}
		});

		this.setBounds(250, 300, 250, 250);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().add(animationPanel);
		this.getContentPane().add(panelButtons, BorderLayout.SOUTH);

	}

	public void startAnimation() {
		animationPanel.addDrop();
	}

	private AnimationPanel animationPanel = new AnimationPanel();
	private JPanel panelButtons = new JPanel();
	private JButton buttonStart = new JButton("Start");

	class AnimationPanel extends JPanel {

		public void addDrop() {
			dropletList.add(new Droplet());
			//number of steps (to change)
			//if you change 250 on 400 it will be bouncing longer
			for (int i = 0; i < 250; i++) {
				try {
					for (int j = 0; j < dropletList.size(); j++) {

						dropletList.get(j).moveDroplet(this);

						Thread.sleep(5);
					}
				} catch (InterruptedException e) {
				}
				this.paint(this.getGraphics());
			}
		}

		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			for (int i = 0; i < dropletList.size(); i++) {
				g.drawImage(Droplet.getImg(), dropletList.get(i).x,
						dropletList.get(i).y, null);
			}
		}

		ArrayList<Droplet> dropletList = new ArrayList<Droplet>();
	}
}

class Droplet {

	public void moveDroplet(JPanel container) {
		Rectangle borders = container.getBounds();
		x += dx;
		y += dy;
		if (y + dropletYpos >= borders.getMaxY()) {

			y = (int) (borders.getMaxY() - dropletYpos);
			dy = -dy;
		}
		if (x + dropletXpos >= borders.getMaxX()) {
			x = (int) (borders.getMaxX() - dropletXpos);
			dx = -dx;
		}
		if (y < borders.getMinY()) {
			y = (int) borders.getMinY();
			dy = -dy;
		}
		if (x <= borders.getMinX()) {
			x = (int) borders.getMinX();
			dx = -dx;
		}

	}

	public static Image getImg() {
		return Droplet.imgRes;
	}

	public static Image imgRes = new ImageIcon("kropelka.gif").getImage();
	int x = 0;
	int y = 0;
	int dx = 1;
	int dy = 1;
	int dropletXpos = imgRes.getWidth(null);
	int dropletYpos = imgRes.getHeight(null);
}
