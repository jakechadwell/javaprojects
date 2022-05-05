import java.util.HashMap;
import java.util.Map;

public class DictionaryCharacterCount {
	static Map<Character, Integer> characterCount(String inputString){
        Map<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        char[] strArray = inputString.toCharArray();
 
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            }
            else {
                charCountMap.put(c, 1);
            }
        }
        return charCountMap;
    }
}
