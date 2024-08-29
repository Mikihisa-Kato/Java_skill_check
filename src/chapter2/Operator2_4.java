package chapter2;

/**
 * 以下処理を実装してください。
 * int 型の変数 x に数値 7 を代入する。
 * 変数 x の値を 3 倍にする。
 * 変数 x の値を表示する。 
 * 変数 x の値を半分(1/2)にする。
 * 変数 x の値を表示する。 
 */
public class Operator2_4 {
	/**
	 * mainメソッド
	 * 変数 x に7を代入し、3倍しその結果を表示、xを半分にし、その結果を表示。
	 * @param args 使用しない。
	 */
	public static void main(String[] args) {
		int x = 7;
		
		x = x * 3;
		System.out.println(x);
		
		x = x / 2;
		System.out.println(x);
	}
}