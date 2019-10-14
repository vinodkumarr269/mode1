package com.hcl.threads;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

class ListDemo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		List lstData=new ArrayList();
		lstData.add("Keerthana");
		lstData.add("Yash");
		lstData.add("Amit");
		lstData.add("Raghu");
		lstData.add("Sai");
		lstData.add("Krishna");
		for (Object object : lstData) {
			System.out.println(object);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
class LinkDemo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		LinkedList lst=new LinkedList();
		lst.add("Bindu");
		lst.add("vinod");
		lst.add("Kumar");
		lst.add("Prem");
		lst.add("sai");
		lst.add("rishab");
		lst.addFirst("Tarun");
		lst.addLast("Kiuba");
		
		for (Object object : lst) {
			System.out.println(object
					);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}
class VectorDemo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Vector v=new Vector(3,2);
		v.addElement("Niveda");
		v.addElement("Yaswanth");
		v.addElement("Sai Krishna");
		v.addElement("Pream Reddy");
		v.addElement("Anisha");
		v.addElement("Nagindra");
		for (Object object : v) {
			System.out.println("Vector "+object);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class ThrImp {
	public static void main(String[] args) {
		Thread t1=new Thread(new ListDemo());
		Thread t2=new Thread(new LinkDemo());
		Thread t3=new Thread(new VectorDemo());
		t1.start();
		t2.start();
		t3.start();
	}

}
