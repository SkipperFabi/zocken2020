package zocken2020;

public class GeometricObject {
	public Vertex pos;
	public double width;
	public double height;

	public GeometricObject(double width, double height, Vertex pos) {
		this.pos = pos;
		this.width = width;
		this.height = height;

		if (width < 0) {
			width = -width;
			pos.x = pos.x - width;
		}

		if (height < 0) {
			height = -height;
			pos.y = pos.y - height;
		}
	}

	public GeometricObject(double width, double height) {
		this(width, height, new Vertex(0, 0));
	}

	public GeometricObject(double width) {
		this(width, width);
	}

	public GeometricObject() {
		this(10);
	}

	public double getWidth() {
		return width;

	}

	public double getHeight() {
		return height;
	}

	public Vertex getPos() {
		return pos;
	}
}
