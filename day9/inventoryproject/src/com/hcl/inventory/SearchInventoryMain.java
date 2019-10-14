package com.hcl.inventory;

import java.util.Scanner;


public class  SearchInventoryMain{
	public static void main(String[] args) {
		String stockid;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter stock id");
		stockid=sc.nextLine();
		Inventory objAccounts=InventoryBAL.searchInventory(stockid);
		if(objAccounts!=null)
		{
			System.out.println(" stock id id"+ objAccounts.getStockid() );
			System.out.println("last name "+ objAccounts.getItemName() );
			System.out.println(" city is "+ objAccounts.getPrice() );
			System.out.println("state is "+ objAccounts.getQuantityAvail() );
			
		}
		else
		{
			System.out.println("stock id not found");
		}
		
		}

}

	
