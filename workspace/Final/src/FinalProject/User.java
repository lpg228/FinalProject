package FinalProject;
/**
 * This program is use to create an account for the user or login.
 */

public class User {
	private String accountName;
	private String password; 

	public User()
	{
		accountName = "";
		password ="";
	}
	public User(String accountName, String password)
	{
		this.accountName = accountName;
		this.password=password;
	}

	public void setAccountName(String accountName)
	{
		this.accountName = accountName;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getAccountName()
	{
		return accountName;
	}
	public String getPassword()
	{
		return password;
	}

	public boolean equals(User other)
	{
		return (this.accountName.equals(other.getAccountName()) && this.password.equals(other.getPassword()));
	}

	public String toString()
	{
		String output = "";
		output = output +"Account Name : "+accountName+ " Password : " + password;
		return output;
	}


	}
