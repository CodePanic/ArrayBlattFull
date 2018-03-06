import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class A6 {

	public static void main(String[] args) {
		
		int[] numbers = createNewSet();
		
		System.out.println(Arrays.toString(numbers));

	}
	
	public static int[] createNewSet() {
		int[] rand = new int[6];
		
		for (int i = 0; i < rand.length; i++) {
			
			rand[i] = (int) (Math.random()*49) +1;
			
		}
		
		return check(rand);
	}
	
	public static int[] check(int[] array) {
	
		boolean result = true;
	
		bigloop:
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < i; j++) {
				if (array[i] == array[j]) {
					result = false;
					break bigloop;
				}
			}
		}
		
		if (result) {
			ArrayUtils.contains(array, 11);
			return array;
		}
		else {
			System.out.println("Oh no! DUPLICATES! "+Arrays.toString(array)+" retry...");
			return createNewSet();
		}
		
		
		
	}
	
	

}
