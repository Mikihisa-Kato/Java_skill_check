package chapter2;
/**
 * int 型の変数 x、y に任意の数値を代入し、x の値を y に、y の値を x に入れ替えて x と y の値を表示するプログラムを作成。
 */
public class Operator2_3 {

	/**
	 * mainメソッド
	 * 変数 x、y に数値を代入し、xとyの数値を入れ替えて x と y の値を表示させる。
	 * @param args　使用しない。
	 */
	public static void main(String[] args) {
		int x = 5;
		int y = 6;
		
		int z = x;
		x = y;
		y = z;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}