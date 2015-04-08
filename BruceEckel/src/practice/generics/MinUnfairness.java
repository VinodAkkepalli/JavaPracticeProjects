package practice.generics;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// The part of the program involving reading from STDIN and writing to STDOUT has been provided by us.

public class MinUnfairness {
  
   public static void main(String[] args) throws NumberFormatException, IOException {
      int numPackets = 7;
      int numKids = 3;
      int[] packets = {10, 100, 300, 200, 1000, 20, 30};
      
      int unfairness = Integer.MAX_VALUE;
      
        // Write your code here, to process numPackets N, numKids K, and the packets of candies
      // Compute the ideal value for unfairness over here
      
      Arrays.sort(packets);
      int i = 0, temp = 0;
      
      int startLimit = numPackets - numKids;
      while(i < startLimit){
    	  temp = packets[i+numKids-1] - packets[i];
    	  if (temp < unfairness) unfairness = temp; 
    	  i++;
      }
      
      System.out.println(unfairness);
   }
}
