
public class Quiz054 {

	public static void main(String[] args) {
		//ハンバーガーを生成
        Menu sandwitch = new Menu("ハンバーガー", 150);
        //オレンジジュースを生成
        Menu drink = new Menu("オレンジジュース", 100);
        //セットメニューを生成
        SetMenu burgerset = new SetMenu("ハンバーガーセット", sandwitch, drink);

        //セットメニューを表示
        burgerset.display();

	}

}

class Menu{
	String name;
	int price;
	
	Menu(String name, int price){
		this.name = name;
		this.price = price;
	}
	void display(){
		System.out.println(this.name + ":" + price + "円");
	}
}

class SetMenu{
	String name;
	Menu sandwitch;
	Menu drink;
	
	SetMenu(String name, Menu sandwitch, Menu drink){
		this.name = name;
		this.sandwitch = sandwitch;
		this.drink = drink;
	}
	void display() {
		
		System.out.println(name);
		System.out.println("---");
		sandwitch.display();
		drink.display();
		System.out.println("---");
		int price = (int)((sandwitch.price + drink.price)*0.8);
		System.out.println("セット価格"+ price + "円");
	}
}
