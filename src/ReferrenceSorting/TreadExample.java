package ReferrenceSorting;

class Counter{
    int counter=0;

   synchronized public void setCounter() {
        this.counter = counter+1;
    }

    public int getCounter() {
        return counter;
    }
}

public class TreadExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter=new Counter();

        // createa a threads

        Thread t1=new Thread(()->{
            for(int i=0;i<1000;i++){
                counter.setCounter();
            }
        });
        Thread t2=new Thread(()->{
            for(int i=0;i<1000;i++){
                counter.setCounter();
            }
        });
//        for(int i=0;i<1000;i++){
//            counter.setCounter();
//        }
//        for(int i=0;i<1000;i++){
//            counter.setCounter();
//        }

        t1.start(); // both thread are working parrelly
        t2.start();
        t1.join();
        t2.join();
        System.out.println("final count "+counter.getCounter());
    }
}
