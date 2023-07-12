package employeeform.model;

public class employee {
private String firstname;
private String lastname;
private String username;
private String passwords;
private String address;
private String contact;
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPasswords() {
	return passwords;
}
public void setPasswords(String passwords) {
	this.passwords = passwords;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
@Override
public String toString() {
	return "employee [firstname=" + firstname + ", lastname=" + lastname + ", username=" + username + ", password="
			+ passwords + ", address=" + address + ", contact=" + contact + "]";
}

}
