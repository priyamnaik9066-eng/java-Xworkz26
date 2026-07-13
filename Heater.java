class Heater { 
    
	
	static boolean isConnected; 
    static int maxTemperature = 7; 
    static int currentTemperature; 
    static int minTemperature; 

    public static void onOroff(){ 
        if (isConnected == false){ 
            isConnected = true; 
            System.out.println("Heater is connected..."); 
        } else if (isConnected == true){ 
            isConnected = false; 
            System.out.println("Heater is dis-connected..."); 
        } 
        return; 
    } 

    public static void increaseTemperature(){ 
        if(isConnected == true){ 
            if(currentTemperature < maxTemperature){ 
                currentTemperature = currentTemperature + 1; 
                System.out.println("The currentTemperature is " + currentTemperature); 
            } else if (currentTemperature == maxTemperature) { 
                System.out.println("Max Temperature reached..."); 
            } 
        } else if (isConnected == false) { 
            System.out.println("Turn On the Heater first..."); 
        } 
    } 

    public static void decreaseTemperature(){ 
        if(isConnected == true){ 
            if(currentTemperature > minTemperature){ 
                currentTemperature = currentTemperature - 1; 
                System.out.println("The currentTemperature is " + currentTemperature); 
            } else if (currentTemperature == minTemperature) { 
                System.out.println("Max Temperature reached..."); 
            } 
        } else if (isConnected == false) { 
            System.out.println("Turn On the Heater first..."); 
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
        increaseTemperature(); 
        increaseTemperature(); 
        increaseTemperature(); 
        increaseTemperature(); 
        increaseTemperature(); 
        increaseTemperature(); 
        increaseTemperature(); 
        onOroff(); 
        System.out.println("main ended"); 

        
        System.out.println("main started"); 
        System.out.println(isConnected); 
        onOroff(); 
        decreaseTemperature(); 
        decreaseTemperature(); 
        decreaseTemperature(); 
        decreaseTemperature(); 
        increaseTemperature(); 
        decreaseTemperature(); 
        decreaseTemperature(); 
        onOroff(); 
        System.out.println("main ended"); 
    } 
}