//class
public class Test {
	//field
	int i = 40;
	
	//method関数
	public void outputI() {
		//local変数
		//こいつの寿命はoutputIが終わるまで
		int i = 0;
		//thisを付けることで、fieldのiを呼ぶのか、
		//outputIで宣言されているiを呼ぶのか区別できる
		System.out.println(this.i);
		System.out.println(i);
	}
	
}
