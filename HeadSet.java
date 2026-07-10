class HeadSet { 
    static boolean isConnected; 
    static int maxVolume = 7; 
    static int currentVolume; 
    static int minVolume; 

    public static void onOroff(){ 
        if (isConnected == false){ 
            isConnected = true; 
            System.out.println("HeadSet is connected..."); 
        } else if (isConnected == true){ 
            isConnected = false; 
            System.out.println("HeadSet is dis-connected..."); 
        } 
        return; 
    } 

    public static void increaseVolume(){ 
        if(isConnected == true){ 
            if(currentVolume < maxVolume){ 
                currentVolume = currentVolume + 1; 
                System.out.println("The currentVolume is " + currentVolume); 
            } else if (currentVolume == maxVolume) { 
                System.out.println("Max Volume reached..."); 
            } 
        } else if (isConnected == false) { 
            System.out.println("Turn On the headset first..."); 
        } 
    } 

    public static void decreaseVolume(){ 
        if(isConnected == true){ 
            if(currentVolume > minVolume){ 
                currentVolume = currentVolume - 1; 
                System.out.println("The currentVolume is " + currentVolume); 
            } else if (currentVolume == minVolume) { 
                System.out.println("Max Volume reached..."); 
            } 
        } else if (isConnected == false) { 
            System.out.println("Turn On the headset first..."); 
        } 
    } 

    // Java only allows one main method per execution. 
    // This combines your exact sequential main blocks into one valid flow.
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
        increaseVolume(); 
        increaseVolume(); 
        increaseVolume(); 
        increaseVolume(); 
        increaseVolume(); 
        increaseVolume(); 
        increaseVolume(); 
        onOroff(); 
        System.out.println("main ended"); 

        
        System.out.println("main started"); 
        System.out.println(isConnected); 
        onOroff(); 
        decreaseVolume(); 
        decreaseVolume(); 
        decreaseVolume(); 
        decreaseVolume(); 
        increaseVolume(); 
        decreaseVolume(); 
        decreaseVolume(); 
        onOroff(); 
        System.out.println("main ended"); 
    } 
}