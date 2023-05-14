
public class Quiz058 {

	public static void main(String[] args) {
		Member taro = new Member("タロウ");
        Member hanako = new Member("ハナコ");

        Coupon silver = new Coupon("シルバー", 0.2);
        Coupon gold = new Coupon("ゴールド", 0.5);

        taro.setCoupon(silver);
        hanako.setCoupon(gold);

        //①taroの持つuseCouponメソッドを呼び出します。引数は2000とします。
        //　戻り値は、変数payを宣言して受け取ります。
        int pay = taro.useCoupon(2000);

        System.out.println("割引額は" + pay + "円です。");

        //②hanakoの持つuseCouponメソッドを呼び出します。引数は2000とします。
        //　戻り値は、変数payで受け取ります。
        //戻り値をpayに格納。あらかじめpayは宣言してあるから上書き
        pay = hanako.useCoupon(2000);

        System.out.println("割引額は" + pay + "円です。");

	}

}

class Coupon{
	String name;
	double rate;
	
	Coupon(String name, double rate){
		this.name = name;
		this.rate = rate;
	}
}

class Member{
	String name;
	//MemberクラスでCouponクラスを使うことを宣言
	Coupon coupon;
	
	Member(String name){
		this.name = name;
	}
	
	void setCoupon(Coupon coupon) {
		this.coupon = coupon;
	}
	
	int useCoupon(int price) {
		//coupon.rateでCouponクラスのrateを呼び出している
		return (int)(price * coupon.rate);
	}
}