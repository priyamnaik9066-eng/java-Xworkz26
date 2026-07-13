class CoffeeMaker { 
    
	
	static boolean isConnected; 
    static int maxBrewStrength = 7; 
    static int currentBrewStrength; 
    static int minBrewStrength; 

    public static void onOroff(){ 
        if (isConnected == false){ 
            isConnected = true; 
            System.out.println("CoffeeMaker is connected..."); 
        } else if (isConnected == true){ 
            isConnected = false; 
            System.out.println("CoffeeMaker is dis-connected..."); 
        } 
        return; 
    } 

    public static void increaseBrewStrength(){ 
        if(isConnected == true){ 
            if(currentBrewStrength < maxBrewStrength){ 
                currentBrewStrength = currentBrewStrength + 1; 
                System.out.println("The currentBrewStrength is " + currentBrewStrength); 
            } else if (currentBrewStrength == maxBrewStrength) { 
                System.out.println("Max Brew Strength reached..."); 
            } 
        } else if (isConnected == false) { 
            System.out.println("Turn On the CoffeeMaker first..."); 
        } 
    } 

    public static void decreaseBrewStrength(){ 
        if(isConnected == true){ 
            if(currentBrewStrength > minBrewStrength){ 
                currentBrewStrength = currentBrewStrength - 1; 
                System.out.println("The currentBrewStrength is " + currentBrewStrength); 
            } else if (currentBrewStrength == minBrewStrength) { 
                System.out.println("Max Brew Strength reached..."); 
            } 
        } else if (isConnected == false) { 
            System.out.println("Turn On the CoffeeMaker first..."); 
        } 
    } 

    public static void main(String[] args){ 
        
        System.out.println("main started"); 
        System.out.println(isConnected); 
        onOroff(); 
        System.out.println(isConnected); 
        onOroff(); 
        System.out.println("main ended"); 

        
        System.out.println("main started"); 
        System.out.println(isConnected); 
        onOroff(); 
        increaseBrewStrength(); 
        increaseBrewStrength(); 
        increaseBrewStrength(); 
        increaseBrewStrength(); 
        increaseBrewStrength(); 
        increaseBrewStrength(); 
        increaseBrewStrength(); 
        onOroff(); 
        System.out.println("main ended"); 

        
        System.out.println("main started"); 
        System.out.println(isConnected); 
        onOroff(); 
        decreaseBrewStrength(); 
        decreaseBrewStrength(); 
        decreaseBrewStrength(); 
        decreaseBrewStrength(); 
        increaseBrewStrength(); 
        decreaseBrewStrength(); 
        decreaseBrewStrength(); 
        onOroff(); 
        System.out.println("main ended"); 
    } 
}