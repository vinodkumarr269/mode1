package com.hcl.obj;

public class Agent {
	public StringBuilder show(String agentId,String fullName,int maritalStatus, String zipcode)
	{
              StringBuilder sbError=new StringBuilder();
	         boolean isValid=true;
	         if(agentId.charAt(0) !='A'){
	 			sbError.append("agent id should start with A"+"\r\n");
	 			isValid=false;
	 		}
	         if(fullName.indexOf(' ')==-1){
	 			sbError.append("name must contain first and last"+"\r\n");
	 			isValid=false;
	 		}
	         if(fullName.length()>20){
	 			sbError.append("age must be grater than 20"+"\r\n");
	 			isValid=false;
	        }	
	         if(maritalStatus !=0&&maritalStatus !=1){
	 			sbError.append("marital state should be 0 or 1"+"\r\n");
	 			isValid=false;
	        }
	        if(zipcode.length()>6){
	 			sbError.append("zip code should contain only 6"+"\r\n");
	 			isValid=false;
	     	}
	        if(isValid==true){

				sbError.append("agent id " +agentId+"\r\n");
				sbError.append("agent name " +fullName+"\r\n");
				sbError.append("marital status "+maritalStatus+"\r\n");
	        }
	        return sbError;
     }
    public static void main(String[] args) {
	String agentId="Anil";
	String fullName="vinod kumar";
	int maritalStatus=1;
	String zipcode = "abcj";
	System.out.println(new Agent().show(agentId,fullName,maritalStatus,zipcode));
			
  }
}
