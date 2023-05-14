
public class Quiz053 {

	public static void main(String[] args) {
		Daikei di1 = new Daikei(12,8,5);
		Daikei di2 = new Daikei(8,4,10);
		
		System.out.println(di1.getMenseki());
		System.out.println(di2.getMenseki());

	}

}

class Daikei{
	int jyoutei;
	int katei;
	int takasa;
	
	Daikei(int jyoutei, int katei, int takasa){
		this.jyoutei = jyoutei;
		this.katei = katei;
		this.takasa = takasa;
	}
	int getMenseki(){
		return (((jyoutei + katei)*takasa)/2);
	}
	
}