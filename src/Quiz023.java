
class Quiz023 {
	public static void main(String[] args) {
        //0～9までのランダムな値をaに代入してくれる命令です。
        int a = new java.util.Random().nextInt(10);
        System.out.println("a = " + a);
        //ここからプログラムを書いていきます。
        if(a % 2 == 0) {
        	System.out.println(a + "は偶数です");
        }else if(a % 2 ==1) {
        	System.out.println(a + "は奇数です");
        }

    }
	

}
