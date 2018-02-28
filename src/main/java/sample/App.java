package sample;

public class App {
	int divide(int x, int y) {
		if(y == 0) {
			throw new IllegalArgumentException("Durch 0 teilen ist verboten!");
		}
		else {
		return x / y;
		}
		
	}
	
	int multiply(int x, int y) 
	{
		return x * y;
	}
		
	int add(int x, int y) 
	{
		return x + y;
	}
	int substract(int x, int y) 
	{
		return x - y;
	}
}

