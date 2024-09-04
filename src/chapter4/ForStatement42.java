package chapter4;

import java.io.*;

/**
 * 商品と単価、支払金額を3回入力し、支払金額の不足有無を出力してください。 最後に不足の合計を出力してください。
 * ※入力値はString配列に格納すること。
 * ※数値の計算はStringから変換を行うこと。 
 */
public class ForStatement42 {

	/**
	 * mainメソッド
	 * ユーザーに商品、単価、支払金額を3回入力させ、金額に応じて各商品の支払金額及び、全体での不足金額を表示する。
	 * @param args　使用しない。
	 * @throws IOException　ユーザーからの入力を読み込む際に、入出力例外が発生する可能性がある。
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[][] items = new String[3][3];
		
		int totalshortage = 0;
		
		for (int i = 0; i < 3; i++) {
			System.out.println("商品を入力してください。");
			items[i][0] = br.readLine();
			
			System.out.println("単価を入力してください。");
			items[i][1] = br.readLine();
			
			System.out.println("支払い金額を入力してください。");
			items[i][2] = br.readLine();
		}
		
		for (String[] item : items) {
			String name = item[0];
			int price = Integer.parseInt(item[1]);
			int payment = Integer.parseInt(item[2]);
			
			if (payment >= price) {
				System.out.println("商品名:" + name + "、金額:" + price + "円、支払金額不足無し");
			} else {
				int shortage = price - payment;
				System.out.println("商品名:" + name + "、金額:" + price + "円、支払金額不足");
				totalshortage += shortage;
			}
		}
		System.out.println("全体の不足金:" + totalshortage + "円");
	}
}