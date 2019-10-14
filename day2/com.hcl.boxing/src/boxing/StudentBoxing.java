package boxing;

public class StudentBoxing {
	public void show(Object ob){
		Student s=(Student)ob;
		System.out.println(s);
		
	}
	public static void main(String[] args) {
		Student ob=new Student();
		ob.sno=1;
		ob.name="dsds";
		ob.city="vava";
		ob.cgp=9.54;
		new StudentBoxing().show(ob);
		
	}

}
