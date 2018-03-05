import java.util.Arrays;

public class A7 {

	public static void main(String[] args) {
		int[] rand = new int[50000];
		int[] histo = new int[10];
		
		for (int i = 0; i < rand.length; i++) {
			rand[i] = (int) (Math.random()*10) ;
		}
		System.out.println(Arrays.toString(rand));
		
		for (int i = 0; i < rand.length; i++) {
			histo[rand[i]]++;
		}
		
		for (int i = 0; i < histo.length; i++) {
			System.out.println(i+" x "+histo[i]);
		}
		
	}

}
