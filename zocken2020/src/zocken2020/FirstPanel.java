package zocken2020;

import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.*;

public class FirstPanel extends JPanel {
	
	private Color shapeColor = Color.RED;
	
	public void setShapeColor(Color color) {
		this.shapeColor = color;
	}

	@Override
	public void paintComponent(java.awt.Graphics g) {
		super.paintComponent(g);
		g.setColor(shapeColor);
		g.fillRect(30, 50, 45, 80);
		g.fillOval(150, 200, 100, 140);
		g.fillArc(300, 400, 100, 100, 360, 300);
		g.fillRoundRect(150, 20, 90, 160, 60, 60);
	}

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.add(new FirstPanel());
		f.setVisible(true);
	}
}
