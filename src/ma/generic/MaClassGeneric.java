package ma.generic;

public class MaClassGeneric<T, T2> {
	private T parm1;
	private T2 param2;

	public MaClassGeneric(T parm1, T2 parm2) {
		this.parm1 = parm1;
		this.param2 = parm2;
	}

	public T getParm1() {
		return parm1;
	}

	public void setParm1(T parm1) {
		this.parm1 = parm1;
	}

	public T2 getParam2() {
		return param2;
	}

	public void setParam2(T2 param2) {
		this.param2 = param2;
	}

}
