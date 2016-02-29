package ma.objet;

public class Point2D {
	private int x, y;

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString(){
		return "[" + x + "," + y +"]";
	}
	
	public static void main(String[] args){
		Point2D po=new Point2D(3, 4);
		System.out.println(po);
	}
}
