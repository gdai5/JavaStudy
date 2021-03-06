package SampleAccesser;

//アクセス修飾子の勉強
public class Documents {
	//全てのクラスからアクセスできる
	//どこからでもアクセスを許したい場合に定義
	public int    a = 0;
	//同じクラス・同じパッケージ・サブクラスからアクセスできる
	//サブクラスでも使いたいときに定義
	protected int b = 1;
	//同じクラス・同じパッケージからアクセスできる
	//後に説明する機会があると思う（よ！）
	int           c = 2;
	//同じクラスからアクセスできる
	//自分自身（ここではDocumentsクラス内を指す）以外では使えない
	private int   d = 3;
	
	//Documentsクラス内で実行するので、全てにアクセスできる
	public static void main(String[] args) {
		Documents doc = new Documents();
		System.out.println(doc.a);
		System.out.println(doc.b);
		System.out.println(doc.c);
		System.out.println(doc.d);
	}
}