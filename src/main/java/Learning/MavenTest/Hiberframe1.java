package Learning.MavenTest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="hiberframe")
public class Hiberframe1 
{
	@Id
	@GeneratedValue
	@Column(name="uid")
	private int uid;
	
	@Column(name="fname")
	private String fname;
	
	@Column(name="lname")
	private String lname; 
	
	@Column(name="email")
	private String email;
	
	@Column(name="pwd")
	private String pwd;
	
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
