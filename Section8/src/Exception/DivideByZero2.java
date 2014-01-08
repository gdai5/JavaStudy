package Exception;

public class DivideByZero2 {
	static void a() {
		b();
		System.out.println("a");
	}
	
	static void b() {
		c();
		System.out.println("b");
	}
	
	static void c() {
		d();
		System.out.println("c");
	}
	
	static void d() {
		int i = 1;
		int j = 0;
		System.out.println(i / j);
		System.out.println("d");
	}
	
	//こちらには、例外処理を追加した
	//これによって、正しくプログラムが動く
	public static void main(String[] args) {
		//tryで囲まれた領域内でエラーが発生したら、catchに移動する
		try {
			a();
		//例外の１つArithmeticExceptionが発生したら（０で除算したら）
		}catch(ArithmeticException e){
			System.out.println("例外が投げられます");
			System.out.println(e);
		}finally{
			System.out.println("最後に実行されたよ！");
		}
		
	}
}
