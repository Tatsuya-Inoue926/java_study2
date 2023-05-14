
class Quiz030 {
	public static void main(String[] args){
        int a = 9;
        int b = 10;
        int c = 6;
        //ここからプログラムを追加します。
        if( a > b && a > c) {
        	System.out.println("aが最大です");
        }else if(b > a && b > c) {
        	System.out.println("bが最大です");
        }else if(c > a && c > b) {
        	System.out.println("cが最大です");
        }else {
        	System.out.println("変数に同数が入っている可能性があります");
        }
    }

}
