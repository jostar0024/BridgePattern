
public class CountDisplay extends Display {
	public CountDisplay(final DisplayImpl impl) {
		super(impl);
	}
	
	public void multiDisplay(final int times) {
		start();
		
		for(int i = 0; i < times ; i++)
		{
			print();
		}
		end();
	}

}
