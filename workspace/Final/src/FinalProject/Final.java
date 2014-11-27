package FinalProject;

import javax.swing.JOptionPane;
/**
 * This program is for login or create an account in order to create a product, sell the product, and then print he receipt of the product.
 * @author User Geonhee Ko and Laura Garia 
 * November 26,2014
 */
public class Final {
	public static String [] log = new String [30];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product [] products = new Product [10];
		Product [] receipt = new Product [10];
		String[] choices = { "Create a product", "Sell a product", "Print receipt", "Exit Program", "Display userlog"};
		String [] welcome ={"Login","Create Account"};
		User [] users = new User[5];
		users[0] = new User("moneymike","csc200");
		
		boolean loop = true;
		
		while(loop)
		{
			loop = false; 
				
			
			String inputUrname = null;
			String inputPass = null;
			
		
			String loginChoice = (String) JOptionPane.showInputDialog(null, "Choose an action...","List of Actions",JOptionPane.QUESTION_MESSAGE, null,welcome,welcome[0]);
			switch (loginChoice){
				case "Login":
				{
					inputUrname = JOptionPane.showInputDialog("Enter User Name");
					
					if(inputUrname != null)
						inputPass = JOptionPane.showInputDialog("Enter Password");
						
				
				//if(urname.equals(inputUrname) &&(pass.equals(inputPass))
				//switch(choices){
				boolean loggedIn = false;
				User loginInput = new User(inputUrname, inputPass);
				for(int i = 0; i < users.length; i++)
				{
					if(users[i] != null && loginInput.equals(users[i]))
					{
						
						loggedIn = true;
					}
				}
			
				if(loggedIn)
					{
						createLogEntry("User : " + inputUrname + " logged in");
					
						JOptionPane.showMessageDialog(null, "Welcome " + inputUrname);
						//Product stuff code goes here
						boolean keepLooping = true;
						while(keepLooping)
						{
							String menuChoice = (String) JOptionPane.showInputDialog(null, "Choose an action...","List of Actions",JOptionPane.QUESTION_MESSAGE, null,choices,choices[0]);
							switch( menuChoice )
							{
								case "Create a product":
								{
									//code for creating an product
									String name = (String) JOptionPane.showInputDialog("Enter name of product");
									String price = (String) JOptionPane.showInputDialog("Enter price of product");
									Product p = new Product(name, Double.parseDouble(price));
									
									int i = 0;
									while(products[i] != null && i < products.length)
									{
										i++;
									}
									if(i < products.length)
									{
										createLogEntry(inputUrname + " created product : " + p);
										JOptionPane.showMessageDialog(null,"Successfully Created Product");
										products[i] = p;
									}
									else
									{
										createLogEntry(inputUrname + " failed to create product : " + p);
										JOptionPane.showMessageDialog(null,"Failed to Create Product, inventory full");
										
									}
									break;
								}
								case "Sell a product":
								{
									//code for selling a product
									if(!isEmpty(products))
									{
										Product choice = (Product) JOptionPane.showInputDialog(null, "Choose a product","List of Products",JOptionPane.QUESTION_MESSAGE, null,products,products[0]);
										boolean found = false;
										for(int i = 0 ; i < products.length; i++)
										{
											if(products[i] != null)
											{
												if(!found && products[i].equals(choice))
												{
													found = true;
													int j = 0; 
													while(receipt[j] != null && j < receipt.length)
													{
														j++;
													}
													if(j < receipt.length)
													{
														receipt[j] = choice;
													}
													products[i] = null;
													createLogEntry(inputUrname + " sold product : " + choice);
												}
											}
										}
									}
									break;
								}
								case "Print receipt":
								{
									createLogEntry(inputUrname + " printed a receipt");
									//code for printing a receipt
									String productsSold = "";
									double total = 0;
									for(int i = 0; i < receipt.length; i++)
									{
										if(receipt[i] != null)
										{
											total += receipt[i].getPrice();
											productsSold += receipt[i].toString() + "\n";
										}
									}
									
									JOptionPane.showMessageDialog(null, "Sold these products\n" + productsSold + "\nTotal Revenue : $" + total);
									break;
								}
								case "Exit Program":
								{
									//EXIT PROGRAM
									keepLooping = false;
									break;
								}
								case "Display userlog" :
								{
									String logString = "";
									for(int i = 0; i < log.length; i++)
									{
										if(log[i] != null)
										{
											logString += log[i] + "\n";
										}
									}
									JOptionPane.showMessageDialog(null, logString);
									break;
								}
							}
						}
						
					}
					else
					{
						if(inputUrname != null)
						{
							loop = true;
							JOptionPane.showMessageDialog(null, "Fail Authentication");
						}
					}
					break;
				}
				case "Create Account" :
				{
					loop = true;
					String newName = null;
					String newPassword = null;
					while(newName == null)
					{
						newName = JOptionPane.showInputDialog("Enter User Name");
					}
					while(newPassword == null)
					{
						newPassword = JOptionPane.showInputDialog("Enter Password");
					}
					
					int i = 0;
					while(users[i] != null && i < users.length)
					{
						i++;
					}
					users[i] = new User(newName, newPassword);
					break;
				}
			}

		}
			
	}
	public static boolean isEmpty(Product [] p)
	{
		for(int i = 0; i < p.length; i++)
		{
			if(p[i] != null)
				return false;
		}
		return true;
	}
	public static void createLogEntry(String entry)
	{
		int i = 0;
		while(log[i] != null && i < log.length)
		{
			i++;
		}
		if(i < log.length)
			log[i] = entry;
		else
			System.out.println("Out of space for log entries");
	}
}


