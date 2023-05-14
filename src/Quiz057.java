
public class Quiz057 {

	public static void main(String[] args) {
		Yusha1 taro = new Yusha1("タロウ", 10);
        Monster goblin = new Monster("ゴブリン", 20);

        //変数taroの持つメソッドattackを呼び出す。
        //引数はgoblinとする。
        //インスタンスを代入している
        taro.attack(goblin);

	}

}

class Monster{
	String name;
	int hp;
	
	Monster(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
}

class Yusha1{
	String name;
	int atk;
	
	Yusha1(String name, int atk){
		this.name = name;
		this.atk = atk;
	}
	
	void attack(Monster target) {
		//引数のインスタンスがMonsterなため、MonsterクラスのnameとHPが使える
		System.out.println(target.name + "に" + this.atk +"ダメージ");
	}
}
