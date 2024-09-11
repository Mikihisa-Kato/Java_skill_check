package chapter5;

/**
* Productクラス。商品名と金額、税率をフィールドにもつ。
*/
public class Product {
	
	/** 商品名 */
	private String name;
	
	/** 金額 */
	private int price;
	
	/** 税率 */
	private static final double TAX = 0.1;

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
		return (int) ( price + (price * TAX));
	}
}
