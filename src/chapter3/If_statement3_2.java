package chapter3;

import java.io.*;

/**
 * 整数値 x, y を入力し、以下のうち該当する条件を表示するプログラムを作成してください。
 * x は y より小さく、かつ、x と y は共に偶数である。
 * x と y は等しく、かつ、負の数である。
 * x は y より小さい、または、x は偶数である。  
 */
public class If_statement3_2 {

	/**
	 * mainメソッド
	 * ユーザーに2つ整数を入力させ、それらをif文で条件分岐させ、その条件を表示する。
	 * @param args 使用しない
	 * @throws IOException ユーザーからの入力を読み込む際に、入出力例外が発生する可能性がある。
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("整数xを入力してください。");
		int x = Integer.parseInt(br.readLine());
		System.out.println("整数yを入力してください。");
		int y = Integer.parseInt(br.readLine());
		
		if (x < y && x % 2 == 0 && y % 2 == 0) {
			System.out.println("x は y より小さく、かつ、x と y は共に偶数である。");
		} else if (x == y && x < 0) {
			System.out.println("x と y は等しく、かつ、負の数である。");
		} else if (x < y || x % 2 == 0) {
			System.out.println("x は y より小さい、または、x は偶数である。");
		}else {
			System.out.println("入力された数値はどの条件にも該当しません。");
		}
	}
}