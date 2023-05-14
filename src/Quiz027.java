//×
import java.util.Scanner;
class Quiz027 {
	public static void main(String[] args) {
        System.out.print("合言葉は？:");
        //キーボードからの文字列の入力を待ちます。
        String str = (new Scanner(System.in)).nextLine();
        //文字列の判定にはequals関数を使う
        if (str.equals("hello")) {
            System.out.println("おはいりください");
        }
        else {
            System.out.println("合言葉が違います");
        }
    }

}
