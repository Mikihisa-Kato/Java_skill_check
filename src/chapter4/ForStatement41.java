package chapter4;

/**
 * 下記の保険契約者の情報を出力してください。
 * 出力の最後に遅延利息が発生している人数を出力してください。
 * ※保険契約者一覧はString配列に格納すること
 * 【保険契約者一覧】
 * 契約者名	保険料	遅延利息金
 * 中村		5000	2000
 * 田島		3000	
 * 小澤		4500	
 * 大西		6000	3500
 */
public class ForStatement41 {

	/**
	 * mainメソッド
	 * String型の配列に契約者情報を入れ、遅延利息金が空になっているデータがあった場合、それを表示する。
	 * @param args　使用しない。
	 */
	public static void main(String[] args) {
		String [][] lists= {
				{"中村", "5000", "2000"},
				{"田島", "3000", ""},
				{"小澤", "4500", ""},
				{"大西", "6000", "3500"}
		};
		
		int unpaid = 0;
		for (String[] list: lists) {
			System.out.println("契約者名:"+ list[0] + "、" + "保険料:"+ list[1] + "円");
			
			if (list[2].isEmpty()) {
				unpaid += 1;
			}
		}
		System.out.println("遅延利息金が発生している人数は" + unpaid + "人です。");
	}
}