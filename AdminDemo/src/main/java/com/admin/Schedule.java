package com.admin;

public class Schedule {
	
	private String appointmentid;
	private String doctorname;
	private String patientname;
	private String date;
	private String time;
	
	
	public Schedule(String appointmentid, String doctorname, String patientname, String date, String time) {
		
		this.appointmentid = appointmentid;
		this.doctorname = doctorname;
		this.patientname = patientname;
		this.date = date;
		this.time = time;
	}


	public String getAppointmentid() {
		return appointmentid;
	}


	public String getDoctorname() {
		return doctorname;
	}


	public String getPatientname() {
		return patientname;
	}


	public String getDate() {
		return date;
	}


	public String getTime() {
		return time;
	}



}
