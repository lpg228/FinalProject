
import javax.swing.JOptionPane;

public class UsserPassword {
	
	public static void main(String[] args) {
		
		
           String username= "lpg228";
           String password = "123";
           String accountType = "Student";

           boolean loop = true;

           String[] choices = { "Admin", "Student", "Staff"};

           while(loop)
           {
        	loop = false;
        	String input = (String) JOptionPane.showInputDialog(null, "Choose account type...","Account Type",JOptionPane.QUESTION_MESSAGE, null,choices,choices[1]); 
        	System.out.println(input);
	
		
        	String inputUsername = null;
        	String inputPassword = null;
	
        	if(input != null)
        	{
        		inputUsername = JOptionPane.showInputDialog("Enter User Name");
		
        		if(inputUsername != null)
        			inputPassword = JOptionPane.showInputDialog("Enter Password");
			
        	}
	
        	if(username.equals(inputUsername))
        		if(password.equals(inputPassword))
        		{
        			switch(input)
        			{
        			case "Admin":
        				if(accountType.equals("Admin"))
        				{
        					JOptionPane.showMessageDialog(null, "Welcome"+ input + " " + inputUsername);
        				}
        				else
        				{
        					loop = false;
        					JOptionPane.showMessageDialog(null, "Wrong account");
        				}
        				break;
        			case "Student":
        				if(accountType.equals("Student"))
        				{
        					JOptionPane.showMessageDialog(null, "Welcome"+ input+ " " + inputUsername);
        				}
        				else
        				{
        					loop = false;
        					JOptionPane.showMessageDialog(null, "Wrong account");
        				}
        				break;
					case "Staff":
						if(accountType.equals("Staff"))
						{
							JOptionPane.showMessageDialog(null, "Welcome "+ input+ " " + inputUsername);
						}
						else
						{
							loop = false;
							JOptionPane.showMessageDialog(null, "Wrong account");
						}
						break;
			}
		}
		else
		{
			if(inputUsername != null)
			{
				loop = true;
				JOptionPane.showMessageDialog(null, "Contact Administrator");
			}
		}
		else 
		{
			if(inputUsername != null)
			{	
				loop = true;
				JOptionPane.showMessageDialog(null, "Contact Administrator");
			}
		}
	}
}
}


		
	
		
		
	
				



