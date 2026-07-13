class Microoven { 
    static boolean isConnected; 
    static int maxPower = 7; 
    static int currentPower; 
    static int minPower; 

    public static void onOroff(){ 
        if (isConnected == false){ 
            isConnected = true; 
            System.out.println("Microoven is connected..."); 
        } else if (isConnected == true){ 
            isConnected = false; 
            System.out.println("Microoven is dis-connected..."); 
        } 
        return; 
    } 

    public static void increasePower(){ 
        if(isConnected == true){ 
            if(currentPower < maxPower){ 
                currentPower = currentPower + 1; 
                System.out.println("The currentPower is " + currentPower); 
            } else if (currentPower == maxPower) { 
                System.out.println("Max Power reached..."); 
            } 
        } else if (isConnected == false) { 
            System.out.println("Turn On the microoven first..."); 
        } 
    } 

    public static void decreasePower(){ 
        if(isConnected == true){ 
            if(currentPower > minPower){ 
                currentPower = currentPower - 1; 
                System.out.println("The currentPower is " + currentPower); 
            } else if (currentPower == minPower) { 
                System.out.println("Max Power reached..."); 
            } 
        } else if (isConnected == false) { 
            System.out.println("Turn On the microoven first..."); 
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
        increasePower(); 
        increasePower(); 
        increasePower(); 
        increasePower(); 
        increasePower(); 
        increasePower(); 
        increasePower(); 
        onOroff(); 
        System.out.println("main ended"); 

        // BLOCK 3
        System.out.println("main started"); 
        System.out.println(isConnected); 
        onOroff(); 
        decreasePower(); 
        decreasePower(); 
        decreasePower(); 
        decreasePower(); 
        increasePower(); 
        decreasePower(); 
        decreasePower(); 
        onOroff(); 
        System.out.println("main ended"); 
    } 
}