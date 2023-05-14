
public class Quiz056 {

	public static void main(String[] args) {
		Node n1 = new Node(5);
        Node n2 = new Node(8);
        Node n3 = new Node(12);
        Node n4 = new Node(7);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        //各ノードの値を表示する
        Node now = n1;
        while( now != null ){
            now.display();
            now = now.next;
        }

	}
}

class Node{
	int value;
	Node next;
	
	Node(int value){
		this.value = value;
	}
	
	void display() {
		System.out.println(this.value);
	}
}