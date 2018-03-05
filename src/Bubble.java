import java.util.Arrays;

public class Bubble {

	public static void main(String[] args) {
		int[] array = new int[] {1,3,2,4};
		
		for (int j = array.length-1; j >= 0 ; j--) {
			
			boolean necessary = false;
			
			for (int i = 0; i < j; i++) {
				System.out.println(j+" "+i+" "+Arrays.toString(array));
				
				int left = array[i];
				int right = array[i+1];
				
				if (left > right) {
					int temp = left;
					array[i]   = right;
					array[i+1] = left;
					necessary = true;
					continue;
				}
				System.out.println(necessary);
			}
			
			if(!necessary) break;
			
		}

		System.out.println(Arrays.toString(array));

	}

}
