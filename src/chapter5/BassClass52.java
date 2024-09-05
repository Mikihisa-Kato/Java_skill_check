package chapter5;

import java.io.*;

/**
 * 演算子（+、-、*、/）と計算値のフィールドを持つ計算クラスを作成してください。
 * 演算子と計算値を入力し、計算結果を出力してください。
 * ※出力はmainメソッドで行うこと。
 */
public class BassClass52 {

	/**
	 * mainメソッド
	 * ユーザーに計算値と演算子を入力させ、calcurationメソッドを実行し、結果を表示させる。
	 * @param args　使用しない。
	 * @throws IOException　ユーザーからの入力を読み込む際に、入出力例外が発生する可能性がある。
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("1つ目の数値を入力してください。");
		double x = Double.parseDouble(br.readLine());
		System.out.println("2つ目の数値を入力してください。");
		double y = Double.parseDouble(br.readLine());
		System.out.println("演算子を入力してください。");
		char operator = br.readLine().charAt(0);
		
		Calculate calc = new Calculate();
		calc.setX(x);
		calc.setY(y);
		calc.setOperator(operator);

		calc.calculation();
	}
}