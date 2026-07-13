class Mixer { 
   

    static boolean isConnected; 
    static int maxSpeed = 7; 
    static int currentSpeed; 
    static int minSpeed; 

    public static void onOroff(){ 
        if (isConnected == false){ 
            isConnected = true; 
            System.out.println("Mixer is connected..."); 
        } else if (isConnected == true){ 
            isConnected = false; 
            System.out.println("Mixer is dis-connected..."); 
        } 
        return; 
    } 

    public static void increaseSpeed(){ 
        if(isConnected == true){ 
            if(currentSpeed < maxSpeed){ 
                currentSpeed = currentSpeed + 1; 
                System.out.println("The currentSpeed is " + currentSpeed); 
            } else if (currentSpeed == maxSpeed) { 
                System.out.println("Max Speed reached..."); 
            } 
        } else if (isConnected == false) { 
            System.out.println("Turn On the mixer first..."); 
        } 
    } 

    public static void decreaseSpeed(){ 
        if(isConnected == true){ 
            if(currentSpeed > minSpeed){ 
                currentSpeed = currentSpeed - 1; 
                System.out.println("The currentSpeed is " + currentSpeed); 
            } else if (currentSpeed == minSpeed) { 
                System.out.println("Max Speed reached..."); 
            } 
        } else if (isConnected == false) { 
            System.out.println("Turn On the mixer first..."); 
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
        increaseSpeed(); 
        increaseSpeed(); 
        increaseSpeed(); 
        increaseSpeed(); 
        increaseSpeed(); 
        increaseSpeed(); 
        increaseSpeed(); 
        onOroff(); 
        System.out.println("main ended"); 

        
        System.out.println("main started"); 
        System.out.println(isConnected); 
        onOroff(); 
        decreaseSpeed(); 
        decreaseSpeed(); 
        decreaseSpeed(); 
        decreaseSpeed(); 
        increaseSpeed(); 
        decreaseSpeed(); 
        decreaseSpeed(); 
        onOroff(); 
        System.out.println("main ended"); 
    } 
}