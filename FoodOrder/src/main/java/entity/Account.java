package entity;

public class Account {
	private int id;
	private String user;
	private String password;
	private int isSell;
	private int isAdmin;

	public Account(int id, String user, String password, int isSell, int isAdmin) {

		this.id = id;
		this.user = user;
		this.password = password;
		this.isSell = isSell;
		this.isAdmin = isAdmin;
	}

	public Account() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getIsSell() {
		return isSell;
	}

	public void setIsSell(int isSell) {
		this.isSell = isSell;
	}

	public int getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}

}
