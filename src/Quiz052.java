
public class Quiz052 {

	public static void main(String[] args) {
		Student2[] students = new Student2[3];
        //ここにプログラムを書きます。
		students[0] = new Student2("タロウ",80,75,90);
		students[1] = new Student2("ハナコ",90,70,80);
		students[2] = new Student2("ジロウ",0,0,0);

        System.out.println("成績表");
        for (int i = 0; i < students.length; i++) {
            students[i].show();
        }
        
	}

}

class Student2{
	String name;
	int koku;
	int su;
	int ei;
	
	Student2(String name, int koku, int su, int ei){
		this.name = name;
		this.koku = koku;
		this.su = su;
		this.ei = ei;
	}
	Student2(String name){
		this(name, 0, 0, 0);
	}
	void show() {
		System.out.println(this.name + ":" + this.koku +","+ this.su + "," + this.ei);
	}
}
