package OverLoad;

/**
 * オーバーロードの練習
 * オーバーロード：メソッドに渡す引数を変えることで、同じ名前のメソッドが大量に作れちゃう！
 * オーバーロードができる＝＞シグニチャのおかげ
 * シグニチャ：メソッド名、パラメータの数、データ型の組み合わせ
 * 親戚：オーバーライド
 */

//ついでに
//ラッパークラスについては＝＞http://www.atmarkit.co.jp/ait/articles/1009/09/news111.html
public class TestOverLoad {
	static class PrintApp {
		//これが全てオーバーロードの関係にあるメソッド群
		public void print(int v) {
            Integer i = Integer.valueOf(v);
            String s = i.toString();
            System.out.println(s);
        }
        public void print(double v) {
            Double d = Double.valueOf(v);
            String s = d.toString();
            System.out.println(s);
        }
        public void print(boolean v) {
            Boolean b = Boolean.valueOf(v);
            String s = b.toString();
            System.out.println(s);
        }
        //ここで返しているのはハッシュ値
        public void print(Object v) {
            String s = v.toString();
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        //TestOverLoad.PrintApp app = new TestOverLoad().new PrintApp();
    	PrintApp app = new PrintApp();
        app.print(1);
        app.print(2.0);
        app.print(false);
        app.print(new Object());
    }
}
