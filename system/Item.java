
package cashier.system;

public class Item {
    
    private String name = "x";
    private double price = 0.0;
    private String color = "red";
    private String size = "ONE SIZE";
    private String Type;
    
	public Item(String name, double price, String color, String size, String type) {
			super();
			this.name = name;
			this.price = price;
			this.color = color;
			this.size = size;
			Type = type;
		}

	public String getType() {
		return Type;
	}
	
	public void setType(String type) {
		Type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	/*----------------------------------------------------------------------------*/   
    public String getItem(){
       return this.name + " " + "$" + this.price + " " + this.size + " " + this.color; 
    }
    
}
