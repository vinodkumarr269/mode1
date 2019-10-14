package com.hcl.projectcollector;

import java.util.List;
import java.util.ResourceBundle;
import java.util.Scanner;

public class MainCust {

public static void deleteCustomer() {
int Cust;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Customer id  ");
Cust=sc.nextInt();
CustomerBAL obj=new CustomerBAL();
String res=obj.deleteCustomerBal(Cust);
System.out.println(res);
}
public static void updateCustomer() {
Customer objCustomer=new Customer();
Scanner sc=new Scanner(System.in);
System.out.println("Enter Customer id  ");
objCustomer.setCustId(Integer.parseInt(sc.next()));
System.out.println("Enter Customer Name  ");
objCustomer.setCustName(sc.next());
System.out.println("Enter Annual Premium  ");
objCustomer.setAnnualPremium(Double.parseDouble(sc.next()));
System.out.println("Enter Model Premium  ");
objCustomer.setModalPremium(Double.parseDouble(sc.next()));
CustomerBAL obj=new CustomerBAL();
String res=obj.updateCustomerBal(objCustomer);
System.out.println(res);
}
public static void showCustomer() {
CustomerBAL obj=new CustomerBAL();
List<Customer> lstCustomer=obj.showsCustomerBal();
for (Customer customer : lstCustomer) {
System.out.println(customer);
}
}
public static void searchCustomer() {
int CustId;
System.out.println("Enter Customer id  ");
Scanner sc=new Scanner(System.in);
CustId=sc.nextInt();
CustomerBAL obj=new CustomerBAL(); 
Customer objCustomer=obj.showsCustomerBal(objCustomer);
if(objCustomer!=null) {
System.out.println(objCustomer);
} else {
System.out.println("Record not found...");
}
}
public static void addCustomer() throws CustomerException {
ResourceBundle rb = ResourceBundle.getBundle("project");
Customer objCustomer=new Customer();
Scanner sc=new Scanner(System.in);
System.out.println("Enter Customer id  ");
objCustomer.setCustId(Integer.parseInt(sc.next()));
System.out.println("Enter Customer Name  ");
objCustomer.setCustName(sc.next());
System.out.println("Enter Annual Premium  ");
objCustomer.setAnnualPremium(sc.nextDouble());
System.out.println("Enter Model Premium  ");
objCustomer.setModalPremium(sc.nextDouble());
System.out.println("Enter Payment method");
objCustomer.setPaymentMode(sc.nextInt());
CustomerBAL obj=new CustomerBAL();
boolean res=obj.addCustomerBal(objCustomer);
if(res==true) {
System.out.println(rb.getString("added"));
}
}
public static void main(String[] args) {
int ch;
Scanner sc=new Scanner(System.in);
do {
System.out.println("Options");
System.out.println("---------");
System.out.println("1. Add Customer");
System.out.println("2. Show Customer");
System.out.println("3. Search Customer");
System.out.println("4. Update Customer");
System.out.println("5. Delete Customer");
System.out.println("6. Exit");
System.out.println("Enter Ur Choice  ");
ch=sc.nextInt();
switch(ch) {
case 1 : 
try {
addCustomer();
} catch (CustomerException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
break;
case 2 :
showCustomer();
break;
case 3 :
searchCustomer();
break;
case 4 : 
updateCustomer();
break;
case 5 : 
deleteCustomer();
break;
case 6 : 
return;
default : 
System.out.println("Invalid Choice");
}
} while(ch!=6);
}

}