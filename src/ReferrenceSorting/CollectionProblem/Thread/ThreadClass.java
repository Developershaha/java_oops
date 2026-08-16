package ReferrenceSorting.CollectionProblem.Thread;

// crate thread class using Thread class and Runnable interface oky

class MyThread extends Thread {
    int count;

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}

class NewThreadClass implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}
public class ThreadClass {
    public static void main(String[] args) throws InterruptedException {

        NewThreadClass newThreadClass=new NewThreadClass();
        Thread t=new Thread(newThreadClass);
        t.start();
//        MyThread thread1 = new MyThread();
//        MyThread thread2 = new MyThread();
//
//        thread1.start();
//        thread2.start();
//        thread1.join();
//        thread2.join();

//        System.out.println(thread2.count+"dfsf");
    }


}
