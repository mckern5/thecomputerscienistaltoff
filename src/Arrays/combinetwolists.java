package Arrays;
import java.util.stream.*;

public class combinetwolists {
	
	
	static String[] combine(String[] x, int[] y) {

		String[] xx= {"ff"};
		
		return xx;//IntStream
			//.range(0, Math.min(x.length, y.length))
			//.mapToObj(i-> x.get(i)+":"+y.get(i))
			
		
		
	}
	
	public static void main (String[] args) {
		
		String[] movie={"INTER","incept","the prest","insomnia"};
		int[] rating= {1,10,10,8,6};
		
		
		
		System.out.print(combine(movie,rating)[0]);
	}

}
