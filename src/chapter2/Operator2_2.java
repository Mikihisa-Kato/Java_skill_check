package chapter2;

/**
 * 変数aに”Hello”を代入し、変数bに”World”を代入し、2つの文字列を結合させて”Hello World”を表示させる。
 */
public class Operator2_2 {
	/**
	 * mainメソッド
	 * 文字列型の変数aとbにHelloとWorldを代入して、文字列を結合させる。
	 * @param args 使用しない。
	 */
	public static void main(String[] args) {
		String a = "Hello";
		String b = "World";

		System.out.println(a + " " + b);
	}
}