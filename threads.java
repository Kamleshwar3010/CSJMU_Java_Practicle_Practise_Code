import java.lang.Thread;

class even extends Thread {
    even() {// constuctor
        start(); // start() method causes this thread to begin execution
        // it is use to run two method concurrently
    }

    public void run() {
        for (int i = 0; i <= 50; i = i + 2) {
            System.out.println("Even Number " + i);
        }
    }
}

class odd extends Thread {
    odd() {
        start();
    }

    public void run() {
        for (int i = 1; i <= 50; i = i + 2) {
            System.out.println("Odd Number " + i);
        }
    }
}

public class threads {
    public static void main(String[] args) {
        // this will execute both method concurrently
        new even(); // even e = new even(); // both are same
        new odd(); // odd o = new odd(); // both are same

    }
}
