package ma.classStatic;


public class InnerClassAccess {
	public static void main(String []args) {
		System.out.println(new Outer.Inner().text);
		}
}
