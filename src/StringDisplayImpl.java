
public class StringDisplayImpl extends DisplayImpl{
	private String m_str;
	
	public StringDisplayImpl(final String string) {
		m_str = string;
	}
	
	@Override
	public void start(){
		printLine();
	}

	@Override
	public void print() {
		System.out.println(m_str);
	}

	@Override
	public void end() {
		printLine();
	}

	private void printLine() {
		System.out.println("**************");
	}
}
