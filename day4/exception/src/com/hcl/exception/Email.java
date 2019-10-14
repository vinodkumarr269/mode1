package com.hcl.exception;
class InvalidEmailExceptioextends Exception{
	public InvalidEmailException(String error)
	{
		super(error);
	}
}
class InvalidUserNameException extends Exception{
	public InvalidUserNameException(String error)
	{
		super(error);
	}
}
class Mail{
	public void display(String user) throws InvalidEmailException, InvalidUserNameException{
		boolean flag=true,flag2=true;
	char[] c=user.toCharArray();
	for(char i:c){
		if(i !='@'){
			flag=false;
			throw new InvalidEmailExceptioextends("nagitive not allowed");
			
		//if(flag==true){
		//throw 
		//new InvalidEmailException("@ mandatory");
	
		if(user.length()-user.indexOf('@')<12){
			flag2=false;
			
			throw new InvalidUserNameException("nagitive not allowed");
			
		
//		if(flag2==false)
//		{
//			throw new InvalidUserNameException("1 2letter should be ther");
//			
//			
//		}
//		else{
//			System.out.println(user);
//		}
//		}
	}
			
	}


public class Email {
	public static void main(String[] args) {
		try {
			new Mail().display("vvjdjdjggjteei@.com")
;
		} catch (InvalidEmailException | InvalidUserNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	}

}

