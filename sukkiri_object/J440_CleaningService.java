package sukkiriobject;
//1.インターフェイス クラス
public interface J440_CleaningService {

		J440_Shirt washShirt(J440_Shirt s, String c);
		J440_Towl washTowl(J440_Towl t);
		J440_Coat washCoat(J440_Coat c);

		//インターフェイス内で、各クラスを呼び出す


}
