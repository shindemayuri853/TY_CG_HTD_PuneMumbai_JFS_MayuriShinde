package com.capgemini.jpawithhibernate.onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "votercard")
public class VoterCard {
	@Id
	@Column
	private int vid;
	@Column
	private String address;
	@OneToOne(mappedBy="VoterCard")
	private Person person;
	
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getaddress() {
		return address;
	}
	public void setaddress(String address) {
		this.address = address;
	}
	public Person getPerson() {
		return person;
	}

}
