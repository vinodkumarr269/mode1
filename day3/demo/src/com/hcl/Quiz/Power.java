package com.hcl.Quiz;
class First{
	public void pow1(int x,int y){
		int z=0;
		for(int i=1;i<y;i++){
			 z=z+x*x;
			}System.out.println(z);
		}
	public void pi(){
		double y;
		y=22f/7f;
		System.out.println(y);
	}
}

public class Power {
	public static void main(String[] args) {
		First o=new First();
		o.pow1(3,2);
		o.pi();
				}
}
