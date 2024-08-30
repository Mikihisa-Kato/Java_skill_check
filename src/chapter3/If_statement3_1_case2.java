package chapter3;

import java.io.*;

/**
 * 試験の点数を入力し、対応する成績を表示するプログラムを3種類作成しなさい。
 * 試験は 100 点満点（0点～100点）とし、点数と成績の対応を以下のようにします。
 * 【ケース 2】
 * 80 点以上：「たいへんよくできました。」
 * 60 点以上、80 点未満：「よくできました。」
 * 60 点未満：「ざんねんでした。」
 */
public class If_statement3_1_case2 {

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

		if (score >= 80) {
			System.out.println("たいへんよくできました。");
		} else if (score >= 60 && score < 80) {
			System.out.println("よくできました。");
		} else {
			System.out.println("ざんねんでした。");
		}
	}
}