package boxing;

public class ClassEmploy {
	public void show(Object ob){
	Employ e=(Employ)ob;
	System.out.println(e);
	}

	public static void main(String[] args) {
		Employ objEmploy=new Employ();
		objEmploy.empno=1;
		objEmploy.name="vinod";
		objEmploy.basic=665;
		new ClassEmploy().show(objEmploy);

	}

}
