package ma.exception;

public class EHBehavior {
	public static void main(String[] args) {
		try {
			int i = 10 / 0; // LINE A
			System.out.print("after throw -> ");
		} catch (ArithmeticException ae) {
			System.out.print("in catch -> ");
			return;
		} finally {
			System.out.print("in finally -> ");
		}
		System.out.print("after everything");
//		System.out.println(num());
	}
}
	
//	public static int num() {
//		int a=10;
//		try {
//			a=15;
//			return a;
//		} finally {
//			System.out.println("here iam");
//			a = 18;
//			syso
//		}
//	}
//}
