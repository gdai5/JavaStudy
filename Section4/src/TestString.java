
public class TestString {
	char[] cs = {'0', '1', '2', '3'};
	String[] ss = new String[4];
	
	//コンストラクタ
	public TestString() {
		ss[0] = "0123";
		ss[1] = ss[0];
		//'1', '2', '3', '4' => "1234"
		ss[2] = new String(cs);
		ss[3] = String.valueOf(cs);
  	}
	
	public void test() {
		System.out.println(ss[0].length());
		System.out.println("-----------");
		for(int i = 0; i < 4; i++) {
			//ここでは、マンションで言うところの、同じ階層かどうか
			System.out.println(ss[0]==ss[i]);
		}
		System.out.println("-----------");
		for(int i = 0; i < 4; i++) {
			//中身が同じであれば良い
			System.out.println(ss[0].equals(ss[i]));
		}
	}
	
	public static void main(String[] args) {
		TestString ts = new TestString();
		ts.test();
	}
	
}
