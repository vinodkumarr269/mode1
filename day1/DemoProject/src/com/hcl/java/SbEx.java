package com.hcl.java;

public class SbEx {
	public void show(int age,String name,String course,String city)
	{
		StringBuilder sbError=new StringBuilder();
		boolean isValid=true;
		//validation of age
		if(age<=20){
			sbError.append("age must be grater than 20"+"\r\n");
			isValid=false;
		}
		if(name.indexOf(' ')==-1){
			sbError.append("name must contain first and last"+"\r\n");
			isValid=false;
		}
		if(!course.equalsIgnoreCase("java")){
			sbError.append("only java allowed"+"\r\n");
			isValid=false; 
		}
		if(!city.equals("ban")){
			sbError.append("only bangalore allowed"+"\r\n");
			isValid=false;
		}
		if(isValid==true){

			System.out.println("age "+age);
			System.out.println("name "+name);
			System.out.println("course "+course);
			System.out.println("city "+city);
			
		}
		else{
			System.out.println(sbError);
		}

	}
	public static void main(String[] args) {
		int age;
		String name,city,course;
		age=31;
		course="JAVA";
		name="vinod kumar";
		city="banalore";
		new SbEx().show(age,name,course,city);
				
	}
}
