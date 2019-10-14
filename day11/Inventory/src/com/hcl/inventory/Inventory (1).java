package com.hcl.inventory;

public class Inventory {
	private int Price,QuantityAvail;
	private String stockid,ItemName;
	public String stockid(){
		return stockid;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getQuantityAvail() {
		return QuantityAvail;
	}
	public void setQuantityAvail(int quantityAvail) {
		QuantityAvail = quantityAvail;
	}
	public String getStockid() {
		return stockid;
	}
	public void setStockid(String stockid) {
		this.stockid = stockid;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	@Override
	public String toString() {
		return "Inventory [Price=" + Price + ", QuantityAvail=" + QuantityAvail + ", stockid=" + stockid + ", ItemName="
				+ ItemName + "]";
	}
	

}
