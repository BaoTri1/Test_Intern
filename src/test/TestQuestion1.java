package test;

import java.util.ArrayList;


public class TestQuestion1 {
	
	public static void main(String[] args) {
		
		ArrayList<Item> list = new ArrayList<Item>();
		list.add(new Item(1, "Product A", 24000, 3));
		list.add(new Item(2, "Product B", 26000, 8));
		list.add(new Item(3, "Product C", 23000, 2));
		list.add(new Item(4, "Product D", 22000, 7));
		list.add(new Item(5, "Product E", 21000, 1));
		list.add(new Item(6, "Product F", 27000, 4));
		list.add(new Item(7, "Product G", 64000, 6));
		list.add(new Item(8, "Product H", 34000, 5));
		
//		for(int i = 0; i < 10000; i++) {
//			list.add(new Item(i+1, "Product " + (i+1), 24000, 3));
//		}
		
		ArrayList<Item> listOutPut = new ArrayList<Item>();
		
		for(int i = 0; i < list.size(); i++) {
			String combName = "";
			int totalPrice = 0;
			for(int j = 0; j < list.size(); j++) {
				if(list.get(i).getComb() == list.get(j).getID()) {
					combName  = list.get(j).getName();
					totalPrice = list.get(i).getPrice() + list.get(j).getPrice();
				}
			}
			Item item = new Item(
					list.get(i).getID(),
					list.get(i).getName(),
					totalPrice,
					list.get(i).getComb()
					);
			item.setCombName(combName);
			listOutPut.add(item);
		}
		
		for(int i = 0; i < listOutPut.size(); i++) {
			System.out.println("id = " + listOutPut.get(i).getID() + ", " +
					"name = " + listOutPut.get(i).getName() + ", " +
					"price = " + listOutPut.get(i).getPrice() + ", " +
					"comb = " + listOutPut.get(i).getComb() + ", " + 
					"comb_name = " + listOutPut.get(i).getCombName() + ", "
					);
		}
		
	}

}
