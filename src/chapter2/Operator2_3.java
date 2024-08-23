//int 型の変数 x、y に任意の数値を代入し、x の値を y に、y の値を x に入れ替えて x と y の値を表示するプログラムを作成してください。

package chapter2;

public class Operator2_3 {

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
