package com.dawidciesielski;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello from the main thread.");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        new Thread() {
            public void run() {
                System.out.println("Hello from the anonymous class.");
            }
        }.start();


        Thread myRunnableThread = new Thread(new MyRunnable());


        myRunnableThread.start();
        anotherThread.interrupt();
        

        System.out.println("Hello again from the main thread.");


    }
}
