package boxing;

public class StudentTest {
public static void main(String[] args) {
	Student ob1=new Student();
	ob1.sno=1;
	ob1.name="dsds";
	ob1.city="vava";
	ob1.cgp=9.54;
	Student ob2=new Student();
	ob2.sno=1;
	ob2.name="dsds";
	ob2.city="vava";
	ob2.cgp=9.5;
	System.out.println(ob1==ob2);
	 System.out.println(ob1.equals(ob2));
	
}
}
