package model;

public class Cafe {
	
	private int cafenum;
	private String cafename;
	private String cafelocation;
	private String cafetel;
	private int cafetotalseat;
	private String cafekind;
	private String cafepicture;
	
	
	public int getCafenum() {
		return cafenum;
	}
	public void setCafenum(int cafenum) {
		this.cafenum = cafenum;
	}
	public String getCafename() {
		return cafename;
	}
	public void setCafename(String cafename) {
		this.cafename = cafename;
	}
	public String getCafelocation() {
		return cafelocation;
	}
	public void setCafelocation(String cafelocation) {
		this.cafelocation = cafelocation;
	}
	public String getCafetel() {
		return cafetel;
	}
	public void setCafetel(String cafetel) {
		this.cafetel = cafetel;
	}
	public int getCafetotalseat() {
		return cafetotalseat;
	}
	public void setCafetotalseat(int cafetotalseat) {
		this.cafetotalseat = cafetotalseat;
	}
	public String getCafekind() {
		return cafekind;
	}
	public void setCafekind(String cafekind) {
		this.cafekind = cafekind;
	}
	public String getCafepicture() {
		return cafepicture;
	}
	public void setCafepicture(String cafepicture) {
		this.cafepicture = cafepicture;
	}
	@Override
	public String toString() {
		return "Cafe [cafenum=" + cafenum + ", cafename=" + cafename + ", cafelocation=" + cafelocation + ", cafetel="
				+ cafetel + ", cafetotalseat=" + cafetotalseat + ", cafekind=" + cafekind + ", cafepicture="
				+ cafepicture + "]";
	}

	
	
}
