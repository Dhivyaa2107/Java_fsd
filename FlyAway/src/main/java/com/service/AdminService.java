package com.service;

import java.util.List;

import com.bean.AdminLogin;
import com.bean.Flights;
import com.dao.AdminDao;

public class AdminService {
	AdminDao ad = new AdminDao();
	public String addFlightDetails(Flights f) {
		if(ad.addFlights(f)>0) {
			return "flight details addesd";
		}else {
			return "flight details not added";
		}
	}
	public String changePassword(String email,String password) {
		if(ad.changePassword(email, password)>0) {
			return "password changed";
		}
		else {
			return "New password must not match old password";
		}
	}
	public List<Flights> getFlightDetails(){
		return ad.AllflightDetails();
	}
	public String addAdminDetails(AdminLogin a) {
		if(ad.addAdmin(a)>0) {
			return "Admin credentials added";
		}else {
			return "Admin credentials not added!!Email must be unique";
		}
	}
}
