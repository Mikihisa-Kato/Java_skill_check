package chapter5;

/**
 * Calcurateクラス。演算子と計算値のフィールドを持つ。
 */
public class Calculate {
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
	public void calculation() {
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