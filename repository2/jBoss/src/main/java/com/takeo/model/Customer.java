package com.takeo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class Customer {

@Id
@Column(name= "CID")
private int custId;
@Column(name= "CNAME")
private String custName;
@Column(name="CADDRESS")
private String custAddress;


public Customer() {
	super();
}
public Customer(int custId, String custName, String custAddress) {
	super();
	this.custId = custId;
	this.custName = custName;
	this.custAddress = custAddress;
}

public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public String getCustAddress() {
	return custAddress;
}
public void setCustAddress(String custAddress) {
	this.custAddress = custAddress;
}

}
