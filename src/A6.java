import java.util.Arrays;

public class A6 {

	public static void main(String[] args) {
		
		int[] numbers = check(createNewSet());
		
		System.out.println(Arrays.toString(numbers));

	}
	
	public static int[] createNewSet() {
		int[] rand = new int[6];
		
		for (int i = 0; i < rand.length; i++) {
			
			rand[i] = (int) (Math.random()*49) +1;
			
		}
		
		return rand;
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
			return array;
		}
		else {
			System.out.println("Oh no DUPLICATES "+Arrays.toString(array));
			return createNewSet();
		}
		
	}
	
	

}
