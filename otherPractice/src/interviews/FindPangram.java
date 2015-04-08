package interviews;

/**
 * 
 * @author Vinod Akkepalli
 *
 */

/*
 *  program to find if a given string is a pangram
 */

public class FindPangram {

	public static void main(String[] args) {

		String str = new String("We promptly judged antique ivory buckles for the next prize  ");
		
		if(isPangram(str)){
			System.out.println("pangram");
		}else{
			System.out.println("not pangram");
		}
	}

	private static boolean isPangram(String str) {

		
		String str1 = new String(str.toUpperCase());
		for(char c=65; c<=90;c++){
			if(str1.indexOf(c) == -1)
				return false;
		}
		return true;
	}

}
