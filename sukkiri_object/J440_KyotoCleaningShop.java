package sukkiriobject;
//J441
//2.インターフェイス実装 クラス
public class J440_KyotoCleaningShop implements J440_CleaningService{

	//インターフェイスを実装する(implements)

	String ownerName; //店名
	String address;	  //住所
	String phone;	  //電話番号


// 親クラス内、同じメソッド内容上書き。
@Override
public J440_Shirt washShirt(J440_Shirt s, String c) {
	// 大型洗濯機15分  /シャツを洗う/
	//J440_Shirt型の s （仮引数）

	System.out.println("大型洗濯機15分");
	System.out.println(c + " シャツを洗う");


	return s;
}

@Override
public J440_Towl washTowl(J440_Towl t) {
	// 大型洗濯機10分  /タオルを洗う/
	//J440_Towl型、 c （仮引数）

	System.out.println("大型洗濯機10分");
	System.out.println("タオルを洗う");

	return t;
}

@Override
public J440_Coat washCoat(J440_Coat c) {
	// ドライ20分	/コートを洗う/
	//J440_Coat型、 c （仮引数）

	System.out.println("ドライ20分");
	System.out.println("コートを洗");

	return c;
}


}
