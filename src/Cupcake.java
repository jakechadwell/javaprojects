import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cupcake {

	public static void main(String[] args) {
		String[] input = {"cup", "cake", "cup", "cup", "cake"};
		
		System.out.println(duplicates(input));
	}
	
	
	private static List<String> duplicates(String[] input) {
        Map<String, Integer> cakeMap = new HashMap<String, Integer>();
        List<String> list = new ArrayList<>();
        for(String word: input){
			if(cakeMap.containsKey(word)) {				
				cakeMap.put(word, cakeMap.get(word) + 1);
				list.add(word + (cakeMap.get(word) - 1));
			}
			else {			
				cakeMap.put(word, 1);	
				list.add(word);
			}		
		}
        return list;
	}
	
}
