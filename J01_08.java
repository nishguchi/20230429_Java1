package create_for_01;

public class J01_08 {

		//カウンタ変数の増減を for文内で行わず、自分で行う

	 public static void main(String[] args) {
	        int i = 0;

	        for( ; i < 5; ){

	            System.out.println("iは" + (i + 1) + "回目の実行です。");

	            i += 1;
	        }
	 }
}
