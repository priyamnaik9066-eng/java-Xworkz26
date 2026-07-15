 class Hotel {

   public static void main(String[] args) {

      String owner = "Ramesh";
      String hotelName = "Udupi Grand";

      String menus[] = {
         "Idli",
         "Vada",
         "Masala Dosa",
         "Plain Dosa",
         "Set Dosa",
         "Rava Dosa",
         "Onion Dosa",
         "Puri",
         "Chapati",
         "Parotta",
         "Upma",
         "Khara Bath",
         "Kesari Bath",
         "Pongal",
         "Bisibele Bath",
         "Puliyogare",
         "Curd Rice",
         "Tomato Rice",
         "Veg Fried Rice",
         "Gobi Manchurian",
         "Veg Noodles",
         "Paneer Butter Masala",
         "Palak Paneer",
         "Dal Fry",
         "Jeera Rice",
         "Veg Meals",
         "South Indian Meals",
         "North Indian Meals",
         "Coffee",
         "Tea",
         "Badam Milk",
         "Lassi",
         "Fresh Lime Juice",
         "Mango Juice",
         "Orange Juice",
         "Ice Cream",
         "Gulab Jamun",
         "Rasgulla",
         "Jalebi",
         "Payasam"
      };

      System.out.println("The owner is " + owner);
      System.out.println("The Hotel name is " + hotelName);
      System.out.println("List of the menus are:");

      for(String menu : menus) {
         System.out.println(menu);
      }

   }

}