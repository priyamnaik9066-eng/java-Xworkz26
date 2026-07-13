class Zomatoo {


            public static int search(String item){
			 System.out.println("search started");
			 
			 int price =0;
			 
			 if(item == "Noodles"){
			     price = 150;
			}
			else if(item == "Manchurian Rice"){
			     price = 160;
			}
			if(item == "Veg Fried Rice"){
			     price = 150;
			}
			else if(item == "Schezwan Rice"){
			    price = 160;
			}
			else if(item == "Chillie Paneer"){
			    price = 180;
			}
			else if(item == "Paneer Manchurian"){
			    price = 200;
			}
			else if(item == "Paneer 65"){
			    price = 222;
			}
			else if(item == "Veg Spring Roll"){
			    price = 200;
			}
			else if(item == "Veg Cripsy"){
			    price = 180;
			}
			else if(item == "Veg Lollipop"){
			    price = 140;
			}
			else if(item == "Maggy Masala"){
			    price = 70;
			}
			else if(item == "Pasta Butter"){
			    price = 90;
			}
			else if(item == "Pasta Masala"){
			    price = 100;
			}
			else if(item == "Noodles Plane "){
			    price = 90;
			}
			else if(item == "Noodles Veg"){
			    price = 100;
			}
			else if(item == "Onion Pizza"){
			    price = 100;
			}
			else if(item == "Corn Pizza"){
			    price = 130;
			}
			else if(item == "Marghenita Pizza"){
			    price = 90;
			}
			else if(item == "Peri Peri Pizza"){
			    price = 160;
			}
			else if(item == "Chicken Momos"){
			    price = 90;
			}
			else if(item == "Egg Rice"){
			    price = 100;
			}
			else if(item == "Chicken Tikka"){
			    price = 140;
			}
			else if(item == "French Fries"){
			    price = 115;
			}
			else if(item == "Mango Lassi"){
			    price = 80;
			}
			else if(item == "Curd Rice "){
			    price = 90;
			}
			else if(item == "Veg Raita"){
			    price = 55;
			}
			else if(item == "Chicken Dum Biryani"){
			    price = 299;
			}
			else if(item == "Chocolate Lava Cake"){
			    price = 99;
			}
				
			
			
			
		System.out.println("search ended");
		 
		  return price;
		  
	}
	
			
			 
	 
      
	  public static int search(String item , int quantity){
			 System.out.println("search started");
			 
			 int price =0;
			 
			 if(item == "Noodles"){
			     price = 150 * quantity;
			}
			else if(item == "Manchurian Rice"){
			     price = 160 * quantity;
			}
			if(item == "Veg Fried Rice"){
			     price = 150 * quantity;
			}
			else if(item == "Schezwan Rice"){
			    price = 160 * quantity;
			}
			else if(item == "Chillie Paneer"){
			    price = 180 * quantity;
			}
			else if(item == "Paneer Manchurian"){
			    price = 200 * quantity;
			}
			else if(item == "Paneer 65"){
			    price = 222 * quantity;
			}
			else if(item == "Veg Spring Roll"){
			    price = 200 * quantity;
			}
			else if(item == "Veg Cripsy"){
			    price = 180 * quantity;
			}
			else if(item == "Veg Lollipop"){
			    price = 140 * quantity;
			}
			else if(item == "Maggy Masala"){
			    price = 70 * quantity;
			}
			else if(item == "Pasta Butter"){
			    price = 90 * quantity;
			}
			else if(item == "Pasta Masala"){
			    price = 100 * quantity;
			}
			else if(item == "Noodles Plane "){
			    price = 90 * quantity;
			}
			else if(item == "Noodles Veg"){
			    price = 100 * quantity;
			}
			else if(item == "Onion Pizza"){
			    price = 100 * quantity;
			}
			else if(item == "Corn Pizza"){
			    price = 130 * quantity;
			}
			else if(item == "Marghenita Pizza"){
			    price = 90 * quantity;
			}
			else if(item == "Peri Peri Pizza"){
			    price = 160 * quantity;
			}
			else if(item == "Chicken Momos"){
			    price = 90 * quantity;
			}
			else if(item == "Egg Rice"){
			    price = 100 * quantity;
			}
			else if(item == "Chicken Tikka"){
			    price = 140 * quantity;
			}
			else if(item == "French Fries"){
			    price = 115 * quantity;
			}
			else if(item == "Mango Lassi"){
			    price = 80 * quantity;
			}
			else if(item == "Curd Rice "){
			    price = 90 * quantity;
			}
			else if(item == "Veg Raita"){
			    price = 55 * quantity;
			}
			else if(item == "Chicken Dum Biryani"){
			    price = 299 * quantity;
			}
			else if(item == "Chocolate Lava Cake"){
			    price = 99 * quantity;
			}
				
			
				
			
			
		System.out.println("search ended");
		 
		  return price;
		  
	}
			 
	 public static void main(String food []){
	    System.out.println("main Started");
		
		String item = "Noodles";
		
		   int price  = search(item);
		   
		   System.out.println(" The price of "+ item +" is "+ price);
		   
		   
		   int priceWithQuantity  = search(item , 4);
		   
		   System.out.println(" The price of "+ item +" is "+ priceWithQuantity);
		   
		   
		   System.out.println("main ended");
		   
	}
	
}
      
	  