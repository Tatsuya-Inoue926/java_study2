
class Quiz043 {

	public static void main(String[] args) {
	      int[][] array = {
	              { 1, 8, 12, 17, 20 },
	              { 2, 5, 11, 13, 18 },
	              { 4, 6, 9, 19, 21 }
	          };
	          //ここからプログラムを書きます。
	      //array.lengthは多元配列数3をさす
	      for(int i = 0; i<array.length; i++) {
	    	  //array[i].lengthは配列1つの長さやから5をさす
	    	  for(int j = 0; j < array[i].length; j++) {
	    		  System.out.print(array[i][j]+ " ");
	    	  }
	    	  System.out.println();
	      }
		

	}

}
