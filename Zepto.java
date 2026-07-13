class Zepto {


            public static int search(String item){
			 System.out.println("search started");
		 
			 int price =0;
			 
			 if(item == "Nandini GoodLife Milk"){
			     price = 54;
			}
			else if(item == "iD Fresh Idly Dosa Batter"){
			     price = 70;
			}
			else if(item == "Heritage Paneer"){
			     price = 95;
			}
			else if(item == "Bingo Potato Chips"){
			    price = 20;
			}
			else if(item == "Thums Up 1.25L"){
			    price = 75;
			}
			else if(item == "Yippee Noodles"){
			    price = 15;
			}
			else if(item == "Parle-G Biscuits"){
			    price = 10;
			}
			else if(item == "Cadbury Oreo"){
			    price = 40;
			}
			else if(item == "KitKat Share Bag"){
			    price = 65;
			}
			else if(item == "Bru Instant Coffee"){
			    price = 160;
			}
			else if(item == "Wagh Bakri Tea Bag"){
			    price = 145;
			}
			else if(item == "MTR Poha Mix"){
			    price = 35;
			}
			else if(item == "Kwality Wall's Cornetto"){
			    price = 50;
			}
			else if(item == "Act II Popcorn"){
			    price = 25;
			}
			else if(item == "Paper Boat Chilli Guava"){
			    price = 35;
			}
			else if(item == "Amul Taaza Milk 1L"){
			    price = 56;
			}
			else if(item == "Milkbikit Biscuits"){
			    price = 25;
			}
			else if(item == "Kurkure Masala Munch"){
			    price = 20;
			}
			else if(item == "Monster Energy Drink"){
			    price = 110;
			}
			else if(item == "Kinley Water 1L"){
			    price = 20;
			}
			else if(item == "Snickers Bar"){
			    price = 50;
			}
			else if(item == "Britannia Cheese Cubes"){
			    price = 135;
			}
			else if(item == "Bector's Premium Bread"){
			    price = 45;
			}
			else if(item == "Everest Garam Masala"){
			    price = 48;
			}
			else if(item == "Sunpure Sunflower Oil"){
			    price = 145;
			}
			else if(item == "Glow & Lovely Cream"){
			    price = 120;
			}
			else if(item == "Sensodyne Toothpaste"){
			    price = 150;
			}
			else if(item == "Lizol Floor Cleaner"){
			    price = 119;
			}
			else if(item == "Harpic Bathroom Cleaner"){
			    price = 105;
			}
			else if(item == "Comfort Fabric Conditioner"){
			    price = 72;
			}
				
			
			
			
		System.out.println("search ended");
		 
		  return price;
		  
	}
	
		public static int search(String item , int quantity){
			 System.out.println("search started");
		 
			 int price =0;
			 
			 if(item == "Nandini GoodLife Milk"){
			     price = 54 * quantity;
			}
			else if(item == "iD Fresh Idly Dosa Batter"){
			     price = 70 * quantity;
			}
			if(item == "Heritage Paneer"){
			     price = 95 * quantity;
			}
			else if(item == "Bingo Potato Chips"){
			    price = 20 * quantity;
			}
			else if(item == "Thums Up 1.25L"){
			    price = 75 * quantity;
			}
			else if(item == "Yippee Noodles"){
			    price = 15 * quantity;
			}
			else if(item == "Parle-G Biscuits"){
			    price = 10 * quantity;
			}
			else if(item == "Cadbury Oreo"){
			    price = 40 * quantity;
			}
			else if(item == "KitKat Share Bag"){
			    price = 65 * quantity;
			}
			else if(item == "Bru Instant Coffee"){
			    price = 160 * quantity;
			}
			else if(item == "Wagh Bakri Tea Bag"){
			    price = 145 * quantity;
			}
			else if(item == "MTR Poha Mix"){
			    price = 35 * quantity;
			}
			else if(item == "Kwality Wall's Cornetto"){
			    price = 50 * quantity;
			}
			else if(item == "Act II Popcorn"){
			    price = 25 * quantity;
			}
			else if(item == "Paper Boat Chilli Guava"){
			    price = 35 * quantity;
			}
			else if(item == "Amul Taaza Milk 1L"){
			    price = 56 * quantity;
			}
			else if(item == "Milkbikit Biscuits"){
			    price = 25 * quantity;
			}
			else if(item == "Kurkure Masala Munch"){
			    price = 20 * quantity;
			}
			else if(item == "Monster Energy Drink"){
			    price = 110 * quantity;
			}
			else if(item == "Kinley Water 1L"){
			    price = 20 * quantity;
			}
			else if(item == "Snickers Bar"){
			    price = 50 * quantity;
			}
			else if(item == "Britannia Cheese Cubes"){
			    price = 135 * quantity;
			}
			else if(item == "Bector's Premium Bread"){
			    price = 45 * quantity;
			}
			else if(item == "Everest Garam Masala"){
			    price = 48 * quantity;
			}
			else if(item == "Sunpure Sunflower Oil"){
			    price = 145 * quantity;
			}
			else if(item == "Glow & Lovely Cream"){
			    price = 120 * quantity;
			}
			else if(item == "Sensodyne Toothpaste"){
			    price = 150 * quantity;
			}
			else if(item == "Lizol Floor Cleaner"){
			    price = 119 * quantity;
			}
			else if(item == "Harpic Bathroom Cleaner"){
			    price = 105 * quantity;
			}
			else if(item == "Comfort Fabric Conditioner"){
			    price = 72 * quantity;
			}
				
			
		System.out.println("search ended");
		 
		  return price;
		  
	}
			 
	 public static void main(String grocery []){
	    System.out.println("main Started");
		
		String item = "Monster Energy Drink";
		
		   int price  = search(item);
		   
		   System.out.println(" The price of "+ item +" is "+ price);
		   
		   
		   int priceWithQuantity  = search(item , 4);
		   
		   System.out.println(" The price of "+ item +" is "+ priceWithQuantity);
		   
		   
		   System.out.println("main ended");
		   
	}
	
}
