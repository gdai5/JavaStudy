package SampleAccesser2;

import SampleAccesser.*;

public class Accesser2 extends Documents{
	public static void main(String[] args) {
		Accesser2 ac2 = new Accesser2();
		//違うクラス、違うパッケージだが、サブクラスのためこの２つまでしかアクセスできない
		System.out.println(ac2.a);
		System.out.println(ac2.b);
		//Documentsの場合では、それ以上に何もできない
		Documents doc = new Documents();
		System.out.println(doc.a);
		//怒られる
		//System.out.println(doc.b);
	}
}
