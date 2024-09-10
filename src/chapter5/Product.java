package chapter5;

/**
* Productクラス。商品名と金額、税率をフィールドにもつ。
*/
public class Product {
	
	/**
	 * String型 商品名
	 */
	private String name;
	
	/**
	 * int型 金額
	 */
	private int price;
	
	/**
	 * double型 税率
	 */
	private double tax = 0.1;

	/**
	 * 商品名を設定する。
	 * @param name 商品名
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 商品名を取得する。
	 * @return　商品名
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 金額を設定する。
	 * @param price　金額
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	
	/**
	 * 金額を取得する。
	 * @return　金額
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * 入力された金額に税率(10%)をかけた金額を返す。
	 * @return 金額(税込)
	 */
	public int calcTotalPrice() {
		return (int) ( price + (price * tax));
	}
}
