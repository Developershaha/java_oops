package multithreading;

public class LaunchMT1 {
    public static void main(String[] args) throws InterruptedException {
        // Can we change the name of main thread in java
        // yes we can change the name of the main thread in java


        Thread thread=Thread.currentThread();
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
        Thread.sleep(5000);

        thread.setName("new thread");
        thread.setPriority(4);
        System.out.println("**************");
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
    }
}
