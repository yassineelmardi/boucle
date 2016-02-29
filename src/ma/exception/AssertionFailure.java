package ma.exception;

public class AssertionFailure {
	public static void main(String[] args) {
		try {
			assert false;
		} catch (RuntimeException re) {
			System.out.println("RuntimeException");
		} catch (Exception e) {
			System.out.println("Exception");
		} catch (Error e) { // LINE A
			System.out.println("Error" + e);
		} catch (Throwable t) {
			System.out.println("Throwable");
		}
	}
}
