package boxing;

public class Quiz5 {
	public void show(Object ob){
		if(ob=="ABC"){
			System.out.println("correct");
		}
		else{
			System.out.println("Error");
		}
	}
	public static void main(String[] args) {
		String s="ABC";
		Quiz5 obj=new Quiz5();
		obj.show(s);
	}

}
