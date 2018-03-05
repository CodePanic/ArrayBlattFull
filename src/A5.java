public class A5 {

	public static void main(String[] args) {

		int rest = 127;
		
		System.out.println(rest+ " aufgeteilt:");
		
		muenze(rest);

	}
	
	public static void muenze(int restgeld) {
		
		int[] muenzArray = new int[8];
		int[] muenzTypen = {200,100,50,20,10,5,2,1};
		
		muenzArray[0] = restgeld/50;
		muenzArray[1] = (restgeld%50)/20;
		muenzArray[2] = ((restgeld%50)%20)/10;
		muenzArray[3] = (((restgeld%50)%20)%10)/5;
		muenzArray[4] = ((((restgeld%50)%20)%10)%5)/2;
		muenzArray[5] = ((((restgeld%50)%20)%10)%5)%2;
		
		System.out.println("50ct: "+muenzArray[0]);
		System.out.println("20ct: "+muenzArray[1]);
		System.out.println("10ct: "+muenzArray[2]);
		System.out.println(" 5ct: "+muenzArray[3]);
		System.out.println(" 2ct: "+muenzArray[4]);
		System.out.println(" 1ct: "+muenzArray[5]);
		
	}

}
