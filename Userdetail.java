package car;

import java.util.Objects;

public class Userdetail {
	private int user_id;
	private String first_name;
	private String cpassword;
	private String roletype;
	private String Email;
	private Long phoneno;
	private String address;
	
	
	public Userdetail(String first_name, String cpassword, String roletype, String email, Long phoneno) {
		super();
		this.first_name = first_name;
		this.cpassword = cpassword;
		this.roletype = roletype;
		this.Email = email;
		this.phoneno=phoneno;
		
	}
	
	public Userdetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Userdetail(String cpassword, String email) {
		super();
		this.cpassword = cpassword;
		Email = email;
	}

	
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	public String getRoletype() {
		return roletype;
	}
	public void setRoletype(String roletype) {
		this.roletype = roletype;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(Long phoneno) {
		this.phoneno = phoneno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Email, address, cpassword, first_name, phoneno, roletype, user_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Userdetail other = (Userdetail) obj;
		return Objects.equals(Email, other.Email) && Objects.equals(address, other.address)
				&& Objects.equals(cpassword, other.cpassword) && Objects.equals(first_name, other.first_name)
				&& Objects.equals(phoneno, other.phoneno) && Objects.equals(roletype, other.roletype)
				&& user_id == other.user_id;
	}

	@Override
	public String toString() {
		return "Userdetail [user_id=" + user_id + ", first_name=" + first_name + ", cpassword=" + cpassword
				+ ", roletype=" + roletype + ", Email=" + Email + ", phoneno=" + phoneno + ", address=" + address + "]";
	}
	
}
