package com.hcl.projectcollector;

import java.util.ArrayList;
import java.util.List;

public class CustomerDAO {
	static List<Customer> lstCustomer=null;
	static{
		lstCustomer =new ArrayList<Customer>();
		}
	public String addCustomerDao(Customer customer){
		lstCustomer.add(customer);
		return "customer crested successfully";
		}
	
	public List<Customer> showCustomerDao(){
	return lstCustomer;
	}
	public Customer searchCustomerDao(int custId){
	 Customer objCustomer=null;
	for (Customer customer : lstCustomer) {
		if(customer.getCustId()==custId){
			objCustomer=customer;
			}
	}
	return objCustomer;
	}
	public String deleteCustomerDao(int custId){
		Customer customer=searchCustomerDao(custId);
		if(customer != null){
			lstCustomer.remove(customer);
			return "customer found";
		}
		else{
			return "customer not found";
		}
	}
	public String updateCustomerDao(Customer objCustomer){
		Customer customer=searchCustomerDao(objCustomer.getCustId());
		if(customer != null){
			for (Customer s : lstCustomer) {
				if(s.getCustId()==objCustomer.getCustId()){
					s.setCustName(objCustomer.getCustName());
					s.setAnnualPremium(objCustomer.getAnnualPremium());
					s.setModalPremium(objCustomer.getModalPremium());
					s.setPaymentMode(objCustomer.getPaymentMode());
				}
			}
				return "record updated";
		}
				else {
					return "record not found";
				}
		
	}
}
