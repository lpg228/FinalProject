package FinalProject;
/**
 * This program is in order to create a product, set the price o the product, and then print the receipt of the product.
 */
public class Product {
private String name;
private double price; 

public Product()
{
	name = "";
	price =0;
}
public Product(String name, double price)
{
	this.name = name;
	this.price=price;
}

public void setName(String name)
{
	this.name = name;
}

public void setPrice(double price)
{
	this.price = price;
}

public String getName()
{
	return name;
}
public double getPrice()
{
	return price;
}

public boolean equals(Product other)
{
	return (this.name.equals(other.getName()) && this.price == other.getPrice());
}

public String toString()
{
	String output = "";
	output = output +name+ " $" + price;
	return output;
}


}
