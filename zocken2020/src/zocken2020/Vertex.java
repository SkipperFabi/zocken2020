package zocken2020;

public class Vertex {

	public double x;
	public double y;

	public Vertex(double x, double y) {

		this.x = x;
		this.y = y;
	}

	public double length() {
		return Math.sqrt(x * x + y * y);
	}

	public Vertex skalarMult(double s) {
		return new Vertex(x * s, y * s);
	}

	public void skalarMultMod(double s) {
		x = s * x;
		y = s * y;
	}

	public Vertex add(Vertex v2) {
		return new Vertex(x + v2.x, y + v2.y);
	}

	public void addMod(Vertex v2) {
		x = x + v2.x;
		y = y + v2.y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
