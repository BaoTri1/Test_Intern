package test;

public class Item {
	
	private int id;
	private String name;
	private int price;
	private int comb;
	private String comb_name;
	
	public Item() {
		
	}
	
	public Item(int id, String name, int price, int comb) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.comb = comb;
	}
	
	public int getID() {
		return id;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getComb() {
		return comb;
	}
	
	public void setComb(int comb) {
		this.comb = comb;
	}
	
	public String getCombName() {
		return comb_name;
	}
	
	public void setCombName(String comb_name) {
		this.comb_name = comb_name;
	}

}
