package boxing;

public class EmploySearch {
	public Employ showEmploy(int empno){
		Employ employ=null;
		if(empno==1){
			employ =new Employ();
			employ.empno=100;
			employ.name="vin";
			employ.basic=7373;
		}
		if(empno==3){
			employ =new Employ();
			employ.empno=10;
			employ.name="vin";
			employ.basic=7373;
		}
		return employ;
	}
	public static void main(String[] args) {
		EmploySearch objSearch=new EmploySearch();
		Employ res=objSearch.showEmploy(6);
		if(res!=null){
			System.out.println(res);
			
		}
		else{
			System.out.println("empno not found");
		}
	}

}
