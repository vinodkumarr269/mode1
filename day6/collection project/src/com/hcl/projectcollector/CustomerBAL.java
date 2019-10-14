package com.hcl.projectcollector;

import java.util.List;

public class CustomerBAL {
	static StringBuilder sb=new StringBuilder();
	public boolean addCustomerBal(Customer objCustomer) throws CustomerException{
		boolean isAdded=true;
		if(objCustomer.getCustId()<=0){
			sb.append("number can not be negitive");
			isAdded=false;
		}
		if(objCustomer.getCustName().length()<5){
			sb.append("name should be grater than five");
			isAdded=false;
		}
		if(objCustomer.getAnnualPremium()<20000 || objCustomer.getAnnualPremium()>1000000);{
		sb.append("annual premiur between 20000 to 1000000");
		isAdded=false;
	   }
    	if(objCustomer.getModalPremium()<1000  || objCustomer.getModalPremium()>50000){
    	sb.append("should between 1000 and 50000");
    	isAdded=false;
    	}
    	if(objCustomer.getPaymentMode()!= 1 && objCustomer.getPaymentMode()!= 2 && objCustomer.getPaymentMode()!= 3){
    	sb.append("payment method should be 1 2 3")	;
    	isAdded=false;
    	}
    	 if(isAdded==false){
  		   throw new CustomerException(sb.toString());
  	   }
    	 else {
    		 new CustomerDAO().addCustomerDao(objCustomer);
    	 }
    	 return isAdded;
    }
	 public List<Customer> showsCustomerBal(){
	 	   return new CustomerDAO().showCustomerDao();
	    }
	public Customer searchCustomerBal(int castId){
 	   return new CustomerDAO().searchCustomerDao(castId);
    }
	 public String deleteCustomerBal(int castId){
	 	   return new CustomerDAO().deleteCustomerDao(castId);
	    }
   
    public String updateCustomerBal(Customer objCustomer){
 	   return new CustomerDAO().updateCustomerDao(objCustomer);
    }
	
   
}