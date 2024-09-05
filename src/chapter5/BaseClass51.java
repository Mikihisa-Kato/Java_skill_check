package chapter5;

import java.io.*;

/**
 * Productクラス。商品名と金額、税率をフィールドにもつ。
 */
class Product
{
	String name;
	int price;
	double tax = 0.1;
	
	/**
	 * @return 金額に税率(10%)をかけた金額を返す。
	 */
	int calcTotalPrice() 
	{
		return (int) ( price + (price * tax));
	}
}

/**
 * 商品名、金額と消費税率をフィールドに持つ商品クラスを作成してください。
 * 商品名と金額を入力し、計算結果を出力してください。消費税率は一律10%です。
 */
public class BaseClass51 {

	/**
	 * mainメソッド
	 * ユーザーに商品名と金額を入力させ、税率をかけた購入額を表示する。
	 * @param args　使用しない。
	 * @throws IOException　ユーザーからの入力を読み込む際に、入出力例外が発生する可能性がある。
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Product item = new Product();
		
		System.out.println("商品名を入力してください。");
		item.name = br.readLine();
		System.out.println("値段を入力してください。");
		item.price = Integer.parseInt(br.readLine());
		
		int totalPrice = item.calcTotalPrice();
		
		System.out.println("商品名:" + item.name);
		System.out.println("購入額:" + totalPrice + "円");
	}
}