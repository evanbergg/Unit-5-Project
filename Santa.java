public class Santa {
    //static instance variable
    public static int numWorkers = 0;
    
    //this method increases numWorkers everytime santa gets a worker.
    public static void increaseWorkers(){
        numWorkers++;
    }
    
    //this method will decrease workers just in case the number goes over and is inaccurate
    public static void decreaseWorkers(int num){
        numWorkers -= num;
    }
}