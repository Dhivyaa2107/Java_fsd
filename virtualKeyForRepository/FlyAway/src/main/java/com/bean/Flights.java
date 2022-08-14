package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Flights {
@Id
private int Srno;
private String fname;
private String source;
private String Destination;
private String date;
private String time;
private int price;
private int seats;

public int getSrno() {
	return Srno;
}
public void setSrno(int srno) {
	Srno = srno;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDestination() {
	return Destination;
}
public void setDestination(String destination) {
	Destination = destination;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getSeats() {
	return seats;
}
public void setSeats(int seats) {
	this.seats = seats;
}
@Override
public String toString() {
	return "Flights [Srno=" + Srno + ", fname=" + fname + ", source=" + source + ", Destination=" + Destination
			+ ", date=" + date + ", time=" + time + ", price=" + price + ", seats=" + seats + "]";
}
}
