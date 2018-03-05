import java.util.Arrays;
import java.util.Scanner;

public class A4 {

	public static void main(String[] args) {
		int[] rand = new int[100000];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < rand.length; i++) {

			rand[i] = (int) (Math.random()*50000) ;
			
		}
		System.out.println(""+Arrays.toString(rand));
		
		System.out.println("Zahl");
		String input = sc.nextLine();
		
		
		//Variante A
//		for (int i = 0; i < rand.length; i++) {
//			int currentRand = rand[i];
//			if(Integer.parseInt(input) == currentRand) {
//				System.out.println("gefunden bei "+i+" "+rand[i]);
//				break;
//			}
//		}

		
		//Variante B
		for (int i = 0; i < rand.length; i++) {
			int currentRand = rand[i];
			System.out.println(i);
			if(Integer.parseInt(input) == currentRand) {
				System.out.println("gefunden bei "+i+" "+rand[i]);
				System.out.println("y fuer weitersuchen");
				String q = sc.nextLine();
				if (q.equals("y")) {
					continue;
				}
				else {
					System.out.println("Gut, dann eben nicht.");
					break;
				}
			}
		}
		
		System.out.println("Bin durch");
		
	}

}
