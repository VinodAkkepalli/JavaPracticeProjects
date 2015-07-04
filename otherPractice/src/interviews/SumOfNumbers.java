package interviews;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class SumOfNumbers {

	/*public static void main(String[] args) throws Exception{

         //Read input from stdin and provide input before running

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        String str[];
        int a[];
        for (int i = 0; i < N; i++) {
        	line = br.readLine();
        	str = line.split(" ");
        	
        	System.out.println(Integer.parseInt(str[0])+Integer.parseInt(str[1]));
        }
        
        		
	}*/
	
	public static void main(String args[] ) throws Exception {
		 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        line = br.readLine();
        String n[] = line.split(" ");
        int k;
        for (int i = 0; i < T; i++) {
        	k = Integer.parseInt(n[i]);
        	for(int j = 1; j <= k; j++){
        		if(j % 3 == 0 & j % 5 == 0 ){
        			System.out.println("FizzBuzz");
        		}else if(j % 3 == 0){
        			System.out.println("Fizz");
        		}else if(j % 5 == 0){
        			System.out.println("Buzz");
        		}else{
        			System.out.println(j);
        		}
        			
        	}
        }
        
    }

}