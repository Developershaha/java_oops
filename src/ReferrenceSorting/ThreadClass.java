class Counter1 {

    int count = 0;

    void increment() {
        count++;
    }
}

class MyThread extends Thread {

    Counter1 counter;

    MyThread(Counter1 counter) {
        this.counter = counter;
    }

    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class ThreadClass {

    public static void main(String[] args) throws InterruptedException {

        Counter1 counter = new Counter1();

        MyThread thread1 = new MyThread(counter);
        MyThread thread2 = new MyThread(counter);

        thread1.start();
        thread2.start();
//        thread2.join();
//        thread1.join();
        System.out.println(counter.count);
    }
}