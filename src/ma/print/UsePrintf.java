package ma.print;

public class UsePrintf {
	public static void main(String[] args) {
		int c = 'a';
		float f = 10;
		long ell = 100L;
		UsePrintf u = new UsePrintf();
		System.out.printf(
				"char val is %c, float val is %f, long int val is %s \n", c, f,ell);
	}
}
