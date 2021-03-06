//自分が所属しているパッケージを宣言している
//パッケージとは、一言で言うと「ディレクトリ＝フォルダー」のこと
//大きな規模になると、パッケージ毎に作るプログラムを決めて、そこにまとめる
//これにより、どこに何があるのかが管理しやすい
package Sample;

//本来、別々のパッケージではその中に存在するクラスファイルを用いることができない
//例）
//今、Sampleというパッケージ内にいるので、Diceパッケージの中にあるFakeDiceやRealDiceを呼び出す事ができない
//そこで、このimportを使って、Diceパッケージをインポートすれば使えるようになる
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		//Main main = new Main();
		//main.execute();
		new Main().execute();
	}
	
	public void execute() {
		//ここで、多分こんな疑問が出てくる
		//1:変数名の型はListなのに、なぜnew List()ではなくArrayListなのか？
		//2:int a = "型が整数型なのに、文字列を入れようとしている" <=こんなことをやっているのではないか？
		//返答
		//実は、ArrayList&LinkedListは「Listインターフェイスを実装」している
		//そのため、ArrayList, LinkedListはListという共通の型で使い回すことができる
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		for (int i = 0; i < list.size(); i++) {
			String s = (String)list.get(i);
			System.out.print(s + " ");
		}
		System.out.println("");
		list = new LinkedList();
		list.add("c");
		list.add("d");
		for (int i = 0; i < list.size(); i++) {
			String s = (String)list.get(i);
			System.out.print(s + " ");
		}
	}

}
