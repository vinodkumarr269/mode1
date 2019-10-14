package boxing;

public class Demo1 {
	public int sum(){
		return 5;
	}
	public int sum(int x){
		return x+5;
	}
	public int sum(int x,int y){
		return x+y;
	}
	

	public static void main(String[] args) {
		Demo1 o=new Demo1();
		int res=o.sum();
		System.out.println(res);
		res=o.sum(72);
		System.out.println(res);
		res=o.sum(4,3);
		System.out.println(res);
	}

}
