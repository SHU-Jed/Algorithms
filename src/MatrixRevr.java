
public class MatrixRevr{
	public static int[][] reverse(int[][]a,int M,int N){
		int b[][] =new int[N][M];
		for(int i = 0;i<M;i++)
			for (int j = 0;j<N ;j++ )
				b[j][i] = a[i][j] ;
			
		return b;
			}


	 public static void main(String[] args) {
	  int[][]a ={ {1,2,3} ,{4,5,6}};
	  int [][]c=reverse(a,2,3);
	  for (int[]row :c ) {
	  	for (int element :row ) {
	  		System.out.print(element +" ");
	  		
	  	}
	  		System.out.println();
	  	
	  }

	}
}