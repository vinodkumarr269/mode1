package com.hcl.inventory;
public class InventoryBAL{
	public static int generateordernoBal()
	{
		return new InventoryDAO().generateordernoDao();
	}
	public static String orderInventoryBal(String stid,int orderedquantity)
	{
		return new InventoryDAO().orderInventoryDao(stid, orderedquantity);
	}
	
	public static Inventory searchInventory(String stockid)
	{
		return new InventoryDAO().searchInventoryDao(stockid);
	}
	public static String createInventory(Inventory obj)
	{
		return new InventoryDAO().createInventoryDao(obj);
	}
	public static String generateStockId(){
		return new InventoryDAO().generateStockIdDao();
	}

}
