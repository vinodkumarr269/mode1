package boxing;

public class OverloadDemo {
      public void show(int x){
    	  System.out.println("int"+x);
      }
      public void show(String x){
    	  System.out.println("string"+x);
      }
      public void show(boolean x){
    	  System.out.println("boolean"+x);
      }
      public void show(double x){
    	  System.out.println("double"+x);
      }
      public static void main(String[] args) {
    	  OverloadDemo o=new OverloadDemo();
    	  o.show(12);
    	  o.show(true);
    	 // o.show(12,5);
    	o.show("HCL");
		
	}

	
}
