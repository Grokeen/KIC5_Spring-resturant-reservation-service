package model;

import java.util.Date;

public class State {
	
	private int reservenum;
	private int cafenum;
	private String reservetime;
	private Date reservedate;
	private int staterestseat;
	
	
	@Override
	public String toString() {
		return "State [reservenum=" + reservenum + ", cafenum=" + cafenum + ", reservetime=" + reservetime
				+ ", reservedate=" + reservedate + ", staterestseat=" + staterestseat + "]";
	}
	public int getReservenum() {
		return reservenum;
	}
	public void setReservenum(int reservenum) {
		this.reservenum = reservenum;
	}
	public int getCafenum() {
		return cafenum;
	}
	public void setCafenum(int cafenum) {
		this.cafenum = cafenum;
	}
	public String getReservetime() {
		return reservetime;
	}
	public void setReservetime(String reservetime) {
		this.reservetime = reservetime;
	}
	public Date getReservedate() {
		return reservedate;
	}
	public void setReservedate(Date reservedate) {
		this.reservedate = reservedate;
	}
	public int getStaterestseat() {
		return staterestseat;
	}
	public void setStaterestseat(int staterestseat) {
		this.staterestseat = staterestseat;
	}
	
	
}
