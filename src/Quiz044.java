
class Quiz044 {

	public static void main(String[] args) {
		 int[] score = { 45, 90, 75, 60, 80 };
	        int[] rank = { 1, 4, 2, 3, 0 };

	        System.out.println("----- 出席番号順 -----");
	        //出席番号順の表示
	        for (int i = 0; i < score.length; i++) {
	            //ここにプログラムを書きます
	        	System.out.println((i+1)+"番：" + score[i]);
	        }
	        System.out.println("----- 得点順 -----");        
	        //得点の高い順に表示
	        for (int i = 0; i < score.length; i++){
	            //ここにプログラムを書きます
	        	System.out.println((i+1)+"位：" + score[rank[i]]+"点");
	        	/*score[rank[i]]の部分は、rank配列の要素をインデックスとして使用して、score配列から対応する得点を取得しています。

具体的には、得点の高い順に表示するために、rank配列を使用してscore配列の要素を選択しています。rank配列の要素は0から始まるインデックスで、各要素の値は対応する出席番号の順位を示しています。

例えば、rank[0]の値が1であれば、score[1]が得点の最高値を示します。同様に、rank[1]の値が4であれば、score[4]が2番目に高い得点を示します。

このようにして、得点の高い順に得点を表示することができます。*/
	        }

	}

}
