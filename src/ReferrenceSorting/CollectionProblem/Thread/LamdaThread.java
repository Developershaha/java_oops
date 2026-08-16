package ReferrenceSorting.CollectionProblem.Thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
class Parent {
    static void print() {
        System.out.println("Parent called");
    }
}

class Child extends Parent {
    static void print() {
        System.out.println("Child called");
    }
}


public class LamdaThread {
    public static void main(String[] args) throws InterruptedException {
//        public static void main(String[] args) throws InterruptedException {

            Child p = new Child();

            p.print();
            Child.print();
            Parent.print();
//        }
//        Thread thread=new Thread(()-> System.out.println("called"));
//        ScheduledExecutorService executor =
//                Executors.newScheduledThreadPool(1);
//
//        executor.schedule(() -> {
//            System.out.println("Task executed!");
//        }, 5, TimeUnit.SECONDS);
//
//        executor.shutdown();
        // impliment thread
//        thread.run();
//        Thread t = new Thread(() -> {
//            System.out.println("Task");
//        });



//        t.start();
//        t.join();
//
//        System.out.println("Main continues");
//        Runnable runnable=()-> System.out.println("runable called");
//        Thread thread1=new Thread(runnable);
////        thread1.run();
//        ScheduledExecutorService executor =
//                Executors.newScheduledThreadPool(1);
//
//        executor.scheduleAtFixedRate(() -> {
//
//            System.out.println(
//                    "Running: " +
//                            Thread.currentThread().getName()
//            );
//
//        }, 0, 5, TimeUnit.SECONDS);


    }
}
