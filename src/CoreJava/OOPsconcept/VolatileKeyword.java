package CoreJava.OOPsconcept;



public class VolatileKeyword {
    static volatile boolean running =true;
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(()->{
            while (running){
                System.out.println("t1 is running");
            }
        });
        Thread t2=new Thread(()->{
            running=false;
            System.out.println("T1 is stopped");
        });
        t1.start();
        Thread.sleep(1);
        t2.start();

    }
}

