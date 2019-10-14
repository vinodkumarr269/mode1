package com.hcl.inventory;

import java.util.Scanner;

import com.hcl.inventory.InventoryBAL;

public class CreateInventoryMain {
   public static void main(String[] args) {
	String stockid=InventoryBAL.generateStockId();
	Inventory objInventory=new Inventory();
	objInventory.setStockid(stockid);
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the ItemName");
	objInventory.setItemName(sc.nextLine());
	System.out.println("enter the QuantityAvail");
	objInventory.setQuantityAvail(sc.nextInt());
	System.out.println("enter the Price");
	objInventory.setPrice(sc.nextInt());
	System.out.println(InventoryBAL.createInventory(objInventory));
	
}
}
