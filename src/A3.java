import java.util.Arrays;

public class A3 {

	public static void main(String[] args) {
		
		int[] rand = new int[10];
		
		for (int i = 0; i < 10; i++) {
			rand[i] = (int) (Math.random()*10) +1;
		}
		
		System.out.println(Arrays.toString(rand));
		
		for (int i = 0; i < 5; i++) {
			int temp = rand[i];
			
			rand[i] = rand[9-i];
			rand[9-i] = temp; 
		}
		
		System.out.println(Arrays.toString(rand));

	}

}
