package Mypackage;

public class Bank {
private long Account_num;
private String name,email;
private float amount;
public long getAccount_num() {
	return Account_num;
}
public void setAccount_num(long account_num) {
	Account_num = account_num;
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
public float getAmount() {
	return amount;
}
public void setAmount(float amount) {
	this.amount = amount;
}

}

