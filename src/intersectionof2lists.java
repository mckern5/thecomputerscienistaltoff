import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//the computer scientist pg 99
public class intersectionof2lists {
	
	
  static Set<Integer> inter(Integer [] a,Integer[] b) {
	  
	  Set<Integer> w=new HashSet<Integer>();
	  Set<Integer> x=new HashSet<Integer>();
	  
	  w.addAll(Arrays.asList(a));
	  x.addAll(Arrays.asList(b));
	  
	  Set<Integer> intersection=new HashSet<Integer>(w);
	 intersection.retainAll(x);
	 
	  return intersection ;
 }
	
  public static void main(String[] args) {
	  
	  Integer [] x= {2,43,48,62,28,3};
	  Integer [] y= {1,28,42,70,2,10,62,31,4,14};
	  
	  System.out.println(inter(x,y));
	  
	  
	  
  }
}