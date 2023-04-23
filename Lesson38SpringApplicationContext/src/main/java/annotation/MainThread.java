package annotation;

import java.lang.Thread.State;

public class MainThread {

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        System.out.println("Hello from main thread");
    }

    static class MyThread extends Thread {

        @Override
        public void run() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from MyThread class");
        }

    }

}
