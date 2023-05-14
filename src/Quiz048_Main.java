//×
public class Quiz048_Main {

	public static void main(String[] args) {
		Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();

        c1.setTax(0.08);
        c2.setTax(0.1);

        System.out.println("税込(8%)" + c1.calc(1000));
        System.out.println( "税込(10%)" + c2.calc(1000) );
	}

}

class Calculator{
	double tax;
	
	void setTax(double tax) {
		this.tax = tax;
	}
	int calc(int price) {
		//結果全体にintをキャストする
		return (int)(price * (1+this.tax));
	}
}
