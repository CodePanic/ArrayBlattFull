
public class A9 {

	static String pw = "";
	static int state = 0;
	final static int lower = 1;
	final static int capital = 10;
	final static int digit = 100;
	final static int special = 1000;

	public static void main(String[] args) {


		while(pw.length() < 8) {
			
			char candidate = (char) ( (Math.random() * 94) + 33 );
			
			System.out.println(state+" "+candidate+" "+pw);
			
			
			
			if ( state <= 1000 && !Character.isLetterOrDigit(candidate) ) {
				state+=special;
				pw+=candidate;
			} 
			else if( (state%1000)/100 < 2 && Character.isDigit(candidate)){
				state+=digit;
				pw+=candidate;
			}
			else if( ((state%1000)%100)/10+((state%1000)%100)%10 < 5 && Character.isLowerCase(candidate)){
				state+=lower;
				pw+=candidate;
			}
			else if( ((state%1000)%100)%10 < 5 && Character.isUpperCase(candidate)){
				state+=capital;
				pw+=candidate;
			}


		}
		
		System.out.println(pw);

	}
	


	
}
