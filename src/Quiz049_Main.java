
public class Quiz049_Main {

	public static void main(String[] args) {
		Circle c1 = new Circle();
        c1.setHankei(8);
        System.out.println(c1.getEnsyu());
        System.out.println(c1.getMenseki());
	}

}

class Circle{
	double PI = 3.14;
	int hankei;
	
	void setHankei(int hankei) {
		this.hankei = hankei;
	}
	double getEnsyu() {
		return hankei * 2 * PI;
	}
	double getMenseki() {
		return hankei * hankei * PI;
	}
}
