
public class Quiz050 {

	public static void main(String[] args) {
		Items i1 = new Items("コーヒー", 120);
        Items i2 = new Items("オレンジジュース", 150);

        i1.display();
        i2.display();
	}

}

class Items{
	String name;
	int price;
	
	Items(String name,int price){
		this.name = name;
		this.price = price;
	}
	
	void display() {
		System.out.println(this.name +":"+ this.price);
	}
}
