import java.util.Arrays;

public class A10 {

	public static void main(String[] args) {
		int[][] matrix = {{1,2},{3,4}};
		
		System.out.println(Arrays.deepToString(transpose(matrix)));

	}
	
	public static int[][] transpose(int[][] someQuadratic){
		
		int dim = someQuadratic.length;
		int[][] transposed = new int[dim][dim];
		
		for (int i = 0; i < someQuadratic.length; i++) {
			for (int j = 0; j < someQuadratic[i].length; j++) {
				transposed[i][j] = someQuadratic[j][i];
			}
		}
		
		
		return transposed;
	}

}
