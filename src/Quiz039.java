import java.util.Scanner;

class Quiz039 {

	public static void main(String[] args) {
		System.out.print("数値を入力してください:");
        //キーボードより数値を受け取ります。
        int n = (new Scanner(System.in)).nextInt();
        for (int i = 0; i < 8; i++) {
            for( int j = 0; j < n; j++) {
            	//1段目が□■□■□になるには
            	//1 + 1 = 2, 1 + 2 = 3, 1 + 3 = 4, 1 + 4 = 5, 1 + 5 = 6として
            	//上記を奇数偶数で見た目変化をさせると良い
            	if((i + j) % 2 == 0) {
            		System.out.print("□");
            	}else if((i + j) % 2 == 1) {
            		System.out.print("■");
            	}
            }
            System.out.println();
        }

	}

}
