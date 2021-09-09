package model;

import java.util.Date;

public class Reservation {
	private int reservenum;
	private int cafenum;
	private String guesttel;
	private String guestpass;
	private String reservetime;
	private Date reservedate;
	private int reservepeople;
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
	public String getGuesttel() {
		return guesttel;
	}
	public void setGuesttel(String guesttel) {
		this.guesttel = guesttel;
	}
	public String getGuestpass() {
		return guestpass;
	}
	public void setGuestpass(String guestpass) {
		this.guestpass = guestpass;
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
	public int getReservepeople() {
		return reservepeople;
	}
	public void setReservepeople(int reservepeople) {
		this.reservepeople = reservepeople;
	}
	@Override
	public String toString() {
		return "Reservation [reservenum=" + reservenum + ", cafenum=" + cafenum + ", guesttel=" + guesttel
				+ ", guestpass=" + guestpass + ", reservetime=" + reservetime + ", reservedate=" + reservedate
				+ ", reservepeople=" + reservepeople + "]";
	}
	
	
}
