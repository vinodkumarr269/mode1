package boxing;

public class StDemo {
	void show(){
		System.out.println("from show");
	
	
	}static void disply(){
		System.out.println("from display");
	}
	public static void main(String[] args) {
	//	StDemo.disply();
		new StDemo().show();
		
	}

}
