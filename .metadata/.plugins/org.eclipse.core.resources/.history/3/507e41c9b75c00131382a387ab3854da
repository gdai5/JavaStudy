package Sample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Kadai {
	public static void main(String[] args) {
		new Main().execute();
	}
	
	public void execute() {
		List list = new ArrayList();
		list.add("a");
		list.add("b");
		//新しく追加
		this.OutputList(list);
		System.out.println("");
		list = new LinkedList();
		list.add("c");
		list.add("d");
		//新しく追加
		this.OutputList(list);
	}
	
	//新しく追加
	//Listインターフェイスで、ArraryListとLinkedListの両方に実装されているので
	//引数の型をListにするだけでOK
	public void OutputList(List list) {
		for (int i = 0; i < list.size(); i++) {
			String s = (String)list.get(i);
			System.out.print(s + " ");
		}
	}

}
