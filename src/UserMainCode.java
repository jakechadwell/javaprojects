import java.lang.*;

public class UserMainCode {
	
	public static int checkCharacters(String s) {
		String[] splt = s.split("");
		if(splt[0].equalsIgnoreCase(splt[splt.length-1])) {
			return 1;
		}else {
			return -1;
		}
	}
	
	public static void main(String args[]) {
		String inputString = "Taco Car";
		if(checkCharacters(inputString)==1) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}
	}
	
}
