package zocken2020;

public class Test {

	public static void main(String[] args) {
		Vertex v1 = new Vertex(17, 4);
		Vertex v2 = new Vertex(42, 0);
		Vertex v3 = new Vertex(0,0);
		Vertex v4 = new Vertex(42, 23);
		
		//Seitenanzahl 54 bzw 67

		System.out.println("v1="+v1.toString());
		System.out.println("v2="+v2.toString());
		v1.y = 2 * v1.y;

		System.out.println("v1x2="+v1.toString());

	}

}
