class HairDryer { 
    
	static boolean isConnected; 
    static int maxHeat = 7; 
    static int currentHeat; 
    static int minHeat; 

    public static void onOroff(){ 
        if (isConnected == false){ 
            isConnected = true; 
            System.out.println("HairDryer is connected..."); 
        } else if (isConnected == true){ 
            isConnected = false; 
            System.out.println("HairDryer is dis-connected..."); 
        } 
        return; 
    } 

    public static void increaseHeat(){ 
        if(isConnected == true){ 
            if(currentHeat < maxHeat){ 
                currentHeat = currentHeat + 1; 
                System.out.println("The currentHeat is " + currentHeat); 
            } else if (currentHeat == maxHeat) { 
                System.out.println("Max Heat reached..."); 
            } 
        } else if (isConnected == false) { 
            System.out.println("Turn On the HairDryer first..."); 
        } 
    } 

    public static void decreaseHeat(){ 
        if(isConnected == true){ 
            if(currentHeat > minHeat){ 
                currentHeat = currentHeat - 1; 
                System.out.println("The currentHeat is " + currentHeat); 
            } else if (currentHeat == minHeat) { 
                System.out.println("Max Heat reached..."); 
            } 
        } else if (isConnected == false) { 
            System.out.println("Turn On the HairDryer first..."); 
        } 
    } 

    public static void main(String[] args){ 
        // BLOCK 1
        System.out.println("main started"); 
        System.out.println(isConnected); 
        onOroff(); 
        System.out.println(isConnected); 
        onOroff(); 
        System.out.println("main ended"); 

        // BLOCK 2
        System.out.println("main started"); 
        System.out.println(isConnected); 
        onOroff(); 
        increaseHeat(); 
        increaseHeat(); 
        increaseHeat(); 
        increaseHeat(); 
        increaseHeat(); 
        increaseHeat(); 
        increaseHeat(); 
        onOroff(); 
        System.out.println("main ended"); 

        // BLOCK 3
        System.out.println("main started"); 
        System.out.println(isConnected); 
        onOroff(); 
        decreaseHeat(); 
        decreaseHeat(); 
        decreaseHeat(); 
        decreaseHeat(); 
        increaseHeat(); 
        decreaseHeat(); 
        decreaseHeat(); 
        onOroff(); 
        System.out.println("main ended"); 
    } 
}