package boxing;

public class EmployTest {

	public static void main(String[] args) {
	 Employ e1=new Employ();
	 e1.empno=1;
	 e1.name="gdgd";
	 e1.basic=21254;
	 Employ e2=new Employ();
	 System.out.println(e1==e2);
	 e2.empno=1;
	 e2.name="gdgd";
	 e2.basic=2121;
	 System.out.println(e1.equals(e2));
	}

}
