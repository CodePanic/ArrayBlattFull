import java.util.Arrays;

public class A2 {

	public static void main(String[] args) {
		int[] rand = new int[3];
		
		int sum = 0;
		int mean = 0;
		
		for (int i = 0; i < rand.length; i++) {

			rand[i] = (int) (Math.random()*10) +1;
			
		}
		
		
		int small = rand[0];
		int large = rand[0]; 
		
		for (int i = 0; i < rand.length; i++) {
			sum += rand[i];
			
			if( small > rand[i]) {
				small = rand[i];
			}
			if(large < rand[i]) {
				large = rand[i];
			}
			
		}
		
		System.out.println(""+Arrays.toString(rand));
		System.out.println("1. "+sum);
		System.out.println("2. "+(1.0*sum)/rand.length);
		System.out.println("3. "+small);
		System.out.println("4. "+large);
     

	}

}