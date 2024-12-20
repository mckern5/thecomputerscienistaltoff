





public class fizzbuzz {
	
	static int fizzbuzz2(int n) {
		
		for(int i=1;i<n+1;i++){
			
			if(i%3==0 && i%5==0) {
				System.out.println("FizzBuzz");
			}
			else if(i%3==0){
				System.out.println("Fizz");
			}
			else if(i%5==0) {
				System.out.println("BUzz");
			}
			
			else {
				System.out.println(i);
			}
			
		}
		
		return 0;
		
	}

	
	
	
	public static void main (String[] args) {
		System.out.println(fizzbuzz2(100));
	}
	

}
