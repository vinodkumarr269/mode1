package boxing;

public class StudentSearch {
	public Student showStudent(int sno){
		Student x=null;
		if(sno==1){
			x =new Student();
			x.sno=100;
			x.name="vin";
			x.city="gdgd";
		}
		if(sno==4){
			x =new Student();
			x.sno=10;
			x.name="in";
			x.city="ggd";
		}
		return x;
		
	}
	public static void main(String[] args) {
		StudentSearch s=new StudentSearch();
		Student res=s.showStudent(4);
		if(res!=null){
			System.out.println(res);
			
		}
		else{
			System.out.println("sno not found");
		}
	}

}
