package chapter3;

import java.io.*;

/**
 * 試験の点数を入力し、対応する成績を表示するプログラムを３種類作成しなさい。
 * 試験は 100 点満点（ 0 点～ 100 点）とし、点数と成績の対応を以下のようにします。
 * 【ケース 3】
 * 80 点以上：「優」
 * 70 点以上、80 点未満：「良」
 * 60 点以上、70 点未満：「可」
 * 60 点未満：「不可」
 */
public class If_statement3_1_case3 {

	/**
	 * mainメソッド
	 * ユーザーに点数を入力させ、その点数をif文で条件分岐させて成績を表示。
	 * @param args 使用しない
	 * @throws IOException ユーザーからの入力を読み込む際に、入出力例外が発生する可能性がある。
	 */
	public static void main(String[] args)  throws IOException {
		System.out.println("試験の点数を入力してください。");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int score = Integer.parseInt(str);

		if (score < 0 || score > 100) {
			System.out.println("点数は0~100の間で入力してください。");
		} else if (score >= 80) {
			System.out.println("優");
		} else if (score >= 70  && score < 80) {
			System.out.println("良");
		} else if (score >= 60 && score < 70) {
			System.out.println("可");
		} else {
			System.out.println("不可");
		}
	}
}