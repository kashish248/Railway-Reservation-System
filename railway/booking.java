package com.example.demo.EntityBooking;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="schedulemanage")
public class booking {
	@Id
	 int pnr;
	 int tnumber;
	 String tname;
	 String doj;
	 String clas;
	 String snumber;
	 String froma;
	 String toa;
	 String dtime;
	 String atime;
	 
	public booking() {}

	public booking(int pnr, int tnumber, String tname, String doj, String clas, String snumber, String froma,
			String toa, String dtime, String atime) {
		super();
		this.pnr = pnr;
		this.tnumber = tnumber;
		this.tname = tname;
		this.doj = doj;
		this.clas = clas;
		this.snumber = snumber;
		this.froma = froma;
		this.toa = toa;
		this.dtime = dtime;
		this.atime = atime;
	}

	public int getPnr() {
		return pnr;
	}

	public void setPnr(int pnr) {
		this.pnr = pnr;
	}

	public int getTnumber() {
		return tnumber;
	}

	public void setTnumber(int tnumber) {
		this.tnumber = tnumber;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public String getSnumber() {
		return snumber;
	}

	public void setSnumber(String snumber) {
		this.snumber = snumber;
	}

	public String getFroma() {
		return froma;
	}

	public void setFroma(String froma) {
		this.froma = froma;
	}

	public String getToa() {
		return toa;
	}

	public void setToa(String toa) {
		this.toa = toa;
	}

	public String getDtime() {
		return dtime;
	}

	public void setDtime(String dtime) {
		this.dtime = dtime;
	}

	public String getAtime() {
		return atime;
	}

	public void setAtime(String atime) {
		this.atime = atime;
	}

	
	
	 

}
