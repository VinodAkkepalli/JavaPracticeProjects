package codingcontest;

public class FindMaxIntLessThanN {

	public static void main(String[] args) {
		
		int N = 10010;
		
		System.out.println(solution(N));
	}

	public static int solution(int N) {
		
		if(N == 1) return 1;
		
		int previous = 0, current = 0;
		double upper = N / 2;

		for(int i = 2; i < upper; i++){
			
			current = previous + i;
			if(current > N ){
				return (i - 1);
			}else{
				previous = current;
			}
		}
		
		return 0;
	}
	
	
}
