
public class Quiz055 {

	public static void main(String[] args) {
		Yusha taro = new Yusha("タロウ", 20, 10);
        taro.displayStatus();
        System.out.println("---");
        taro.buki = new Buki("鉄の剣", 10);
        taro.displayStatus();

	}

}

class Buki{
	String name;
	int atk;
	
	Buki(String name, int atk){
		this.name = name;
		this.atk =atk;
	}
}

class Yusha{
	String name;
	int hp;
	int atk;
	Buki buki;
	
	Yusha(String name, int hp, int atk){
		this.name = name;
		this.hp = hp;
		this.atk = atk;
	}
	void displayStatus() {
		System.out.println("勇者" + this.name);
		System.out.println("HP"+ this.hp);
		if(buki == null) {
			System.out.println("攻撃力："+ this.atk);
		}else {
			System.out.println("攻撃力："+ (this.atk + buki.atk));
		}
	}
}