package com.service;

import java.util.List;

import com.bean.Flights;
import com.dao.UserDao;

public class UserService {
	UserDao ud= new UserDao();
	public List<Flights> flightDetails(String src,String des,String date){
		return ud.flightDetails(src, des, date);
	}
	public String Bookflights(int srno,int seat) {
		if(ud.bookFlights(srno, seat)>0) {
			return "Booking successful";
		}else {
			return "booking not done!! try once again by checking vailable flight details";
		}
	}
}