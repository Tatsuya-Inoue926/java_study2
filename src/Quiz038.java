import java.util.Scanner;

class Quiz038 {

	public static void main(String[] args) {
		System.out.print("数値を入力してください:");
        //キーボードより数値を受け取ります。
        int n = (new Scanner(System.in)).nextInt();
        for (int i = 0; i < 8; i++) {
            //ここにプログラムを書きます。
        	for( int j = 0; j < n; j++) {
        		if(i % 2 == 0) {
        			System.out.print("■");
        		}else if(i % 2 == 1) {
        			System.out.print("□");
        		}
        	}
        	System.out.println();
        }

	}

}
