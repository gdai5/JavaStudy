package Exception;

//例外を発生させるサンプル
//ザ・たらい回し！
public class DivideByZero {
	
	static void a() {
		b();
	}
	
	static void b() {
		c();
	}
	
	static void c() {
		d();
	}
	
	static void d() {
		int i = 1;
		int j = 0;
		System.out.println(i / j);
	}
	
	public static void main(String[] args) {
			a();
	}
	
}
