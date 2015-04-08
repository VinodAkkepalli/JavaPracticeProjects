package interviews;

/**
 * 
 * @author Vinod Akkepalli
 *
 */
/**
	 input: I Love You My Friend!!
	 output: Friend!! My You Love I
 */


public class ReverseWordsOfString {

	public static String ReverseWords(String str){
		String ans = "";
		int strLen = str.length();
		String temp = new String();
		
		for(int i=0;i<strLen;i++){
			temp = "";
			while((i<strLen) && (str.charAt(i) != ' ')){
				temp = temp + str.charAt(i);
				i++;
			}
			ans = temp + " " + ans;
		}
		
		return ans;
	}
	
	
	public static void main(String[] args) {

		String inputStr = new String("I Love You My Friend!!");
		System.out.println("String is = " + inputStr);
		System.out.println("Reversed words is =  "+ ReverseWords(inputStr));
	}

	
}
