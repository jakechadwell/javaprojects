import java.util.*;

public class SortByLength{
	
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>(new MyComparator());
		
		set.add("krishna");
        set.add("manjula");
        set.add("apple");
        set.add("alexander");
        set.add("chris");
        
        System.out.println(set);
	}
	
	class MyComparator implements Comparator<String> {
		
		@Override
		public int compare(String o1, String o2) {
			if(o1.length() == o2.length()) {
				return o1.compareTo(o2);
			}else {
				return o1.length() - o2.length();
			}
		}
	}
	
}
