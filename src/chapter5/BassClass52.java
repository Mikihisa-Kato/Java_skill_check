package chapter5;

import java.io.*;

/**
 * Calcurateクラス。演算子と計算値のフィールドを持つ。
 */
class Calculate {
	private double x;
	private double y;
	private char operator;
	
	/**
	 * xの値を設定する
	 * @param x double型
	 */
	public void setX(double x) {
		this.x = x;
	}
	
	/**
	 * xの値を取得する
	 * @return xの値
	 */
	public double getX() {
		return x;
	}

	/**
	 * yの値を設定する
	 * @param y double型
	 */
	public void setY(double y) {
		this.y = y;
	}
	
	/**
	 * yの値を取得する
	 * @return yの値
	 */
	public double getY() {
		return y;
	}
	
	/**
	 * 演算子を設定する
	 * @param operator char型
	 */
	public void setOperator(char operator) {
		this.operator = operator;
	}
	
	/**
	 * 演算子を取得する
	 * @return operator
	 */
	public char getOperator() {
		return operator;
	}
	
	/**
	 * クラスメソッド。
	 * 計算値と演算子を引数に持ち、それをif文で条件分岐させて、その結果を表示させる。
	 * @param x double型
	 * @param y double型
	 * @param operator char型
	 */
	void calculation() {
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