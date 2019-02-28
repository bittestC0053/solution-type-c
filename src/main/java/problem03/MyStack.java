package problem03;

public class MyStack {
	
	private String[] buffer;
	int top;
	int size;
	
	public MyStack( int size ) {
		top=0;
		this.size=size;
		buffer = new String[size()];
	}
	
	public void push(String item) {
		
		if(top<size) {
			buffer[++top]=item;
		}
	}

	public String pop() {

		return buffer[top--];
		
	}

	public boolean isEmpty() {
		
		if(top>0) {
			return false;
		}
		
		else {
			return true;
		}
		
	}
	
	public int size() {
		
		size=size*2;
		
		return size;
	}
}