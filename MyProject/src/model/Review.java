package model;

public class Review {
	private int reviewnum;
	private int cafenum;
	private String guesttel;
	private String guestpass;
	private String reviewtitle;
	private String reviewcontent;
	private int reviewscore;
	
	@Override
	public String toString() {
		return "Review [reviewnum=" + reviewnum + ", cafenum=" + cafenum + ", guesttel=" + guesttel + ", guestpass="
				+ guestpass + ", reviewtitle=" + reviewtitle + ", reviewcontent=" + reviewcontent + ", reviewscore="
				+ reviewscore + "]";
	}
	public int getReviewnum() {
		return reviewnum;
	}
	public void setReviewnum(int reviewnum) {
		this.reviewnum = reviewnum;
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
	public String getReviewtitle() {
		return reviewtitle;
	}
	public void setReviewtitle(String reviewtitle) {
		this.reviewtitle = reviewtitle;
	}
	public String getReviewcontent() {
		return reviewcontent;
	}
	public void setReviewcontent(String reviewcontent) {
		this.reviewcontent = reviewcontent;
	}
	public int getReviewscore() {
		return reviewscore;
	}
	public void setReviewscore(int reviewscore) {
		this.reviewscore = reviewscore;
	}
	
	
}
