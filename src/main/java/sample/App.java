package sample;

public class App {
	int multiply(int x, int y) {
		if(x == 0) {
			throw new IllegalArgumentException();
		}
		return x * y;
	}
}
