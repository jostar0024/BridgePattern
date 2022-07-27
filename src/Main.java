
public class Main {
	public static void main(String[] args) {
		final Display display = new Display(new StringDisplayImpl("Hello"));
		final Display display2 = new CountDisplay(new StringDisplayImpl("Hello"));
		final CountDisplay display3 = new CountDisplay(new StringDisplayImpl("Good"));
		
		display.display();
		display2.display();
		display3.display();
		display3.multiDisplay(3);
	}
}
