package sukkiriobject;
//3.main() クラス内でインスタンス化
//4.main() クラスで実行
public class J440_main {

	public static void main(String[] args) {

		J440_Shirt shirt = new J440_Shirt();

		J440_KyotoCleaningShop kyotoCleaning = new J440_KyotoCleaningShop();

		String b = kyotoCleaning.phone= "000-000-0000"; // J440_KyotoCleaningShop(別クラス)の変数「phone」を仕様

		shirt.s = "赤色"; // J440_Shirt(別クラス)の変数「ｓ」を使用


		kyotoCleaning.washShirt(shirt, shirt.s);
		//0.クラスからっぽ→ //1.インターフェイス クラスでメソッド作成→
		//2.インターフェイス実装 クラスで、メソッド内容を上書き、引数もらう→
		//3.main() クラス内でインスタンス化 →
		//4.main() クラスで実行

		System.out.println(b);


	}

}
