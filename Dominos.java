class Dominos {


            public static int search(String item){
			 System.out.println("search started");
		 
			 int price =0;
			 
			 if(item == "Double Cheese Margherita"){
			     price = 219;
			}
			else if(item == "Indi Chicken Tikka Pizza"){
			     price = 359;
			}
			else if(item == "Fiery Jalapeno and Paprika"){
			     price = 239;
			}
			else if(item == "Chicken Fiesta Pizza"){
			    price = 309;
			}
			else if(item == "Achari Do Pyaza Pizza"){
			    price = 179;
			}
			else if(item == "The 5 Pepper Pizza"){
			    price = 309;
			}
			else if(item == "Kadhai Paneer Pizza"){
			    price = 309;
			}
			else if(item == "Spiced Double Chicken"){
			    price = 309;
			}
			else if(item == "Moroccan Spice Pasta Veg"){
			    price = 149;
			}
			else if(item == "Moroccan Spice Pasta NonVeg"){
			    price = 169;
			}
			else if(item == "Creamy Tomato Pasta Veg"){
			    price = 139;
			}
			else if(item == "Creamy Tomato Pasta NonVeg"){
			    price = 159;
			}
			else if(item == "Burger Pizza Premium NonVeg"){
			    price = 169;
			}
			else if(item == "Paneer Tikka Stuffed Garlic Bread"){
			    price = 179;
			}
			else if(item == "Chicken Tikka Stuffed Garlic Bread"){
			    price = 199;
			}
			else if(item == "Roasted Chicken Wings"){
			    price = 159;
			}
			else if(item == "Meatballs Bites"){
			    price = 119;
			}
			else if(item == "Boneless Chicken Bites"){
			    price = 149;
			}
			else if(item == "Crushed Pepper Chicken Pizza"){
			    price = 239;
			}
			else if(item == "Fresh Veggie Pizza"){
			    price = 219;
			}
			else if(item == "Spicy Non Veg Pizza"){
			    price = 259;
			}
			else if(item == "Sweet Corn Topping"){
			    price = 45;
			}
			else if(item == "Grilled Mushroom Topping"){
			    price = 55;
			}
			else if(item == "Extra Cheese Topping"){
			    price = 75;
			}
			else if(item == "Bacon Bits Topping"){
			    price = 85;
			}
			else if(item == "Pepsi Black Can"){
			    price = 40;
			}
			else if(item == "7Up Can"){
			    price = 40;
			}
			else if(item == "Tangy Tomato Dip"){
			    price = 25;
			}
			else if(item == "Roasted Garlic Dip"){
			    price = 30;
			}
			else if(item == "Butterscotch Mousse Cake"){
			    price = 109;
			}
				
			
			
			
		System.out.println("search ended");
		 
		  return price;
		  
	}
	
		public static int search(String item , int quantity){
			 System.out.println("search started");
		 
			 int price =0;
			 
			 if(item == "Double Cheese Margherita"){
			     price = 219 * quantity;
			}
			else if(item == "Indi Chicken Tikka Pizza"){
			     price = 359 * quantity;
			}
			if(item == "Fiery Jalapeno and Paprika"){
			     price = 239 * quantity;
			}
			else if(item == "Chicken Fiesta Pizza"){
			    price = 309 * quantity;
			}
			else if(item == "Achari Do Pyaza Pizza"){
			    price = 179 * quantity;
			}
			else if(item == "The 5 Pepper Pizza"){
			    price = 309 * quantity;
			}
			else if(item == "Kadhai Paneer Pizza"){
			    price = 309 * quantity;
			}
			else if(item == "Spiced Double Chicken"){
			    price = 309 * quantity;
			}
			else if(item == "Moroccan Spice Pasta Veg"){
			    price = 149 * quantity;
			}
			else if(item == "Moroccan Spice Pasta NonVeg"){
			    price = 169 * quantity;
			}
			else if(item == "Creamy Tomato Pasta Veg"){
			    price = 139 * quantity;
			}
			else if(item == "Creamy Tomato Pasta NonVeg"){
			    price = 159 * quantity;
			}
			else if(item == "Burger Pizza Premium NonVeg"){
			    price = 169 * quantity;
			}
			else if(item == "Paneer Tikka Stuffed Garlic Bread"){
			    price = 179 * quantity;
			}
			else if(item == "Chicken Tikka Stuffed Garlic Bread"){
			    price = 199 * quantity;
			}
			else if(item == "Roasted Chicken Wings"){
			    price = 159 * quantity;
			}
			else if(item == "Meatballs Bites"){
			    price = 119 * quantity;
			}
			else if(item == "Boneless Chicken Bites"){
			    price = 149 * quantity;
			}
			else if(item == "Crushed Pepper Chicken Pizza"){
			    price = 239 * quantity;
			}
			else if(item == "Fresh Veggie Pizza"){
			    price = 219 * quantity;
			}
			else if(item == "Spicy Non Veg Pizza"){
			    price = 259 * quantity;
			}
			else if(item == "Sweet Corn Topping"){
			    price = 45 * quantity;
			}
			else if(item == "Grilled Mushroom Topping"){
			    price = 55 * quantity;
			}
			else if(item == "Extra Cheese Topping"){
			    price = 75 * quantity;
			}
			else if(item == "Bacon Bits Topping"){
			    price = 85 * quantity;
			}
			else if(item == "Pepsi Black Can"){
			    price = 40 * quantity;
			}
			else if(item == "7Up Can"){
			    price = 40 * quantity;
			}
			else if(item == "Tangy Tomato Dip"){
			    price = 25 * quantity;
			}
			else if(item == "Roasted Garlic Dip"){
			    price = 30 * quantity;
			}
			else if(item == "Butterscotch Mousse Cake"){
			    price = 109 * quantity;
			}
				
			
		System.out.println("search ended");
		 
		  return price;
		  
	}
			 
	 public static void main(String food []){
	    System.out.println("main Started");
		
		String item = "Double Cheese Margherita";
		
		   int price  = search(item);
		   
		   System.out.println(" The price of "+ item +" is "+ price);
		   
		   
		   int priceWithQuantity  = search(item , 4);
		   
		   System.out.println(" The price of "+ item +" is "+ priceWithQuantity);
		   
		   
		   System.out.println("main ended");
		   
	}
	
}
