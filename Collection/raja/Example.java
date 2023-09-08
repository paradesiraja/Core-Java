package raja;

public class Example {
    private int x;
    public Example(int x) {
    	this.x=x;
    }
	@Override
	public String toString() {
		//return "int value "+x;
		//return Integer.toString(x);
		return String.valueOf(x);
	}
    
}
