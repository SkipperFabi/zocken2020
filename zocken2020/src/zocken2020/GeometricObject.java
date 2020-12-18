package zocken2020;

public class GeometricObject {
	public Vertex pos;
	public double width;
	public double height;
	// Object im Raum chrakterisieren

	public GeometricObject(double width, double height, Vertex pos) { // Stellt sicher, dass keine Objects mit negativer
																		// Breite oder H�he erzeugt werden
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

	public GeometricObject(double width, double height) { // Konstruktor �berladen mit Object beim Ursprung 0,0
		this(width, height, new Vertex(0, 0));
	}

	public GeometricObject(double width) { // Konstrukor �berladen, dass man nur Breite hat, und daraus H�he und Vertex
											// bestimmt
		this(width, width);
	}

	public GeometricObject() { // Konstruktor mit einem bestimmen Wert �berladen, width und height =10
		this(10);
	}

	public String toString() {
		return "width=" + width + ", height=" + height + ", pos=" + pos;
	}

	public double circumference() {
		return 2 * (width + height);
		// Umfang des Objects bzw Rechteck berechnen
	}

	public double area() {
		return height * width;
		// Fl�cheninhalt des Objects bzw Rechteck berechnen
	}

	public boolean contains(Vertex v) { // Pr�ft ob ein Punkt innerhalb der Figur bzw Object ist
		return v.x >= pos.x && v.x <= pos.x + width && v.y >= pos.y && v.y <= pos.y + height;
	}

	public boolean isLargerThan(GeometricObject that) { // Gr��envergleich: Ist das �bergebene Object (=that) gr��er als
														// das Object wof�r die Methode aufgerufen wurde (=this) ?
		return this.area() > that.area();
	}

	public void moveTo(Vertex pos) { // Object verschieben, neuer Eckpunkt wird festgelegt -> absolute Verschiebung
		this.pos = pos;
	}

	public void moveTo(double x, double y) { // Methode moveTo �berladen mit spezifischen Werten im Vertex
		moveTo(new Vertex(x, y));
	}

	public void move(Vertex v) { // relative Verschiebung von Object
		moveTo(pos.add(v));
	}

	public boolean equals(Object thatObject) { // Gleichheit von 2 Objects pr�fen
		if (thatObject instanceof GeometricObject) {
			GeometricObject that = (GeometricObject) thatObject;
			return that.width == this.width && this.height == that.height && this.pos.equals(that.pos);
		}
		return false;
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
