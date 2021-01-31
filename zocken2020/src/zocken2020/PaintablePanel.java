package zocken2020;

import util.ShowInFrame;

public class PaintablePanel extends SizedPanel {

	Paintable pa;

	public PaintablePanel(Paintable pa) {
		this.pa = pa;
	}

	public void paintComponent(java.awt.Graphics g) {
		pa.paintTo(g);
	}

	public static void main(String[] args) {
		ShowInFrame.show(new PaintablePanel(new PaintableOval(100, 50, 30, 50)));
		ShowInFrame.show(new PaintablePanel(new PaintableOval(10, 10, 130, 40)));
		ShowInFrame.show(new PaintablePanel(new PaintableRectangle(100, 300, 10, 10)));

	}

}
