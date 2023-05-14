
class Quiz029 {
	public static void main(String[] args) {
        int age = 19;
        boolean members = true;
        int fee = 0;
        //ここにプログラムを追加します。
        if(age >= 20 && members) {
        	fee = 1100;
        }else if(age >= 20 && !members) {
        	fee = 1500;
        }else if(age < 20 && members) {
        	fee = 500;
        }else if(age < 20 && !members) {
        	fee = 800;
        }
        System.out.println("料金は" + fee + "円です");
    }

}
