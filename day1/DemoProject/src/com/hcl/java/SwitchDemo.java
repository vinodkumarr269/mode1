package com.hcl.java;

public class SwitchDemo {
	public void show(int dayNo)
	{
		switch(dayNo){
		case 1:
		    System.out.println(" sun");
		    break;
		case 2:
			System.out.println("mon");
		    break;
		case 3:
			System.out.println("tue");
			break;
		case 4:
			System.out.println("wed");
			break;
		case 5:
			System.out.println("thu");
			break;
		case 6:
			System.out.println("fri");
			break;
		default:
			System.out.println("sat");
		}
		
	}
	public static void main(String[] args) {
		int dayNo=10;
		SwitchDemo o=new SwitchDemo();
		o.show(dayNo);
	}

}
