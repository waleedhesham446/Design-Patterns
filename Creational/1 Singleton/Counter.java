public class Counter {
    
    public int count = 0;

    private static Counter instance = null;

    private static Object lockObj = new Object();

    private Counter(){}

    //  static methods must deal with static variables only
    public static Counter getInstance() {   //  we can put synchronized here also
        if(instance == null){       //  double check for more safety
            synchronized(lockObj){
                if(instance == null){
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        return null;
                    }
                    instance = new Counter();  //  lazy initialization
                }
            }
        }
        return instance;
    }
    
    public synchronized void addOne() {
        count++;
    }
}