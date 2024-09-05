package chapter5;

import java.io.*;

/**
 * Calcurateクラス。演算子と計算値のフィールドを持つ。
 */
class Calculate {
	double x;
	double y;
	char operator;
	
	/**
	 * クラスメソッド。
	 * 計算値と演算子を引数に持ち、それをif文で条件分岐させて、その結果を表示させる。
	 * @param x double型
	 * @param y double型
	 * @param operator char型
	 */
	void calculation(double x, double y, char operator) {
		if (operator == '+') {
			System.out.println("計算結果:" + (x + y));
		} else if (operator == '-') {
			System.out.println("計算結果:" + (x - y));
		} else if (operator == '*') {
			System.out.println("計算結果:" + (x * y));
		} else if (operator == '/') {
			if (y != 0) {
				System.out.println("計算結果:" + (x / y));
			} else {
				System.out.println("エラー: 0で割ることはできません。") ;
			}
		} else {
			System.out.println("エラー: 無効な演算子です。");
		}
	}
}

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
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("1つ目の数値を入力してください。");
		double x = Double.parseDouble(br.readLine());
		System.out.println("2つ目の数値を入力してください。");
		double y = Double.parseDouble(br.readLine());
		System.out.println("演算子を入力してください。");
		char operator = br.readLine().charAt(0);
		
		Calculate calc = new Calculate();

		calc.calculation(x, y, operator);
	}
}