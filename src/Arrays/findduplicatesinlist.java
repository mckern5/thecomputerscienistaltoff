package Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;


public class findduplicatesinlist {
	
	
	static ArrayList<String> finddup(String[] nam) {
		ArrayList<String> dups= new ArrayList<String>();
		
		Set<String> s=new HashSet<>() ;
		
		for(int i=0;i<nam.length;i++) {
			
			int l1=s.size();
			s.add(nam[i]);
			int l2=s.size();
			
			if(l1==l2) {
				dups.add(nam[i]);
			}
		}
		
		return dups;
	}
	
	public static void main(String[] args) {
		String[] names= {"Susan Adams","Jane Goodall","Isaac Asimov","Susan Adams"};
		
		ArrayList<String> result=finddup(names);
		
		for (String x:result) {
			System.out.println(x);
		}
	}

}
