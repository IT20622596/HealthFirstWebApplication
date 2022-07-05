package com.admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AdminDBUtil {
	    private static boolean  isSuccess; 
		private static Connection con = null;
		private static Statement stat = null;
		private static ResultSet rs = null;
	
	
	public static List<Admin> validate(String userName, String password){
		
		ArrayList<Admin> admi = new ArrayList<>();
		 
		try {
			
			con = DBConnect.getConnection();
			stat = con.createStatement();
		
			String sql = "select * from admin where username ='"+userName+"' and password ='"+password+"'";
			rs = stat.executeQuery(sql);
			
			
			if(rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String userU = rs.getString(5);
				String passU = rs.getString(6);
				
				Admin a = new Admin(id,name,email,phone,userU,passU);
				admi.add(a);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return admi;
		
	}
	
	public static boolean insertadmin(String doctorname,String month,String numOfPatients,String payment  ) {
		
		boolean isSuccess = false;
		
		
		try {
            
			con = DBConnect.getConnection();
			stat = con.createStatement();
			String sql ="insert into report values (0,'"+doctorname+"','"+month+"','"+numOfPatients+"','"+payment+"')";
			int rs= stat.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
			
		}
		catch (Exception e){
			e.printStackTrace();
			
		}
		return isSuccess;
      }
	
	public static boolean updateadmin(String id,String name,String email,String phone,String username,String password) {
		
		try {
			con = DBConnect.getConnection();
			stat = con.createStatement();
			String sql ="update admin set name='"+name+"',email='"+email+"',phone='"+phone+"',username='"+username+"',password='"+password+"'"
			+"where id ='"+id+"'";
			int rs = stat.executeUpdate(sql);
			
		    if(rs > 0) {
		    	isSuccess = true;
		    }
		    else {
		    	isSuccess = false;
		    }
		    	
		} 
		   catch(Exception e){
			e.printStackTrace();
			
		}
		
		
		return isSuccess;
	
		}
	public static List<Admin> getAdminDetails(String Id){
		

		
		ArrayList<Admin> admi = new ArrayList<>();
		try {
			con = DBConnect.getConnection();
			stat = con.createStatement();
			String sql = "select * from admin where id = '"+Id+"'";
			rs = stat.executeQuery(sql);
			
			while(rs.next()) {
				String id =rs.getString(1);
				String name =rs.getString(2);
				String email =rs.getString(3);
				String phone =rs.getString(4);
				String username =rs.getString(5);
				String password =rs.getString(6);
						
			    Admin a = new Admin(id,name,email,phone,username,password);
				admi.add(a);
				
			}
			
			
		}
		catch(Exception e){
			e.printStackTrace(); 
		}
		
		
		return admi;
	}
	
	public static boolean deleteAdmin(String id) {
	
	try {
		con = DBConnect.getConnection();
		stat = con.createStatement();
		String sql = "delete from admin where id='"+id+"'";
		int r  =stat.executeUpdate(sql);
		
		if(r>0) {
			isSuccess = true;
		}
		else {
			isSuccess = false;
		}
		
	}
	catch(Exception e){
		e.printStackTrace();
	}
		
	return isSuccess;	
	} 
	public static List <Schedule> validate(String appointmentID){
		ArrayList<Schedule> sche = new ArrayList<>();
		
		try {
			con = DBConnect.getConnection();
			stat = con.createStatement();
			
			String sql = "select * from appschedule where appointmentid='"+appointmentID+"'";
			rs = stat.executeQuery(sql);
			
			if(rs.next()) {
				String appointmentid = rs.getString(1);
				String doctorname = rs.getString(2);
				String patientname = rs.getString(3);
				String date = rs.getString(4);
				String time = rs.getString(5);
				
				Schedule s = new Schedule(appointmentid,doctorname,patientname,date,time);
				
				sche.add(s);
				
			}
			
			
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		
			return sche;
	}
	
	public static boolean updateschedule(String appointmentid,String doctorname,String patientname,String date,String time) {
	
		try {
			con = DBConnect.getConnection();
			stat = con.createStatement();
			String sql ="update appschedule set doctorname='"+doctorname+"',date='"+date+"',time='"+time+"'"
					+"where appointmentid='"+appointmentid+"'";
			
			int rs = stat.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		return isSuccess;
	}
	
	
	public static List<Schedule>getScheduleDetails(String AppId){
		
		ArrayList<Schedule>	sche = new ArrayList<>();
		
		try {
			
			con= DBConnect.getConnection();
			stat = con.createStatement();
			String sql ="select * from appschedule where appointmentid='"+AppId+"'";
			rs = stat.executeQuery(sql);
			
			while(rs.next()) {
				
				String appointmentid = rs.getString(1);
				String doctorname = rs.getString(2);
				String patientname = rs.getString(3);
				String date = rs.getString(4);
				String time = rs.getString(5);
				
				Schedule s = new Schedule(appointmentid,doctorname,patientname,date,time);
				sche.add(s);
				
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return sche;
	}	

	
	public static boolean deleteSchedule(String appointmentid) {
		
		try {
			
			con = DBConnect.getConnection();
			stat = con.createStatement();
			String sql = "delete from appschedule where appointmentid = '"+appointmentid+"'";
			int result = stat.executeUpdate(sql);
			
			if(result > 0) {
				
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		}
		catch(Exception e){
			
			e.printStackTrace();
		}
		
		
		
				
		return isSuccess;
	}
}














