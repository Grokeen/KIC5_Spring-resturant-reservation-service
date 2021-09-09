package model;

public class Menu {
	
	private int menunum;
	private int cafenum;
	private String menuname;
	private int menuprice;
	
	
	@Override
	public String toString() {
		return "Menu [menunum=" + menunum + ", cafenum=" + cafenum + ", menuname=" + menuname + ", menuprice="
				+ menuprice + "]";
	}
	public int getMenunum() {
		return menunum;
	}
	public void setMenunum(int menunum) {
		this.menunum = menunum;
	}
	public int getCafenum() {
		return cafenum;
	}
	public void setCafenum(int cafenum) {
		this.cafenum = cafenum;
	}
	public String getMenuname() {
		return menuname;
	}
	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}
	public int getMenuprice() {
		return menuprice;
	}
	public void setMenuprice(int menuprice) {
		this.menuprice = menuprice;
	}
	
	
	
}
