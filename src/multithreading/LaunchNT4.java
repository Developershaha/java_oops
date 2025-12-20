package multithreading;

class Demo1 {
    int count;

    void increament() {
        count++;

    }

    ;
}

public class LaunchNT4 {
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        Runnable obj1 = () -> {
            for (int i = 1; i <= 1000; i++) {
                d.increament();
            }
        };
        Runnable obj2 = () -> {
            for (int i = 1; i <= 1000; i++) {
                d.increament();
            }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
        System.out.println("Count  "+d.count);
    }
}
