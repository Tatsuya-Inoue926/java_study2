
public class Quiz051 {

	public static void main(String[] args) {
        Shop2 s1 = new Shop2("A町店", 150000);
        Shop2 s2 = new Shop2("B公園前店", 180000);
        Shop2 s3 = new Shop2();

        s1.display();
        s2.display();
        s3.display();

	}

}

class Shop2{
	String name;
	int sales;
	
	Shop2(String name,int sales){
		this.name = name;
		this.sales = sales;
	}
	Shop2(){
		//引数つきコンストラクタを呼び出す
		 this("出店予定",0);
	}
	void display() {
		System.out.println(this.name + ":売上高" + this.sales);
	}
}
