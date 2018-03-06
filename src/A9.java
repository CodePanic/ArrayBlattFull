
public class A9 {

	static String pw = "";
	static int lower = 0;
	static int capital = 0;
	static int digit = 0;
	static int special = 0;

	public static void main(String[] args) {


		while(pw.length() < 8) {
			
			char candidate = (char) ( (Math.random() * 94) + 33 );
			
			System.out.println("// "+lower+" "+capital+" "+digit+" "+special+" "+candidate+" "+pw);
			

			if ( special < 1 && !Character.isLetterOrDigit(candidate) ) {
				special++;
				pw+=candidate;
			} 
			else if( digit < 2 && Character.isDigit(candidate)){
				digit++;
				pw+=candidate;
			}
			else if( lower < 4 && capital+lower < 5 && Character.isLowerCase(candidate)){
				lower++;
				pw+=candidate;
			}
			else if( capital+lower < 5 &&  Character.isUpperCase(candidate)){
				capital++;
				pw+=candidate;
			}


		}
		
		System.out.println(pw);

	}
	


	
}
