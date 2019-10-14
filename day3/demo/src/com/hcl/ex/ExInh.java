package com.hcl.ex;

 class First {
	public void show(){
		System.out.println("first method");
	}
 }
	class Second extends First{
		public void show(){
			System.out.println("second method");
		}
	}
	
	public class ExInh{
		public static void main(String[] args) {
			try {
				First ob1=new First();
				
				Second ob2=(Second)ob1;
				ob2.show();
			} 
			catch (ClassCastException e){
				System.out.println("derived can not take base base calss");
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}


