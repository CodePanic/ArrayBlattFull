import java.util.Arrays;

public class A1 {

	public static void main(String[] args) {

		int[] up = new int[10];
		int[] down = new int[10];
		int[] rand = new int[10];
		
		for (int i = 0; i < 10; i++) {
			
			up[i] = i+1;
			down[i] = 10-i;
			
			rand[i] = (int) (Math.random()*10) +1;
			
		}
		
		System.out.println("a) "+Arrays.toString(up));
		System.out.println("b) "+Arrays.toString(down));
		System.out.println("c) "+Arrays.toString(rand));
     

	}

}
