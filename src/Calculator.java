
public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}
	public double computeCircleArea(double radius) {
		return Math.PI * radius * radius;
	}
	
	public String getFizzbuzz(int a) {
		if(a % 15 == 0) {
			return "FizzBuzz";
		}
		if(a%5 == 0)
			return "Buzz";
		if(a%3 == 0)
			return "Fizz";
		return Integer.toString(a);
	}
}
