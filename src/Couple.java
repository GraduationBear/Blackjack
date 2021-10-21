
public class Couple<T1, T2> {
	
	private T1 v1;
	private T2 v2;
	public Couple(T1 v1, T2 v2) {
		this.v1 = v1;
		this.v2 = v2;
	}
	
	public T1 getValeur1() {
		return this.v1;
	}
	public T2 getValeur2() {
		return this.v2;
	}
	
}
