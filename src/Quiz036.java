//×
import java.util.Scanner;
class Quiz036 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("数値を入力してください:");
        //キーボードからの入力を受けとり、nに入れる
        int n = (new Scanner(System.in)).nextInt();
        //ここからプログラムを記述します。
        int sum = 1;
        for(int i = 1; i <= n; i++) {
        	sum *= i;
    }
        System.out.println(n +"!" + sum);

	}

}
