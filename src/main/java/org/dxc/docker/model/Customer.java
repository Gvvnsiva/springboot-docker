package org.dxc.docker.model;

public class Customer {
private String name;
private String email;
private String mobileNo;
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public Customer(String name, String email, String mobileNo) {
	super();
	this.name = name;
	this.email = email;
	this.mobileNo = mobileNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobileNo() {
	return mobileNo;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}

}
