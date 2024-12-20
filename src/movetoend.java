
//page92
public class movetoend {
	
	static int[] movetoend2(int[] a_list){
		
		
		int[] blank=new int[a_list.length];
		int zeroindex=0;
		
		for(int i=0; i<a_list.length;i++) {
			if(a_list[i] !=0) {
				blank[zeroindex]=a_list[i];
				zeroindex++;
			}
			
			
			
		}
						
		return blank;
		
	}
	
		
public static void main (String[] args) {
		int[] a_list= {8,0,3,0, 12};
		for(int x: a_list) {
			System.out.print(x);System.out.print(",");
			
			
		}
		System.out.println();
		int[] sorted=movetoend2(a_list);
		
		for(int theint:sorted) {
			System.out.print(theint);System.out.print(",");
		}
		
	}

}
