//変数a,bを用い、aのb乗を求めて実行結果のように表示してください。
class Quiz037 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = 2;
		int b = 8;
		int sum = a;
		for(int i = 0; i < b-1 ;i++) {
			sum = sum * a;
		}
		System.out.println(sum);

	}

}
