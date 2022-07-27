
public class Display {
	private final DisplayImpl m_impl;
	
	Display(final DisplayImpl impl){
		m_impl = impl;
	}
	
	public void start() {
		m_impl.start();
	}
	
	public void print() {
		m_impl.print();
	}
	
	public void end() {
		m_impl.end();
	}
	
	public final void display() {
		start();
		print();
		end();
	}
	
}
