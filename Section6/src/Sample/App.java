package Sample;

//だるかったので、コピペ
//決して手抜きじゃないよ！

import java.text.Format;
import java.util.Date;
import java.text.DateFormat;

class App {
	//フィールド
	static String loadedTime;
	String initTime;
	static int count = 0;

	/**
	 * 初期化ブロックとは、何か複雑な処理の結果をフィールドの初期値として持たせたい場合
	 * などに用いるもの（俺は使ったことは無いし、存在自体覚えていなかった・・・）
	 * staticが付いているので、static初期化ブロックを呼ぶ
	 * なんと実行してみると、不思議な事が起こる・・・
	 */
	static {
		//まず、現在の日付や時間情報を取ってくる
		Date currentDate = new Date();
		//どのようなフォーマットに変形するのかを決めている
		//Format > DateFormatのためこのような形で書く事ができる
		//フォーマットの形には色々あるが、今回は日時を見た目が分かりやすい形に加工する
		Format dft = DateFormat.getDateTimeInstance();
		//加工方法が上で決まったので、format(変換したい日付)で文字列が帰ってくる
		loadedTime = dft.format(currentDate);
	}
	
	{// 初期化ブロック ここから
		Date currentDate = new Date();
		Format dft = DateFormat.getDateTimeInstance();
		initTime = dft.format(currentDate);
		count++;
		System.out.println("count:" + count);
	}// 初期化ブロック ここまで

	void exec() {
		System.out.print("L:" + loadedTime);
		System.out.println("\tI:" + initTime);
	}

	public static void main(String[] args) throws Exception {
		// Appクラスをロードするために、App.loadedTimeへアクセス
		System.out.println("App.loadedTime:" + App.loadedTime);
		Thread.sleep(1000); // 1000ミリ秒一時停止
		App app = new App(); // 1つめのインスタンス生成
		app.exec();
		Thread.sleep(1000); // 1000ミリ秒一時停止
		app = new App(); // 2つめのインスタンス生成
		app.exec();
	}
}
