
public class IntSwap {

	public static class Swap{
		int x;
		int y;
		int temp;
	}
	
	public static void intSwap(Swap value) {
		value.temp = value.x;
		value.x = value.y;
		value.y = value.temp;
	}
	
	public static void main(String[] args) {
		Swap value = new Swap();
		value.x = 1;
		value.y = 45;
		System.out.format("x: %d y: %d \n", value.x, value.y);
		intSwap(value);
		System.out.println("x: " + value.x + " y: " + value.y);
	}
	
}
