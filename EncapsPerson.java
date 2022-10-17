package OOP;

import java.util.Date;

public class EncapsPerson {
       
	private String name;
	private String address;
	private Date DOB;
	
	public String getName() {
		return name; 
		}
	public String getAdd() {
		return address; 
		}
	public Date getDOB() {
		return DOB; 
		}
	public void setName(String name) {
		this.name=name; 
		}
	public void setAdd(String address) {
		this.address=address; 
		}
	public void setDOB(Date DOB) {
		this.DOB=DOB;
	}
}
