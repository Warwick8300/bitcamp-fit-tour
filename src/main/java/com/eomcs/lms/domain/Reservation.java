package com.eomcs.lms.domain;
import java.io.Serializable;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Reservation implements Cloneable, Serializable {
	private static final long serialVersionUID = 1L;

	private int no;//예약번호
	private int tourNo;//상품번호
	private int memberNo;//회원번호
	private int statusNo;//상태번호
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd",timezone = "Asia/Seoul" )
	//@DateTimeFormat(pattern="yyyy-MM-dd'T'HH:mm:ss")
	private Date tourDate;//여행일
	private int personnel;//여행인원
	private String touristTel;//예약자 연락처
	private String requirement;//요청사항
	private String paymentNo;//결제번호
	private String buyerName; // 예약자번호
	private String cancelReason;

	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
	private Date paymentDate;//결제일
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
	private Date reservationDate;//예약일
	private PaymentStatus paymentStatus;
	private Member member;
	private Tour tour;
	
	

	public String getCancelReason() {
    return cancelReason;
  }
  public void setCancelReason(String cancelReason) {
    this.cancelReason = cancelReason;
  }
  public String getBuyerName() {
		return buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	public Tour getTour() {
		return tour;
	}
	public void setTour(Tour tour) {
		this.tour = tour;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getTourNo() {
		return tourNo;
	}
	public void setTourNo(int tourNo) {
		this.tourNo = tourNo;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public int getStatusNo() {
		return statusNo;
	}
	public void setStatusNo(int statusNo) {
		this.statusNo = statusNo;
	}
	public Date getTourDate() {
		return tourDate;
	}
	public void setTourDate(Date tourDate) {
		this.tourDate = tourDate;
	}
	public int getPersonnel() {
		return personnel;
	}
	public void setPersonnel(int personnel) {
		this.personnel = personnel;
	}
	public String getTouristTel() {
		return touristTel;
	}
	public void setTouristTel(String touristTel) {
		this.touristTel = touristTel;
	}
	public String getRequirement() {
		return requirement;
	}
	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}
	public String getPaymentNo() {
		return paymentNo;
	}
	public void setPaymentNo(String paymentNo) {
		this.paymentNo = paymentNo;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public Date getReservationDate() {
		return reservationDate;
	}
	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}
	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
  @Override
  public String toString() {
    return "Reservation [no=" + no + ", tourNo=" + tourNo + ", memberNo=" + memberNo + ", statusNo="
        + statusNo + ", tourDate=" + tourDate + ", personnel=" + personnel + ", touristTel="
        + touristTel + ", requirement=" + requirement + ", paymentNo=" + paymentNo + ", buyerName="
        + buyerName + ", cancelReason=" + cancelReason + ", paymentDate=" + paymentDate
        + ", reservationDate=" + reservationDate + ", paymentStatus=" + paymentStatus + ", member="
        + member + ", tour=" + tour + "]";
  }
	
	
	
















}
